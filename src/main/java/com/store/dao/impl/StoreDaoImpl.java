package com.store.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

@Repository
public class StoreDaoImpl implements StoreDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	
	public void addStore(SaveStore store) {
		Session session=sessionFactory.openSession();
		try {
			
			session.saveOrUpdate(store);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			session.close();
		}
		
	}
	
	
	public void addProduct(SaveProduct product) {
		
		Session session=sessionFactory.openSession();
		
		try {
			session.saveOrUpdate(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			session.close();
		}
		
	}
	
	
	public void addContact(ContactUs contact) {
		Session session=sessionFactory.openSession();
		
		try {
			session.saveOrUpdate(contact);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			session.close();
		}
		
	}
	
	

	
	
	public void addReview(SaveReview saveReview) {
		
		Session session=sessionFactory.openSession();
		try {
			session.saveOrUpdate(saveReview);
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
		finally
		{
			session.close();
		}
	}
	
	
	
	public void addMainOffer(MainOffer mainOffer) {
		Session session=sessionFactory.openSession();
		try {
			session.saveOrUpdate(mainOffer);
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
		finally
		{
			session.close();
		}
		
	}
	
	
	

	public void addShoppingCenter(ShoppingCenter shoppingCenter) {
		Session session=sessionFactory.openSession();
		try {
			session.saveOrUpdate(shoppingCenter);
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
		finally
		{
			session.close();
		}
		
	}

	
	/*public void addHitCount(HitCount hitCount) {
		Session session=sessionFactory.openSession();
		try {
			session.saveOrUpdate(hitCount);
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
		finally
		{
			session.close();
		}
	}*/

	
	
	
	
	//For display particular store
	@SuppressWarnings("unchecked")
	public List<Store> getStoreList(String type,String pincode) {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from  Store   where storeType like:type AND  storePincode=:pincode AND storeId IN (select store from Product where offerStartTime < CURRENT_DATE() AND offerEndTime >= CURRENT_DATE()) order by storePriority desc");
        query.setParameter("type", "%" +type+ "%" );
        query.setParameter("pincode", pincode);
        List<Store> storeList = query.list();
        return storeList;
	}
	
	@SuppressWarnings("unchecked")
	public List<Store> getCityStoreList(String type, String currentCity) {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from  Store where storeType like:type AND  storeCity=:currentCity order by storePriority desc  ");
        query.setParameter("type", "%" + type+ "%" );
        query.setParameter("currentCity", currentCity);
        List<Store> storeList = query.list();
        return storeList;
	}
	
	

	//For display particular product
	@SuppressWarnings("unchecked")
	public List<Product> getProductByType(String productType,int storeId) {
		Session session=sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Product where productType =:productType AND STORE_STOREID =:storeId AND offerStartTime < CURRENT_DATE() AND offerEndTime >= CURRENT_DATE()");
        query.setParameter("productType", productType);
        query.setParameter("storeId", storeId);
        List<Product> productListById = query.list();
       return productListById;
	}
	
	
	//For search store
		@SuppressWarnings("unchecked")
		public List<Product> getProductByStoreId(int storeId) {
			Session session=sessionFactory.openSession();
			//Transaction tx = session.beginTransaction();
	        Query query = session.createQuery("from Product where STORE_STOREID=:storeId");
	        query.setParameter("storeId", storeId);
	        List<Product> productListByStoreId = query.list();
	       return productListByStoreId;
		}
	

    //for CRUD operation
    //Listing
	@SuppressWarnings("unchecked")
	public List<SaveStore> getStores() {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from SaveStore ");
        List<SaveStore> storeList = query.list();
		return storeList;
	}

	
	public SaveStore getStoreByIdForEdit(int storeId) {
		Session session=sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
		SaveStore store = (SaveStore) session.load(SaveStore.class, storeId);
		return  store;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<SaveProduct> getProducts() {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from SaveProduct ");
        List<SaveProduct> productList = query.list();
		return productList;
	}

	@SuppressWarnings("unchecked")
	public List<MainOffer> getMainOfferImage() {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from MainOffer ");
        List<MainOffer> offerImageList = query.list();
		return offerImageList;
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	public List<MainOffer> getMainOffers() {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from MainOffer ");
        List<MainOffer> offerImageList = query.list();
		return offerImageList;
	}


	@SuppressWarnings("unchecked")
	public List<ShoppingCenter> getShoppingCenters() {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from ShoppingCenter ");
        List<ShoppingCenter> offerImageList = query.list();
		return offerImageList;
	}


	@SuppressWarnings("unchecked")
	public List<SaveProduct> getExpiredProducts() {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from SaveProduct");
        /*query.setParameter("today", today);*/
        List<SaveProduct> expiredProducts = query.list();
		return expiredProducts;
	}


	@SuppressWarnings("unchecked")
	public List<MainOffer> getExpiredOffers() {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from MainOffer");
        /*query.setParameter("today", today);*/
        List<MainOffer> expiredOffers = query.list();
		return expiredOffers;
	}

	
	//For Search
	@SuppressWarnings("unchecked")
	public List<Store> getStoreByName(String storeName) {
		Session session=sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Store where storeName like :storeName");
        query.setParameter("storeName", "%" +storeName + "%");
        List<Store> storeListByName = query.list();
        return storeListByName;
	}

	@SuppressWarnings("unchecked")
	public List<SaveProduct> getProductByName(String productName) {
		Session session=sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
        Query query = session.createQuery(" from SaveProduct where productName  like:productName");
        query.setParameter("productName",  "%" + productName +"%");
        List<SaveProduct> productListByName = query.list();
        return productListByName;
	}

	
	//For Store
	public void updateStore(SaveStore store) {
		Session session =sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx=session.beginTransaction();
			session.update(store);
			tx.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}


	public void deleteStore(int storeId) {
		Session session =sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx=session.beginTransaction();
			Store store = (Store) session.load(Store.class, storeId);
			session.delete(store);
			tx.commit();
		} 
		finally
		{
			session.close();
		}
		
	}
	
	
	//For Product
	public SaveProduct getProductById(int productId) {
		Session session=sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
		SaveProduct product = (SaveProduct) session.load(SaveProduct.class, productId);
		return  product;
	}

	
	
	
	

	public void updateProduct(SaveProduct saveProduct) {
		Session session =sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx=session.beginTransaction();
			session.update(saveProduct);
			tx.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		
	}


	public void deleteProduct(int productId) {
		Session session =sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx=session.beginTransaction();
			 SaveProduct product = (SaveProduct) session.load(SaveProduct.class, productId);
			session.delete(product);
			tx.commit();
		} 
		finally
		{
			session.close();
		}
	}

	
	//For Main Offer

	public MainOffer getMainOfferById(int mainOfferId) {
		Session session=sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
		MainOffer mainOffer = (MainOffer) session.load(MainOffer.class, mainOfferId);
		return  mainOffer;
	}


	public void updateMainOffer(MainOffer mainOffer) {
		Session session=sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx=session.beginTransaction();
			session.update(mainOffer);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally
		{
			session.close();
		}
		
	}
	
	public void deleteMainOffer(int mainOfferId) {
		Session session =sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx=session.beginTransaction();
			 MainOffer offer = (MainOffer) session.load(MainOffer.class, mainOfferId);
			session.delete(offer);
			tx.commit();
		} 
		finally
		{
			session.close();
		}
		
	}

	//For REview
	@SuppressWarnings("unchecked")
	public List<SaveReview> getReview(int storeId) {
		Session session=sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
        Query query = session.createQuery(" from SaveReview where STORE_STOREID =:storeId");
        query.setParameter("storeId",storeId);
        List<SaveReview> reviews = query.list();
        return reviews;
	}

	
	/*For search*/
	@SuppressWarnings("unchecked")
	public List<Store> searchStores(String searchValue) {
		Session session=sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
        Query query = session.createQuery(" from Store where storeName  like:searchValue");
        query.setParameter("searchValue",searchValue +"%");
		List<Store> storeList = query.list();
		return storeList;
	}


	//For hitCount
	@SuppressWarnings("unchecked")
	public List<HitCount> getCount() {
		
		Session session=sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from  HitCount");
		List<HitCount> indexPage=query.list();
		
		return  indexPage;
			
	}


	public void save(HitCount hc) {
		
		Session session=sessionFactory.openSession();
		try {
			Transaction tx = session.beginTransaction();
			session.update(hc);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
		finally
		{
			session.close();
		}
		
	}


	/*for autosearch*/
	@SuppressWarnings("unchecked")
	public List<String> getStoreNameForSearch(String searchValue) {
		
			Session session=sessionFactory.openSession();
			//Transaction tx = session.beginTransaction();
			Query query = session.createQuery("Select storeName FROM Store  WHERE storeName LIKE:searchValue");
			query.setParameter("searchValue",searchValue +"%");
			List<String> sList=query.list();
			return sList;
		
	}


	
	/*For Shopping Centers*/
	public List<ShoppingCenter> getShoppingCenterList() {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from ShoppingCenter");
        List<ShoppingCenter> shoppingCenterList = query.list();
		return shoppingCenterList;
	}


	@SuppressWarnings("unchecked")
	public List<ShoppingCenter> getShoppingcenters(String type, String pincode) {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from  ShoppingCenter where shoppingCenterType like:type AND  shoppingCenterPincode=:pincode");
        query.setParameter("type", "%" + type+ "%" );
        query.setParameter("pincode", pincode);
        List<ShoppingCenter> shoppingCenterList = query.list();
        return shoppingCenterList;
	}


	@SuppressWarnings("unchecked")
	public List<ShoppingCenter> getShoppingCenterByName(String shoppinCenterName) {
		Session session=sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from ShoppingCenter where shoppingCenterName like :shoppinCenterName");
        query.setParameter("shoppinCenterName", "%" +shoppinCenterName + "%");
        List<ShoppingCenter> shoppingCenterName = query.list();
        return shoppingCenterName;
	}


	@SuppressWarnings("unchecked")
	public List<SaveStore> getSoreListOfShoppingCenter(int centerId,String centerType,String location) {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from  SaveStore where storeType like:centerType AND SHOPPING_CENTER_ID=:centerId AND storePincode=:location");
        query.setParameter("centerType", "%" + centerType + "%");
        query.setParameter("location", location);
        query.setParameter("centerId", centerId);
        List<SaveStore> shoppingCenterList = query.list();
        return shoppingCenterList;
	}

	//for shopping center crud
	public ShoppingCenter getShoppingCenterById(int shoppingCenterId) {
		Session session=sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
		ShoppingCenter shoppingCenter = (ShoppingCenter) session.load(ShoppingCenter.class, shoppingCenterId);
		return  shoppingCenter;
	}


	public void updateShoppingCenter(ShoppingCenter shoppingCenter) {

		Session session=sessionFactory.openSession();
		try {
			Transaction tx = session.beginTransaction();
			session.update(shoppingCenter);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
		finally
		{
			session.close();
		}
		
	}


	public void deleteShoppingCenter(int shoppingCenterId) {
		Session session =sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx=session.beginTransaction();
			ShoppingCenter shoppingCenter = (ShoppingCenter) session.load(ShoppingCenter.class, shoppingCenterId);
			session.delete(shoppingCenter);
			tx.commit();
		} 
		finally
		{
			session.close();
		}
		
	}

	
	//Get Offered Store List
	@SuppressWarnings("unchecked")
	public List<Store> getOfferStoreList(List<String> types, String location) {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from  Store where storeType IN (:type) AND  storePincode=:pincode order by storePriority desc  ");
        query.setParameterList("type",types);
        query.setParameter("pincode", location);
        List<Store> storeList = query.list();
        return storeList;
	}


	@SuppressWarnings("unchecked")
	public List<Product> getProductListById(int productId) {

		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product where productId=:productId");
		query.setParameter("productId", productId);
        List<Product> productList = query.list();
        return productList;
		
		
	}


	
	
	/*public Product getStoreListByProduct() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		//query.setParameter("productId", productId);
        Product productList = (Product) query.uniqueResult();
        return productList;
	}


	@SuppressWarnings("unchecked")
	public List<Product> getListOfStoresByProduct(int storeId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		
		Query query=session.createQuery("from Product where STORE_STOREID=:storeId and offerEndTime<=:curentDate");
		query.setParameter("storeId", storeId);
		query.setParameter("curentDate",new Date().getTime() );
		return query.list();
	}
*/

	/*public List<Product> getStoresByValidOffer(Date date) {
		Session session=sessionFactory.openSession();
        Query query = session.createQuery("from  Product where offerEndTime >= :currentDate");
        query.setParameter("currentDate",date);
       
        List<Product> storeList = query.list();
        return storeList;
	}
*/

	


	
	


	


	



	


	



	/*public void saveHitCount(HitCount hitCount) {
		Session session=sessionFactory.openSession();
		try {
			Transaction tx = session.beginTransaction();
			session.save(hitCount);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
		finally
		{
			session.close();
		}
		
	}*/

	

	

	


	


	

	


	

}
