package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import com.nmk.ecomm.model.Category;
import com.nmk.ecomm.service.entity.EcommCategory;

/**
 * @author NMK OPT 1
 *
 */
public class CategoryServiceUtil {
	public static Category convertEcommCategoryObjectToCategory(final EcommCategory ecommCategory) {
		final Category category = new Category();
		try {
			BeanUtils.copyProperties(category, ecommCategory);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return category;
	}

	public static EcommCategory convertCategoryToEcommCategory(final Category category) {
		final EcommCategory ecommCategory = new EcommCategory();
		try {
			BeanUtils.copyProperties(ecommCategory, category);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return ecommCategory;
	}

	public static List<Category> convertEcommCategoryListToCategory(final List<EcommCategory> ecommCategoryList) {
		final List<Category> categoryList = new ArrayList<Category>();
		try {
			for (final EcommCategory ecommCategory : ecommCategoryList) {
				final Category category = new Category();
				BeanUtils.copyProperties(category, ecommCategory);
				categoryList.add(category);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return categoryList;
	}
}
