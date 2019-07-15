package com.nmk.ecomm.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nmk.ecomm.api.client.CategoryServiceClient;
import com.nmk.ecomm.model.Category;
import com.nmk.ecomm.web.service.intf.ERetailCategoryService;
import com.nmk.ecomm.web.util.CategoryWebUtil;
import com.nmk.ecomm.web.vo.CategoryVO;

/**
 * @author NMK OPT 1
 *
 */
@Service
public class ERetailCategoryServiceImpl implements ERetailCategoryService {
	private static final Logger LOGGER = Logger.getLogger(ERetailCategoryServiceImpl.class);

	public CategoryVO getCategoryByIdx(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCategoryServiceImpl.getCategoryByIdx()");
		}
		final Category category = CategoryServiceClient.getCategoryByIdx(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCategoryServiceImpl.getCategoryByIdx()");
		}
		return CategoryWebUtil.convertCategoryToCategoryVO(category);
	}

	public void createCategory(final CategoryVO categoryVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCategoryServiceImpl.createCategory()");
		}
		final Category category = CategoryWebUtil.convertCategoryVOObjectToCategory(categoryVO);
		CategoryServiceClient.createCategory(category);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCategoryServiceImpl.createCategory()");
		}
	}

	public void updateCategory(final CategoryVO categoryVO, final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCategoryServiceImpl.updateCategory()");
		}
		final Category category = CategoryWebUtil.convertCategoryVOObjectToCategory(categoryVO);
		// CategoryServiceClient.updateCategory(category,id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCategoryServiceImpl.updateCategory()");
		}
	}

	public void deleteCategory(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCategoryServiceImpl.deleteCategory()");
		}
		CategoryServiceClient.deleteCategory(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCategoryServiceImpl.deleteCategory()");
		}
	}

	public List<CategoryVO> getAllCategory() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCategoryServiceImpl.getAllCategory()");
		}
		List<Category> categories = (List<Category>) CategoryServiceClient.getAllCategory();
		final List<CategoryVO> categoryVOList = CategoryWebUtil.convertCategoryListToCategoryVOList(categories);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCategoryServiceImpl.getAllCategory()");
		}
		return null;
	}

	public List<Category> test() {
		// TODO Auto-generated method stub
		return null;
	}

}
