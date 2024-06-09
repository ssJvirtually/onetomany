package tech.ssjvirtually.hibernate_onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ssjvirtually.hibernate_onetomany.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
