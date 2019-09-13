package com.yys.dao;

import com.yys.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("articleDao")
public interface ArticleDao {
    void insert(Article article);
    List<Article> getAll();
}
