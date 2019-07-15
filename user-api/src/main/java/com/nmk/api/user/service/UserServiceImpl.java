package com.nmk.api.user.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nmk.api.user.repository.UserRepository;
import com.nmk.ecomm.api.exception.ECommHTTP404Exception;
import com.nmk.ecomm.api.util.UserServiceUtil;
import com.nmk.ecomm.model.User;
import com.nmk.ecomm.model.list.UserList;
import com.nmk.ecomm.service.entity.EcommUser;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	UserRepository UserRepository;

	public EcommUser createUser(EcommUser ecommUser) {
		EcommUser ecommUser2 =null;
		
		try {
			logger.debug("######## Starting UserServiceImpl : createUser()  GOT INVOKED ########");

			ecommUser2 = UserRepository.save(ecommUser);
		} catch (Exception e) {
			logger.error("####### Exception in UserServiceImpl : createUser()  GOT INVOKED #######" +e.getMessage());
			e.printStackTrace();
		}
		
		return ecommUser2;

	}

	public EcommUser findUserByIdx(int UserByIdx) {
		EcommUser ecommUser = null;
		try {
			logger.debug("######## Starting UserServiceImpl : findUserByIdx()  GOT INVOKED ########");

			ecommUser = UserRepository.findById(UserByIdx);
					if(ecommUser==null) new ECommHTTP404Exception("idx-" + UserByIdx + " is not exist");
		} catch (Exception e) {
			logger.error("####### Exception in UserServiceImpl : findUserByIdx()  GOT INVOKED #######" +e.getMessage());
			e.printStackTrace();
		}

		return ecommUser;
	}

	public EcommUser updateUser(User user, Integer UserByIdx) {

		EcommUser updateduser = null;
		try {
			logger.debug("######## Starting UserServiceImpl : updateUser()  GOT INVOKED ########");

			EcommUser ecommUser = UserRepository.findOne(UserByIdx);
					if(ecommUser==null) new ECommHTTP404Exception("idx-" + UserByIdx + " is not exist");
			ecommUser.setUserId(user.getUserId());
			ecommUser.setPwd(user.getPwd());
			ecommUser.setFirstName(user.getFirstName());
			ecommUser.setLastName(user.getLastName());
			ecommUser.setMiddleName(user.getMiddleName());
			ecommUser.setEmailAddress(user.getEmailAddress());
			ecommUser.setHomePhone(user.getHomePhone());
			ecommUser.setWorkPhone(user.getWorkPhone());
			ecommUser.setMobilePhone(user.getMobilePhone());
			ecommUser.setFax(user.getFax());
			ecommUser.setStatus(user.getStatus());
			ecommUser.setCreatedBy(user.getCreatedBy());
			ecommUser.setCreateDate(user.getCreateDate());
			ecommUser.setModifiedBy(user.getModifiedBy());
			ecommUser.setModifiedDate(user.getModifiedDate());
			updateduser = UserRepository.save(ecommUser);
		} catch (Exception e) {
			logger.error("####### Exception in UserServiceImpl : updateUser()  GOT INVOKED #######" +e.getMessage());
			e.printStackTrace();
		}

		return updateduser;
	}

	
	public EcommUser deleteUser(int UserByIdx) {

		EcommUser ecommUser = null;
		try {
			logger.debug("######## Starting UserServiceImpl : deleteUser()  GOT INVOKED ########");

			ecommUser = UserRepository.findOne(UserByIdx);
					if(ecommUser==null) new ECommHTTP404Exception("idx-" + UserByIdx + " is not exist");
					UserRepository.delete(ecommUser);

		} catch (Exception e) {
			logger.error("####### Exception in UserServiceImpl : deleteUser()  GOT INVOKED #######" +e.getMessage());
			e.printStackTrace();
		}

		return ecommUser;
	}

	public UserList findAll() {
		UserList UserList = null;
		try {
			logger.debug("######## Starting UserServiceImpl : findAll()  GOT INVOKED ########");

			List<EcommUser> ecommUserList = UserRepository.findAll();
			List<User> list = UserServiceUtil.convertEcommUserListToUser(ecommUserList);
			UserList = new UserList();
			UserList.setData(list);
		} catch (Exception e) {
			logger.error("####### Exception in UserServiceImpl : findAll()  GOT INVOKED #######" +e.getMessage());
			e.printStackTrace();
		}

		return UserList;
	}

}
