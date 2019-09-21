package com.yys.dao;

import com.yys.entity.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("categoryDao")
public interface CategoryDao {
    void insert(Category category);
    void delete(Integer id);
    void update(Category category);
    Category select(Integer id);
    List<Category> getAll();
    List<Category> getByParam(@Param("limit") Integer limit);
}
