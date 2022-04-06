package com.demo.lab1demo.services.post;

import com.demo.lab1demo.dtos.CreatePostDto;
import com.demo.lab1demo.dtos.PostDto;
import com.demo.lab1demo.models.Post;
import com.demo.lab1demo.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
public interface PostService {

//    PostDto get(long id);
//    List<PostDto> getAll();
    void save(Post post, long id);
    List<Post> getPost (long Id);

//    PostDto update(PostDto dto);
//    long delete (long id);
}
