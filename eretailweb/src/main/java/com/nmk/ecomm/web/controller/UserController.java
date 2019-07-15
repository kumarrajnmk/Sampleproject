package com.nmk.ecomm.web.controller;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nmk.ecomm.model.User;
import com.nmk.ecomm.web.jdbc.UserForgotJDBC;
import com.nmk.ecomm.web.service.intf.ERetailUserService;
import com.nmk.ecomm.web.vo.UserVO;

@Controller
@SessionAttributes("user")
public class UserController {

	private static final Logger LOGGER = Logger.getLogger(UserController.class);

	@Autowired
	ERetailUserService eRetailUserService;

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping("/loginform.do")
	public String showLoginForm(final Model model) {

		try {
			if (LOGGER.isDebugEnabled())
				LOGGER.debug("login  form page is loading ");
			model.addAttribute("user", new UserVO());
		} catch (Exception e) {
			LOGGER.error(" ERROR : login() METHOD GOT INVOKED ");
		}
		return "pages/signon";
	}

	/**
	 * @param user
	 * @param model
	 * @param uid
	 * @param bindResult
	 * @param pwd
	 * @param request
	 * @return Requesting to Login
	 */
	@RequestMapping(value = "/loginuser.do", method = RequestMethod.POST)
	public String loginUser(@Valid @ModelAttribute("user") UserVO user, final Model model,
			final BindingResult bindResult, @RequestParam("uid") final String uid,
			@RequestParam("pwd") final String pwd, HttpServletRequest req) {
		try {

			if (LOGGER.isDebugEnabled())
				LOGGER.debug("Start: LoginController.login()");
			if (LOGGER.isTraceEnabled())
				LOGGER.trace("User Credentials Received from User: " + user);
			if (LOGGER.isTraceEnabled())
				LOGGER.debug("Start: ERetailUserServiceImpl.getUserByIdx()");
			final UserVO userVO = eRetailUserService.getUserByIdx(Integer.parseInt(uid), pwd);

			user.setFirstName(userVO.getFirstName());
			user.setEmailAddress(userVO.getEmailAddress());
			user.setMobilePhone(userVO.getMobilePhone());
			user.setPwd(userVO.getPwd());
			user.setLastName(userVO.getLastName());
			user.setMiddleName(userVO.getMiddleName());
			user.setStatus(userVO.getStatus());
			user.setUserId(userVO.getUserId());
			model.addAttribute("user", user);
			return "index";
		}

		catch (Exception e) {
			LOGGER.error(" ERROR : login() METHOD GOT INVOKED " + e.getLocalizedMessage());
		}
		model.addAttribute("message", "username and password not valid");
		return "pages/signon";
	}

	@RequestMapping("/showRegisterForm.do")
	public String showRegistrationForm(final Model model) {

		model.addAttribute("user", new UserVO());

		return "pages/register";
	}

	/**
	 * @param user
	 * @param bindResult
	 * @param model
	 * @return
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 */
	@RequestMapping("/userregister.do")
	public String submitForm(@Valid @ModelAttribute("user") UserVO userVO, BindingResult bindResult, Model model)
			throws IllegalAccessException, InvocationTargetException {

		try {

			if (LOGGER.isDebugEnabled())
				LOGGER.debug("Start: UserController.submitForm()");
			if (LOGGER.isTraceEnabled())
				LOGGER.trace("User Details Received from User: " + userVO);
			if (LOGGER.isTraceEnabled())
				LOGGER.debug("Start: ERetailUserServiceImpl.submitForm()");
			if (bindResult.hasErrors()) {
				System.out.println(bindResult.getAllErrors());
				return "pages/register";
			}

			Date dt = new Date();
			userVO.setCreateDate(dt);
			userVO.setCreatedBy("rao");
			userVO.setModifiedBy("gopi");
			userVO.setModifiedDate(dt);
			userVO.setStatus("working");
			eRetailUserService.createUser(userVO);

		} catch (Exception e) {
			LOGGER.error(" ERROR : login() METHOD GOT INVOKED " + e.getLocalizedMessage());

		}

		return "pages/registersuccess";
	}

