/**
 * 
 */
package com.jspring.techguy.controller;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspring.techguy.mapping.Company;
import com.jspring.techguy.service.CompanyService;
import com.jspring.techguy.util.CommonVar;
import com.jspring.techguy.util.EndPoint;

/**
 * @Author : Vimukthi R.
 * @Date : Jan 14, 2019
 * @Description :Control the all company related requests
 */
@RestController
@RequestMapping(value = EndPoint.COMPANIES)
@CrossOrigin(CommonVar.angularOrigin)
public class TechGuyCompanyController {
	
	private static final Logger logger = Logger.getLogger(TechGuyCompanyController.class);
	
	@Autowired
	CompanyService companyService;
	
	/*
	 * This method manage get all company requests
	 * if success returns company arrayList
	 * else returns empty list
	 */
	@GetMapping
	public List<Company> findAllReviews(){
		List<Company> companyList = new ArrayList<>();
		try {
			logger.info("get all companies request received.");
			companyList = companyService.findAllCompanies(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return companyList;
	}
	
	/*
	 * This method returns single company object by company name
	 * else returns null
	 */
	@GetMapping(value="/{name}")
	public Company findReviewById(@PathVariable("name") String companyName) throws NumberFormatException{
		Company company = null;
		try {
			logger.info("get single reviews request received. reviewId:" + companyName);
			company = companyService.findCompanyByName(companyName); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return company;
	}
}
