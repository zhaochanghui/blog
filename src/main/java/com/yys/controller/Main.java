package com.yys.controller;

import com.yys.service.ArticleService;
import com.yys.service.CategoryService;
import com.yys.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class Main {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ArticleService articleService;

    @Autowired
    UserService userService;

    public static void main(String[] args){
    }

    @Test
    public void demo1()
    {
        System.out.println(userService.select("admin","615331",null));
    }
}
