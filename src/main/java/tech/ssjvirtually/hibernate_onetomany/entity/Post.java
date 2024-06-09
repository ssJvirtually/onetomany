package tech.ssjvirtually.hibernate_onetomany.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    @OneToMany(mappedBy = "post")
    @JsonIgnoreProperties("post")
    private List<Comment> commentList;
}