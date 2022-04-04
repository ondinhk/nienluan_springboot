package com.ondinhk.nienluan.repository;

import com.ondinhk.nienluan.model.Comments;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CommentsRepository extends MongoRepository<Comments, String> {
    @Query("{'idHouse': ?0 }")
    List<Comments> findCommentById(Long idHouse);
}
