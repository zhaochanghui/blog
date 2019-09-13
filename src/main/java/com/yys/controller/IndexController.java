package com.yys.controller;

import com.yys.entity.Category;
import com.yys.service.CategoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller(value = "indexController")
public class IndexController {


    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/out",method = RequestMethod.GET)
    @ResponseBody
    public String out(HttpServletRequest request)
    {
        Category category = categoryService.select(2);
        System.out.println(category);
        System.out.println(request.getParameter("name"));
        return "输出";
    }

    @RequestMapping(value = "/to_login",method = RequestMethod.GET)
    public String tologin()
    {
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(@Param("name") String name)
    {
        List<Category> list = categoryService.getAll();
        System.out.println(list);
        return "输出:"+name;
    }
}
