package com.nmk.ecomm.web.service.intf;

import java.util.List;

import com.nmk.ecomm.model.Product;
import com.nmk.ecomm.web.vo.ProductVO;

/**
 * @author NMK OPT 1
 *
 */
public interface ERetailProductService {

	void createProduct(ProductVO productVO);

	ProductVO getProductByIdx(int id);

	void deleteProduct(int id);

	void updateProduct(ProductVO productVO);

	List<ProductVO> getAllProduct();

	List<Product> test();
}
