package com.example.forumserve.service.Service;

import com.example.forumserve.mybatis.entity.comment;

import java.util.List;

public interface commentService {
    public List<comment> GetCommentById(Integer usrId,Integer becommentId,Integer becommentTypeId);
    public void addComment(comment data);
}
