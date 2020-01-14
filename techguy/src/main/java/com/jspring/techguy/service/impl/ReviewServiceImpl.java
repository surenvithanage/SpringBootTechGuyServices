/**
 * 
 */
package com.jspring.techguy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspring.techguy.bean.ReviewBean;
import com.jspring.techguy.repository.ReviewRepository;
import com.jspring.techguy.service.ReviewService;

/**
 * @author vimukthi_r
 * @Date Jan 14, 2019
 * @Description This class implements ReviewService interface and generate it's
 *              methods
 * @Version V1.0
 */
@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewRepository reviewRepository;

	@Override
	public List<ReviewBean> findAllReviews() throws Exception {
		List<ReviewBean> reviewList = new ArrayList<>();
		try {
			reviewRepository.findAll().forEach(review -> {
				ReviewBean reviewBean = new ReviewBean();
				reviewBean.setCompany(review.getCompany().getName());
				reviewBean.setCons(review.getCons());
				reviewBean.setDescription(review.getDescription());
				reviewBean.setDuration(review.getDuration());
				reviewBean.setHeader(review.getHeader());
				reviewBean.setImage(review.getImage());
				reviewBean.setPros(review.getPros());
				reviewBean.setRating(review.getRating());
				reviewBean.setReviewId(review.getReviewId());
				reviewBean.setUser(review.getUser().getUserName());
				
				reviewList.add(reviewBean);
			});
		} catch (Exception e) {
			throw e;
		}
		return reviewList;
	}

	@Override
	public List<ReviewBean> findLastFiveReviews() throws Exception {
		List<ReviewBean> reviewList = new ArrayList<>();
		try {
			reviewRepository.findFirst5ByOrderByReviewIdDesc().forEach(review -> {
				ReviewBean reviewBean = new ReviewBean();
				reviewBean.setCompany(review.getCompany().getName());
				reviewBean.setCons(review.getCons());
				reviewBean.setDescription(review.getDescription());
				reviewBean.setDuration(review.getDuration());
				reviewBean.setHeader(review.getHeader());
				reviewBean.setImage(review.getImage());
				reviewBean.setPros(review.getPros());
				reviewBean.setRating(review.getRating());
				reviewBean.setReviewId(review.getReviewId());
				reviewBean.setUser(review.getUser().getUserName());
				
				reviewList.add(reviewBean);
			});
			//return Arrays.asList(reviewRepository.findFirst2ByOrderByReviewIdAsc());
		} catch (Exception e) {
			throw e;
		}
		return reviewList;
	}

}
