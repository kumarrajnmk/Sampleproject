package com.nmk.ecomm.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nmk.ecomm.model.Order;
import com.nmk.ecomm.model.Product;
import com.nmk.ecomm.web.service.intf.ERetailOrderService;
import com.nmk.ecomm.web.service.intf.ERetailProductService;
import com.nmk.ecomm.web.vo.OrderVO;
import com.nmk.ecomm.web.vo.ProductVO;

/**
 * OrderWebController
 *
 */
@Controller
public class OrderWebController {

	private static final Logger LOGGER = Logger.getLogger(OrderWebController.class);

	private ArrayList shoppingCart=new ArrayList();
	/**
	 * @eRetailOrderService
	 */
	@Autowired
	private static ERetailOrderService eRetailOrderService;
	
	/**
	 * @eRetailProductService
	 */
	@Autowired
	private static ERetailProductService eRetailProductService;

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping("/myorders.do")
	public String myOrders(final Model model) {
		if (LOGGER.isDebugEnabled()) {LOGGER.debug("start: OrderWebController.myOrders()");}
		if (LOGGER.isTraceEnabled()) { LOGGER.trace("User id received from client: ");}
		final List<OrderVO> list=eRetailOrderService.getAllOrder();
		model.addAttribute("list", list);	
		if (LOGGER.isTraceEnabled()) {LOGGER.trace("User Information received from servicecgetAllOrders():");}
		if (LOGGER.isDebugEnabled()) {LOGGER.debug("End: OrderWebController.getAllOrders()");}
		return "pages/myorders";
	}

	/**
	 * @param id
	 * @param modelandview
	 * @param model
	 * @return
	 */
	@RequestMapping("/placeorder1.do")
	public String placeorderedItems(@RequestParam ("id") final String id , final ModelAndView modelandview,final Model model){
		if (LOGGER.isDebugEnabled()) {LOGGER.debug("start: OrderWebController.placeorderedItems()");}
		if (LOGGER.isTraceEnabled()) {LOGGER.trace("Order id received from client: ");}
	final ProductVO product=eRetailProductService.getProductByIdx(Integer.parseInt(id));
		System.out.println("OrderWebController.placeorderedItems()"); 
		model.addAttribute("command",product);
		if (LOGGER.isTraceEnabled()) {LOGGER.trace("Order Information received from serviceplaceorderedItems():");}
		if (LOGGER.isDebugEnabled()) {LOGGER.debug("End: OrderWebController.placeorderedItems()");}
		return "pages/orderconfirmation";	
	}

	/**
	 * @param purchasedItems
	 * @param model
	 * @return
	 */
	@RequestMapping("/getItemsFromCart2.do")
	public String getItemsFromcart(@RequestParam("purchaseditems") final String purchasedItems,final Model model)
	{
		ArrayList<String> a = new ArrayList<>();
		
/*		System.out.println("CONNECTED TO CONTROLLER FOR GET ITEMS FROM CART");
		System.out.println(purchasedItems);
		
		StringTokenizer st=new StringTokenizer(purchasedItems," ");
		
		ArrayList list=new ArrayList();
		
		while(st.hasMoreTokens())
		{
			
			String token=st.nextToken();
			
			list.add(token);
			
		}
		
		
ArrayList productList=new ArrayList();
		
		for(int i=0;i<list.size();i++)
		{
		
			int productId=Integer.parseInt((String)list.get(i));
			
			ProductVO productVO = eRetailProductService.getProductByIdx(productId);
			if (logger.isTraceEnabled()) logger.trace("Brand Recevied from Service\n" + productVO);
			if (logger.isDebugEnabled()) logger.debug("End: BrandWebController.displayCategory()");
			
			productList.add(productVO);
			
			model.addAttribute("products", productList);
						
		}
		
		shoppingCart.addAll(productList);
		
		ShoppingCartUtil.setShoppingCart(shoppingCart);
		*/
	
		
		//model.addAttribute("brand", brands);
		return "product/displayitemsincart";
	}
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping("/placeorder.do")
	public String placeorderedItems(final Model model)
	{
		System.out.println("CONNECTED TO CONTROLLER FOR GET ORDERS FROM CART"); 
		//shoppingCart.addAll(productList);
		
		model.addAttribute("shoppingCart", shoppingCart);
		
		long totalCost=0;
		
		
		for(int i=0;i<shoppingCart.size();i++)
		{
			
			final ProductVO productvo=(ProductVO)shoppingCart.get(i);
			final long cost=(long) productvo.getPrice();
			System.out.println(cost); 
			totalCost=totalCost+cost;
			
		}
		
		model.addAttribute("TOTALCOST", totalCost);
		
		System.out.println("THE TOTAL COST Issssssssssssssss"+totalCost); 
		
		return "product/makepayment";
	}
	
}
