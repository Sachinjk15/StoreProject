package com.store.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="store_table")
public class Store {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int storeId;
	
	@Column
	@NotNull
	private String storeName;
	
	@Column
	@NotNull
	private String StoreProprietor;
	
	@Column
	@NotNull
	private String storePriority;
	
	@Column
	@NotNull
	private String storeLandLineNumber;
	
	@Column
	@NotNull
	private String storeMobileNumber;
	

	@Column(columnDefinition = "LONGTEXT")
	@NotNull
	private String storeType;
	
	@Column
	@NotNull
	private String storeArea;
	
	@Column
	@NotNull
	private String storeAddress;
	

	@Column
	@NotNull
	private String storeCity;
	
	@Column
	@NotNull
	private String storePincode;
	
	
	@Column
	@NotNull
	@Lob
	private String storeDescription;
	

	@Column
	@NotNull
	private String storeImagePath;
	
	@Column
	@NotNull
	private String storeTag;
	

	@Column
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date storeEntryDate;

	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.LAZY, mappedBy="store")
	@Column(name="STORE_STOREID")
	private Set<Product> products=new HashSet<Product>(0);

	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.LAZY, mappedBy="storeId")
	@Column(name="STORE_STOREID")
	private Set<Review> reviews ;
	
	
	
	@ManyToOne
    @JoinColumn(name = "SHOPPING_CENTER_ID", nullable = false, updatable = true, insertable = true)
	private ShoppingCenter shoppingCenterId;
	
	@Column(name="lat_lon", nullable=true)
	private double lattitude_longitude;
	
	
	
	public double getLattitude_longitude() {
		return lattitude_longitude;
	}

	public void setLattitude_longitude(double lattitude_longitude) {
		this.lattitude_longitude = lattitude_longitude;
	}

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
		return StoreProprietor;
	}

	public void setStoreProprietor(String storeProprietor) {
		StoreProprietor = storeProprietor;
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

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	public ShoppingCenter getShoppingCenterId() {
		return shoppingCenterId;
	}

	public void setShoppingCenterId(ShoppingCenter shoppingCenterId) {
		this.shoppingCenterId = shoppingCenterId;
	}

	
	
	
	

}
