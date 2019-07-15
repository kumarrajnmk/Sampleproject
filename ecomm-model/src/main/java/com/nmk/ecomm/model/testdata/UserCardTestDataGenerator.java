package com.nmk.ecomm.model.testdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nmk.ecomm.model.UserCard;

public abstract class UserCardTestDataGenerator {
	static List<UserCard> userCardList = new ArrayList<UserCard>();
	static {
		UserCard userCard1 = new UserCard("Abhilash", "good", "visa", "2019-020-23", "244", "watson", "george",
				"ameerpet", "srnagar", "Hyderabad", "Telangana", "500016", 78, 5, "willium", new Date(), "madan",
				new Date());
		userCard1.setIdx(1);

		UserCard userCard2 = new UserCard("Samson", "good", "Maestro", "2019-020-23", "244", "watson", "george",
				"ameerpet", "srnagar", "Hyderabad", "Telangana", "500016", 78, 5, "willium", new Date(), "madan",
				new Date());
		userCard2.setIdx(2);

		UserCard userCard3 = new UserCard("Sandeep", "good", "American Express", "2019-020-23", "244", "watson",
				"george", "ameerpet", "srnagar", "Hyderabad", "Telangana", "500016", 78, 5, "willium", new Date(),
				"madan", new Date());
		userCard3.setIdx(3);

		UserCard userCard4 = new UserCard("Harish", "good", "visa", "2019-020-23", "244", "watson", "george",
				"ameerpet", "srnagar", "Hyderabad", "Telangana", "500016", 78, 5, "willium", new Date(), "madan",
				new Date());
		userCard4.setIdx(4);

		UserCard userCard5 = new UserCard("Sai", "good", "Maestro", "2019-020-23", "244", "watson", "george",
				"ameerpet", "srnagar", "Hyderabad", "Telangana", "500016", 78, 5, "willium", new Date(), "madan",
				new Date());
		userCard5.setIdx(5);

		userCardList.add(userCard1);
		userCardList.add(userCard2);
		userCardList.add(userCard3);
		userCardList.add(userCard4);
		userCardList.add(userCard5);
	}

	public static List<UserCard> getAllCardTypes() {
		return userCardList;
	}
}
