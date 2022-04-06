package com.demo.lab1demo.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String content;
    private String author;
    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "post_id")
    private List<Comment> comments;
}
