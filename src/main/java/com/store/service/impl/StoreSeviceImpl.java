package com.store.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.store.dao.StoreDao;
import com.store.model.ContactUs;
import com.store.model.HitCount;
import com.store.model.MainOffer;
import com.store.model.Product;
import com.store.model.SaveProduct;
import com.store.model.SaveReview;
import com.store.model.SaveStore;
import com.store.model.ShoppingCenter;
import com.store.model.Store;
import com.store.service.StoreService;
import com.store.user.repository.UserRepository;

@Service
public class StoreSeviceImpl implements StoreService {
	
	@Autowired
	private StoreDao storeDao;
	
	
	@Autowired
	private UserRepository userRepository;
	
	
	
/*	@Autowired
	private HitCount hitCount;
	
	public void destroy()
	{
		
	
		storeDao.addHitCount(hitCount);
		
		
	}*/
	
	
	public void addStore(SaveStore store) {
		storeDao.addStore(store);

	}
	
	
	public void addProduct(SaveProduct product) {
		storeDao.addProduct(product);
		
	}
	
	
	
	public void addReview(SaveReview saveReview) {
		storeDao.addReview(saveReview);
		
	}
	
	
	public void addMainOffer(MainOffer mainOffer) {
		storeDao.addMainOffer(mainOffer);
		
	}
	
	
	public void addShoppingCenter(ShoppingCenter shoppingCenter) {
		storeDao.addShoppingCenter(shoppingCenter);
		
	}
	
	
	
	public void addContact(ContactUs contact) {
		storeDao.addContact(contact);
		
	}
	
	/*public void addHitCount(HitCount hitCount) {
		storeDao.addHitCount(hitCount);
		
	}*/
	
	

	public List<Store> getSoreList(String type,String pincode) {
		
		return storeDao.getStoreList(type,pincode);
	}
	
	
	//get Stores in a particular city
	public List<Store> getCitySoreList(String type, String currentCity) {
		return storeDao.getCityStoreList(type,currentCity);
	}
	
	
	
	public Store getStoreById(int storeId)
	{
		return userRepository.getStoreById(storeId);
		
	}
	
	
	public SaveStore getStoreByIdForEdit(int storeId)
	{
		return storeDao.getStoreByIdForEdit(storeId);
		
	}
	
	public SaveProduct getProductById(int productId) {
		return storeDao.getProductById(productId);
	}

	
	public MainOffer getMainOfferById(int mainOfferId) {
		return storeDao.getMainOfferById(mainOfferId);
	}

	
	//for CRUD operation
	
	public List<SaveStore> getStores() {
		
		return storeDao.getStores();
	}


	public List<SaveProduct> getProducts() {
		
		return storeDao.getProducts();
	}

	public List<MainOffer> getMainOfferImage() {
		return storeDao.getMainOfferImage();
	}
	
	
	
	public List<MainOffer> getMainOffers() {
		return storeDao.getMainOffers();
	}

	public List<ShoppingCenter> getShoppingCenters() {
		return storeDao.getShoppingCenters();
	}

	public List<SaveProduct> getExpiredProducts() {
		return storeDao.getExpiredProducts();
	}

	public List<MainOffer> getExpiredOffers() {
		return storeDao.getExpiredOffers();
	}
	

	//For search
	//for CRUD Operation
	//For Store
	public List<Store> getStoreByName(String storeName) {
			
		return storeDao.getStoreByName(storeName);
	}
	
	public List<SaveProduct> getProductByName(String productName) {
		return storeDao.getProductByName(productName);
	}
	
	

	public void updateStore(SaveStore store) {
		storeDao.updateStore(store);
		
	}

	public void deleteStore(int storeId) {
		storeDao.deleteStore(storeId);
		
	}

	//For Product
	public List<Product> getProductByType(String productType,int storeId) {
		return storeDao.getProductByType(productType,storeId);
	}
	
	
	//For search store
	public List<Product> getProductByStoreId(int storeId) {
		return storeDao.getProductByStoreId(storeId);
	}


	//for product
	public void updateProduct(SaveProduct saveProduct) {
		storeDao.updateProduct(saveProduct);
		
	}

	public void deleteProduct(int productId) {
		storeDao.deleteProduct(productId);
		
	}
	
	
	//for main offer
	public void updateMainOffer(MainOffer mainOffer) {
		storeDao.updateMainOffer(mainOffer);
		
	}
	
	
	public void deleteMainOffer(int mainOfferId) {
		storeDao.deleteMainOffer(mainOfferId);
		
	}


	//for shopping center curd
	public ShoppingCenter getShoppingCenterById(int shoppingCenterId) {
		
		return storeDao.getShoppingCenterById(shoppingCenterId);
	}

	public void updateShoppingCenter(ShoppingCenter shoppingCenter) {
		storeDao.updateShoppingCenter(shoppingCenter);
		
	}
	
	public void deleteShoppingCenter(int shoppingCenterId) {
		 storeDao.deleteShoppingCenter(shoppingCenterId);
		
	}

	//For review
	public List<SaveReview> getReview(int storeId) {
		
		return storeDao.getReview(storeId);
	}

	public List<Store> serachStores(String searchValue) {
		return storeDao.searchStores(searchValue);
	}

	
	
	//For hitcount
	public List<HitCount> getCount() {
		return storeDao.getCount();
	}

	public void save(HitCount hc) {
		 storeDao.save(hc);
		
	}

	/*For autosearch*/
	public List<String> getStoreNameForSearch(String searchValue) {
		
		return storeDao.getStoreNameForSearch(searchValue);
	}

	
	/*For shopping Centers*/
	public List<ShoppingCenter> getShoppingCenterList() {
		return storeDao.getShoppingCenterList();
	}

	public List<ShoppingCenter> getShoppingCenters(String type, String location) {
		return storeDao.getShoppingcenters(type,location);
	}

	public List<ShoppingCenter> getShoppingCenterByName(String shoppinCenterName) {
		return storeDao.getShoppingCenterByName(shoppinCenterName);
	}

	public List<SaveStore> getSoreListOfShoppingCenter(int centerId,String centerType,String location) {
		return storeDao.getSoreListOfShoppingCenter(centerId,centerType,location);
	}


	//get Offerd stores
	public List<Store> getOfferSoreList(List<String> types, String location) {
		return storeDao.getOfferStoreList(types,location);
	}

	
	

	public List<Product> getProductListById(int productId) {
		
		return storeDao.getProductListById(productId);
	}

/*
	public Product getStoreListByProduct() {
		// TODO Auto-generated method stub
		return storeDao.getStoreListByProduct();
	}


	public List<Product> getListOfStoresByProduct(int storeId) {
		// TODO Auto-generated method stub
		return storeDao.getListOfStoresByProduct(storeId);
	}*/


	

	

/*	public void saveHitCount(HitCount hitCount) {
		storeDao.saveHitCount(hitCount);
		
	}
*/


}
