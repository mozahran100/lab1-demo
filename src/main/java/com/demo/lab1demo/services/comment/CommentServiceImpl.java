package com.demo.lab1demo.services.comment;

import com.demo.lab1demo.models.Comment;
import com.demo.lab1demo.models.Post;
import com.demo.lab1demo.models.User;
import com.demo.lab1demo.repositories.CommentRepo;
import com.demo.lab1demo.repositories.PostRepo;
import com.demo.lab1demo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepo commentRepository;
    @Autowired
    private PostRepo postRepository;
    @Autowired
    private UserRepo userRepository;

    @Override
    public void create(Comment comment, long userid, long postid) {
        User user = userRepository.findById(userid).orElse(null);
        Post post = postRepository.findById(postid).orElse(null);
        int index = user.getPosts().indexOf(post);
        if (index > -1) {
            post.getComments().add(comment);
            commentRepository.save(comment);
        }
    }
}
