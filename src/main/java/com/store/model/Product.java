package com.store.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.store.model.Store;

@Entity
@Table(name="product_table")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int productId;
	
	
	@Column
	private String productName;

	@Column
	private int productPriority;
	
	@Column
	@Lob
	private String productDescription;
	
	@Column
	private String productImagePath;

	@Column
	private String productType;
	
	//@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	//@ManyToOne(fetch = FetchType.EAGER)
	//@ManyToOne(optional=false)
	
	@ManyToOne
    @JoinColumn(name = "STORE_STOREID", nullable = false, updatable = true, insertable = true)
	private  Store store;
	
	
	/*@OneToOne
	@JoinColumn(name="OFFER_OFFERID")
	private Offer offer;*/
	
	@Column
	private Date productEntryDate;

	@Column
	private Date offerStartTime;
	
	@Column
	private Date offerEndTime;


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductPriority() {
		return productPriority;
	}


	public void setProductPriority(int productPriority) {
		this.productPriority = productPriority;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public String getProductImagePath() {
		return productImagePath;
	}


	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public Store getStore() {
		return store;
	}


	public void setStore(Store store) {
		this.store = store;
	}


	public Date getProductEntryDate() {
		return productEntryDate;
	}


	public void setProductEntryDate(Date productEntryDate) {
		this.productEntryDate = productEntryDate;
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
