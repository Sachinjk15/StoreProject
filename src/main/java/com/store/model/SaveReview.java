package com.store.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="review_table")
public class SaveReview {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int reviewId;
	
	@Column
	private String userName;
	
	@Column
	private int reviewRating;
	
	@Column(columnDefinition = "LONGTEXT")
	private String reviewDescription;
	
	
	private String reviewDate;
	
	@Column
	private boolean isLiked;
	
	@Column
	private int STORE_STOREID;
	
	@Column
	private String productType;

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getReviewRating() {
		return reviewRating;
	}

	public void setReviewRating(int reviewRating) {
		this.reviewRating = reviewRating;
	}

	public String getReviewDescription() {
		return reviewDescription;
	}

	public void setReviewDescription(String reviewDescription) {
		this.reviewDescription = reviewDescription;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	public boolean getIsLiked() {
		return isLiked;
	}

	public void setIsLiked(boolean isLiked) {
		this.isLiked = isLiked;
	}

	public int getStoreId() {
		return STORE_STOREID;
	}

	public void setStoreId(int STORE_STOREID) {
		this.STORE_STOREID = STORE_STOREID;
	}
	

}
