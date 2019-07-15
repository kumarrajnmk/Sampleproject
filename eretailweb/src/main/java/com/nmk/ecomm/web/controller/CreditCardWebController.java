package com.nmk.ecomm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @CreditCardWebController
 *
 */
@Controller
public class CreditCardWebController {
	
	/**
	 * @return
	 */
	@RequestMapping("/processcreditcard")
	public String registerUser(){
		
		return "order/finalizeorder";
	}
}
