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
import org.springframework.web.bind.annotation.RestController;

import com.jspring.techguy.mapping.Page;
import com.jspring.techguy.service.PageService;
import com.jspring.techguy.util.CommonVar;

/**
 * @Author : Vimukthi R.
 * @Date : Jan 14, 2019
 * @Description :Control the some page related requests
 */
@RestController
@CrossOrigin(CommonVar.angularOrigin)
public class TechGuyPageController {
	
	private static final Logger logger = Logger.getLogger(TechGuyPageController.class);
	
	@Autowired
	PageService pageService;
	
	/*
	 * This method displays welcome text
	 */
	@GetMapping(value="/")
	public String welcomePage() {
		return "Welcome to TechGuy";
	}
	
	/*
	 * This method manage get all page requests
	 * if success returns company arrayList
	 * else returns empty list
	 */
	@GetMapping(value="/pages")
	public List<Page> findAllPages(){
		List<Page> pageList = new ArrayList<>();
		try {
			logger.info("get all pages request received.");
			pageList = pageService.findAllPages(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pageList;
	}
	
	/*
	 * This method manage get single page by role requests
	 * if success returns page object
	 * else returns null
	 */
	@GetMapping(value="/roles/{rolename}/pages")
	public List<Page> findPagesByRoleName(@PathVariable("rolename") String roleName){
		List<Page> pageList = new ArrayList<>();
		try {
			logger.info("get all pages for rolename "+roleName+" request received.");
			pageList = pageService.findPageByRoleName(roleName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pageList;
	}
}
