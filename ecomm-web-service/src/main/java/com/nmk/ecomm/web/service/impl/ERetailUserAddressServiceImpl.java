package com.nmk.ecomm.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nmk.ecomm.api.client.UserAddressServiceClient;
import com.nmk.ecomm.model.UserAddress;
import com.nmk.ecomm.web.service.intf.ERetailUserAddressService;
import com.nmk.ecomm.web.util.UserAddressWebUtil;
import com.nmk.ecomm.web.vo.UserAddressVO;

/**
 * @author NMK OPT 1
 *
 */
@Service
public class ERetailUserAddressServiceImpl implements ERetailUserAddressService {
	private static final Logger LOGGER = Logger.getLogger(ERetailUserAddressServiceImpl.class);

	public UserAddressVO getUserAddress(final int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserAddressVO> getAllUserAddress() {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailUserAddressServiceImpl.getAllUserAddress()");
		}
		List<UserAddress> userAddresses = (List<UserAddress>) UserAddressServiceClient.getAllUserAddress();
		final List<UserAddressVO> userAddressVOList = UserAddressWebUtil
				.convertUserAddressListToUserAddressVOList(userAddresses);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailUserAddressServiceImpl.getAllUserAddress()");
		}
		return userAddressVOList;
	}

	public void createUserAddress(final UserAddressVO userAddressVO) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailUserAddressServiceImpl.createUserAddress()");
		}
		final UserAddress userAddress = UserAddressWebUtil.convertUserAddressVOObjectToUserAddress(userAddressVO);
		UserAddressServiceClient.createUserAddress(userAddress);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailUserAddressServiceImpl.createUserAddress()");
		}

	}

	public void updateUserAddress(final UserAddressVO userAddressVO) {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailUserAddressServiceImpl.updateUserAddress()");
		}
		final UserAddress userAddress = UserAddressWebUtil.convertUserAddressVOObjectToUserAddress(userAddressVO);
		UserAddressServiceClient.updateUserAddress(userAddress);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailUserAddressServiceImpl.updateUserAddress()");
		}
	}

	public void deleteUserAddress(final int id) {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailUserAddressServiceImpl.deleteUserAddress()");
		}
		UserAddressServiceClient.deleteUserAddress(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailUserAddressServiceImpl.deleteUserAddress()");
		}
	}

	public UserAddressVO getUserAddressByIdx(final int id) {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailUserAddressServiceImpl.getUserAddressByIdx()");
		}
		UserAddress userAddress = UserAddressServiceClient.getUserAddressByIdx(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailUserAddressServiceImpl.getUserAddressByIdx()");
		}
		return UserAddressWebUtil.convertUserAddressToUserAddressVO(userAddress);
	}

	public List<UserAddress> test() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailAuditServiceImpl.getAllAuditLog()");
		}
		List<UserAddress> auditLog = (List<UserAddress>) UserAddressServiceClient.getAllUserAddress();
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailAuditServiceImpl.getAllAuditLog()");
		}
		// System.out.println(auditLog);
		return auditLog;

	}

	public List<UserAddress> myAddresses() {

		try {
			LOGGER.debug("######## Starting ERetailUserAddressServiceImpl : myAddresses() METHOD GOT INVOKED ########");
			// List<UserAddress> userAddress = (List<UserAddress>)
			// UserAddressServiceClient.myAddresses();
		} catch (Exception e) {
			/*
			 * LOGGER.error(
			 * "####### End Exception in ERetailUserAddressServiceImpl : myAddresses() Method Got Invoked #######"
			 * + e.getMessage());
			 */
		}
		// return userAddress;
		return null;

	}

	public void deleteuserAddress(int id) {
		// TODO Auto-generated method stub

	}

	public void updateUserAddress(UserAddress userAddress) {
		// TODO Auto-generated method stub

	}

}
