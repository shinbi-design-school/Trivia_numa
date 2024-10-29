package com.design_shinbi.trivia_numa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.design_shinbi.trivia_numa.model.dao.UsersDao;

public class UserTest {
    @Test
    public void testUserCreation() {
        UsersDao.User user = new UsersDao.User(1, "Alice", 10, 20);
        assertEquals(1, user.getId());
        assertEquals("Alice", user.getName());
    }
}

