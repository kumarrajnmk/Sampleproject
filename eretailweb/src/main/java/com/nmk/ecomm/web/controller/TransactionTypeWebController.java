package com.nmk.ecomm.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nmk.ecomm.web.service.intf.ERetailTransTypeService;

/**
 * TransactionTypeWebController
 *
 */
@Controller
public class TransactionTypeWebController {

/**
 * TransactionTypeWebController FOR DEBUG using LOGGERS
 */
private static final Logger LOGGER = Logger.getLogger(TransactionTypeWebController.class);
/**
 * @param eRetailTransTypeService
 */
/**
 * @eRetailTransTypeService
 */
@Autowired 
ERetailTransTypeService eRetailTransTypeService=null; 
/**
 * @param eRetailTransTypeService
 */
public TransactionTypeWebController(final ERetailTransTypeService eRetailTransTypeService) { 
		super();
		this.eRetailTransTypeService = eRetailTransTypeService;
	}
	/**
	 * @return
	 */
	@RequestMapping("/makepayment.do")
	public String createTransactiontype() {
		if (LOGGER.isDebugEnabled()) {LOGGER.debug("start: TransactionTypeWebController.createTransactiontype()");}
		if (LOGGER.isTraceEnabled()) {LOGGER.trace("Transaction id received from client: " );}
		/*Date dt=new Date();
		transTypeVO.setCreatedBy("user1");
		transTypeVO.setCreateDate(dt);*/
		eRetailTransTypeService.createTransactiontype(null);
		if (LOGGER.isTraceEnabled()) {LOGGER.trace("Transaction Information received from service: \n" );}
		if (LOGGER.isDebugEnabled()) {LOGGER.debug("End: TransactionTypeWebController.createTransactiontype()");}
		return "pages/makepayment";
	}

}
