package com.yys.controller;

import com.yys.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-all.xml")
public class Main {

    @Autowired
    private CategoryService categoryService;

    public static void main(String[] args){
    }

    @Test
    public void demo1()
    {
        System.out.println(categoryService.getAll());
    }
}
