package tech.ssjvirtually.hibernate_onetomany.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
;
import tech.ssjvirtually.hibernate_onetomany.entity.Post;
import tech.ssjvirtually.hibernate_onetomany.repo.PostRepository;
import tech.ssjvirtually.hibernate_onetomany.service.PostService;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepo;
    @Override
    public void save(Post post) {
        postRepo.save(post);
    }
    @Override
    public List < Post > findPostList() {
        return postRepo.findAll();
    }
    @Override
    public Post findById(Integer id) {
        return postRepo.findById(id).get();
    }
}
