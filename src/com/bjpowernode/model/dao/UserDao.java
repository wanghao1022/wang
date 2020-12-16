package com.bjpowernode.model.dao;

import com.bjpowernode.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;

public interface UserDao {
    int deleteByPrimaryKey(Integer pid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer pid);

    User selectByAll(@Param("pid") Integer pid, @Param("username") String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}