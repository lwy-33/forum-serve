package com.example.forumserve.dao;

import com.example.forumserve.mybatis.entity.thumbs;
import com.example.forumserve.mybatis.entity.title;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface titleDao {
    public void incrementalThumbs(Integer titleId);//点赞递增，当用户点赞帖子时触发
    public title idGetTitle(Integer titleId); //根据titleID找到用户，用途：1、通知时查找用户
    public void DecrementThumbs(Integer titleId);
    public List<title> findAllTitleByPage(@Param("curPage")Integer curPage,
                                          @Param("pageSize")Integer pageSize,
                                          @Param("titleName")String titleName,
                                          @Param("userId")Integer userId,
                                          @Param("gameId")Integer gameId);
    public Integer getAllTitleCount();
    public void addTitle(title title);
    public void delTitleByIds(List<Integer> titleIds);
    public void delTitleById(Integer titleId);
    public void updateTitle(title title);
}
