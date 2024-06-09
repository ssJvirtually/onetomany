package tech.ssjvirtually.hibernate_onetomany.service;

import tech.ssjvirtually.hibernate_onetomany.entity.Post;

import java.util.List;

public interface PostService {
    void save(Post post);
    List<Post> findPostList();
    Post findById(Integer id);
}