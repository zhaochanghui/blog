package com.yys.controller;

import com.yys.entity.Article;
import com.yys.service.ArticleService;
import com.yys.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/to_add")
    public String toAdd(Map<String, Object> map) {
        map.put("article", new Article());
        map.put("categories", categoryService.getAll());
        return "/article/add";
    }


    @RequestMapping("/add")
    public String add(Article article) {

        return "redirect:list";
    }

    @RequestMapping("/list")
    public String list(Map<String,Object> map) {

        return "/article/list";
    }

}
