package com.nmk.ecomm.web.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nmk.ecomm.model.UserAddress;
import com.nmk.ecomm.web.service.intf.ERetailUserAddressService;
import com.nmk.ecomm.web.vo.UserAddressVO;

@Controller
public class UserAddressWebController {

	private static final Logger LOGGER = Logger.getLogger(UserAddressWebController.class);

	@Autowired
	private static ERetailUserAddressService eRetailUserAdressService=null; 
	
	public UserAddressWebController(final ERetailUserAddressService eRetailUserAdressService) { 
		super();
		this.eRetailUserAdressService = eRetailUserAdressService;
	}
	
	
	/**
	 * @param e
	 * @param br
	 * @param model
	 * @return
	 */
	@RequestMapping("/myaddresses.do")
	public String myAddresses(@Valid final UserAddress e, final BindingResult bindResult,final Model model) { 
	
		try {
			LOGGER.debug("######## Starting UserController : myAddresses() METHOD GOT INVOKED ########");

			if(bindResult.hasErrors())	
			{
			LOGGER.debug(bindResult.getAllErrors()); 
		//	List<UserAddress> userAddress=eRetailUserAdressService.myAddresses();
				return "pages/myaddresses"; 
			}
		} catch (Exception e1) {
			LOGGER.error("####### End Exception in UserController : myAddresses() Method Got Invoked #######"+e1.getMessage());

		}
		
		return "pages/myaddresses";
	}
	
	/**
	 * @return
	 */
	@RequestMapping("/address.do")
	public String showAddressPage() {
		return "pages/addnewaddress";
	}
	
	/**
	 * @param userAddress
	 * @param bindResult
	 * @param model
	 * @return
	 */
	@RequestMapping("/addnewaddress.do")
	public String addNewAddress( @Valid final UserAddress userAddress , final BindingResult bindResult,final Model model)throws IllegalAccessException, InvocationTargetException
			{
		UserAddressVO userAddressVO=null;
		try {
			
			LOGGER.debug("######## Starting UserAddressWebController : addNewAddress() METHOD GOT INVOKED ########");
	  if(bindResult.hasErrors())  
	    { 
		LOGGER.debug(bindResult.getAllErrors());
		  
		System.out.println("UserAddressWebController.addNewAddress()+error"); 
		  
		return "pages/myaddresses"; 
	    }               
			final Date date=new Date();
			userAddressVO.setCreateDate(date);
			userAddressVO.setModifiedDate(date);
			model.addAttribute("userAddress", userAddressVO);
			BeanUtils.copyProperties(userAddressVO, userAddress);
			eRetailUserAdressService.createUserAddress(userAddressVO );
			return "pages/myaddresses"; 
		}
		catch(Exception e) {
			LOGGER.debug("######## End UserAddressWebController : addNewAddress() METHOD GOT INVOKED ########"+e.getMessage());

		}
		return "pages/myaddresses";
	}


	public String userInfo(UserAddress userAddress1, Model model) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
/*
 * @RequestMapping(value = "/saveUser2", method = RequestMethod.POST) public
 * String submitForm1(@ModelAttribute("useraddress") @Valid final UserAddress
 * useraddress, final BindingResult result) throws IllegalAccessException,
 * InvocationTargetException { if (result.hasErrors()) { return
 * "createauditlog"; // NOPMD by NMK PC Java 4 on 5/21/19 3:54 AM } final
 * UserAddressVO auditLogVO = new UserAddressVO(); final Date date = new Date();
 * auditLogVO.setCreateDate(date); auditLogVO.setModifiedDate(date);
 * auditLogVO.setCreatedBy("Admin"); // NOPMD by NMK Java 3 on 5/29/19 11:38 PM
 * auditLogVO.setModifiedBy("Admin"); //auditLogVO.setDescription("sdfsd");
 * BeanUtils.copyProperties(auditLogVO, useraddress);
 * eRetailUserAdressService.createUserAddress(useraddress);
 * 
 * // auditService.createAuditlog(auditLogVO); // status.setComplete();
 * auditLogVO.setCreatedBy("Admin"); auditLogVO.setModifiedBy("Admin");
 * auditLogVO.setModifiedDate(date); return "redirect:/"; } }
 * 
 */
