package com.nmk.ecomm.model.testdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nmk.ecomm.model.User;

public abstract class UserTestDataGenerator {

	public static List<User> userList = new ArrayList<User>();
	static {
		User user1 = new User("36", "hello", "katta", "john", "son", "siva.nmkglobal@gmail.com", "2565459245",
				"0406525435", "96548542533", "ameerpet", "active", "gopi", new Date(2017, 8, 9), "sathish", new Date());
		user1.setUid(1);

		User user2 = new User("37", "Dont know", "kallagunta", "smith", "stev", "gopi@gmail.com", "32846120947",
				"04065464353", "96542881233", "mehadipatnam", "active", "gopi", new Date(2017, 8, 9), "sathish",
				new Date());
		;
		user2.setUid(2);

		User user3 = new User("38", "Dont know", "kotti", "willium", "son", "vijay@gmail.com", "31364498378",
				"04065464435", "96543881233", "erramanjill", "active", "gopi", new Date(2017, 8, 9), "sathish",
				new Date());
		;
		user3.setUid(3);

		User user4 = new User("39", "hello", "gunti", "perth", "mathew", "rao@gmail.com", "69995631565", "040655425423",
				"9654884233", "srnagar", "active", "gopi", new Date(2017, 8, 9), "sathish", new Date());
		;
		user4.setUid(4);

		User user5 = new User("40", "monitor", "swarna", "sundar", "migh", "kumar@gmail.com", "6565659898",
				"0406545423543", "96545431233", "haithnagar", "active", "gopi", new Date(2017, 8, 9), "sathish",
				new Date());
		;
		user5.setUid(5);

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);

	}

	public static User getUserDetails(int index) {
		return userList.get(index);
	}

	public static List<User> addUser(User user) {
		List<User> user1 = new ArrayList<User>();
		userList.add(new User("39", "hello", "gunti", "perth", "mathew", "rao@gmail.com", "69995631565", "040655425423",
				"9654884233", "srnagar", "active", "gopi", new Date(2017, 8, 9), "sathish", new Date()));
		return userList;
	}

	public static List<User> getAllUsers() {

		return userList;
	}

}
