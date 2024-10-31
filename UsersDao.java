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
    private static final String URL = "jdbc:mysql://localhost:3306/users"; // データベース名を変更
    private static final String USER = "root"; // ユーザー名
    private static final String PASSWORD = ""; // パスワード
    private Connection connection;

    public UsersDao() {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addUser(User user) {
        String sql = "INSERT INTO Users (id, name, hobby_score, study_score) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, user.getId());
            stmt.setString(2, user.getName());
            stmt.setInt(3, user.gethobby_score());
            stmt.setInt(4, user.getstudy_score());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User getUser(int id) {
        String sql = "SELECT * FROM Users WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("id"), rs.getString("name"),
                                rs.getInt("hobby_score"), rs.getInt("study_score"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM Users";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                users.add(new User(rs.getInt("id"), rs.getString("name"),
                                   rs.getInt("hobby_score"), rs.getInt("study_score")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void updateUser(User user) {
        String sql = "UPDATE Users SET name = ?, hobby_score = ?, study_score = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, user.getName());
            stmt.setInt(2, user.gethobby_score());
            stmt.setInt(3, user.getstudy_score());
            stmt.setInt(4, user.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM Users WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ユーザー情報を格納する内部クラス
    static class User {
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
        public int gethobby_score() { return hobby_score; }
        public int getstudy_score() { return study_score; }
        public void setHobbyScore(int hobbyScore) { this.hobby_score = hobbyScore; }
        public void setId(int id) { this.id = id; }
        public void setName(String name) { this.name = name; }
        public void setStudyScore(int studyScore) { this.study_score = studyScore; }
    }

    public static void main(String[] args) {
        UsersDao usersDao = new UsersDao();

        // 新しいユーザーの追加
        usersDao.addUser(new User(1, "Alice", 90, 85));

        // ユーザーの取得
        User user = usersDao.getUser(1);
        System.out.println("Retrieved User: " + user.getName());

        // ユーザーの更新
        user.setHobbyScore(95);
        usersDao.updateUser(user);

        // 全ユーザーの取得
        List<User> users = usersDao.getAllUsers();
        for (User u : users) {
            System.out.println("User: " + u.getName());
        }

        // ユーザーの削除
        usersDao.deleteUser(1);
    }
}

