package com.yys.dao;

import com.yys.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository(value="userDao")
public interface UserDao {

    User select(@Param("name") String name,@Param("pwd") String pwd,@Param("id") Integer id);
}
