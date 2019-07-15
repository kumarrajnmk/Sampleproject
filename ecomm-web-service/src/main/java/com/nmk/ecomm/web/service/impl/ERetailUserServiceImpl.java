package com.nmk.ecomm.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nmk.ecomm.api.client.UserServiceClient;
import com.nmk.ecomm.model.User;
import com.nmk.ecomm.web.service.intf.ERetailUserService;
import com.nmk.ecomm.web.util.UserWebUtil;
import com.nmk.ecomm.web.vo.UserVO;

/**
 * @author NMK OPT 1
 *
 */
@Service
public class ERetailUserServiceImpl implements ERetailUserService {
	private static final Logger LOGGER = Logger.getLogger(ERetailUserServiceImpl.class);

	public UserVO getUserByIdx(final int uid, final String pwd) {
		User user = null;

		try {
			if (LOGGER.isTraceEnabled())
				LOGGER.debug("Start: UserServiceClient.getUserByIdx()");
			// user = UserServiceClient.getUserByLogin(uid , pwd);
			user = UserServiceClient.getuserbylogin(uid, pwd);
			System.out.println(user);
		} catch (Exception e) {
			LOGGER.error(" ERROR :  login() METHOD GOT INVOKED " + e.getLocalizedMessage());

		}

		return UserWebUtil.convertUserToUserVO(user);
	}

	public UserVO getUserByLogin(final int uid, final String pwd) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailUserServiceImpl.getUserByIdx()");
		}

		User x = UserServiceClient.getUserByIdx(uid);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailUserServiceImpl.getUserByIdx()");
		}
		return (UserVO) null;
		// return false;
	}

	public void createUser(final UserVO userVO) {
	
		try {
			User user = UserWebUtil.convertUserVOObjectToUser(userVO);
			UserServiceClient.createUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public void deleteUser(final int id) {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailUserServiceImpl.deleteUser()");
		}
		UserServiceClient.deleteUser(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailUserServiceImpl.deleteUser()");
		}

	}

	@SuppressWarnings("unchecked")

	public List<UserVO> getAllUser() {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailUserAddressServiceImpl.getAllUserAddress()");
		}
		List<User> user = (List<User>) UserServiceClient.getAllUser();
		final List<UserVO> userVOList = UserWebUtil.convertUserListToUserVOList(user);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailUserAddressServiceImpl.getAllUserAddress()");
		}
		return userVOList;

	}

	public void updateUser(final UserVO userVO) {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailUserAddressServiceImpl.updateUser()");
		}
		final User user = UserWebUtil.convertUserVOObjectToUser(userVO);
		UserServiceClient.updateUser(user);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailUserAddressServiceImpl.updateUser()");
		}
	}

	public void registerUserfinal(final UserVO userVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailCategoryServiceImpl.createCategory()");
		}
		final User user = UserWebUtil.convertUserVOObjectToUser(userVO);
		// UserServiceClient.registerUser(user);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailCategoryServiceImpl.createCategory()");
		}
	}

	public List<User> test() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailAuditServiceImpl.getAllAuditLog()");
			final List<User> auditLog = (List<User>) UserServiceClient.getAllUser();
			if (LOGGER.isDebugEnabled())
				LOGGER.debug("End: ERetailAuditServiceImpl.getAllAuditLog()");
			// System.out.println(auditLog);
			return auditLog;
		}
		return null;
	}

	public List<User> getAllUsers() {
		List<User> user = null;
		try {
			LOGGER.debug("######## Starting ERetailCategoryServiceImpl : forgotUserid() METHOD GOT INVOKED ########");
			user = (List<User>) UserServiceClient.getAllUser();
		} catch (Exception e) {
			/*
			 * LOGGER.error(
			 * "####### End Exception in ERetailCategoryServiceImpl : forgotUserid() Method Got Invoked #######"
			 * + e.getMessage());
			 */
		}
		return user;
	}

	public UserVO getUserByIdx(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void registerUser(UserVO userVO) {
		// TODO Auto-generated method stub

	}

	public UserVO getUserByLogin1(int uid, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

}
