package com.demo.lab1demo.services.user;

import com.demo.lab1demo.models.User;

import java.util.List;

public interface UserService {
    public void save (User user);
    public List<User> getUsers();
    public User getUser(long id);
    List<User> findUsersByPostsGreaterThan (int id);
}
