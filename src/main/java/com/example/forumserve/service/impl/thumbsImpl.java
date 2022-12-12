package com.example.forumserve.service.impl;

import com.example.forumserve.dao.*;
import com.example.forumserve.mybatis.entity.notice;
import com.example.forumserve.mybatis.entity.thumbs;
import com.example.forumserve.service.Service.thumbsService;
import com.example.forumserve.utils.noticeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class thumbsImpl implements thumbsService {
    @Autowired
    public userDao userdao;

    @Autowired
    public thumbsDao thumbsdao;

    @Autowired
    public titleDao titledao;

    @Autowired
    public commentDao commentdao;

    @Autowired
    public noticeDao noticedao;

    @Override
    public void addThumbs(thumbs da) {
        /*功能简介：
            点赞涉及的表：thumbs(点赞表)、title(帖子)、comment(评论表)
            原因：添加到点赞表后进行统计
            约定：BethumbsTypeId中0代表帖子点赞，1代表评论点赞
         */
        thumbsdao.addThumbs(da);
        //给被点的用户发通知(根据帖子或评论id找人，方便通知)
        notice no=new notice(-1,da.getUserId(),-1,null,da.getThumbsTime(),0,"","");
        if(da.getBethumbsTypeId()==0){//帖子点赞
             //根据帖子id找到发布的全部信息，在全部信息中提出发布者
            no.setBeuserId(titledao.idGetTitle(da.getbethumbsId()).getUserId());
            //对通知内容格式化
//            System.out.println(""+userdao.idGetUser(da.getUserId()).getNickname()+"对你举手表示赞成");
            no.setNoticeContent(new noticeUtil().noticeTemplates(no,"点赞",userdao.idGetUser(da.getUserId()).getNickname()));
            //对帖子的thumbsCount的字段+1
            titledao.incrementalThumbs(da.getbethumbsId());
            System.out.println("id为"+da.getbethumbsId()+"的帖子点赞+1");
        }else{//评论点赞
            //根据找到评论id的全部信息，在全部信息中提出发布者
            no.setBeuserId(commentdao.idGetComment(da.getbethumbsId()).getUserId());
            //对通知内容格式化
            no.setNoticeContent(new noticeUtil().noticeTemplates(no,"点赞",userdao.idGetUser(da.getUserId()).getNickname()));
            //对评论的commentCount的字段+1
            commentdao.incrementalThumbs(da.getbethumbsId());
            System.out.println("id为"+da.getbethumbsId()+"的评论点赞+1");
        }
        noticedao.addNotice(no);

    }

    @Override
    public List<thumbs> judgeThumbs(thumbs da) {
        return thumbsdao.judgeThumbs(da);
    }

    @Override
    public void delThumbs(thumbs da) {//取消点赞
        /*功能简介：
            取消点赞涉及的表：thumbs(点赞表)、title(帖子)、comment(评论表)
            约定：BethumbsTypeId中0代表帖子点赞，1代表评论点赞
         */
        thumbsdao.delThumbs(da);
        //给被点的用户发通知(根据帖子或评论id找人，方便通知)
        notice no=new notice(-1,da.getUserId(),-1,null,da.getThumbsTime(),0,"","");
        if(da.getBethumbsTypeId()==0){//帖子点赞
            //根据帖子id找到发布的全部信息，在全部信息中提出发布者
            no.setBeuserId(titledao.idGetTitle(da.getbethumbsId()).getUserId());
            //对通知内容格式化
            no.setNoticeContent(new noticeUtil().noticeTemplates(no,"取消点赞",userdao.idGetUser(da.getUserId()).getNickname()));
            //对帖子的thumbsCount的字段+1
            titledao.DecrementThumbs(da.getbethumbsId());
            System.out.println("id为"+da.getbethumbsId()+"的帖子点赞-1");
        }else{//评论点赞
            //根据找到评论id的全部信息，在全部信息中提出发布者
            no.setBeuserId(commentdao.idGetComment(da.getbethumbsId()).getUserId());
            //对通知内容格式化
            no.setNoticeContent(new noticeUtil().noticeTemplates(no,"取消点赞",userdao.idGetUser(da.getUserId()).getNickname()));
            //对评论的commentCount的字段+1
            commentdao.DecrementThumbs(da.getbethumbsId());
            System.out.println("id为"+da.getbethumbsId()+"的评论点赞-1");
        }
        noticedao.addNotice(no);
    }
}
