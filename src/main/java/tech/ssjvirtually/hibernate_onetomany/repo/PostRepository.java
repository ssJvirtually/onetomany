package tech.ssjvirtually.hibernate_onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ssjvirtually.hibernate_onetomany.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
