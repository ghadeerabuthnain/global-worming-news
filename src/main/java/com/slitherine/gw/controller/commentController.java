package com.slitherine.gw.controller;

import com.slitherine.gw.model.comment;
import com.slitherine.gw.service.commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comment/")
public class commentController {
    @Autowired
    public commentService service;

//    add comment
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public comment addComment(@RequestBody comment newComment)
    {
        return service.addComment(newComment);
    }

//    delete comment
    @RequestMapping(method = RequestMethod.DELETE, path = "{id}")
    public void deleteComment(@PathVariable (value = "id") int id){
        service.deleteComment(id);
    }

//    get a post comments
    @RequestMapping(method=RequestMethod.GET, path = "{postId}/comments")
    public Page<comment> getComments(@PathVariable (value = "postId") int postId,
                                     Pageable pageable) {
        return service.getPostComments(postId, pageable);
    }

//    get all comments
    @RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<comment> getAllComments()
    {
        return service.getAllComments();
    }

//    get comment by id
    @RequestMapping(method = RequestMethod.GET, path = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<comment> getCommentById(@PathVariable (value = "id") int id)
    {
        return service.getCommentById(id);
    }
}
