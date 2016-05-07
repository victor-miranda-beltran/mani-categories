package com.victormiranda.mani.categories.controller;

import com.victormiranda.mani.bean.category.Category;
import com.victormiranda.mani.type.TransactionFlow;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CategoryController {

    @RequestMapping(value = "/get")
    public Optional<Category> categorize() {
        return Optional.of(new Category(1, "Tesco store", TransactionFlow.OUT, Optional.empty()));
    }

    @RequestMapping("/empty")
    public Optional<Category> categorizeEmpty() {
        return Optional.empty();
    }

}
