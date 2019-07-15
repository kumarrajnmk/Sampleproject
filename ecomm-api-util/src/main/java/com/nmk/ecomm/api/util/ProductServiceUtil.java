package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.Product;
import com.nmk.ecomm.service.entity.EcommProduct;

/**
 * @author NMK OPT 1
 *
 */
public class ProductServiceUtil {
	public static Product convertEcommProductObjectToProduct(final EcommProduct ecommProduct) {
		final Product product = new Product();
		try {
			BeanUtils.copyProperties(product, ecommProduct);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return product;
	}

	public static EcommProduct convertProductToEcommProduct(final Product product) {
		final EcommProduct ecommProduct = new EcommProduct();
		try {
			BeanUtils.copyProperties(ecommProduct, product);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return ecommProduct;
	}

	public static List<Product> convertEcommProductListToProduct(final List<EcommProduct> ecommProductList) {
		final List<Product> orderList = new ArrayList<Product>();
		try {
			for (final EcommProduct ecommProduct : ecommProductList) {
				final Product order = new Product();
				BeanUtils.copyProperties(order, ecommProduct);
				orderList.add(order);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return orderList;
	}
}