	/**
	 * @param userVO
	 * @return
	 */
	@RequestMapping("/updateUserProfile.do")
	public String updateUser(@ModelAttribute("user") @Validated User user, BindingResult bindResult)
			throws IllegalAccessException, InvocationTargetException {

		try {

			if (LOGGER.isDebugEnabled())
				LOGGER.debug("Start: UserController.updateUser()");
			if (LOGGER.isTraceEnabled())
				LOGGER.trace("User Details updated  Received from User: " + user);
			if (bindResult.hasErrors()) {
				System.out.println(bindResult.getAllErrors());

				System.out.println("UserController.submitForm()+error");

				return "pages/myprofile";
			}

			UserVO userVO = new UserVO();
			Date dt = new Date();
			userVO.setCreateDate(dt);
			userVO.setCreatedBy("rao");
			userVO.setModifiedBy("gopi");
			userVO.setModifiedDate(dt);
			BeanUtils.copyProperties(userVO, user);
			eRetailUserService.updateUser(userVO);

		} catch (Exception e) {
			LOGGER.error(" ERROR : updateUser() METHOD GOT INVOKED " + e.getLocalizedMessage());

		}
		return "redirect:/myprofile";
	}

	/**
	 * @param user1
	 * @param br
	 * @param model
	 * @return
	 */
	@GetMapping("/myProfile.do")
	public String userInfo(@SessionAttribute("user") UserVO user1, Model model) {

		try {
			LOGGER.debug("######## Starting UserController : userInfo() METHOD GOT INVOKED ########");
			user1.getFirstName();
			user1.getEmailAddress();
			user1.getMobilePhone();
			user1.getPwd();
			user1.getUserId();
			LOGGER.debug("UserController.userInfo()");
			model.addAttribute("user", user1);
		} catch (Exception e) {
			LOGGER.error(" ERROR : userInfo() METHOD GOT INVOKED " + e.getLocalizedMessage());

		}

		return "pages/myprofile";
	}

	/**
	 * @param session
	 * @return
	 */
	@RequestMapping("/logout")
	public String LogOut(final HttpSession session) {
		try {
			LOGGER.debug("######## Starting UserController : LogOut() METHOD GOT INVOKED ########");
			session.invalidate();
		} catch (Exception e) {
			LOGGER.error(
					"####### End Exception in UserController : LogOut() Method Got Invoked #######" + e.getMessage());
		}
		return "pages/categories";
	}

	/**
	 * @param user
	 * @return
	 */
	@RequestMapping("/forgotpassword.do")
	public String newPassword(final Model model) {

		try {
			LOGGER.debug("######## Starting UserController : newPassword() METHOD GOT INVOKED ########");
			model.addAttribute("user", new UserVO());

		} catch (Exception e) {
			LOGGER.error("####### End Exception in UserController : newPassword() Method Got Invoked #######"
					+ e.getMessage());
		}

		return "pages/forgotpassword";
	}

	/**
	 * @return
	 */
	// String view = " ";

	@RequestMapping(value = "/resetPassword.do", method = { RequestMethod.GET, RequestMethod.POST })
	public String restPassword(@ModelAttribute("user") UserVO user, @RequestParam("emailAddress") String emailAddress,
			HttpServletRequest req, Model model) throws SQLException, ClassNotFoundException {

		try {

			if (LOGGER.isDebugEnabled())
				LOGGER.debug("Start: UserController.restPassword()");
			if (LOGGER.isTraceEnabled())
				LOGGER.trace("emailAddress recived from  from User: " + user);

			UserForgotJDBC data = null;
			data = new UserForgotJDBC();
			List<String> emails = data.getEmails();

			for (String email : emails) {
				if (emailAddress.equals(email)) {
					System.out.println("UserController.restPassword()" + "if");
					return "pages/useridsuccess";

				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("error", "Please provide valid Email Address");

		return "pages/forgotpassword";
	}

	public Object getAllUsers(Model model) {
		// TODO Auto-generated method stub
		return null;
	}

}
