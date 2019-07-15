package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.Product;
import com.nmk.ecomm.web.vo.ProductVO;

/**
 * @author NMK OPT 1
 *
 */
public class ProductWebUtil {
	public static Product convertProductVOObjectToProduct(final ProductVO productVO) {
		final Product product = new Product();
		try {
			BeanUtils.copyProperties(product, productVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return product;
	}

	public static ProductVO convertProductToProductVO(final Product product) {
		final ProductVO productVO = new ProductVO();
		try {
			BeanUtils.copyProperties(productVO, product);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return productVO;
	}

	public static List<ProductVO> convertProductListToProductVOList(final List<Product> products) {
		final List<ProductVO> productList = new ArrayList<ProductVO>();
		try {
			BeanUtils.copyProperties(productList, products);

		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return productList;
	}

}
