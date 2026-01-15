package org.example;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class BlogPostResponse {
    private int userId;
    private int id;
    private String title;
    private String body;
}