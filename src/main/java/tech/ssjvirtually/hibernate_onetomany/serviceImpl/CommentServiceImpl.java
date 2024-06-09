package tech.ssjvirtually.hibernate_onetomany.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.ssjvirtually.hibernate_onetomany.entity.Comment;
import tech.ssjvirtually.hibernate_onetomany.repo.CommentRepository;
import tech.ssjvirtually.hibernate_onetomany.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepository commentRepo;
    @Override
    public void save(Comment comment) {
        commentRepo.save(comment);
    }
    @Override
    public List <Comment> findAll() {
        return commentRepo.findAll();
    }
}