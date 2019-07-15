package com.nmk.ecomm.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nmk.ecomm.api.client.UserCardServiceClient;
import com.nmk.ecomm.model.UserCard;
import com.nmk.ecomm.web.service.intf.EretailUserCardService;
import com.nmk.ecomm.web.util.UserCardWebUtil;
import com.nmk.ecomm.web.vo.UserCardVO;

/**
 * @author NMK OPT 1
 *
 */
@Service
public class EretailUserCardServiceImpl implements EretailUserCardService {

	private static final Logger LOGGER = Logger.getLogger(EretailUserCardServiceImpl.class);

	public void createUserCard(final UserCardVO usercardVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: EretailUserCardServiceImpl.createProduct()");
		}
		final UserCard usercard = UserCardWebUtil.convertUserCardVOObjectToUserCard(usercardVO);
		UserCardServiceClient.createUserCard(usercard);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetail" + "ProductServiceImpl.createProduct()");
		}
	}

	public UserCardVO getUserCardIdx(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailProductServiceImpl.getUserCardIdx()");
		}
		final UserCard usercard = UserCardServiceClient.getUserCardByIdx(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailProductServiceImpl.getUserCardIdx()");
		}
		return UserCardWebUtil.convertUserCardToUserCardVO(usercard);
		// return null;
	}

	public void updateUserCard(final UserCardVO usercardVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailProductServiceImpl.updateUserCard()");
		}
		UserCard usercard = UserCardWebUtil.convertUserCardVOObjectToUserCard(usercardVO);
		// UserCardServiceClient.updateUserCard(usercard);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailProductServiceImpl.updateUserCard()");
		}

	}

	public void deleteUserCard(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailProductServiceImpl.deleteUserCard()");
		}
		UserCardServiceClient.deleteUserCard(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailProductServiceImpl.deleteUserCard()");
		}

	}

	public List<UserCardVO> getAllUserCard() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailProductServiceImpl.getAllUserCard()");
		}
		// List<UserCard> usercards = (List<UserCard>)
		// UserCardServiceClient.getAllUserCards();
		// List<UserCardVO> usercardVOList
		// =UserCardWebUtil.convertUserCardListToUserCardVOList(usercards);
		if (LOGGER.isDebugEnabled()) {
			{
				LOGGER.debug("End: ERetailProductServiceImpl.getAllUserCard()");
			}
		}
		// return usercardVOList;
		return null;
	}

	public List<UserCard> test() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailAuditServiceImpl.getAllAuditLog()");
		}
		List<UserCard> auditLog = (List<UserCard>) UserCardServiceClient.getAllUserCards();
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailAuditServiceImpl.getAllAuditLog()");
		}
		// System.out.println(auditLog);
		return auditLog;

	}

}
