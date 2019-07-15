package com.nmk.ecomm.web.service.intf;

import java.util.List;

import com.nmk.ecomm.model.Category;
import com.nmk.ecomm.web.vo.CategoryVO;

/**
 * @author NMK OPT 1
 *
 */
public interface ERetailCategoryService {

	void deleteCategory(int id);

	void updateCategory(CategoryVO categoryVO, int id);

	void createCategory(CategoryVO categoryVO);

	CategoryVO getCategoryByIdx(int id);

	List<Category> test();
	
}
     