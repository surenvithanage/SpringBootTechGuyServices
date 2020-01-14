package com.jspring.techguy.bean;
// Generated Jan 3, 2019 9:27:06 AM by Hibernate Tools 4.3.1

import org.springframework.stereotype.Component;

/**
 * Review generated by hbm2java
 */
@Component
public class ReviewBean implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = -559823427979362489L;
	private int reviewId;
	private String company;
	private String user;
	private String header;
	private String description;
	private String image;
	private String rating;
	private String pros;
	private String cons;
	private String duration;

	public ReviewBean() {
	}

	public ReviewBean(int reviewId, String company, String user) {
		this.reviewId = reviewId;
		this.company = company;
		this.user = user;
	}

	public ReviewBean(String image, int reviewId, String company, String user, String header, String description,
			String rating, String pros, String cons, String duration) {
		this.reviewId = reviewId;
		this.company = company;
		this.user = user;
		this.header = header;
		this.description = description;
		this.rating = rating;
		this.pros = pros;
		this.cons = cons;
		this.duration = duration;
		this.image = image;
	}

	/**
	 * @return the reviewId
	 */
	public int getReviewId() {
		return reviewId;
	}

	/**
	 * @param reviewId the reviewId to set
	 */
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the header
	 */
	public String getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(String header) {
		this.header = header;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * @return the pros
	 */
	public String getPros() {
		return pros;
	}

	/**
	 * @param pros the pros to set
	 */
	public void setPros(String pros) {
		this.pros = pros;
	}

	/**
	 * @return the cons
	 */
	public String getCons() {
		return cons;
	}

	/**
	 * @param cons the cons to set
	 */
	public void setCons(String cons) {
		this.cons = cons;
	}

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	
}
