package com.demo.lab1demo.controllers;

import com.demo.lab1demo.models.Post;
import com.demo.lab1demo.services.post.PostService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class PostController {

    @Autowired
    private final PostService service;

    @PostMapping("/{id}")
    public void create (@RequestBody Post post, @PathVariable long id){
        service.save(post, id);
    }

    @GetMapping("/{id}/posts")
    public List<Post> getPosts (@PathVariable long id){
        return service.getPost(id);
    }
//
//    @GetMapping("/{id}")
//    public PostDto get(@PathVariable long id){
//        return service.get(id);
//    }
//
//    @GetMapping
//    public List<PostDto> getAll(){
//        return service.getAll();
//    }
//
//    @PostMapping
//    public PostDto create(@RequestBody CreatePostDto dto){
//        return service.create(dto);
//    }
//
//    @PutMapping("/{id}")
//    public PostDto update(@PathVariable long id, @RequestBody PostDto dto){
//        dto.setId(id);
//        return service.update(dto);
//    }
//
//    @DeleteMapping("/{id}")
//    public long delete (@PathVariable long id){
//        return service.delete(id);
//    }
}
