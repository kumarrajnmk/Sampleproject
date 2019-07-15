package com.nmk.ecomm.model.testdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nmk.ecomm.model.UserAddress;

public abstract class UserAddressTestDataGenerator {
	static List<UserAddress> userAddressList = new ArrayList<UserAddress>();
	public static Object userList;
	static {
		UserAddress userAddress1 = new UserAddress("Nikitha", "Ganesh Nagar", "Bala Nagar", "Hyderabad", "Telangana",
				"500083", "India", "Nikitha", new Date(2018, 2, 18), "Nikitha", new Date(), 2);
		userAddress1.setIdx(1);

		UserAddress userAddress2 = new UserAddress("Moses", "Khairathabaad", "chinthal basthi", "Hyderabad",
				"Telangana", "500004", "India", "Moses", new Date(2018, 2, 18), "Moses", new Date(), 3);
		userAddress2.setIdx(2);

		UserAddress userAddress3 = new UserAddress("Maruthi", "Vemavaram", "Chilakaluripet", "Guntur", "Amaravathi",
				"522616", "India", "Maruthi", new Date(2018, 2, 18), "Maruthi", new Date(), 4);
		userAddress3.setIdx(3);

		UserAddress userAddress4 = new UserAddress("Nikitha", "Ganesh Nagar", "Bala Nagar", "Hyderabad", "Telangana",
				"500083", "India", "Nikitha", new Date(2018, 2, 18), "Nikitha", new Date(), 5);
		userAddress4.setIdx(4);

		UserAddress userAddress5 = new UserAddress("Nikitha", "Ganesh Nagar", "Bala Nagar", "Hyderabad", "Telangana",
				"500083", "India", "Nikitha", new Date(2018, 2, 18), "Nikitha", new Date(), 6);
		userAddress5.setIdx(5);

		userAddressList.add(userAddress1);
		userAddressList.add(userAddress2);
		userAddressList.add(userAddress3);
		userAddressList.add(userAddress4);
		userAddressList.add(userAddress5);
	}

	public static UserAddress getUserAddress(int index) {
		return userAddressList.get(index);
	}

	public static List<UserAddress> getAllUserAddress(UserAddress userAddress) {

		return userAddressList;
	}
}
