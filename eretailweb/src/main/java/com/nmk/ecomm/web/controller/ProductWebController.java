package com.nmk.ecomm.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nmk.ecomm.api.client.ProductServiceClient;
import com.nmk.ecomm.web.service.intf.ERetailProductService;

/**
 * @author NMK OPT 1
 *
 */
@Controller
public class ProductWebController {

	private static final Logger LOGGER = Logger.getLogger(ProductWebController.class);

	@Autowired
	static ERetailProductService eRetailProductService;

	@RequestMapping("/processsearch")
	public String searchProduct() {
		return "product/productsearchsuccess";
	}

	/**
	 * @return
	 */
	@RequestMapping("/displayproducts.do")
	public String displayAllProducts() {
		// System.out.println("ProductWebController.displayAllProducts()");

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(
						"Start: ProductWebController.displayAllProducts()" + eRetailProductService.getAllProduct());
			}
			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Credentials Received from Product: ");
			}
			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("User Found? ");
			}
			eRetailProductService.getAllProduct();

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ProductWebController.displayAllProducts()");
			}

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ProductServiceClient.displayAllProducts()");
			}
		} catch (NumberFormatException e1) {
			LOGGER.error(" ERROR : displayAllProducts() METHOD GOT INVOKED ");
			// display error page
		}

		return "pages/categories";
	}

	/**
	 * @return
	 */
	@RequestMapping("/getProductNames.do")
	public String getProductsForName() {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.getProductsForName()");
				ProductServiceClient.getAllProduct();
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details Received from Product: ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Prduct Found? ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.getProductsForName()");
			}

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ERetailProductServiceImpl.getProductsForName()");
			}
		}

		catch (NumberFormatException e1) {
			LOGGER.error(
					"####### End Exception in ProductWebController : getProductsForName() Method Got Invoked #######");

		}

		return "pages/categories";
	}

	/**
	 * @return
	 * 
	 */
	@RequestMapping("/getItemsFromCart.do")
	public String getItemsFromCart() {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.getItemsFromCart()");
				ProductServiceClient.getAllProduct();
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Items Received from Product: ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Prduct Found? ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.getItemsFromCart()");
			}

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ERetailProductServiceImpl.getItemsFromCart()");
			}
		}

		catch (NumberFormatException e1) {
			LOGGER.error(" ERROR : getItemsFromCart() METHOD GOT INVOKED ");

		}

		return "pages/cart";
	}

	/**
	 * @return
	 */
	@RequestMapping("/itemsInCart.do")
	public String itemsInCart() {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.itemsInCart()");
				ProductServiceClient.getAllProduct();
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details Received from Product: ");
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

		return "pages/checkout";
	}

	/**
	 * @param id
	 * @param modelandview
	 * @param model
	 * @return
	 */
	@RequestMapping("/addItemToCart.do")
	public String addToCart(@RequestParam("id") final String id, final ModelAndView modelandview, final Model model) {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.addToCart()");
				ProductServiceClient.getAllProduct();
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details Received from Product: ");
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

		return "pages/cart";
	}

	/**
	 * @param id
	 * @param modelandview
	 * @param model
	 * @return
	 */
	@RequestMapping("/checkout.do")
	public String checkOut(@RequestParam("id") final String id, final ModelAndView modelandview, final Model model) {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.checkOut()");
				ProductServiceClient.getAllProduct();
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details Received from Product: ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Prduct Found? ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.checkOut()");
			}

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ERetailProductServiceImpl.checkOut()");
			}
		}

		catch (NumberFormatException e1) {
			LOGGER.error(" ERROR : checkOut() METHOD GOT INVOKED ");

		}

		return "pages/checkout";
	}

	/**
	 * @return
	 */
	@RequestMapping("/offers.do")
	public String displayOffers() {

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
		return "pages/offers";
	}

	/**
	 * @param id
	 * @param modelandview
	 * @param model
	 * @return
	 * @throws NumberFormatException
	 */
	@RequestMapping("/getProduct3.do")
	public String getProducts(@RequestParam("id") final String id, final ModelAndView modelandview, final Model model)
			throws NumberFormatException {

		try {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.getProducts()");
				ProductServiceClient.getAllProduct();
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Product Details Received from Product: ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.trace("Prduct Found? ");
			}

			if (LOGGER.isTraceEnabled()) {
				LOGGER.debug("Start: ERetailProductServiceImpl.getProducts()");
			}

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("End: ERetailProductServiceImpl.getProducts()");
			}
		}

		catch (NumberFormatException e1) {
			LOGGER.error(" ERROR : getProducts() METHOD GOT INVOKED ");

		}

		return "pages/productdetails";
	}
}
