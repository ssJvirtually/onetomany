package tech.ssjvirtually.hibernate_onetomany.service;

import tech.ssjvirtually.hibernate_onetomany.entity.Comment;

import java.util.List;
public interface CommentService {
    void save(Comment comment);
    List<Comment> findAll();
}