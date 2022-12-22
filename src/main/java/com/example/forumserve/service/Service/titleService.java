package com.example.forumserve.service.Service;

import com.example.forumserve.mybatis.entity.title;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface titleService {
    public List<title> findAllTitleByPage(Integer curPage,
                                          Integer pageSize,
                                          String titleName,
                                          Integer userId,
                                          Integer gameId);
    public void addTitle(title title);
    public void delTitleByIds(List<Integer> titleIds);
    public void delTitleById(Integer titleId);
    public void updateTitle(title title);
    public Integer getAllTitleCount();
}
