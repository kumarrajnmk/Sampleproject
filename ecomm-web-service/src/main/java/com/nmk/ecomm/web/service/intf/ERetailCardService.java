package com.nmk.ecomm.web.service.intf;

import java.util.List;

import com.nmk.ecomm.web.vo.CardTransactionVO;

/**
 * @author NMK OPT 1
 *
 */
public interface ERetailCardService {

	void createCardtransaction(CardTransactionVO cardTransactionVO);

	CardTransactionVO getCardtransactionByIdx(int id);

	void updateCardtransaction(CardTransactionVO cardTransactionVO);

	void deleteCardtransaction(int id);

	List<CardTransactionVO> getAllCardTransaction();

}
