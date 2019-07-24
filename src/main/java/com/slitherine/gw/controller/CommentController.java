package com.slitherine.gw.controller;

import com.slitherine.gw.model.Comment;
import com.slitherine.gw.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comment/")
public class CommentController {
    @Autowired
    public CommentService service;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Comment addComment(@RequestBody Comment newComment)
    {
        return service.addComment(newComment);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "{id}")
    public void deleteComment(@PathVariable (value = "id") int id){
        service.deleteComment(id);
    }

    @RequestMapping(method=RequestMethod.GET, path = "{postId}/comments")
    public Page<Comment> getComments(@PathVariable (value = "postId") int postId,
                                     Pageable pageable) {
        return service.getPostComments(postId, pageable);
    }

    @RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Comment> getAllComments()
    {
        return service.getAllComments();
    }

    @RequestMapping(method = RequestMethod.GET, path = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Comment> getCommentById(@PathVariable (value = "id") int id)
    {
        return service.getCommentById(id);
    }
}
