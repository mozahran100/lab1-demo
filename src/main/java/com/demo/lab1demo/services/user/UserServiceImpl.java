package com.demo.lab1demo.services.user;

import com.demo.lab1demo.models.User;
import com.demo.lab1demo.repositories.PostRepo;
import com.demo.lab1demo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo userRepository;
    @Autowired
    PostRepo postRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUser(long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findUsersByPostsGreaterThan(int id) {
        return userRepository.getUsersMoreThanOnePosts();
    }


}