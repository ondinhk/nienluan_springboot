package com.ondinhk.nienluan.service;

import com.ondinhk.nienluan.model.Comments;
import com.ondinhk.nienluan.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServiceImlp implements ICommentsService{
    @Autowired
    private CommentsRepository commentsRepository;
    @Override
    public List<Comments> getComment(Long idHouse) {
        return commentsRepository.findCommentById(idHouse);
    }
}
