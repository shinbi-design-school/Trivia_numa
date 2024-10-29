package com.design_shinbi.trivia_numa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.design_shinbi.trivia_numa.model.dao.UsersDao;

public class UsersDaoTest {
    private UsersDao usersDao;

    @BeforeEach
    public void setUp() {
        usersDao = new UsersDao();
        // ここでテスト用のデータを追加することもできます
    }

    @AfterEach
    public void tearDown() {
        // テスト後にデータをクリーンアップすることができます
    }

    @Test
    public void testAddUser() {
        UsersDao.User user = new UsersDao.User(1, "Test User", 10, 20);
        usersDao.addUser(user);
        UsersDao.User retrievedUser = usersDao.getUser(1);
        assertNotNull(retrievedUser);
        assertEquals("Test User", retrievedUser.getName());
    }

    @Test
    public void testGetAllUsers() {
        // 複数のユーザーを追加し、全て取得できるかテスト
    }

    @Test
    public void testUpdateUser() {
        // ユーザーを追加し、更新後に値が変更されているかテスト
    }

    @Test
    public void testDeleteUser() {
        // ユーザーを追加し、削除後にnullが返されるかテスト
    }

    @Test
    public void testSaveResult() {
        // 結果を保存し、正しく保存されたかテスト
    }
}
