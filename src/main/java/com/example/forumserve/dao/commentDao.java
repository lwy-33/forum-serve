package com.example.forumserve.dao;

import com.example.forumserve.mybatis.entity.comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface commentDao {
    public void incrementalThumbs(Integer commentId);//赞计数器加一
    public  void DecrementThumbs(Integer commentId);//赞计数器减1
    public comment idGetComment(Integer commentId);//按照id找全部评论信息
    public List<comment> GetCommentById(@Param("userId")Integer userId,
                                        @Param("becommentId")Integer becommentId,
                                        @Param("becommentTypeId")Integer becommentTypeId);
    public void addComment(comment data);
    public Integer acquireReceivingUser(Integer becommentId);//传入comment.becommentId,传回comment.becommentId的userId
}
