package com.nmk.ecomm.api.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nmk.ecomm.model.User;

@RestController
public class UserServiceClient {

	static Boolean userExist = null;

	@Autowired
	static RestTemplate restTemplate = new RestTemplate();

	static String userSeriviceURL = "http://localhost:8092/api/v1/user";

	private static final Logger logger = LoggerFactory.getLogger(UserAddressServiceClient.class);

	public static User getUserByIdx(int uid) {

		logger.debug("Start  :UserServiceClient .getUserByIdx() ");

		final List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
		interceptors.add(new BasicAuthorizationInterceptor("kumar", "password"));
		restTemplate.setInterceptors(interceptors);

		User user = restTemplate.getForObject(userSeriviceURL + "/" + uid, User.class);

		System.out.println(user.getUid() + "  " + user.getUserId() + "  " + user.getPwd() + "  " + user.getFirstName()
				+ "  " + user.getLastName() + "   " + user.getMiddleName() + "   " + user.getEmailAddress() + "   "
				+ user.getHomePhone() + "   " + user.getWorkPhone() + "   " + user.getMobilePhone() + "   "
				+ user.getFax() + "   " + user.getStatus() + "   " + user.getCreatedBy() + "   " + user.getCreateDate()
				+ "   " + user.getModifiedBy() + "   " + user.getModifiedDate());
		logger.debug("Start  :UserServiceClient .getUserByIdx() ");

		return user;
	}

	// private static RestTemplateBuilder restTemplateBuilder;

	public static User getUserByIdx(int uid, String password) {

		String uide = Integer.toString(uid);

		System.out.println("before rest template");
		restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor(uide, password));

		String plainCreds = uide + ":" + password;

		byte[] plainCredsBytes = plainCreds.getBytes();

		byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);

		String base64Creds = new String(base64CredsBytes);
		System.out.println("after base 64cred");

		HttpHeaders headers = new HttpHeaders();

		headers.add("Authorization", "Basic " + base64Creds);

		logger.debug("Start  :UserServiceClient .getUserByIdx() ");

		HttpEntity<String> request = new HttpEntity<String>(headers);

		System.out.println(uid + " " + password + " " + base64Creds);

		System.out.println("before calling the url");
		System.out.println(uid + " " + password);
		ResponseEntity<User> response = restTemplate.exchange(userSeriviceURL + "/" + uid, HttpMethod.GET, request,
				User.class);
		System.out.println("UserServiceClient.getUserByIdx()");
		User user = response.getBody();

		System.out.println(user.getUid() + "  " + user.getUserId() + "  " + user.getPwd() + "  " + user.getFirstName()
				+ "  " + user.getLastName() + "   " + user.getMiddleName() + "   " + user.getEmailAddress() + "   "
				+ user.getHomePhone() + "   " + user.getWorkPhone() + "   " + user.getMobilePhone() + "   "
				+ user.getFax() + "   " + user.getStatus() + "   " + user.getCreatedBy() + "   " + user.getCreateDate()
				+ "   " + user.getModifiedBy() + "   " + user.getModifiedDate());

		logger.debug("Start  :UserServiceClient .getUserByIdx() ");

		System.out.println("UserServiceClient.getUserByIdx()+end");

		System.out.println("UserServiceClient.getUserByIdx()" + user.toString());

		return user;
	}

	/*
	 * public static User getUserByIdx(int uid) {
	 * 
	 * String username = "kumar"; String password = "password";
	 * System.out.println("UserServiceClient.getUserByIdx()");
	 * 
	 * 
	 * HttpHeaders headers = new HttpHeaders();
	 * System.out.println("UserServiceClient.getUserByIdx()");
	 * 
	 * headers.setBasicAuth("kumar", "password");
	 * System.out.println("UserServiceClient.getUserByIdx()");
	 * 
	 * 
	 * System.out.println("UserServiceClient.getUserByIdx()"); HttpEntity<String>
	 * request = new HttpEntity<String>(headers);
	 * 
	 * 
	 * 
	 * System.out.println("UserServiceClient.getUserByIdx()"); ResponseEntity<User>
	 * response = restTemplate.exchange(userSeriviceURL, HttpMethod.GET, request,
	 * User.class); User account = response.getBody(); return account;
	 * 
	 * }
	 */

	public static User getAllUser() {

		RestTemplate restTemplate = new RestTemplate();
		logger.debug("Start  :UserServiceClient .getAllUser() ");

		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("kumar", "password");

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(userSeriviceURL, HttpMethod.GET, entity, String.class);
		logger.debug("Start  :UserServiceClient .getAllUser() ");

		System.out.println(result);
		return null;
	}

	public static void deleteUser(int id) {
		logger.debug("Start  :UserServiceClient .deleteUser() ");

		restTemplate.delete(userSeriviceURL + "/" + id);
		logger.debug("Start  :UserServiceClient .deleteUser() ");

	}

	public static void createUser(User user) {
		logger.debug("Start  :UserServiceClient .createUser() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<User> request = new HttpEntity<User>(user);
		ResponseEntity<User> response = restTemplate.exchange(userSeriviceURL, HttpMethod.POST, request, User.class);
		logger.debug("Start  :UserServiceClient .createUser() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("User Data Inserted Successfully");
	}

	public static void updateUser(User user) {

		userSeriviceURL = "http://localhost:8092/api/v1/user/35";
		logger.debug("Start  :UserServiceClient .updateUser() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<User> request = new HttpEntity<User>(user);
		ResponseEntity<User> response = restTemplate.exchange(userSeriviceURL, HttpMethod.PUT, request, User.class);
		logger.debug("Start  :UserServiceClient .updateUser() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("User Data Updated Successfully");
	}

	public static User getuserbylogin(int uid, String pwd) {
		System.out.println(uid);
		User user = restTemplate.getForObject(userSeriviceURL +"/"+ uid, User.class);

		String user1 = Integer.toString(uid);

		if (userExist != null) {

			String password = user.getPwd();

			String m = pwd.trim();

			if (password.equals(m)) {
				System.out.print("userexist");
				userExist = true;

			} else {
				userExist = false;
			}

		}

		return user;

	}

	public static void main(String[] args) {
		// User user = new User("Saftish1", "Passfword", "afaa", "aafa", "aafa",
		// "rsffsfaj@gmail.com", "243234", "5108233426772", "4443444", "5310243867899",
		// "2334234", "243234", new java.util.Date(), "2343234", new java.util.Date());

		// createUser(user);
		// updateUser(user);
		// getUserByIdx(2, "password");
		// System.out.println(user);
		// User user1 = getAllUser();
		// System.out.println(user.getFirstName());
		// User user = new User();
		// deleteUser(33);
		getUserByIdx(2, "ramarama");
	}

}
