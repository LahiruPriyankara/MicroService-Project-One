package com.lhu.catBillerInfo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/categoryBillerInfo")
public class CategoryBillerInfoController {
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/category")
	public CategoryList getCategories() {
		CategoryList categoryList = restTemplate.getForObject("http://category-info/categoryInfo/category",CategoryList.class);
		return categoryList;
	}

	@RequestMapping("/category/{categoryId}")
	public Category getCategory(@PathVariable("categoryId") String categoryId) {
		// Category category = restTemplate.getForObject("http://localhost:8082/categoryInfo/category/" + categoryId, Category.class);
		Category category = restTemplate.getForObject("http://category-info/categoryInfo/category/" + categoryId,Category.class);
		return category;
	}

	@RequestMapping("/biller")
	public BillerList getbillers() {
		BillerList billerList = restTemplate.getForObject("http://biller-info/billerInfo/biller",BillerList.class);
		return billerList;
	}

	@RequestMapping("/biller/{billerId}")
	public Biller getCatalog(@PathVariable("billerId") String billerId) {
		Biller biller = restTemplate.getForObject("http://biller-info/billerInfo/biller/" + billerId, Biller.class);
		return biller;
	} 

}
