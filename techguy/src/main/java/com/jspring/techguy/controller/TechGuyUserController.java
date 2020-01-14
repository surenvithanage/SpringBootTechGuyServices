/**
 * 
 */
package com.jspring.techguy.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspring.techguy.util.EmailService;
import com.jspring.techguy.util.MailRequest;
import com.jspring.techguy.util.MailResponse;
import com.jspring.techguy.util.UserBean;
import com.jspring.techguy.mapping.TemporyUser;
import com.jspring.techguy.mapping.User;
import com.jspring.techguy.requests.UserLoginRequest;
import com.jspring.techguy.service.UserService;
import com.jspring.techguy.util.EndPoint;
import com.jspring.techguy.util.LogMessageList;

/**
 * @Author : Vimukthi G. R.
 * @Date : Nov 29, 2018
 * @Description :Control the all user related requests
 */
@RestController
public class TechGuyUserController {

	private static final Logger logger = Logger.getLogger(TechGuyUserController.class);

	@Autowired
	UserService userService;

	@Autowired
	EmailService service;

	/*
	 * This method manage user register requests if success returns user object else
	 * returns null
	 */
	@PostMapping(value = EndPoint.USER_SIGN_UP, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> registerUser(@Valid @RequestBody UserBean user) {
		logger.info(LogMessageList.USER_SIGN_UP_REQUEST_RECEVED + user);
		TemporyUser user1 = new TemporyUser();
		MailResponse response = new MailResponse();
		try {

			user1.setAddressLineOne(user.getAddressLineOne());
			user1.setAddressLineTwo(user.getAddressLineTwo());
			user1.setAge(user.getAge());
			user1.setCity(user.getCity());
			user1.setCityCode(user.getCityCode());
			user1.setConfirmationToken(user.getConfirmationToken());
			user1.setCountry(user.getCountry());
			user1.setEmail(user.getEmail());
			user1.setFirstname(user.getFirstname());
			user1.setGender(user.getGender());
			user1.setLastName(user.getPassword());
			user1.setPassword(user.getPassword());
			user1.setTelephone(user.getTelephone());

			Map<String, Object> model = new HashMap<>();
			model.put("Name", user.getLastName());
			model.put("location", "Battaramulla,Colombo");
			model.put("confirmation no", user.getConfirmationToken());
			response = service.sendEmail(user, model);

			user1 = userService.registerTemporyUser(user1);
			if (!Objects.isNull(user1)) {
				response.setResponse("temporarly data saved and wait for confirmation");
			}

		} catch (Exception e) {
			logger.error(e);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping(value = EndPoint.USER_SIGN_UP_STORE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> registerUser2(
			@RequestParam(name = "confirmationToken", required = false, defaultValue = "Stranger you fucked up") String confirmationToken) {
		logger.info(LogMessageList.USER_SIGN_UP_REQUEST_RECEVED);
		TemporyUser user = new TemporyUser();

		try {
			user = userService.getUserByconfirmation_token(confirmationToken);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		User userstored = new User();
		if (!Objects.isNull(user)) {

			userstored.setAddressLineOne(user.getAddressLineOne());
			userstored.setAddressLineTwo(user.getAddressLineTwo());
			userstored.setAge(user.getAge());
			userstored.setCity(user.getCity());
			userstored.setCityCode(user.getCityCode());
			userstored.setCountry(user.getCountry());
			userstored.setEmail(user.getEmail());
			userstored.setFirstname(user.getFirstname());
			userstored.setGender(user.getGender());
			userstored.setLastName(user.getLastName());
			userstored.setPassword(user.getPassword());
			userstored.setProvince(user.getProvince());
			userstored.setTelephone(user.getTelephone());
			userstored.setUserName(user.getUserName());

			try {
				userstored = userService.registerUser(userstored);

				if (!Objects.isNull(userstored)) {

					return new ResponseEntity<>(userstored, HttpStatus.OK);
				} else {

					return new ResponseEntity<>(userstored, HttpStatus.REQUEST_TIMEOUT);
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return new ResponseEntity<>(user, HttpStatus.REQUEST_TIMEOUT);
			}

		} else {

			return new ResponseEntity<>(user, HttpStatus.REQUEST_TIMEOUT);

		}

//		try {
//			user = userService.registerUser(user);
//		} catch (Exception e) {
//			logger.error(e);
//		}

	}

	/*
	 * This method manage user login requests if success returns user object else
	 * returns null
	 */
	@PostMapping(value = EndPoint.USER_SIGN_IN, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> loginUser(@Valid @RequestBody UserLoginRequest userLoginRequest) {
		logger.info(LogMessageList.USER_SIGN_IN_REQUEST_RECEVED + userLoginRequest);
		User user = null;
		try {
			user = userService.getUserByEmailAndPassword(userLoginRequest.getEmail(), userLoginRequest.getPassword());
		} catch (Exception e) {
			logger.error(e);
		}
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	/*
	 * This method manage user register requests
	 */
	@PostMapping(value = EndPoint.USER_UPDATE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> updateUser(@Valid @RequestBody User user) {
		return null;
	}

	@Autowired
	public JavaMailSender emailSender;

	@GetMapping("/user/version1")
	public String test(@RequestParam(value = "name", required = false) String username,
			@RequestParam(value = "pwd", required = false) String password,
			@RequestParam(value = "en", required = false) boolean encrypted) {
		// Dont delete below
		/*
		 * BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
		 * basicTextEncryptor.setPassword("password");
		 * 
		 * if (encrypted) { System.err.println(basicTextEncryptor.decrypt(username) +
		 * "," + basicTextEncryptor.decrypt(password)); } else {
		 * System.err.println(username + "," + password); }
		 * 
		 * System.err.println(username + "," + password); String name =
		 * basicTextEncryptor.encrypt(username); String pwd =
		 * basicTextEncryptor.encrypt(password);
		 * 
		 * String testUrl = "http://localhost:8091/user/version1?name=" + name + "&pwd="
		 * + pwd+"&en=true";
		 * 
		 * URLEncoder urlEncoder = new URLEncoder(); String encodedUrl =
		 * urlEncoder.encode(testUrl, StandardCharsets.UTF_8);
		 * 
		 * System.err.println(encodedUrl);
		 */

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("reachVimukthi@gmail.com");
		message.setText("<html><body><h1>dummy message</h1></body></html>"); // not working
		emailSender.send(message);
		return "success";
	}

	@PostMapping("/sendingEmail")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "Bangalore,India");
		// return service.sendEmail(request, model);
		return null;
	}

}
