package com.slitherine.gw.service;

import com.slitherine.gw.model.Post;
import com.slitherine.gw.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by LAMA ALOSAIMI on 7/22/19 at 8:31 PM.
 */
@Service
public class PostService {

    @Autowired
    public PostRepository repository;

    public List<Post> getAllPosts()
    {
        return repository.findAll();
    }

    public Optional<Post> getPostById(int id) {
        return repository.findById(id);
    }

    public  Post addPost(Post newPost) {
        newPost.setCreatedDate(java.time.LocalDateTime.now());
            return repository.save(newPost);
    }
}
