package com.store.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="main_offer_table")
public class MainOffer {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int mainOfferId;
	
	@Column
	private String mainOfferName;
	
	@Column
	private String mainOfferImagePath;
	
	@Column
	@Lob
	private String mainOfferUrl;
	
	@Column
	private Date offerStartTime;
	
	@Column
	private Date offerEndTime;

	
	

	public String getMainOfferUrl() {
		return mainOfferUrl;
	}

	public void setMainOfferUrl(String mainOfferUrl) {
		this.mainOfferUrl = mainOfferUrl;
	}

	public int getMainOfferId() {
		return mainOfferId;
	}

	public void setMainOfferId(int mainOfferId) {
		this.mainOfferId = mainOfferId;
	}

	public String getMainOfferName() {
		return mainOfferName;
	}

	public void setMainOfferName(String mainOfferName) {
		this.mainOfferName = mainOfferName;
	}

	public String getMainOfferImagePath() {
		return mainOfferImagePath;
	}

	public void setMainOfferImagePath(String mainOfferImagePath) {
		this.mainOfferImagePath = mainOfferImagePath;
	}

	public Date getOfferStartTime() {
		return offerStartTime;
	}

	public void setOfferStartTime(Date offerStartTime) {
		this.offerStartTime = offerStartTime;
	}

	public Date getOfferEndTime() {
		return offerEndTime;
	}

	public void setOfferEndTime(Date offerEndTime) {
		this.offerEndTime = offerEndTime;
	}
	
	
	

}
