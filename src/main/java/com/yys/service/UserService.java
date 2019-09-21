package com.yys.service;

import com.yys.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User select(@Param("name") String name,@Param("pwd") String pwd,@Param("id") Integer id);;
}
