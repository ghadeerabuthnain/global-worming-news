package com.slitherine.gw.service;

import com.slitherine.gw.model.post;
import com.slitherine.gw.repository.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by LAMA ALOSAIMI on 7/22/19 at 8:31 PM.
 */
@Service
public class postService {

    @Autowired
    public postRepository repository;

    public List<post> getAllpost()
    {
        return repository.findAll();
    }

    public Optional<post> getPostById(int id) {
        return repository.findById(id);
    }

    public  post addPost(post newPost) {
        newPost.createdDate = java.time.LocalDateTime.now();
            return repository.save(newPost);
    }
}
