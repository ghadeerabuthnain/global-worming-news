package com.slitherine.gw.controller;

import com.slitherine.gw.model.post;
import com.slitherine.gw.service.postService;
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
public class postController {

    @Autowired
    public postService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<post> getAllPost(){
        return service.getAllpost();
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public Optional<post> getPostById(@PathVariable int id)
    {
        return service.getPostById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public post addPost(@RequestBody post newPost){
        return service.addPost(newPost);
    }

}
