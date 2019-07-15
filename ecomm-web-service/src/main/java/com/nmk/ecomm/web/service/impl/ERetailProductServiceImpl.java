package com.nmk.ecomm.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nmk.ecomm.api.client.ProductServiceClient;
import com.nmk.ecomm.model.Product;
import com.nmk.ecomm.web.service.intf.ERetailProductService;
import com.nmk.ecomm.web.util.ProductWebUtil;
import com.nmk.ecomm.web.vo.ProductVO;

/**
 * @author NMK OPT 1
 *
 */
@Service
public class ERetailProductServiceImpl implements ERetailProductService {
	private static final Logger LOGGER = Logger.getLogger(ERetailProductServiceImpl.class);

	public void createProduct(final ProductVO productVO) {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.createProduct()");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details Received from Product: " + productVO);
			}
			final Product product = ProductWebUtil.convertProductVOObjectToProduct(productVO);

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Prduct Found? " + product);
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.createProduct()");
			}

			ProductServiceClient.createProduct(product);

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ERetailProductServiceImpl.createProduct()");
			}
		} catch (NumberFormatException e1) {
			LOGGER.error(" ERROR : createProduct() METHOD GOT INVOKED ");

		}
	}

	public ProductVO getProductByIdx(final int id) {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.getProductByIdx()");
			}
			final Product product = ProductServiceClient.getProductByIdx(id);

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details Received from Product: " + product);
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Prduct Found? " + product);
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.getProductByIdx()");
			}

			ProductServiceClient.getProductByIdx(id);

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ERetailProductServiceImpl.getProductByIdx()");
			}
		} catch (NumberFormatException e1) {
			LOGGER.error(" ERROR : getProductByIdx() METHOD GOT INVOKED ");

		}
		return null;
	}

	public void deleteProduct(final int id) {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.deleteProduct()");
			}
			ProductServiceClient.deleteProduct(id);

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details Deleted from Product: " + id);
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Prduct Found? " + id);
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.deleteProduct()");
			}

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ERetailProductServiceImpl.deleteProduct()");
			}
		}

		catch (NumberFormatException e1) {
			LOGGER.error(" ERROR : deleteProduct() METHOD GOT INVOKED ");

		}

	}

	public void updateProduct(final ProductVO productVO) {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.updateProduct()");
			}

			Product product = ProductWebUtil.convertProductVOObjectToProduct(productVO);

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details Updated from Product: " + product);
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Prduct Found? " + product);
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.updateProduct()");
			}
			ProductServiceClient.updateProduct(product);

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ERetailProductServiceImpl.updateProduct()");
			}
		}

		catch (NumberFormatException e1) {
			LOGGER.error(" ERROR : updateProduct() METHOD GOT INVOKED ");

		}

	}

	public List<ProductVO> getAllProduct() {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.getAllProduct()");
			}

			final List<Product> products = (List<Product>) ProductServiceClient.getAllUsers();

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details Received from Product: " + products);
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Prduct Found? " + products);
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.getAllProduct()");
			}
			final List<ProductVO> productVOList = ProductWebUtil.convertProductListToProductVOList(products);

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ERetailProductServiceImpl.getAllProduct()");
			}
		}

		catch (NumberFormatException e1) {
			LOGGER.error(" ERROR : getAllProduct() METHOD GOT INVOKED ");

		}
		return null;

	}

	public void addToCart() {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.addToCart()");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details Added to Cart from Product: ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Prduct Found? ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.addToCart()");
			}

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ERetailProductServiceImpl.addToCart()");
			}
		}

		catch (NumberFormatException e1) {
			LOGGER.error(" ERROR : addToCart() METHOD GOT INVOKED ");

		}

	}

	public void itemsInCart() {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.itemsInCart()");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details of itemsin cart from Product: ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Prduct Found? ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.itemsInCart()");
			}

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ERetailProductServiceImpl.itemsInCart()");
			}
		}

		catch (NumberFormatException e1) {
			LOGGER.error(" ERROR : itemsInCart() METHOD GOT INVOKED ");

		}
	}

	public void displayOffers() {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.displayOffers()");
				ProductServiceClient.getAllProduct();
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details Received from Product: ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Prduct Found? ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.displayOffers()");
			}

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ERetailProductServiceImpl.displayOffers()");
			}
		}

		catch (NumberFormatException e1) {
			LOGGER.error(" ERROR : displayOffers() METHOD GOT INVOKED ");

		}

	}

	public void getAllProducts() {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.getAllProducts()");
				ProductServiceClient.getAllProduct();
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details Received from Product: ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Prduct Found? ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.getAllProducts()");
			}

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ERetailProductServiceImpl.getAllProducts()");
			}
		}

		catch (NumberFormatException e1) {
			LOGGER.error(" ERROR : getAllProducts() METHOD GOT INVOKED ");

		}

	}

	public List<Product> test() {
		// TODO Auto-generated method stub
		return null;
	}

}
