package com.nmk.ecomm.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nmk.ecomm.api.client.TransactiontypeServiceClient;
import com.nmk.ecomm.model.TransType;
import com.nmk.ecomm.web.service.intf.ERetailTransTypeService;
import com.nmk.ecomm.web.util.TransTypeWebUtil;
import com.nmk.ecomm.web.vo.TransTypeVO;

/**
 * @author NMK OPT 1
 *
 */
@Service
public class ERetailTransTypeServiceImpl implements ERetailTransTypeService {
	private static final Logger LOGGER = Logger.getLogger(ERetailTransTypeServiceImpl.class);

	public void createTransactiontype(final TransTypeVO transTypeVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailTransTypeServiceImpl.createTransactiontype()");
		}
		final TransType transType = TransTypeWebUtil.convertTransTypeVOObjectToTransType(transTypeVO);
		TransactiontypeServiceClient.createTransactiontype(transType);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailTransTypeServiceImpl.createTransactiontype()");
		}
	}

	public TransTypeVO getTransactiontypeIdx(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailTransTypeServiceImpl.getTransactiontypeIdx()");
		}
		TransType transType = TransactiontypeServiceClient.getTransactiontypeIdx(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailTransTypeServiceImpl.getTransactiontypeIdx()");
		}
		return TransTypeWebUtil.convertTransTypeToTransTypeVO(transType);
	}

	public void updateTransactiontype(final TransTypeVO transTypeVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailTransTypeServiceImpl.updateTransactiontype()");
		}
		final TransType transType = TransTypeWebUtil.convertTransTypeVOObjectToTransType(transTypeVO);
		TransactiontypeServiceClient.updateTransactiontype(transType);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailTransTypeServiceImpl.updateTransactiontype()");
		}

	}

	public void deleteTransactiontype(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailTransTypeServiceImpl.deleteCategory()");
		}
		TransactiontypeServiceClient.deleteTransactiontype(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailTransTypeServiceImpl.deleteCategory()");
		}
	}

	public List<TransTypeVO> getAllTransType() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailTransTypeServiceImpl.getAllTransactions()");
		}
		List<TransType> transactions = (List<TransType>) TransactiontypeServiceClient.getAllTransType();
		List<TransTypeVO> transTypeVOList = TransTypeWebUtil.convertTransTypeListToTransTypeVOList(transactions);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailTransTypeServiceImpl.getAllTransactions()");
		}
		return transTypeVOList;
	}

	public List<TransType> test() {
		// TODO Auto-generated method stub
		return null;
	}
}
