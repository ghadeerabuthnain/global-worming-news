package com.slitherine.gw.controller;

import com.slitherine.gw.model.comment;
import com.slitherine.gw.service.commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteComment(@PathVariable int id){
        service.deleteComment(id);
    }

}
