package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class BlogPostResponse2 {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}