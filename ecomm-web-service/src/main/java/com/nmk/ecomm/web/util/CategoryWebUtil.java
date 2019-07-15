package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.Category;
import com.nmk.ecomm.web.vo.CategoryVO;

/**
 * @author NMK OPT 1
 *
 */
public class CategoryWebUtil {
	public static Category convertCategoryVOObjectToCategory(final CategoryVO categoryVO) {
		final Category category = new Category();
		try {
			BeanUtils.copyProperties(category, categoryVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return category;
	}

	public static CategoryVO convertCategoryToCategoryVO(final Category category) {
		final	CategoryVO categoryVO = new CategoryVO();
		try {
			BeanUtils.copyProperties(categoryVO, category);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return categoryVO;
	}

	public static List<CategoryVO> convertCategoryListToCategoryVOList(final List<Category> categories) {
		final List<CategoryVO> categoryList = new ArrayList<CategoryVO>();
		try {
			for (final Category category : categories) {
				final CategoryVO categoryVO = new CategoryVO();
				BeanUtils.copyProperties(categoryVO, category);
				categoryList.add(categoryVO);
			}
		} catch (IllegalAccessException e) {
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return categoryList;
	}
}
