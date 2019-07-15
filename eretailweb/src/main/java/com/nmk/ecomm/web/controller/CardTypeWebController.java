package com.nmk.ecomm.web.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.nmk.ecomm.model.CardType;
import com.nmk.ecomm.web.service.intf.ERetailCardTypeService;
import com.nmk.ecomm.web.vo.CardTypeVO;


@Controller
@SessionAttributes("cardType") 
public class CardTypeWebController {

	private static final Logger LOGGER = Logger.getLogger(CardTypeWebController.class);

	
	
	public CardTypeWebController(final ERetailCardTypeService eRetailCardTypeService) { 
		super();
		this.eRetailCardTypeService = eRetailCardTypeService;
	}
	
	@Autowired
	private final ERetailCardTypeService eRetailCardTypeService; 

	/**
	 * @param model
	 * @return
	 */
	
	/**
	 * @param model
	 * @return
	 */
/*	@RequestMapping("/mycards.do")
	public String myCards(final Model model) {
		
		  try {
			  
				LOGGER.debug("######## Starting CardTypeWebController : myCards() METHOD GOT INVOKED ########");

			final ArrayList list = (ArrayList) sampleDao.getCardTypeIds();
			  
			  ArrayList productList = new ArrayList();
			  
			  for (int i = 0; i < list.size(); i++) {
			  
			  final int cardtypeId = (int) list.get(i);
			  
			  CardTypeVO cardTypeVO = eRetailCardTypeService.getCardByIdx(cardtypeId);
			  
			 
			  productList.add(cardTypeVO);
			  
			  model.addAttribute("card", productList); 
			  } 
			  
			  
			
		} catch (Exception e) {
			LOGGER.error("######## Starting CardTypeWebController : myCards() METHOD GOT INVOKED ########"+e.getMessage());

		}
		  
		  return "pages/mycards";
		//return null;
	}*/

	/**
	 * @param cardtypeId
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	@RequestMapping("/getcardtype2.do")
	public ModelAndView getCardType(@RequestParam("cardtypeId") final String cardtypeId)
			throws IllegalAccessException, InvocationTargetException {
			ModelAndView model = null;
			try {
				LOGGER.debug("######## Starting CardTypeWebController : getCardType() METHOD GOT INVOKED ########");

				final CardTypeVO cardType = eRetailCardTypeService.getCardByIdx(Integer.parseInt(cardtypeId));
				model = new ModelAndView("pages/makepayment");
				model.addObject("employee", cardType);
			} catch (NumberFormatException e) {
				LOGGER.error("######## Starting CardTypeWebController : myCards() METHOD GOT INVOKED ########"+e.getMessage());

			}
	
		return model;
	}
	/**
	 * @param cardtypeId
	 * @return
	 */
	@RequestMapping("/deletecardtype.do")
	public String deleteCardType(@RequestParam("cardtypeId") final String cardtypeId) {
		
		try {
			LOGGER.debug("######## Starting CardTypeWebController : deleteCardType() METHOD GOT INVOKED ########");

			eRetailCardTypeService.deleteCard(Integer.parseInt(cardtypeId));
		} catch (NumberFormatException e) {
			LOGGER.error("######## Starting CardTypeWebController : deleteCardType() METHOD GOT INVOKED ########"+e.getMessage());

		}

		return "redirect:/mycards.do";
	}
	
	/**
	 * @param cardType
	 * @return
	 */
	@RequestMapping("/addCardType.do")
	public String createCard(@ModelAttribute("cardTypeVO") final CardTypeVO cardType) {
	
		try {
			LOGGER.debug("######## Starting CardTypeWebController : createCard() METHOD GOT INVOKED ########");

			final Date date = new Date();
			cardType.setCreateDate(date);
			cardType.setCreatedBy("siva");
			cardType.setModifiedDate(date);
			eRetailCardTypeService.createCard(cardType);
		} catch (Exception e) {
			LOGGER.error("######## Starting CardTypeWebController : createCard() METHOD GOT INVOKED ########"+e.getMessage());

		}
		
		return "pages/mycards";
	}

	/**
	 * @return
	 */
	@RequestMapping("/makepayment1.do")
	public String showPaymentPage() {
		return "pages/newpayment1";
	}

	/**
	 * @param card
	 * @param idx
	 * @return
	 */
	/*
	 * @RequestMapping("/updateCardType.do") public String
	 * updateCard(@ModelAttribute("card ") final CardTypeVO card, final Integer idx)
	 * { if (LOGGER.isDebugEnabled()) {
	 * LOGGER.debug("Start: CardTypeWebController. updateCard()");} if
	 * (LOGGER.isTraceEnabled()) { LOGGER.trace("CardType received from the client"
	 * + card);} final Date date = new Date(); card.setCreatedBy("user");
	 * card.setCreateDate(date); card.setModifiedDate(date);
	 * eRetailCardTypeService.updateCard(card, idx); if (LOGGER.isTraceEnabled()) {
	 * LOGGER.trace("CardType Information received from service: \n" + card);} if
	 * (LOGGER.isDebugEnabled()) {
	 * LOGGER.debug("End: CardTypeWebController.updateProduct()");} return
	 * "redirect:/mycards.do"; }
	 */

	/**
	 * @param employee
	 * @param result
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String submitForm1(@ModelAttribute("employee") @Validated CardType employee,
			final BindingResult result) throws IllegalAccessException, InvocationTargetException {
		try {
			LOGGER.debug("######## Starting CardTypeWebController : submitForm1() METHOD GOT INVOKED ########");

			if (result.hasErrors()) {
				return "pages/makepayment"; 
			}
			final CardTypeVO cardTypeVO = new CardTypeVO();
			final Date date = new Date();
			employee.setCreateDate(date);
			employee.setModifiedDate(date);
			BeanUtils.copyProperties(cardTypeVO, employee);
			eRetailCardTypeService.createCard(cardTypeVO);
		} catch (Exception e) {
			LOGGER.error("######## Starting CardTypeWebController : submitForm1() METHOD GOT INVOKED ########"+e.getMessage());

		}
		return "redirect:/mycards.do";
	}
}
