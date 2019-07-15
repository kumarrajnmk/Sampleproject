package com.nmk.ecomm.web.service.intf;

import java.util.List;

import com.nmk.ecomm.model.UserAddress;
import com.nmk.ecomm.web.vo.UserAddressVO;

/**
 * @author NMK OPT 1
 *
 */
public interface ERetailUserAddressService {
	UserAddressVO getUserAddress(int id);

	List<UserAddressVO> getAllUserAddress();

	void createUserAddress(UserAddressVO userAddressVO);

	void updateUserAddress(UserAddressVO userAddressVO);

	void deleteuserAddress(int id);

	void deleteUserAddress(int parseInt);

	UserAddressVO getUserAddressByIdx(int id);

	void updateUserAddress(UserAddress userAddress);

	List<UserAddress> test();
}
