package com.lhu.catInfo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoryInfo")
public class CategoryInfoController {
	
	@RequestMapping("/category")
	public CategoryList getCategories() {
		CategoryList catList = new CategoryList();
		catList.setCatList(getCategoryList());
		return catList;
	}

	@RequestMapping("/category/{categoryId}")
	public Category getCategory(@PathVariable("categoryId") String categoryId) {
		List<Category> categoryList = getCategoryList();
		for (Category cat : categoryList) {
			if (cat.getCatId().equalsIgnoreCase(categoryId)) {
				return cat;
			}
		}
		return new Category();
	}

	public List<Category> getCategoryList() {
		List<Category> categoryList = new ArrayList<>();
		categoryList.add(new Category("C100", "Category One"));
		categoryList.add(new Category("C101", "Category Two"));
		return categoryList;
	}

}
