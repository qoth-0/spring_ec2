package com.example.demo.post;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class PostService { // 비즈니스 로직 처리
    private PostRepository postRepository;
    PostService() {
        this.postRepository = new PostRepository();
    }
    List<Post> findAll() {
        return this.postRepository.findAll();
    }
}
