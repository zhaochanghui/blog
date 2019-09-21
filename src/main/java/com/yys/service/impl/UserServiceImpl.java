package com.yys.service.impl;

import com.yys.dao.UserDao;
import com.yys.entity.User;
import com.yys.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User select(@Param("name") String name, @Param("pwd") String pwd, @Param("id") Integer id) {
        return userDao.select(name,pwd,id);
    }
}
