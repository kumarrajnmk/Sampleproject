package com.nmk.ecomm.web.service.intf;

import java.util.List;

import com.nmk.ecomm.model.CardType;
import com.nmk.ecomm.web.vo.CardTypeVO;

/**
 * @author NMK OPT 1
 *
 */
public interface ERetailCardTypeService {

	void createCard(CardTypeVO cardTypeVO);

	CardTypeVO getCardByIdx(int id);

	void updateCard(CardTypeVO cardTypeVO, int id);

	List<CardTypeVO> getAllCardType();

	void deleteCard(int id);

	List<CardType> test();

	// void updateCard(CardTypeVO employee1, int idx);

}
