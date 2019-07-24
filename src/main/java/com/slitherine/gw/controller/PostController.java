package com.slitherine.gw.controller;

import com.slitherine.gw.model.Post;
import com.slitherine.gw.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by LAMA ALOSAIMI on 7/22/19 at 8:51 PM.
 */
@RestController
@RequestMapping("/post/")
public class PostController {

    @Autowired
    public PostService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<Post> getAllPost(){
        return service.getAllPosts();
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public Optional<Post> getPostById(@PathVariable int id)
    {
        return service.getPostById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Post addPost(@RequestBody Post newPost){
        return service.addPost(newPost);
    }

}
