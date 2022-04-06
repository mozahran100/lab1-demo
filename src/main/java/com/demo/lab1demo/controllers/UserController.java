package com.demo.lab1demo.controllers;

import com.demo.lab1demo.aspect.annotations.ExecutionTime;
import com.demo.lab1demo.models.User;
import com.demo.lab1demo.services.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private final UserService userService;

    @PostMapping("/save")
    public void saveUser (@RequestBody User user){
        userService.save(user);
    }

    @ExecutionTime
    @GetMapping("/get-all")
    public List<User> getAllUsers (){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable long id) {
        return userService.getUser(id);
    }

    @GetMapping("/ttt/{id}")
    public List<User> getUsersMoreThanOnePosts (@PathVariable int id){
        return userService.findUsersByPostsGreaterThan(id);
    }

}
