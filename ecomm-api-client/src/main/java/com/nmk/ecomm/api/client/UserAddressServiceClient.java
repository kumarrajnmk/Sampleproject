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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.nmk.ecomm.model.UserAddress;

@RestController
public class UserAddressServiceClient {
	@Autowired
	static RestTemplate restTemplate = new RestTemplate();
	static String userAddressSeriviceURL = "http://localhost:8091/api/v1/useraddress";
	private static final Logger logger = LoggerFactory.getLogger(UserAddressServiceClient.class);

	public static UserAddress getUserAddressByIdx(int id) {
		logger.debug("Start  :UserAddressServiceClient .getUserAddressByIdx() ");

		UserAddress userAddress = restTemplate.getForObject(userAddressSeriviceURL + "/" + id, UserAddress.class);
		System.out.println(userAddress.getIdx() + " " + userAddress.getName() + " " + userAddress.getStreetAddress1()
				+ " " + userAddress.getStreetAddress2() + " " + userAddress.getCity() + " " + userAddress.getState()
				+ " " + userAddress.getZipCode() + " " + userAddress.getCountry() + " " + userAddress.getCreatedBy()
				+ " " + userAddress.getCreateDate() + " " + userAddress.getModifiedBy() + " "
				+ userAddress.getModifiedDate());
		logger.debug("Start  :UserAddressServiceClient .getUserAddressByIdx() ");

		return userAddress;
	}

	public static UserAddress getAllUserAddress() {
		logger.debug("Start  :UserAddressServiceClient .getAllUserAddress() ");

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(userAddressSeriviceURL, HttpMethod.GET, entity,
				String.class);
		logger.debug("Start  :UserAddressServiceClient .getAllUserAddress() ");

		System.out.println(result);
		return null;
	}

	public static void deleteUserAddress(int id) {
		logger.debug("Start  :UserAddressServiceClient .deleteUserAddress() ");

		restTemplate.delete(userAddressSeriviceURL + "/" + id);
		logger.debug("Start  :UserAddressServiceClient .deleteUserAddress() ");

	}

	public static void createUserAddress(UserAddress userAddress) {
		logger.debug("Start  :UserAddressServiceClient .createUserAddress() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<UserAddress> request = new HttpEntity<UserAddress>(userAddress);
		ResponseEntity<UserAddress> response = restTemplate.exchange(userAddressSeriviceURL, HttpMethod.POST, request,
				UserAddress.class);
		logger.debug("Start  :UserAddressServiceClient .createUserAddress() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("UserAddress Data Inserted Successfully");
	}

	public static void updateUserAddress(UserAddress userAddress) {
		userAddressSeriviceURL = "http://localhost:8091/api/v1/useraddress/5009";
		logger.debug("Start  :UserAddressServiceClient .updateUserAddress() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<UserAddress> request = new HttpEntity<UserAddress>(userAddress);
		ResponseEntity<UserAddress> response = restTemplate.exchange(userAddressSeriviceURL, HttpMethod.PUT, request,
				UserAddress.class);
		logger.debug("Start  :UserAddressServiceClient .updateUserAddress() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("UserAddress Data Updated Successfully");
	}

	public static void main(String[] args) {
		// We should use these for above methods
		// Brand brand = new Brand("Hp5", "Satish2", "rajdgsg", new java.util.Date(),
		// "asdsaddgs", new java.util.Date());
	//	UserAddress userAddress = new UserAddress("hegllo", "Kukutgpally", "Kpghb", "Hygderabad", "Telagngana",
	//		"5040083", "Indgia", "Lgakshmi", new java.util.Date(), "asdsaddgs", new java.util.Date(), 445);
		// updateUserAddress(userAddress);
	//	createUserAddress(userAddress);
	//	 UserAddress userAddress =getUserAddressByIdx(5000);
		// System.out.println(brand.getName());
		// UserAddress userAddress =new UserAddress();
		// UserAddress userAddress = getAllUserAddress();
		// System.out.println(brand.getIdx());
		// deleteUserAddress(2);
	}

	public static List<UserAddress> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}
