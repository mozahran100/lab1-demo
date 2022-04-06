package com.demo.lab1demo.repositories;

import com.demo.lab1demo.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

  //List<User> findByPostsGreaterThan(int id);

  @Query(value = "select u from User u where u.posts.size>= 1")
  List<User> getUsersMoreThanOnePosts ();

}
