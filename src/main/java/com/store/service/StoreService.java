package com.store.service;


import java.util.Date;
import java.util.List;

import com.store.model.ContactUs;
import com.store.model.HitCount;
import com.store.model.MainOffer;
import com.store.model.Product;
import com.store.model.SaveProduct;
import com.store.model.SaveReview;
import com.store.model.SaveStore;
import com.store.model.ShoppingCenter;
import com.store.model.Store;


public interface StoreService {
	//For add data 
    void addStore(SaveStore store);
    
    void addProduct(SaveProduct product);
    
    void addMainOffer(MainOffer mainOffer);
    
    void addShoppingCenter(ShoppingCenter shoppingCenter);
    
    void addContact(ContactUs contact);

    
   /* void addHitCount(HitCount hitCount);*/
    
  //For Review

  	void addReview(SaveReview saveReview);

    
    List<Store> getSoreList(String type,String picode);
    
    List<Store> getCitySoreList(String type, String currentCity);
    
    
    public Store getStoreById(int storeId);
    
    public SaveStore getStoreByIdForEdit(int storeId);
    
    public SaveProduct getProductById(int productId);
    
    List<Product> getProductByType(String productType,int storeId);
    
    public MainOffer getMainOfferById(int mainOfferId);
    
   
   
    //for CRUD operation
    //Listing
    List<SaveStore> getStores();
    
    List<SaveProduct> getProducts();
    
    List<MainOffer> getMainOfferImage();
    
    
    List<MainOffer> getMainOffers();

	List<ShoppingCenter> getShoppingCenters();

	List<SaveProduct> getExpiredProducts();

	List<MainOffer> getExpiredOffers();
   
    
    /*For search*/
    
    /*For CRUD Operation*/
    //For Store 
    List<Store> getStoreByName(String storeName);

    public void updateStore(SaveStore store);

	public void deleteStore(int storeId);
	
	//For Product
	List<SaveProduct> getProductByName(String productName);

	public void updateProduct(SaveProduct saveProduct);

	public void deleteProduct(int productId);
	
	
	//for Main Offer
	
	public void updateMainOffer(MainOffer mainOffer);
	
	public void deleteMainOffer(int mainOfferId);
	
	
	//for shopping Center curd
	public ShoppingCenter getShoppingCenterById(int shoppingCenterId);
	
	public void updateShoppingCenter(ShoppingCenter shoppingCenter);
	
	public void deleteShoppingCenter(int shoppingCenterId);
	
	//For Review

	List<SaveReview> getReview(int storeId);

	List<Store> serachStores(String searchValue);
	
	
	//For hitCount

	List<HitCount> getCount();

	void save(HitCount hc);

	/*void saveHitCount(HitCount hitCount);*/
	
	List<Product> getProductByStoreId(int storeId);

	
	/*For autosearch*/
	List<String> getStoreNameForSearch(String searchValue);

	
	
	/*For shopping Centers*/
	List<ShoppingCenter> getShoppingCenterList();

	List<ShoppingCenter> getShoppingCenters(String type, String location);

	List<ShoppingCenter> getShoppingCenterByName(String shoppinCenterName);

	List<SaveStore> getSoreListOfShoppingCenter(int centerId,String centerType,String location);
	
	//get Offered Stores
	List<Store> getOfferSoreList(List<String> types, String location);
	
	
	
	
	

	List<Product> getProductListById(int productId);
	
	
	
	//testing
	/*Product getStoreListByProduct();

	List<Product> getListOfStoresByProduct(int storeId);*/
	
	
	
	


	

	
	

	

	

	

	

	

	

	
	

	

	

	

	
	
	
	

	
}
