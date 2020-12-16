package com.bjpowernode.model.service;

import com.bjpowernode.entity.User;

/**
 * @ProjectName: 01-ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: 王浩
 * @CreateDate: 2020/12/15 9:31
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface IUserService {

    User selectByAll(Integer pid,String username);
}
