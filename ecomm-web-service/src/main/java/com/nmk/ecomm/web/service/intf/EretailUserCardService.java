package com.nmk.ecomm.web.service.intf;

import java.util.List;

import com.nmk.ecomm.model.UserCard;
import com.nmk.ecomm.web.vo.UserCardVO;

/**
 * @author NMK OPT 1
 *
 */
public interface EretailUserCardService {

	void createUserCard(UserCardVO usercardVO);

	UserCardVO getUserCardIdx(int id);

	void updateUserCard(UserCardVO usercardVO);

	void deleteUserCard(int id);

	List<UserCardVO> getAllUserCard();

	List<UserCard> test();

}
