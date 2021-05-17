package com.databasetesting.jdbc.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.databasetesting.jdbc.db.*;
import com.databasetesting.jdbc.to.Movies;



public class MovieDAO {
	private Connection connection;
    private Statement statement;
 
    public MovieDAO() { }
 
    public List<Movies> getMovies() throws SQLException {
        String query = "SELECT * FROM movies";
        List<Movies> list = new ArrayList<Movies>();
        Movies movie = null;
        ResultSet rs = null;
        try {
            connection = JDBCconnection.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
            	movie = new Movies();
                /*Retrieve one movie details 
                and store it in movie object*/
            	movie.setName(rs.getString("name"));
            	movie.setYear(rs.getInt("year"));
            	movie.setGenre(rs.getString("genre"));
            	movie.setimdb_rating(rs.getDouble("imdb_rating"));
                list.add(movie);
            }
        } finally {
            DbUtil.close(rs);
            DbUtil.close(statement);
            DbUtil.close(connection);
        }
        return list;
    }
}
