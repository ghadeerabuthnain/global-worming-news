package com.slitherine.gw.controller;

import com.slitherine.gw.model.comment;
import com.slitherine.gw.service.commentService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.lang.reflect.Method;

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
    public void deleteComment(@PathVariable int id){
        service.deleteComment(id);
    }

//    get a post comments
    @RequestMapping(method=RequestMethod.GET, path = "{postId}/comments")
    public Page<comment> getComments(@PathVariable (value = "postId") int postId,
                                                Pageable pageable) {
        return service.getComments(postId, pageable);
    }
}
