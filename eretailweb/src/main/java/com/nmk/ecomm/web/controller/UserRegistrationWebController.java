package com.nmk.ecomm.web.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.validation.Valid;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nmk.ecomm.web.service.intf.ERetailUserService;
import com.nmk.ecomm.web.vo.UserVO;

@Controller
public class UserRegistrationWebController {
	
	private static final Logger LOGGER =Logger.getLogger(UserRegistrationWebController.class);

	
	@Autowired
	ERetailUserService eRetailUserService;
	

	//@RequestMapping("/showRegisterForm.do")
	public String showRegistrationForm(final Model model) {

		model.addAttribute("user", new UserVO());

		return "pages/register";
	}
	
//	@RequestMapping("/userregister.do")
	public String submitForm(@Valid @ModelAttribute("user") UserVO user, BindingResult bindResult, Model model)
			throws IllegalAccessException, InvocationTargetException {

		if (bindResult.hasErrors()) {
			
			return "pages/register";
		}
		
		
		try {
			if (LOGGER.isDebugEnabled())LOGGER.debug("Start: UserRegistrationWebController.submitForm()");

			UserVO userVO = new UserVO();
			Date dt = new Date();
			userVO.setCreateDate(dt);
			userVO.setCreatedBy("rao");
			userVO.setModifiedBy("gopi");
			userVO.setModifiedDate(dt);
			BeanUtils.copyProperties(userVO, user);
			eRetailUserService.createUser(userVO);
			
			if (LOGGER.isTraceEnabled()) LOGGER.trace("user Information received from service: \n" + userVO);
			if (LOGGER.isDebugEnabled()) LOGGER.debug("End: UserRegistrationWebController.submitForm()");

		} catch (Exception e) {
			LOGGER.error(" ERROR : submitForm() METHOD GOT INVOKED ");
		}

		return "pages/registersuccess";
	}


}
