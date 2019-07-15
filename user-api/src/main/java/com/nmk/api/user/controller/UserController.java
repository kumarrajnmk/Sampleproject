package com.nmk.api.user.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nmk.api.user.service.UserService;
import com.nmk.ecomm.api.util.UserServiceUtil;
import com.nmk.ecomm.model.User;
import com.nmk.ecomm.model.list.UserList;
import com.nmk.ecomm.service.entity.EcommUser;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserService userService;

	@RequestMapping("/")
	String hello() {
		logger.debug("Debug message");
		logger.info("Info message");
		logger.warn("Warn message");
		logger.error("Error message");
		return "Done";
	}

	@GetMapping(value = "", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public UserList getAllUser() {
		
		UserList ecommUserList = null;
		try {
			logger.debug("######## Starting UserController : getAllUser()  GOT INVOKED ########");

			ecommUserList = userService.findAll();
		} catch (Exception e) {
			logger.error("####### Exception in UserController : getAllUser()  GOT INVOKED #######" +e.getMessage());
			e.printStackTrace();
		}
		return ecommUserList;
	}
	

	@GetMapping(value = "/{idx}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public User getUserByIdx(@PathVariable(value = "idx")  Integer userIdx) {
		
		
		EcommUser ecommUser = null;
		try {
			logger.debug("######## Starting UserController : getUserByIdx()  GOT INVOKED ########");

			ecommUser = userService.findUserByIdx(userIdx);
		} catch (Exception e) {
			logger.error("####### Exception in UserController : getUserByIdx()  GOT INVOKED #######" +e.getMessage());
			e.printStackTrace();
		}

		return UserServiceUtil.convertEcommUserObjectToUser(ecommUser);
	}

	@PostMapping(value = "", consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public User createUser(@Valid @RequestBody User user) {
		EcommUser ecommUser1 = null;
		try {
			logger.debug("######## Starting UserController : createUser()  GOT INVOKED ########");

			EcommUser ecommUser = UserServiceUtil.convertUserToEcommUser(user);

			ecommUser1 = userService.createUser(ecommUser);
		} catch (Exception e) {
			logger.error("####### Exception in UserController : createUser()  GOT INVOKED #######" +e.getMessage());
			e.printStackTrace();
		}

		return UserServiceUtil.convertEcommUserObjectToUser(ecommUser1);
	}

	@DeleteMapping(value = "/{idx}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> deleteUser(@PathVariable(value = "idx") Integer userIdx) {
		try {
			logger.debug("######## Starting UserController : deleteUser()  GOT INVOKED ########");

			userService.deleteUser(userIdx);
		} catch (Exception e) {
			logger.error("####### Exception in UserController : deleteUser()  GOT INVOKED #######" +e.getMessage());
			e.printStackTrace();
		}

		return ResponseEntity.ok().build();

	}

	@PutMapping(value = "/{idx}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public User updateUser(@PathVariable(value = "idx") Integer userIdx, @Valid @RequestBody User user) {

		EcommUser ecommUser = null;
		try {
			logger.debug("######## Starting UserController : updateUser()  GOT INVOKED ########");

			ecommUser = userService.updateUser(user, userIdx);
		} catch (Exception e) {
			logger.error("####### Exception in UserController : updateUser()  GOT INVOKED #######" +e.getMessage());
			e.printStackTrace();
		}

		return UserServiceUtil.convertEcommUserObjectToUser(ecommUser);
	}

	@RequestMapping("/login")
	public String userValidation() {
		return "User: Successfully logged in!";
	}

}
