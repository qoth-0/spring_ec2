package com.example.demo.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PostRepository { //  DB역할
    List<Post> posts;
    PostRepository() {
        this.posts = new ArrayList<>();
        this.posts.add(new Post(1, "title1", "hello java", "hongildong1"));
        this.posts.add(new Post(2, "title2", "hello c++", "hongildong1"));
        this.posts.add(new Post(3, "title3", "hello python", "hongildong2"));
        this.posts.add(new Post(4, "title4", "hello javascript", "hongildong3"));
    }
    List<Post> findAll() {
        return this.posts;
    }
}
