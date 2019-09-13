package com.yys.service.impl;

import com.yys.dao.ArticleDao;
import com.yys.entity.Article;
import com.yys.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("articleService" )
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleDao articleDao;

    @Override
    public void insert(Article article) {
        articleDao.insert(article);
    }

    @Override
    public List<Article> getAll() {
        return articleDao.getAll();
    }
}
