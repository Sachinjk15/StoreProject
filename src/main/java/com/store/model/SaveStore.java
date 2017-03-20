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
@Table(name="store_table")
public class SaveStore {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int storeId;
	
	@Column
	private String storeName;
	
	@Column
	private String storeProprietor;
	
	@Column
	private String storePriority;
	
	@Column
	private String storeLandLineNumber;
	
	@Column
	private String storeMobileNumber;
	
	@Column
	private String storeType;
	
	@Column
	private String storeArea;
	
	@Column
	private String storeAddress;
	
	@Column
	private String storeCity;
	
	@Column
	private String storePincode;
	
	@Column
	@Lob
	private String storeDescription;
	
	@Column
	private String storeImagePath;
	
	@Column
	private String storeTag;
	
	@Column
	private Date storeEntryDate;
	
	
	@Column(name="lat_lon",  nullable=true)
	private double lattitude_longitude;

	@Column(name="SHOPPING_CENTER_ID")
	private int shoppingCenterId;


	public int getStoreId() {
		return storeId;
	}


	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}


	public String getStoreName() {
		return storeName;
	}


	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}


	public String getStoreProprietor() {
		return storeProprietor;
	}


	public void setStoreProprietor(String storeProprietor) {
		this.storeProprietor = storeProprietor;
	}


	public String getStorePriority() {
		return storePriority;
	}


	public void setStorePriority(String storePriority) {
		this.storePriority = storePriority;
	}


	public String getStoreLandLineNumber() {
		return storeLandLineNumber;
	}


	public void setStoreLandLineNumber(String storeLandLineNumber) {
		this.storeLandLineNumber = storeLandLineNumber;
	}


	public String getStoreMobileNumber() {
		return storeMobileNumber;
	}


	public void setStoreMobileNumber(String storeMobileNumber) {
		this.storeMobileNumber = storeMobileNumber;
	}


	public String getStoreType() {
		return storeType;
	}


	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}


	public String getStoreArea() {
		return storeArea;
	}


	public void setStoreArea(String storeArea) {
		this.storeArea = storeArea;
	}


	public String getStoreAddress() {
		return storeAddress;
	}


	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}


	public String getStoreCity() {
		return storeCity;
	}


	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}


	public String getStorePincode() {
		return storePincode;
	}


	public void setStorePincode(String storePincode) {
		this.storePincode = storePincode;
	}


	public String getStoreDescription() {
		return storeDescription;
	}


	public void setStoreDescription(String storeDescription) {
		this.storeDescription = storeDescription;
	}


	public String getStoreImagePath() {
		return storeImagePath;
	}


	public void setStoreImagePath(String storeImagePath) {
		this.storeImagePath = storeImagePath;
	}


	public String getStoreTag() {
		return storeTag;
	}


	public void setStoreTag(String storeTag) {
		this.storeTag = storeTag;
	}


	public Date getStoreEntryDate() {
		return storeEntryDate;
	}


	public void setStoreEntryDate(Date storeEntryDate) {
		this.storeEntryDate = storeEntryDate;
	}


	public int getShoppingCenterId() {
		return shoppingCenterId;
	}


	public void setShoppingCenterId(int shoppingCenterId) {
		this.shoppingCenterId = shoppingCenterId;
	}
	
	
	public double getLattitude_longitude() {
		return lattitude_longitude;
	}


	public void setLattitude_longitude(double lattitude_longitude) {
		this.lattitude_longitude = lattitude_longitude;
	}
	


}
