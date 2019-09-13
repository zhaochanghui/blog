package com.yys.service.impl;

import com.yys.dao.CategoryDao;
import com.yys.entity.Category;
import com.yys.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Resource
    CategoryDao categoryDao;


    @Override
    public void insert(Category category) {
        category.setPid(0);
        categoryDao.insert(category);
    }

    @Override
    public void delete(Integer id) {
        categoryDao.delete(id);
    }

    @Override
    public void update(Category category) {
        categoryDao.update(category);
    }

    public Category select(int id){
        return categoryDao.select(id);
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }


}
