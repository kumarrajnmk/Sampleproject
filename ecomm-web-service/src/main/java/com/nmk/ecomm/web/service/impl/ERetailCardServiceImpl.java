package com.nmk.ecomm.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nmk.ecomm.api.client.CardTransactionServiceClient;
import com.nmk.ecomm.model.CardTransaction;
import com.nmk.ecomm.web.service.intf.ERetailCardService;
import com.nmk.ecomm.web.util.CardTransactionWebUtil;
import com.nmk.ecomm.web.vo.CardTransactionVO;

/**
 * @author NMK OPT 1
 *
 */
@Service
public class ERetailCardServiceImpl implements ERetailCardService {
	private static final Logger LOGGER = Logger.getLogger(ERetailAuditServiceImpl.class);

	public void createCardtransaction(final CardTransactionVO cardTransactionVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCardServiceImpl.createCardtransaction()");
		}
		final CardTransaction cardTransaction = CardTransactionWebUtil
				.convertCardTransactionVOObjectToCardTransaction(cardTransactionVO);
		CardTransactionServiceClient.createCardtransaction(cardTransaction);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCardServiceImpl.createCardtransaction()");
		}

	}

	public CardTransactionVO getCardtransactionByIdx(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCardServiceImpl.getCardtransactionByIdx()");
		}
		final CardTransaction cardTransaction = CardTransactionServiceClient.getCardtransactionByIdx(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCardServiceImpl.getCardtransactionByIdx()");
		}
		return CardTransactionWebUtil.convertCardTransactionToCardTransactionVO(cardTransaction);
	}

	public void updateCardtransaction(final CardTransactionVO cardTransactionVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCardServiceImpl.updateCardtransaction()");
		}
		final CardTransaction cardTransaction = CardTransactionWebUtil
				.convertCardTransactionVOObjectToCardTransaction(cardTransactionVO);
		CardTransactionServiceClient.updateCardtransaction(cardTransaction);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCardServiceImpl.updateCardtransaction()");
		}
	}

	public void deleteCardtransaction(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCardServiceImpl.deleteCardtransaction()");
		}
		CardTransactionServiceClient.deleteCardtransaction(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCardServiceImpl.deleteCardtransaction()");
		}
	}

	public List<CardTransactionVO> getAllCardTransaction() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCardServiceImpl.getAllCardTransaction()");
		}
		List<CardTransaction> cardTypes = (List<CardTransaction>) CardTransactionServiceClient.getAllCardTransaction();
		final List<CardTransactionVO> cardTypeVOList = CardTransactionWebUtil
				.convertCardTransactionVOListToCardTransaction(cardTypes);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCardServiceImpl.getAllCardTransaction()");
		}
		return cardTypeVOList;
	}

	public List<CardTransaction> test() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailAuditServiceImpl.getAllAuditLog()");
		}
		//final List<CardTransaction> auditLog = CardTransactionServiceClient.getall();
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailAuditServiceImpl.getAllAuditLog()");
		}
		// System.out.println(auditLog);
		return null;

	}

}
