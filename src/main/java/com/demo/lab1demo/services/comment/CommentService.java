package com.demo.lab1demo.services.comment;

import com.demo.lab1demo.models.Comment;

public interface CommentService {
    void create (Comment comment, long userid, long postid);

}
