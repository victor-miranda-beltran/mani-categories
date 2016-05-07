package com.victormiranda.mani.categories.service;

import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    public String categorize() {
        return "sad";
    }

    @Override
    public String hidden() {
        return null;
    }

    public Object dummy() {
        return null;
    }
}
