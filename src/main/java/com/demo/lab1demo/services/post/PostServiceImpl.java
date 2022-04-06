package com.demo.lab1demo.services.post;

import com.demo.lab1demo.models.Post;
import com.demo.lab1demo.models.User;
import com.demo.lab1demo.repositories.PostRepo;

import com.demo.lab1demo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@AllArgsConstructor
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepo postRepository;
    @Autowired
    private UserRepo userRepository;

    @Override
    public void save(Post post, long id) {
        User user = userRepository.findById(id).orElse(null);
        user.getPosts().add(post);
        postRepository.save(post);
    }

    @Override
    public List<Post> getPost(long id) {
        User user = userRepository.findById(id).orElse(null);
        return user.getPosts();
    }


//    private final PostRepository repository;
//    private final ModelMapper modelMapper;
//
//    public PostServiceImpl(PostRepository repository, ModelMapper modelMapper) {
//        this.repository = repository;
//        this.modelMapper = modelMapper;
//    }
//
//    @Override
//    public PostDto get(long id) {
//        Post post = repository.get(id);
//        PostDto  dto= modelMapper.map(post, PostDto.class);
//        return dto;
//    }
//
//    @Override
//    public List<PostDto> getAll() {
//        return repository.getAll().stream()
//                .map(post -> modelMapper.map(post, PostDto.class))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public PostDto create(CreatePostDto dto) {
//        Post post = repository.create(modelMapper.map(dto, Post.class));
//        return modelMapper.map(post, PostDto.class);
//    }
//
//    @Override
//    public PostDto update(PostDto dto) {
//        Post post = repository.update(modelMapper.map(dto, Post.class));
//        return modelMapper.map(post, PostDto.class);
//    }
//
//    @Override
//    public long delete(long id) {
//        return repository.delete(id);
//    }
}