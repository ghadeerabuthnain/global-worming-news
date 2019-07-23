package com.slitherine.gw.service;

import com.slitherine.gw.model.comment;
import com.slitherine.gw.repository.commentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class commentService {
    @Autowired
    public commentRepository repository;

//    add new comment
    public comment addComment(comment newComment)
    {
        newComment.createdDate = java.time.LocalDateTime.now();
        return repository.save(newComment);
    }

//    delete a comment
    public void deleteComment(int id)
    {
        repository.deleteById(id);
    }

//    get a post comments
    public Page<comment> getComments(int postId, Pageable pageable)
    {
        return repository.findByPostId(postId, pageable);
    }

}
