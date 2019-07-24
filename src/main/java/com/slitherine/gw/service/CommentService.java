package com.slitherine.gw.service;

import com.slitherine.gw.model.Comment;
import com.slitherine.gw.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    public CommentRepository repository;

    public Comment addComment(Comment newComment)
    {
        newComment.setCreatedDate( java.time.LocalDateTime.now());
        return repository.save(newComment);
    }

    public void deleteComment(int id)
    {
        repository.deleteById(id);
    }

    public Page<Comment> getPostComments(int postId, Pageable pageable)
    {
        return repository.findByPostId(postId, pageable);
    }

    public List<Comment> getAllComments()
    {
        return repository.findAll();
    }

    public Optional<Comment> getCommentById(int id)
    {
        return repository.findById(id);
    }


}
