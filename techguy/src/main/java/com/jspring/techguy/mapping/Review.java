package com.jspring.techguy.mapping;
// Generated Jan 3, 2019 9:27:06 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Review generated by hbm2java
 */
@Entity
@Table(name = "review", catalog = "techguy")
public class Review implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = -559823427979362489L;
	private int reviewId;
	private Company company;
	private User user;
	private String header;
	private String description;
	private String image;
	private String rating;
	private String pros;
	private String cons;
	private String duration;

	public Review() {
	}

	public Review(int reviewId, Company company, User user) {
		this.reviewId = reviewId;
		this.company = company;
		this.user = user;
	}

	public Review(String image, int reviewId, Company company, User user, String header, String description,
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

	@Id
	@Column(name = "review_id", unique = true, nullable = false)
	public int getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_company_id", nullable = false)
	@JsonManagedReference
	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_user_Id", nullable = false)
	@JsonManagedReference
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "header", length = 255)
	public String getHeader() {
		return this.header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	@Column(name = "description", length = 255)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "rating", length = 255)
	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Column(name = "pros", length = 255)
	public String getPros() {
		return this.pros;
	}

	public void setPros(String pros) {
		this.pros = pros;
	}

	@Column(name = "cons", length = 255)
	public String getCons() {
		return this.cons;
	}

	public void setCons(String cons) {
		this.cons = cons;
	}

	@Column(name = "duration", length = 20)
	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Column(name = "image", length = 255)
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
