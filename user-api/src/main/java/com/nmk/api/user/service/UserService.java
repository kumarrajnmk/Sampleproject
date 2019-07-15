package com.nmk.api.user.service;

import com.nmk.ecomm.model.User;
import com.nmk.ecomm.model.list.UserList;
import com.nmk.ecomm.service.entity.EcommUser;

public interface UserService {
	public EcommUser createUser(EcommUser ecommUser);

	public EcommUser findUserByIdx(int UserByIdx);

	public EcommUser updateUser(User user, Integer UserByIdx);

	public EcommUser deleteUser(int UserByIdx);

	public UserList findAll();
}
