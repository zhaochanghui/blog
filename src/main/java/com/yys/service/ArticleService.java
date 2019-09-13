package com.yys.service;

import com.yys.entity.Article;

import java.util.List;

public interface ArticleService {
    void insert(Article article);
    List<Article> getAll();
}
