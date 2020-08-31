package com.spring.blog2.repository;

import com.spring.blog2.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeBlogRepository extends JpaRepository<Post, Long> {
}
