package com.demo.lab1demo.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreatePostDto {
    private String title;
    private String content;
    private String author;
}
