package com.nmk.ecomm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * HomeController 
 *
 */
@Controller
public class HomeWebController { 
	
	/**
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "index";	
	}
	
	/**
	 * @return
	 */
	@RequestMapping("/contact.do")
	public String showContact() {
		return "pages/contact";
	}
	@RequestMapping("/feedback.do")
	public String contactFeedback() {
		
		return "pages/feedback";
	}
}

