package com.ondinhk.nienluan.service;

import com.ondinhk.nienluan.model.Comments;

import java.util.List;

public interface ICommentsService {
//    List comments
    List<Comments> getComment(Long idHouse);

}
