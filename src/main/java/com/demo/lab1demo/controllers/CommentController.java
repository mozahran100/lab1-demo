package com.demo.lab1demo.controllers;

import com.demo.lab1demo.models.Comment;
import com.demo.lab1demo.services.comment.CommentService;
import com.demo.lab1demo.services.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("{userid}/posts/{postid}/comments")
    public void create (@RequestBody Comment comment, @PathVariable long userid, @PathVariable long postid){
        commentService.create(comment, userid, postid);
    }
}