/**
 * 
 */
package com.jspring.techguy.service;

import java.util.List;

import com.jspring.techguy.bean.ReviewBean;

/**
 * @author vimukthi_r
 * @Date Jan 14, 2019
 * @Description 
 * @Version V1.0
 */
public interface ReviewService {
	public List<ReviewBean> findAllReviews() throws Exception;
	public List<ReviewBean> findLastFiveReviews() throws Exception;
}
