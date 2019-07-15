package com.nmk.ecomm.web.service.intf;

import java.util.List;

import com.nmk.ecomm.model.TransType;
import com.nmk.ecomm.web.vo.TransTypeVO;

/**
 * @author NMK OPT 1
 *
 */
public interface ERetailTransTypeService {

	void createTransactiontype(TransTypeVO transTypeVO);

	TransTypeVO getTransactiontypeIdx(int id);

	void updateTransactiontype(TransTypeVO transTypeVO);

	void deleteTransactiontype(int id);

	List<TransTypeVO> getAllTransType();

	List<TransType> test();

}
