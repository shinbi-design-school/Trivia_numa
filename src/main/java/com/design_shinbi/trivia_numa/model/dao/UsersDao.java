package com.design_shinbi.trivia_numa.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsersDao {
    private static final String URL = "jdbc:mysql://localhost:3306/trivia_numa";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public void addUser(User user) {
        String sql = "INSERT INTO Users (id, name, hobby_score, study_score) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, user.getId());
            stmt.setString(2, user.getName());
            stmt.setInt(3, user.getHobbyScore());
            stmt.setInt(4, user.getStudyScore());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error adding user: " + e.getMessage());
        }
    }

    public User getUser(int id) {
        String sql = "SELECT * FROM Users WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("id"), rs.getString("name"),
                                rs.getInt("hobby_score"), rs.getInt("study_score"));
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving user: " + e.getMessage());
        }
        return null;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM Users";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                users.add(new User(rs.getInt("id"), rs.getString("name"),
                                   rs.getInt("hobby_score"), rs.getInt("study_score")));
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving users: " + e.getMessage());
        }
        return users;
    }

    public void updateUser(User user) {
        String sql = "UPDATE Users SET name = ?, hobby_score = ?, study_score = ? WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, user.getName());
            stmt.setInt(2, user.getHobbyScore());
            stmt.setInt(3, user.getStudyScore());
            stmt.setInt(4, user.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error updating user: " + e.getMessage());
        }
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM Users WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error deleting user: " + e.getMessage());
        }
    }

    public void saveResult(int userId, int result) {
        String sql = "INSERT INTO Results (user_id, score) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            stmt.setInt(2, result);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error saving result: " + e.getMessage());
        }
    }

    // ユーザー情報を格納するクラス
    public static class User {
        private int id;
        private String name;
        private int hobby_score;
        private int study_score;

        public User(int id, String name, int hobby_score, int studyScore) {
            this.id = id;
            this.name = name;
            this.hobby_score = hobby_score;
            this.study_score = studyScore;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public int getHobbyScore() { return hobby_score; }
        public int getStudyScore() { return study_score; }
        public void setHobbyScore(int hobbyScore) { this.hobby_score = hobbyScore; }
        public void setId(int id) { this.id = id; }
        public void setName(String name) { this.name = name; }
        public void setStudyScore(int studyScore) { this.study_score = studyScore; }
    }
}
