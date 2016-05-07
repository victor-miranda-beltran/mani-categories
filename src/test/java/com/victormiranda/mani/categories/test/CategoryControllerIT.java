package com.victormiranda.mani.categories.test;

import com.victormiranda.mani.categories.App;
import com.victormiranda.mani.categories.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class CategoryControllerIT {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void testInjection() {
        Assert.assertNotNull(categoryService);
        Assert.assertEquals(categoryService.categorize(), "sad");
    }
}
