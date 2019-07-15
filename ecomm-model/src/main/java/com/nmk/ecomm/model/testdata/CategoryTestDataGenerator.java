package com.nmk.ecomm.model.testdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nmk.ecomm.model.CardType;
import com.nmk.ecomm.model.Category;

public abstract class CategoryTestDataGenerator {
	static List<Category> categoryList = new ArrayList<Category>();
	static {
		Category category1 = new Category("Dell", "Dell", "admin", new Date(2017, 9, 10), "admin", new Date());
		category1.setIdx(1);
		
		Category category2 = new Category("HP", "HP", "admin", new Date(2015, 10, 6), "admin", new Date());
		category2.setIdx(2);
		
		Category category3 = new Category("Haldiram", "Haldiram", "admin1", new Date(2016, 4, 4), "admin", new Date());
		category3.setIdx(3);
	
		
		Category category4 = new Category("McGraw-Hill", "McGraw-Hill", "admin1", new Date(2012, 11, 10), "admin", new Date());
		category4.setIdx(4);
		
		Category category5 = new Category("Wilson", "Wilson", "admin", new Date(2014, 2, 2), "admin", new Date());
		category5.setIdx(5);
		
		categoryList.add(category1);
		categoryList.add(category2);
		categoryList.add(category3);
		categoryList.add(category4);
		categoryList.add(category5);
	}
	public static List<Category> getAllCardTypes() {
	    return categoryList;
	}
}
