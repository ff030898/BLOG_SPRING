package com.spring.blog2.service;

import com.spring.blog2.model.Post;

import java.util.List;

public interface CodeBlogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
