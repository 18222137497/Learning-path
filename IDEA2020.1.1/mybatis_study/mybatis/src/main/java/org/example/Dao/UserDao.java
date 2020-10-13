package org.example.Dao;

import org.example.Domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
