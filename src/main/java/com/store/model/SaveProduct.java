package com.store.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name="product_table")
public class SaveProduct {
	
	
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
		@Type(type = "org.hibernate.type.TextType")
		private String productDescription;
		
		@Column
		private String productImagePath;
		
		@Column
		private Date productEntryDate;
		
		@Column
		private Date offerStartTime;
		
		
		@Column
		private Date offerEndTime;
		
		@Column
		private String productType;
		
		
		@Column(name="STORE_STOREID")
		private int storeId;

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

		

		public int getStoreId() {
			return storeId;
		}

		public void setStoreId(int storeId) {
			this.storeId = storeId;
		}

		public Date getProductEntryDate() {
			return productEntryDate;
		}

		public void setProductEntryDate(Date productEntryDate) {
			this.productEntryDate = productEntryDate;
		}

		public String getProductType() {
			return productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public Date getOfferStartTime() {
			return offerStartTime;
		}

		public void setOfferStartTime(Date offerSartTime) {
			this.offerStartTime = offerSartTime;
		}

		public Date getOfferEndTime() {
			return offerEndTime;
		}

		public void setOfferEndTime(Date offerEndTime) {
			this.offerEndTime = offerEndTime;
		}
		
		
		
		
		
	

}
