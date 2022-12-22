package com.example.forumserve.service.impl;

import com.example.forumserve.dao.titleDao;
import com.example.forumserve.mybatis.entity.title;
import com.example.forumserve.service.Service.titleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class titleImpl implements titleService {
    @Autowired
    private titleDao titleAut;
    @Override
    public List<title> findAllTitleByPage(Integer curPage, Integer pageSize, String titleName, Integer userId, Integer gameId) {
        return titleAut.findAllTitleByPage(curPage,pageSize,titleName,userId,gameId);
    }

    @Override
    public void addTitle(title title) {titleAut.addTitle(title);}

    @Override
    public void delTitleByIds(List<Integer> titleIds) {titleAut.delTitleByIds(titleIds);}

    @Override
    public void delTitleById(Integer titleId) {titleAut.delTitleById(titleId);}

    @Override
    public void updateTitle(title title) {titleAut.updateTitle(title);}

    @Override
    public Integer getAllTitleCount() {return titleAut.getAllTitleCount();}
}
