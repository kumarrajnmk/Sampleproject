package com.nmk.ecomm.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nmk.ecomm.api.client.CardTypeServiceClient;
import com.nmk.ecomm.model.CardType;
import com.nmk.ecomm.web.service.intf.ERetailCardTypeService;
import com.nmk.ecomm.web.util.CardTypeWebUtil;
import com.nmk.ecomm.web.vo.CardTypeVO;

/**
 * @author NMK OPT 1
 *
 */
@Service
public class ERetailCardTypeServiceImpl implements ERetailCardTypeService {
	private static final Logger LOGGER = Logger.getLogger(ERetailCardTypeServiceImpl.class);

	public void createCard(final CardTypeVO cardTypeVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCardTypeServiceImpl.createCard()");
		}
		final CardType cardType = CardTypeWebUtil.convertCardTypeVOObjectToCardType(cardTypeVO);
		CardTypeServiceClient.createCard(cardType);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCardTypeServiceImpl.createCard()");
		}
	}

	public CardTypeVO getCardByIdx(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCardTypeServiceImpl.getCardByIdx()");
		}
		final CardType cardType = CardTypeServiceClient.getCardByIdx(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCardTypeServiceImpl.getCardByIdx()");
		}
		return CardTypeWebUtil.convertCardTypeToCardTypeVO(cardType);
	}

	public void updateCard(final CardTypeVO cardTypeVO, int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCardTypeServiceImpl.updateProduct()");
		}
		final CardType cardType = CardTypeWebUtil.convertCardTypeVOObjectToCardType(cardTypeVO);
		// CardTypeServiceClient.updateCard(cardType,id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCardTypeServiceImpl.updateProduct()");
		}
	}

	public List<CardTypeVO> getAllCardType() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCardTypeServiceImpl.getAllProduct()");
		}
		// List<CardType> cardTypes = (List<CardType>)
		// CardTypeServiceClient.getAllCardType();
		// List<CardTypeVO> cardTypeVOList =
		// CardTypeWebUtil.convertCardTypeListToCardTypeVOList(cardTypes);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCardTypeServiceImpl.getAllProduct()");
		}
		// return cardTypeVOList;
		return null;
	}

	public void deleteCard(final int id) {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCardTypeServiceImpl.deleteCard()");
		}
		CardTypeServiceClient.deleteCard(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCardTypeServiceImpl.deleteCard()");
		}

	}

	public List<CardType> test() {
		// TODO Auto-generated method stub
		return null;
	}

}
