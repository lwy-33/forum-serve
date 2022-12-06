package com.example.forumserve.utils;


import com.example.forumserve.dao.userDao;
import com.example.forumserve.mybatis.entity.notice;
import com.example.forumserve.mybatis.entity.user;
import org.springframework.beans.factory.annotation.Autowired;

//类简介：这是一个给通知套模板的一个工具类
public class noticeUtil {

    public String noticeTemplates(notice da,String type,String nickname){

        if(type.equals("点赞")){
            return ""+nickname+"对你举手表示赞成";
        }else if(type.equals("取消点赞")){
            return ""+nickname+"对你的观点思考再三，感觉不太行";
        }else if(type.equals("关注")){
            return ""+nickname+"加入了你的粉丝大家庭，这就是实力";
        }else if(type.equals("取消关注")){
            return ""+nickname+"离开了你的粉丝大家庭，加油吧";
        }else if(type.equals("官方")){
            return "系统通知：\n";
        }
        return "获取不到通知";
    }
}
