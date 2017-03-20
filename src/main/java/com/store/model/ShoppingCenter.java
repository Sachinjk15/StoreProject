package com.store.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="shopping_center_table")
public class ShoppingCenter{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int shoppingCenterId;
	
	@Column
	@NotNull
	private String shoppingCenterName;
	
	@Column
	@NotNull
	private String shoppingCenterType;
	
	@Column
	@NotNull
	private String shoppingCenterCity;
	
	@Column
	@NotNull
	private String shoppingCenterPincode;
	
	
	@Column
	@NotNull
	private String shoppingCenterImagePath;
	
	
	@Column
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date shoppingCenterEntryDate;
	
	
	
	
	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.LAZY, mappedBy="shoppingCenterId")
	@Column(name="SHOPPING_CENTER_ID")
	private Set<Store> storeId ;

	
	public int getShoppingCenterId() {
		return shoppingCenterId;
	}

	public String getShoppingCenterName() {
		return shoppingCenterName;
	}


	public void setShoppingCenterName(String shoppingCenterName) {
		this.shoppingCenterName = shoppingCenterName;
	}


	public void setShoppingCenterId(int shoppingCenterId) {
		this.shoppingCenterId = shoppingCenterId;
	}


	public String getShoppingCenterType() {
		return shoppingCenterType;
	}


	public void setShoppingCenterType(String shoppingCenterType) {
		this.shoppingCenterType = shoppingCenterType;
	}


	public String getShoppingCenterCity() {
		return shoppingCenterCity;
	}


	public void setShoppingCenterCity(String shoppingCenterCity) {
		this.shoppingCenterCity = shoppingCenterCity;
	}


	public String getShoppingCenterPincode() {
		return shoppingCenterPincode;
	}


	public void setShoppingCenterPincode(String shoppingCenterPincode) {
		this.shoppingCenterPincode = shoppingCenterPincode;
	}

	
	

	public String getShoppingCenterImagePath() {
		return shoppingCenterImagePath;
	}

	public void setShoppingCenterImagePath(String shoppingCenterImagePath) {
		this.shoppingCenterImagePath = shoppingCenterImagePath;
	}

	
	
	public Date getShoppingCenterEntryDate() {
		return shoppingCenterEntryDate;
	}

	public void setShoppingCenterEntryDate(Date shoppingCenterEntryDate) {
		this.shoppingCenterEntryDate = shoppingCenterEntryDate;
	}

	public Set<Store> getStoreId() {
		return storeId;
	}

	public void setStoreId(Set<Store> storeId) {
		this.storeId = storeId;
	}
	

}
