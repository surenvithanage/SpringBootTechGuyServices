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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspring.techguy.bean.ReviewBean;
import com.jspring.techguy.service.ReviewService;
import com.jspring.techguy.util.CommonVar;
import com.jspring.techguy.util.EndPoint;

/**
 * @Author : Vimukthi R.
 * @Date : Jan 14, 2019
 * @Description :Control the all review related requests
 */
@RestController
@RequestMapping(value = EndPoint.REVIEWS)
@CrossOrigin(CommonVar.angularOrigin)
public class TechGuyReviewController {
	
	private static final Logger logger = Logger.getLogger(TechGuyReviewController.class);
	
	@Autowired
	ReviewService reviewService;
		
	/*
	 * This method manage get all review requests
	 * if success returns review arrayList
	 * else returns empty list
	 */
	@GetMapping
	public List<ReviewBean> findAllReviews(){
		List<ReviewBean> reviewList = new ArrayList<>();
		try {
			logger.info("get all reviews request received.");
			reviewList = reviewService.findAllReviews(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reviewList;
	}
	
	/*
	 * This method returns last five reviews as list
	 * else returns empty list
	 */
	@GetMapping(value="/latest")
	public List<ReviewBean> findLastFiveRevies(){
		List<ReviewBean> reviewList = new ArrayList<>();
		try {
			logger.info("get single reviews request received.");
			reviewList = reviewService.findLastFiveReviews(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reviewList;
	}
}
