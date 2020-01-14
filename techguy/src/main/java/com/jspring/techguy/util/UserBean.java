package com.jspring.techguy.util;

import java.util.HashSet;
import java.util.Set;

import com.jspring.techguy.mapping.Company;
import com.jspring.techguy.mapping.Cvdata;
import com.jspring.techguy.mapping.Jobrole;
import com.jspring.techguy.mapping.Review;
import com.jspring.techguy.mapping.Role;



public class UserBean {
	private int userId;
	
	private String userName;
	private String firstname;
	private String lastName;
	private String gender;
	private Integer age;
	private String email;
	private String telephone;
	private String addressLineOne;
	private String addressLineTwo;
	private String city;
	private String cityCode;
	private String province;
	private String country;
	private String password;
	
	
	private String confirmationToken;


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getAddressLineOne() {
		return addressLineOne;
	}


	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}


	public String getAddressLineTwo() {
		return addressLineTwo;
	}


	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCityCode() {
		return cityCode;
	}


	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmationToken() {
		return confirmationToken;
	}


	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}
	
	
	
	
	
	
	
}
