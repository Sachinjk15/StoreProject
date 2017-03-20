package com.store.dao;


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


public interface StoreDao {
	
    void addStore(SaveStore store);
    
    void addProduct(SaveProduct product);
    
    void addMainOffer(MainOffer mainOffer);
    
    void addReview(SaveReview saveReview);
    
    void addShoppingCenter(ShoppingCenter shoppingCenter);
    
    void addContact(ContactUs contact);
    
    
    
    List<Store> getStoreList(String type,String pincode);
    
    List<Product> getProductByType(String productType,int storeId);
  

    //for CRUD operation
    //Listing
    List<SaveStore> getStores();
    
    SaveStore getStoreByIdForEdit(int storeId);
    
    List<SaveProduct> getProducts();
    
    List<MainOffer> getMainOfferImage();
    
    List<MainOffer> getMainOffers();

	List<ShoppingCenter> getShoppingCenters();

	List<SaveProduct> getExpiredProducts();

	List<MainOffer> getExpiredOffers();
    
    //for Search
    //For Store
    List<Store> getStoreByName(String storeName);
    
    /*List<SaveProduct> getProductByName(String productName);*/
    
    
    public void updateStore(SaveStore store);

	void deleteStore(int storeId);

	List<SaveProduct> getProductByName(String productName);

	
	/*For Product Edit*/
	 public SaveProduct getProductById(int productId);

	 void updateProduct(SaveProduct saveProduct);
	
	 public void deleteProduct(int productId);
	
	
	 //for main offer
	 public MainOffer getMainOfferById(int mainOfferId);
	 
	 void updateMainOffer(MainOffer mainOffer);
	 
	 
     void deleteMainOffer(int mainOfferId);

	
     
     //for shopping center curd
     public ShoppingCenter getShoppingCenterById(int shoppingCenterId);
     
     void updateShoppingCenter(ShoppingCenter shoppingCenter);
     
     public void deleteShoppingCenter(int shoppingCenterId);
	//For offer Edit

	

	

	List<SaveReview> getReview(int storeId);

	List<Store> searchStores(String searchValue);

	//For hitCount
	List<HitCount> getCount();

	void save(HitCount hc);
	
	/*void saveHitCount(HitCount hitCount);*/

	List<Product> getProductByStoreId(int storeId);

	public List<String> getStoreNameForSearch(String searchValue);

	
	/*For Shopping Centers*/
	List<ShoppingCenter> getShoppingCenterList();

	List<ShoppingCenter> getShoppingcenters(String type, String location);

	List<ShoppingCenter> getShoppingCenterByName(String shoppinCenterName);

	List<SaveStore> getSoreListOfShoppingCenter(int centerId,String centerType,String location);

	List<Store> getCityStoreList(String type, String currentCity);

	//get Offered store List
	List<Store> getOfferStoreList(List<String> types, String location);
	
	
	

	List<Product> getProductListById(int productId);

	/*Product getStoreListByProduct();

	List<Product> getListOfStoresByProduct(int storeId);*/
	

	

	

	

	

	




	

	

	

	

	



	

	

}	
