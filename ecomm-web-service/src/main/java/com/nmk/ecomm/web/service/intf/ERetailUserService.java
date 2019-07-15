package com.nmk.ecomm.web.service.intf;

import java.util.List;

import com.nmk.ecomm.model.User;
import com.nmk.ecomm.web.vo.UserVO;

/**
 * @author NMK OPT 1
 *
 */
public interface ERetailUserService {

	void createUser(UserVO userVO);

	void deleteUser(int id);

	List<UserVO> getAllUser();

	void updateUser(UserVO userVO);

	UserVO getUserByIdx(int userId);

	void registerUser(UserVO userVO);

	UserVO getUserByLogin1(int uid, String pwd);

	List<User> test();

	UserVO getUserByIdx(final int uid, final String pwd);

}
