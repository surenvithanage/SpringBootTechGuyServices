/**
 * 
 */
package com.jspring.techguy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jspring.techguy.mapping.Review;

/**
 * @author vimukthi_r
 * @Date Jan 14, 2019
 * @Description
 * @Version
 */
@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
	//@Query("SELECT r FROM Review r ORDER BY reviewId DESC LIMIT 5")
	//public List<Review> findLastFiveReviews();
	public Iterable<Review> findFirst5ByOrderByReviewIdDesc();
}
