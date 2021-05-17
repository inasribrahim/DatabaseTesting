package com.databasetesting.jdbc.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCconnection {
	    //static reference to itself
	    private static JDBCconnection instance = new JDBCconnection();
	    public static final String URL = "jdbc:mysql://localhost/YIFY";
	    public static final String USER = "<username>";
	    public static final String PASSWORD = "<your_password>";
	    public static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver"; 
	     
	    //private constructor
	    private JDBCconnection() {
	        try {
	            Class.forName(DRIVER_CLASS);
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	     
	    public Connection createConnection() {
	        Connection connection = null;
	        try {
	            connection = DriverManager.getConnection(URL, USER, PASSWORD);
	        } catch (SQLException e) {
	            System.out.println("ERROR: Unable to Connect to Database.");
	        }
	        return connection;
	    }   
	     
	    public static Connection getConnection() {
	        return instance.createConnection();
	    }
	
}