package com.nmk.ecomm.api.client;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.nmk.ecomm.model.UserCard;

public class UserCardServiceClient {
	@Autowired
	static RestTemplate restTemplate = new RestTemplate();
	static String userCardSeriviceURL = "http://localhost:8085/api/v1/usercard";
	
	private static final Logger logger = LoggerFactory.getLogger(UserAddressServiceClient.class);

	public static UserCard getUserCardByIdx(int id) {
		UserCard userCard = restTemplate.getForObject(userCardSeriviceURL + "/" + id, UserCard.class);
		logger.debug("Start  :UserAddressServiceClient .getUserAddressByIdx() ");

		logger.debug("Start  :UserAddressServiceClient .getUserAddressByIdx() ");

		return userCard;
	}
	
	
	

	public static UserCard getAllUserCards() {
		logger.debug("Start  :UserAddressServiceClient .getAllUserAddress() ");

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(userCardSeriviceURL, HttpMethod.GET, entity,
				String.class);
		logger.debug("Start  :UserAddressServiceClient .getAllUserAddress() ");

		System.out.println(result);
		return null;
	}

	public static void deleteUserCard(int id) {
		restTemplate.delete(userCardSeriviceURL + "/" + id);
	}

	public static void createUserCard(UserCard userCard) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<UserCard> request = new HttpEntity<UserCard>(userCard);
		ResponseEntity<UserCard> response = restTemplate.exchange(userCardSeriviceURL, HttpMethod.POST, request,
				UserCard.class);
		if (200 == response.getStatusCodeValue())
			System.out.println("UserCard Data Inserted Successfully");
	}

	public static void updateUserCard(UserCard userCard) {
		userCardSeriviceURL = "http://localhost:8085/api/v1/usercard/1000";
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<UserCard> request = new HttpEntity<UserCard>(userCard);
		ResponseEntity<UserCard> response = restTemplate.exchange(userCardSeriviceURL, HttpMethod.PUT, request,
				UserCard.class);
		if (200 == response.getStatusCodeValue())
			System.out.println("UserCard Data Updated Successfully");
	}

	/*
	 * public static void lockUserCard(int id) { }
	 */
	public static void main(String[] args) {
		// // We should use these for above methods
		// // UserCard userCard = new UserCard("Hp5", "Satish2", "rajdgsg", new
		// java.util.Date(),
		// // "asdsaddgs", new java.util.Date());
		// // updateUserCard(userCard);
		// // createUserCard(userCard);
		// //UserCard userCard = getUserCardByIdx(8);
		// // System.out.println(userCard.getName());
		// // UserCard userCard = new UserCard();
		//
		// deleteUserCard(1004);
	
		getAllUserCards();
	}




	public static List<UserCard> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}
