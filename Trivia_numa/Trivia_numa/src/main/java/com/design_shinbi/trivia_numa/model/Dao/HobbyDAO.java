package com.design_shinbi.trivia_numa.model.Dao;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.design_shinbi.trivia_numa.model.entity.User;

public class HobbyDAO {
	protected Connection connection;
	 public HobbyDAO(Connection connection)
	 throws NoSuchAlgorithmException, SQLException {
	 this.connection = connection;
	 }
	 
	 public void hobbyAdd(String name,int hobby_score)
	 throws NoSuchAlgorithmException, SQLException{
		 String sql = "INSERT INTO hobby_users (name,hobby_score) values (?, ?)";
		 PreparedStatement statement = this.connection.prepareStatement(sql);
		 statement.setString(1, name);
		 statement.setInt(2, hobby_score);
		 statement.executeUpdate();
		 statement.close();
	 }
	 
	 public List<User> findHobby() throws SQLException {
		 List<User> list = new ArrayList<User>();
		 String sql = "SELECT * FROM hobby_users ORDER BY hobby_score DESC LIMIT 5";
		 Statement statement = this.connection.createStatement();
		 ResultSet resultSet = statement.executeQuery(sql);
		 while (resultSet.next()) {
			 User user = createHobby(resultSet);
		 list.add(user);
		 }
		 resultSet.close();
		 statement.close();
		 return list;
		 }
	 
	 private User createHobby(ResultSet resultSet) throws SQLException {
	 User user = new User();
	 user.setId(resultSet.getInt("id"));
	 user.setName(resultSet.getString("name"));
	 user.setScore(resultSet.getInt("hobby_score"));
	 return user;
	 }
	 
	 public void delete(int id) throws SQLException {
		 String sql = "DELETE FROM hobby_users WHERE id = ?";
		 PreparedStatement statement = this.connection.prepareStatement(sql);
		 statement.setInt(1, id);
		 statement.executeUpdate();
		 statement.close();
		 }

}