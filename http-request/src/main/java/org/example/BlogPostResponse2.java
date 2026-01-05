package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class BlogPostResponse2 {
    @JsonProperty("postId")
    int postId;
    @JsonProperty("id")
    int id;
    @JsonProperty("name")
    String name;
    @JsonProperty("email")
    String email;
    @JsonProperty("body")
    String body;
}
