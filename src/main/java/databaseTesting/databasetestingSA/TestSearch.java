package databaseTesting.databasetestingSA;

import java.util.concurrent.TimeUnit;
import java.sql.SQLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.databasetesting.jdbc.dao.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.databasetesting.jdbc.to.Movies;


public class TestSearch {	
	   public static void main(String[] args) {
		   tc_Search();
	    }
	 
	    public static void tc_Search() {
	 	   	String site = "http://www.google.com" ;
			WebDriverManager.chromedriver().setup();
	     	WebDriver driver;
	  		driver = new ChromeDriver();
			driver.get(site);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	 	    driver.findElement(By.name("q")).sendKeys(getMovies());;
	 	    driver.findElement(By.className("gNO89b")).click();
	    }

	   private static String getMovies() {
		   MovieDAO mv = new MovieDAO();
		   String movieName = null ; 
	        java.util.List<Movies> movie;
	        try {
	        	movie = mv.getMovies();
	            for (Movies movies: movie) {
	            	movieName = movies.getName();
	                //System.out.println(employee);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
			return movieName;  	        

}

	   }
