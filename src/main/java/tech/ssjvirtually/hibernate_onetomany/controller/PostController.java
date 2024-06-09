package tech.ssjvirtually.hibernate_onetomany.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.ssjvirtually.hibernate_onetomany.entity.Post;
import tech.ssjvirtually.hibernate_onetomany.service.PostService;

@RestController
@RequestMapping("/api")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("/post/save")
    public ResponseEntity<?> save(@RequestBody Post post) {
        Map<String, Object> respPost = new LinkedHashMap<String, Object>();
        // saving Post into db
        postService.save(post);
        respPost.put("status", 1);
        respPost.put("message", "Record is Saved Successfully!");
        return new ResponseEntity<>(respPost, HttpStatus.CREATED);
    }

    @GetMapping("/post/list")
    public ResponseEntity<?> getPosts() {
        Map<String, Object> respPost = new LinkedHashMap<String, Object>();
        List<Post> postList = postService.findPostList();
        if (!postList.isEmpty()) {
            respPost.put("status", 1);
            respPost.put("data", postList);
            return new ResponseEntity<>(respPost, HttpStatus.OK);
        } else {
            respPost.clear();
            respPost.put("status", 0);
            respPost.put("message", "Data is not found");
            return new ResponseEntity<>(respPost, HttpStatus.NOT_FOUND);
        }
    }
}