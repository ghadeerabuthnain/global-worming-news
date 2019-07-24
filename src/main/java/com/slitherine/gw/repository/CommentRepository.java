package com.slitherine.gw.repository;

import com.slitherine.gw.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.util.List;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    public Page<Comment> findByPostId(int postId, Pageable pageable);
}