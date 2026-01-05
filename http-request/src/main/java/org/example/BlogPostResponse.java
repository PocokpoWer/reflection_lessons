package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class BlogPostResponse {
    @JsonProperty("userId")
    int userId;
    @JsonProperty("id")
    int id;
    @JsonProperty("title")
    String title;
    @JsonProperty("body")
    String body;
}
