package com.fiap.citieye.services.impl;

import com.fiap.citieye.model.Category;
import com.fiap.citieye.repository.CategoryRepository;
import com.fiap.citieye.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

}
