package com.demo.lab1demo.repositories;

import com.demo.lab1demo.models.Post;
import com.demo.lab1demo.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends CrudRepository <Post, Long> {

    @Query(value = "select p from Post p where p.title = :title")
    List<User> getUsersMoreThanOnePosts (String title);

//    Post get(long id);
//    List<Post> getAll();
//    void save(Post post);
//    Post update(Post post);
//    long delete (long id);
}
