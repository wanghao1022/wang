package com.bjpowernode.model.service;

import com.bjpowernode.entity.User;
import com.bjpowernode.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/15 9:32
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class UserService  implements IUserService{

    @Autowired
    private UserDao userDao;


    @Override
    public User selectByAll(Integer pid,String username) {
        return userDao.selectByAll(pid,username);
    }
}
