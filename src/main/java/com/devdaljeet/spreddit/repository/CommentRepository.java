package com.devdaljeet.spreddit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devdaljeet.spreddit.model.Comment;
import com.devdaljeet.spreddit.model.Post;
import com.devdaljeet.spreddit.model.User;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
