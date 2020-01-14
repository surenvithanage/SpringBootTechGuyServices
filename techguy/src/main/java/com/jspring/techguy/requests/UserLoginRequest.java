/**
 * 
 */
package com.jspring.techguy.requests;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;


/**
 * @Author : Vimukthi G. R.
 * @Date : Dec 04, 2018
 * @Description :Contains user login request parameters
 */
@Component
public class UserLoginRequest {
	
	private String email;
	private String password;

	/**
	 * @return the email
	 */
	@NotEmpty(message = "email field cannot be empty")
	@NotNull
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	@NotEmpty(message = "password field cannot be empty")
	@NotNull
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
