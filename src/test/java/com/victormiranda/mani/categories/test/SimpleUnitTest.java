package com.victormiranda.mani.categories.test;

import com.victormiranda.mani.categories.service.CategoryService;
import com.victormiranda.mani.categories.service.CategoryServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class SimpleUnitTest {

    @Test
    public void testUnit() {
        CategoryService categoryService = new CategoryServiceImpl();
        Assert.assertNull(categoryService.dummy());

    }
}
