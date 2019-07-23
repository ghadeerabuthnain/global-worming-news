package com.slitherine.gw.service;

import com.slitherine.gw.model.comment;
import com.slitherine.gw.repository.commentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Page<comment> getPostComments(int postId, Pageable pageable)
    {
//        return repository.findByPostId(postId, pageable);
        return repository.findByPostId(postId, pageable);

    }

//    get all comments
    public List<comment> getAllComments()
    {
        return repository.findAll();
    }

//    get comment by id
    public Optional<comment> getCommentById(int id)
    {
        return repository.findById(id);
    }


}
