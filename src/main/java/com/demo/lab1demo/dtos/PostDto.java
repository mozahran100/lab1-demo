package com.demo.lab1demo.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
    private long id;
    private String title;
    private String content;
    private String author;
}
