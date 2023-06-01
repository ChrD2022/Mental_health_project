package com.capstoneproject.Empower.controller;

import com.capstoneproject.Empower.models.Affirmation;
import com.capstoneproject.Empower.models.Forum;
import com.capstoneproject.Empower.repository.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ForumController {

    @Autowired
    ForumRepository forumRepository;

    @GetMapping(value = "/forums")
    public ResponseEntity<List<Forum>> getAllForums(){
        return new ResponseEntity<>(forumRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/forums/{id}")
    public ResponseEntity getForum(@PathVariable Long id){
        return new ResponseEntity<>(forumRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/forums")
    public ResponseEntity<Forum> postForum(@RequestBody Forum forum){
        forumRepository.save(forum);
        return new ResponseEntity<>(forum, HttpStatus.CREATED);
    }

    @PutMapping("/forums/{id}")
    public ResponseEntity<?> saveForum(@RequestBody Forum forum, @PathVariable("id") String id) {
        forumRepository.save(forum);
        return new ResponseEntity<>(forum, HttpStatus.OK);
    }

    @PatchMapping(value = "/forums/{id}")
    public ResponseEntity<Forum> updatePartialForum(@RequestBody Forum forum){
        forumRepository.save(forum);
        return new ResponseEntity<>(forum, HttpStatus.OK);
    }

    @DeleteMapping(value = "/forums/{id}")
    public ResponseEntity<Forum> deleteForum(@PathVariable Long id){
        Forum found = forumRepository.getOne(id);
        forumRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
