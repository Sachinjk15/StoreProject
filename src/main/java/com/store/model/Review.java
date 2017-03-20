package com.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="review_table")
public class Review {
	
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
	
	@Column
	private String reviewDate;
	
	
	@Column
	private boolean isLiked;
	
	
	@ManyToOne
    @JoinColumn(name = "STORE_STOREID", nullable = false, updatable = true, insertable = true)
	private Store storeId;
	
	
	@Column
	private String productType;

	public Store getStoreId() {
		return storeId;
	}


	public void setStoreId(Store storeId) {
		this.storeId = storeId;
	}


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


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	
}
