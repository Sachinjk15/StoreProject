package com.store.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;
import com.store.model.ContactUs;
import com.store.model.HitCount;
import com.store.model.MainOffer;
import com.store.model.Product;
import com.store.model.SaveProduct;
import com.store.model.SaveReview;
import com.store.model.SaveStore;
import com.store.model.ShoppingCenter;
import com.store.model.Store;
import com.store.model.UserLogin;
import com.store.model.UserWithRole;
import com.store.service.StoreService;


@Controller
public class StoreController {
	
	
	@Autowired
	private StoreService   storeService;
	
	
	
	/*@Autowired
	private HitCount hitCount;*/
	
	
	@RequestMapping(value="/file")
	public String fileCheck(Model model, HttpServletRequest request) throws IOException{
		
		File file = new File("/WorkSpace/StoreProject/src/main/webapp/img");
		model.addAttribute("ap", file.getAbsolutePath());
		model.addAttribute("cp", file.getCanonicalPath());
		model.addAttribute("path", file.getPath());
		model.addAttribute("abc", file.getParent());
//		model.addAttribute("b", file.getParentFile().getAbsolutePath());
		
		String rootDirectory = request.getSession().getServletContext().getContextPath();
//		System.out.println(rootDirectory + "/webapp/img/product3.jpg");
		System.out.println(rootDirectory);
		
/*Paths.get(rootDirectory + "/webapp/img/product3.jpg").toString();
		*/
//		String workingDir = System.getProperty("user.dir");
//		   System.out.println("Current working directory : " + workingDir);
		String s = "img\\product3.jpg";
//		System.out.println(s);
		model.addAttribute("rp", request.getSession().getServletContext().getRealPath("/")+"img\\product3_2 - Copy.jpg");
		System.out.println(request.getSession().getServletContext().getRealPath("\\")+s);
		
		
		try {
			File fileD = new File( request.getSession().getServletContext().getRealPath("/")+"img\\product3_2 - Copy.jpg");
			
			fileD.delete();
			System.out.println(file.getName() + " is deleted!");
		} catch (Exception e) {
			System.out.println(request.getSession().getServletContext().getRealPath("/")+"product3_2 - Copy.jpg" + " cant deleted");
			e.printStackTrace();
		}
		
		String rpath=request.getSession().getServletContext().getRealPath("/");
		
		model.addAttribute("rp1",rpath);
		model.addAttribute("ipAddress",request.getSession().getServletContext().getRealPath("/"));
		
		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		
		System.out.println(ipAddress);
		
		
		
		return "file";
	}
	
	
	
	/*	For  index*/
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String showIndex(Model model, HttpSession session)
	{
		
		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
			 
		}
		
		
		
		List<HitCount> list= storeService.getCount();
		
		/*if(list == null)
		{
			HitCount hitCount=new HitCount();
			
			hitCount.setIndexPage(0);
			hitCount.setBabyFashionPage(0);
			hitCount.setBakeryFoodPage(0);
			hitCount.setBeautyFashionPage(0);
			hitCount.setCinemasPage(0);
			hitCount.setClinicHealthPage(0);
			hitCount.setComputerShopPage(0);
			hitCount.setFurnituresPage(0);
			hitCount.setGamesPage(0);
			hitCount.setGamesPage(0);
			hitCount.setGandhiBazarShoppingStreetPage(0);
			hitCount.setGopalanArchadeShoppingCenterPage(0);
			hitCount.setGroceryPage(0);
			hitCount.setHomeAppliancesPage(0);
			hitCount.setHospitalHealthPage(0);
			hitCount.setKidsFashionPage(0);
			hitCount.setKitchenAppliancesPage(0);
			hitCount.setLuggageAndBagsFashionPage(0);
			hitCount.setMantriShoppingCenterPage(0);
			hitCount.setMenFashionPage(0);
			hitCount.setMobileShopPage(0);
			hitCount.setOrionShoppingCenterPage(0);
			hitCount.setPersonalCareHealthPage(0);
			hitCount.setPharmacyHealthPage(0);
			hitCount.setPlaysPage(0);
			hitCount.setPubsFoodPage(0);
			hitCount.setRestaurantsFoodPage(0);
			hitCount.setSportsAccessoriesPage(0);
			hitCount.setSportsApparealPage(0);
			hitCount.setSportsShoesPage(0);
			hitCount.setWatcheFashionPage(0);
			hitCount.setWomenFashionPage(0);
			
			storeService.saveHitCount(hitCount);
		}*/
		
		
		HitCount hc = list.get(0);
		
		
		int count=hc.getIndexPage();
		
		
		
		hc.setIndexPage(++count);
		
		count=hc.getIndexPage();
		
		System.out.println(count);
		
		storeService.save(hc);
		
		
		
		
		
		List<MainOffer> offerImageList=storeService.getMainOfferImage();
		model.addAttribute("offerImageList", offerImageList); 
		
		
		
		List<HitCount> listHitCount= storeService.getCount();
		model.addAttribute("hitCount", listHitCount); 
		
		
		
		
		return "index";
		
	}
	
	
	/*	------------------For  Electronics ---------------------------*/
	
	@RequestMapping(value="/mobileShop", method=RequestMethod.GET)
	public String mobileShop(Model model,HttpServletRequest request, HttpSession session)
	{
		//List<Store> validStoreList=new ArrayList<Store>();
		
		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
			  
			  
			 
			  
		}
		
		 final String location=(String) session.getAttribute("location");
		String mobile=request.getParameter("type");
		
		
		
		List<Store> stores = storeService.getSoreList(mobile,location);
		
		
		
		/*For Hitcount*/
		List<HitCount> list= storeService.getCount();
		
		HitCount hc = list.get(0);
		
		
		int count=hc.getMobileShopPage();
		
		
		
		hc.setMobileShopPage(++count);
		
		count=hc.getMobileShopPage();
		
		System.out.println(count);
		
		storeService.save(hc);
		
		
		/*
		List<SaveProduct> product= storeService.getProducts();
		
		long todaysDate=new java.util.Date().getTime();
		
		long offerDate= ((SaveProduct) product).getOfferEndTime().getTime();
     	
		System.out.println(todaysDate+"-------"+ offerDate );*/
	
				     	
		
		
			
			PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
		
		       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
		       
		       pagedListHolder.setPage(page);
		       pagedListHolder.setPageSize(12);
		       
		       model.addAttribute("pagedListHolder", pagedListHolder);
			
			/*model.addAttribute("stores", stores);*/
		      
		      
		       //get List according to city
		       final String currentCity= (String) session.getAttribute("currentCity");
		       
			    List<Store> cityStores = storeService.getCitySoreList(mobile,currentCity);
			       
			    model.addAttribute("cityStores",cityStores);
		
			return "mobileShop";
		
	}
	
	
	@RequestMapping(value="/computerShop", method=RequestMethod.GET)
	public String computerShop(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getComputerShopPage();
			
			
			
			hc.setComputerShopPage(++count);
			
			count=hc.getComputerShopPage();
			
			System.out.println(count);
			
			storeService.save(hc);
		 
		 
		final String location=(String) session.getAttribute("location");
		String computer=request.getParameter("type");
		
		List<Store> stores = storeService.getSoreList(computer,location);
		
		 
		
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       
	      
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(computer,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
	      
	       
	       
	       
		return "computerShop";
	}
	
	
	@RequestMapping(value="/homeAppliance", method=RequestMethod.GET)
	public String homeAppliance(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getHomeAppliancesPage();
			
			
			
			hc.setHomeAppliancesPage(++count);
			
			count=hc.getHomeAppliancesPage();
			
			System.out.println(count);
			
			storeService.save(hc);
		 
		 
		final String location=(String) session.getAttribute("location"); 
		String homeAppliances=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(homeAppliances,location);
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(homeAppliances,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "homeAppliance";
	}
	
	
	/*------------------------For  Entertainment---------------------------------*/
	
	@RequestMapping(value="/cinemaEntertainment", method=RequestMethod.GET)
	public String cinemaEntertainment(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getCinemasPage();
			
			
			
			hc.setCinemasPage(++count);
			
			count=hc.getCinemasPage();
			
			System.out.println(count);
			
			storeService.save(hc);
			
			
		final String location=(String) session.getAttribute("location");		 
		String cinema=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(cinema,location);
		
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
			
		
		int page= ServletRequestUtils.getIntParameter(request, "p", 0);
			       
			       
		pagedListHolder.setPage(page);
			       
		pagedListHolder.setPageSize(12);
			       
			      
		model.addAttribute("pagedListHolder", pagedListHolder);
		
		  //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(cinema,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "cinemaEntertainment";
	}
	
	
	
	@RequestMapping(value="/gameEntertainment", method=RequestMethod.GET)
	public String gameEntertainment(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getGamesPage();
			
			
			
			hc.setGamesPage(++count);
			
			count=hc.getGamesPage();
			
			System.out.println(count);
			
			storeService.save(hc);
		 
			 final String location=(String) session.getAttribute("location"); 
		String game=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(game,location);
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(game,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "gameEntertainment";
	}
	
	
	@RequestMapping(value="/playEntertainment", method=RequestMethod.GET)
	public String playEntertainment(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getPlaysPage();
			
			
			
			hc.setPlaysPage(++count);
			
			count=hc.getPlaysPage();
			
			System.out.println(count);
			
			storeService.save(hc);
		 
			 final String location=(String) session.getAttribute("location"); 
		String plays=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(plays,location);
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(plays,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "playEntertainment";
	}
	
	
	
	/*------------------------------For Fashion----------------------------*/
	
	@RequestMapping(value="/menFashion", method=RequestMethod.GET)
	public String menFashion(Model model,HttpServletRequest request, HttpSession session)
	{
		
		 final String location=(String) session.getAttribute("location");
		String men=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(men,location);
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		
		/*For Hitcount*/
		List<HitCount> list= storeService.getCount();
		
		HitCount hc = list.get(0);
		
		
		int count=hc.getMenFashionPage();
		
		
		
		hc.setMenFashionPage(++count);
		
		count=hc.getMenFashionPage();
		
		System.out.println(count);
		
		storeService.save(hc);
		
		
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(men,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "menFashion";
	}
	
	
	@RequestMapping(value="/womenFashion", method=RequestMethod.GET)
	public String womenFashion(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getWomenFashionPage();
			
			
			
			hc.setWomenFashionPage(++count);
			
			count=hc.getWomenFashionPage();
			
			System.out.println(count);
			
			storeService.save(hc);
		 
			 final String location=(String) session.getAttribute("location"); 
		String women=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(women,location);
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(women,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "womenFashion";
	}
	
	@RequestMapping(value="/kidsFashion", method=RequestMethod.GET)
	public String kidsFashion(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
		 
		 	
			List<HitCount> list= storeService.getCount();
			
			
			
			HitCount hc = list.get(0);
			
			/*if(hc==null)
			{
				hc.setIndexPage(0);
				hc.setBabyFashionPage(0);
				hc.setBakeryFoodPage(0);
				hc.setBeautyFashionPage(0);
				hc.setCinemasPage(0);
				hc.setClinicHealthPage(0);
				hc.setComputerShopPage(0);
				hc.setFurnituresPage(0);
				hc.setGamesPage(0);
				hc.setGamesPage(0);
				hc.setGandhiBazarShoppingStreetPage(0);
				hc.setGopalanArchadeShoppingCenterPage(0);
				hc.setGroceryPage(0);
				hc.setHomeAppliancesPage(0);
				hc.setHospitalHealthPage(0);
				hc.setKidsFashionPage(0);
				hc.setKitchenAppliancesPage(0);
				hc.setLuggageAndBagsFashionPage(0);
				hc.setMantriShoppingCenterPage(0);
				hc.setMenFashionPage(0);
				hc.setMobileShopPage(0);
				hc.setOrionShoppingCenterPage(0);
				hc.setPersonalCareHealthPage(0);
				hc.setPharmacyHealthPage(0);
				hc.setPlaysPage(0);
				hc.setPubsFoodPage(0);
				hc.setRestaurantsFoodPage(0);
				hc.setSportsAccessoriesPage(0);
				hc.setSportsApparealPage(0);
				hc.setSportsShoesPage(0);
				hc.setWatcheFashionPage(0);
				hc.setWomenFashionPage(0);
				
				
			}
			*/
			
			int count=hc.getKidsFashionPage();
			
			
			
			hc.setKidsFashionPage(++count);
			
			count=hc.getKidsFashionPage();
			
			System.out.println(count);
			
			storeService.save(hc);
		 
		 
			 final String location=(String) session.getAttribute("location"); 
		String kids=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(kids,location);
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(kids,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "kidsFashion";
	}
	
	@RequestMapping(value="/babyFashion", method=RequestMethod.GET)
	public String babyFashion(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getBabyFashionPage();
			
			
			
			hc.setBabyFashionPage(++count);
			
			count=hc.getBabyFashionPage();
			
			System.out.println(count);
			
			storeService.save(hc);
		 
			 final String location=(String) session.getAttribute("location");
		String baby=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(baby,location);
       
        
        
       PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
       
       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
       
       pagedListHolder.setPage(page);
       pagedListHolder.setPageSize(12);
       
       model.addAttribute("pagedListHolder", pagedListHolder);
       
       //get List according to city
       final String currentCity= (String) session.getAttribute("currentCity");
       
	    List<Store> cityStores = storeService.getCitySoreList(baby,currentCity);
	       
	    model.addAttribute("cityStores",cityStores);
        
		return "babyFashion";
	}
	
	
	@RequestMapping(value="/watchFashion", method=RequestMethod.GET)
	public String watchFashion(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getWatcheFashionPage();
			
			
			
			hc.setWatcheFashionPage(++count);
			
			count=hc.getWatcheFashionPage();
			
			System.out.println(count);
			
			storeService.save(hc);
		 
			 final String location=(String) session.getAttribute("location"); 
		String watch=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(watch,location);
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(watch,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "watchFashion";
	}
	
	
	@RequestMapping(value="/luggageAndBagsFashion", method=RequestMethod.GET)
	public String luggageAndBagsFashion(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getLuggageAndBagsFashionPage();
			
			
			
			hc.setLuggageAndBagsFashionPage(++count);
			
			count=hc.getLuggageAndBagsFashionPage();
			
			System.out.println(count);
			
			storeService.save(hc);
		
			
			 final String location=(String) session.getAttribute("location");
		String luggage=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(luggage,location);
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(luggage,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "luggageAndBagsFashion";
	}
	
	
	@RequestMapping(value="/beautyFashion", method=RequestMethod.GET)
	public String beautyFashion(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getBabyFashionPage();
			
			
			
			hc.setBabyFashionPage(++count);
			
			count=hc.getBabyFashionPage();
			
			System.out.println(count);
			
			storeService.save(hc);
		 
			
			 final String location=(String) session.getAttribute("location");
		String beauty=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(beauty,location);
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(beauty,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "beautyFashion";
	}
	
	
	/*---------------------Food & Beverages-------------------*/
	
	@RequestMapping(value="/bakeryFood", method=RequestMethod.GET)
	public String bakeryFood(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getBakeryFoodPage();
			
			
			
			hc.setBakeryFoodPage(++count);
			
			count=hc.getBakeryFoodPage();
			
			System.out.println(count);
			
			storeService.save(hc);
			 final String location=(String) session.getAttribute("location"); 
		String bakery=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(bakery,location);
		
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       model.addAttribute("storeList",stores);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(bakery,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "bakeryFood";
	}
	
	@RequestMapping(value="/restaurantFood", method=RequestMethod.GET)
	public String restaurantFood(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getRestaurantsFoodPage();
			
			
			
			hc.setRestaurantsFoodPage(++count);
			
			count=hc.getRestaurantsFoodPage();
			
			System.out.println(count);
			
			storeService.save(hc);
		 
			 final String location=(String) session.getAttribute("location");
		String restaurant=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(restaurant,location);

		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(restaurant,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "restaurantFood";
	}
	
	
	@RequestMapping(value="/pubFood", method=RequestMethod.GET)
	public String pubFood(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getPubsFoodPage();
			
			
			
			hc.setPubsFoodPage(++count);
			
			count=hc.getPubsFoodPage();
			
			System.out.println(count);
			
			storeService.save(hc);
			
			
			 final String location=(String) session.getAttribute("location");
		String pub=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(pub,location);
        
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(pub,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "pubFood";
	}
	
	
	/*need to impl*/
	@RequestMapping(value="/hotelFood", method=RequestMethod.GET)
	public String hotelFood(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 
		 final String location=(String) session.getAttribute("location");
		String hotel=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(hotel,location);

		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(hotel,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "hotelFood";
	}
	
	
	
	
	
	@RequestMapping(value="/spaPersonalCare", method=RequestMethod.GET)
	public String spaAndMassageFashion(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getPersonalCareHealthPage();
			
			
			
			hc.setPersonalCareHealthPage(++count);
			
			count=hc.getPersonalCareHealthPage();
			
			System.out.println(count);
		 
			 final String location=(String) session.getAttribute("location"); 
		String spa=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(spa,location);


		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(spa,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "spaPersonalCare";
	}
	
	@RequestMapping(value="/outlatesFashion", method=RequestMethod.GET)
	public String outlatesFashion(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 
		 final String location=(String) session.getAttribute("location");
		String outlate=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(outlate,location);
		
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(outlate,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "outlatesFashion";
	}
	
	@RequestMapping(value="/textilesFashion", method=RequestMethod.GET)
	public String textilesFashion(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 
		 final String location=(String) session.getAttribute("location");
		String textile=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(textile,location);
		
		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(textile,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "textilesFashion";
	}
	
	/*-------------------------------Health & Personal Care---------------------------------*/
	@RequestMapping(value="/clinicHealth", method=RequestMethod.GET)
	public String clinicHealth(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getClinicHealthPage();
			
			
			
			hc.setClinicHealthPage(++count);
			
			count=hc.getClinicHealthPage();
			
			System.out.println(count);
		 
		 
			 final String location=(String) session.getAttribute("location"); 
		String clinic=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(clinic,location);


		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(clinic,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "clinicHealth";
	}
	
	@RequestMapping(value="/hospitalHealth", method=RequestMethod.GET)
	public String hospitalHealth(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getHospitalHealthPage();
			
			
			
			hc.setHospitalHealthPage(++count);
			
			count=hc.getHospitalHealthPage();
			
			System.out.println(count);
		
			
			 final String location=(String) session.getAttribute("location");
		String hospital=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(hospital,location);


		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(hospital,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "hospitalHealth";
	}
	
	@RequestMapping(value="/pharmacyHealth", method=RequestMethod.GET)
	public String pharmacyHealth(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getPharmacyHealthPage();
			
			
			
			hc.setPharmacyHealthPage(++count);
			
			count=hc.getPharmacyHealthPage();
			
			System.out.println(count);
		
			
			
			 final String location=(String) session.getAttribute("location");
		String paramacy=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(paramacy,location);


		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(paramacy,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "pharmacyHealth";
	}
	
	
	
	
	
	
	/*-----------------Home Needss--------------------*/
	@RequestMapping(value="/houseHoldItems", method=RequestMethod.GET)
	public String houseHoldItems(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getFurnituresPage();
			
			
			
			hc.setFurnituresPage(++count);
			
			count=hc.getFurnituresPage();
			
			System.out.println(count);
		 
		
			 final String location=(String) session.getAttribute("location");
		String house=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(house,location);


		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(house,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "houseHoldItems";
	}
	
	@RequestMapping(value="/kitchenAppliance", method=RequestMethod.GET)
	public String kitchenAppliance(Model model,HttpServletRequest request,HttpSession session)
	{
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getKitchenAppliancesPage();
			
			
			hc.setKitchenAppliancesPage(++count);
			
			count=hc.getKitchenAppliancesPage();
			
			System.out.println(count);
		 
		 
			 final String location=(String) session.getAttribute("location");
		String kitchen=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(kitchen,location);


		PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
	       
	       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
	       
	       pagedListHolder.setPage(page);
	       pagedListHolder.setPageSize(12);
	       
	       model.addAttribute("pagedListHolder", pagedListHolder);
	       
	       //get List according to city
	       final String currentCity= (String) session.getAttribute("currentCity");
	       
		    List<Store> cityStores = storeService.getCitySoreList(kitchen,currentCity);
		       
		    model.addAttribute("cityStores",cityStores);
		return "kitchenAppliance";
	}
	
	@RequestMapping(value="/groceryItems", method=RequestMethod.GET)
	public String groceryItems(Model model,HttpServletRequest request,HttpSession session)
	{
		
		 final String location=(String) session.getAttribute("location");
		String grocery=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(grocery,location);
		
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getGroceryPage();
			
			
			hc.setGroceryPage(++count);
			
			count=hc.getGroceryPage();
			
			System.out.println(count);
		 
		


			PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
		       
		       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
		       
		       pagedListHolder.setPage(page);
		       pagedListHolder.setPageSize(12);
		       
		       model.addAttribute("pagedListHolder", pagedListHolder);
		       
		       //get List according to city
		       final String currentCity= (String) session.getAttribute("currentCity");
		       
			    List<Store> cityStores = storeService.getCitySoreList(grocery,currentCity);
			       
			    model.addAttribute("cityStores",cityStores);
		return "groceryItems";
	}
	
	
	/*----------------------Shopping Centers---------------------------- */
	
	
	
	@RequestMapping(value="/shoppingMalls", method=RequestMethod.GET)
	public String mantriMall(Model model,HttpServletRequest request,HttpSession session)
	{
		
		 final String location=(String) session.getAttribute("location");
		String malls=request.getParameter("type");
		
		List<ShoppingCenter> shoppingMall = storeService.getShoppingCenters(malls,location);
		
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 
		 /*For Hitcount*/
			/*List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getMantriShoppingCenterPage();
			
			
			hc.setMantriShoppingCenterPage(++count);
			
			count=hc.getMantriShoppingCenterPage();
			
			System.out.println(count);*/
		 
		


			PagedListHolder<ShoppingCenter> pagedListHolder=new PagedListHolder<ShoppingCenter>(shoppingMall);
		       
		       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
		       
		       pagedListHolder.setPage(page);
		       pagedListHolder.setPageSize(12);
		       
		       
		       model.addAttribute("pagedListHolder", pagedListHolder);
		       
		       
		       
		     
				
				model.addAttribute("zipcodeCurrent", session.getAttribute("location"));
				
				  //get List according to city
			       final String currentCity= (String) session.getAttribute("currentCity");
			       
				    List<Store> cityStores = storeService.getCitySoreList(malls,currentCity);
				       
				    model.addAttribute("cityStores",cityStores);
				
		return "shoppingMalls";
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value="/shoppingStreets", method=RequestMethod.GET)
	public String shoppingStreets(Model model,HttpServletRequest request,HttpSession session)
	{
		
		final String location=(String) session.getAttribute("location");
		String streets=request.getParameter("type");
		
		List<ShoppingCenter> shoppingStreet = storeService.getShoppingCenters(streets,location);
		
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 
		 /*For Hitcount*/
			/*List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getMantriShoppingCenterPage();
			
			
			hc.setMantriShoppingCenterPage(++count);
			
			count=hc.getMantriShoppingCenterPage();
			
			System.out.println(count);*/
		 
		


			PagedListHolder<ShoppingCenter> pagedListHolder=new PagedListHolder<ShoppingCenter>(shoppingStreet);
		       
		       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
		       
		       pagedListHolder.setPage(page);
		       pagedListHolder.setPageSize(12);
		       
		       
		       model.addAttribute("pagedListHolder", pagedListHolder);
		       
		       
		       
		     
				
				model.addAttribute("zipcodeCurrent", session.getAttribute("location"));
				
				  //get List according to city
			       final String currentCity= (String) session.getAttribute("currentCity");
			       
				    List<Store> cityStores = storeService.getCitySoreList(streets,currentCity);
				       
				    model.addAttribute("cityStores",cityStores);
				
				
		return "shoppingStreets";
	}
	
	
	
	
	/*------------------------------Sports--------------------------*/
	
	@RequestMapping(value="/sportAccessories", method=RequestMethod.GET)
	public String sportAccessories(Model model,HttpServletRequest request,HttpSession session)
	{
		
		
		 final String location=(String) session.getAttribute("location");
		String sports=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(sports,location);
		
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getSportsAccessoriesPage();
			
			
			hc.setSportsAccessoriesPage(++count);
			
			count=hc.getSportsAccessoriesPage();
			
			System.out.println(count);
		 
		 
			PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
		       
		       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
		       
		       pagedListHolder.setPage(page);
		       pagedListHolder.setPageSize(12);
		       
		       model.addAttribute("pagedListHolder", pagedListHolder);
		       
		       //get List according to city
		       final String currentCity= (String) session.getAttribute("currentCity");
		       
			    List<Store> cityStores = storeService.getCitySoreList(sports,currentCity);
			       
			    model.addAttribute("cityStores",cityStores);
		return "sportAccessories";
	}
	
	@RequestMapping(value="/sportApparel", method=RequestMethod.GET)
	public String sportApparel(Model model,HttpServletRequest request,HttpSession session)
	{
		
		
		 final String location=(String) session.getAttribute("location");
		String sports=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(sports,location);
		
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getSportsApparealPage();
			
			
			hc.setSportsApparealPage(++count);
			
			count=hc.getSportsApparealPage();
			
			System.out.println(count);
		 
			PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
		       
		       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
		       
		       pagedListHolder.setPage(page);
		       pagedListHolder.setPageSize(12);
		       
		       model.addAttribute("pagedListHolder", pagedListHolder);
		       
		       //get List according to city
		       final String currentCity= (String) session.getAttribute("currentCity");
		       
			    List<Store> cityStores = storeService.getCitySoreList(sports,currentCity);
			       
			    model.addAttribute("cityStores",cityStores);
		return "sportApparel";
	}
	
	@RequestMapping(value="/sportShoes", method=RequestMethod.GET)
	public String sportShoes(Model model,HttpServletRequest request,HttpSession session)
	{
		
		 final String location=(String) session.getAttribute("location");
		String sports=request.getParameter("type");
		List<Store> stores = storeService.getSoreList(sports,location);
		
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 
		 /*For Hitcount*/
			List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getSportsShoesPage();
			
			
			hc.setSportsShoesPage(++count);
			
			count=hc.getSportsShoesPage();
			
			System.out.println(count);
		 
		 
			PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
		       
		       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
		       
		       pagedListHolder.setPage(page);
		       pagedListHolder.setPageSize(12);
		       
		       model.addAttribute("pagedListHolder", pagedListHolder);
		       
		       //get List according to city
		       final String currentCity= (String) session.getAttribute("currentCity");
		       
			    List<Store> cityStores = storeService.getCitySoreList(sports,currentCity);
			       
			    model.addAttribute("cityStores",cityStores);
		return "sportShoes";
	}
	
	
	
	
	
	
	
	
	
	
	/*---------------------------For Product Display----------------------------------*/
	@RequestMapping("/{storeId}")
    public String viewProduct(@PathVariable int storeId,HttpServletRequest request, Model model, HttpSession session) throws IOException{
     
	  
	  Store store=storeService.getStoreById(storeId);
	  
	  String productType=request.getParameter("productType");
	  
	  List<Product> productList= storeService.getProductByType(productType,storeId);
	  
	  
	  
	  List<SaveReview> reviews=storeService.getReview(storeId);
	  
	  if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
	  
	  model.addAttribute("store",store);
	  model.addAttribute("productList",productList);
	  model.addAttribute("saveReview", new SaveReview());
	  model.addAttribute("reviews",reviews);
	  model.addAttribute("productType", productType);
	  
	  return "viewProduct";
    }
	
	
	
	/*---------------------------For Searched Product Display----------------------------------*/
	@RequestMapping("/search_{storeId}")
    public String serachStore(@PathVariable int storeId,HttpServletRequest request, Model model, HttpSession session) throws IOException{
		
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
	  
	  Store store=storeService.getStoreById(storeId);
	  
	
	  
	  List<Product> productList= storeService.getProductByStoreId(storeId);
	  
	  
	  
	  List<SaveReview> reviews=storeService.getReview(storeId);
	  
	 
	  
	  model.addAttribute("store",store);
	  model.addAttribute("productList",productList);
	  model.addAttribute("saveReview", new SaveReview());
	  model.addAttribute("reviews",reviews);
	  
	  
	  return "viewProduct";
    }
	
	
	
	

	/*---------------------------For Store Display from shoppingCenter----------------------------------*/
	@RequestMapping("/shoppingCenter_{centerId}")
    public String viewStore(@PathVariable int centerId,HttpServletRequest request, Model model, HttpSession session) throws IOException{
     
		

		final String location=(String) session.getAttribute("location");
		String centerType=request.getParameter("type");
		
		List<SaveStore> centers = storeService.getSoreListOfShoppingCenter(centerId,centerType,location);
		
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		 
		 
		 /*For Hitcount*/
			/*List<HitCount> list= storeService.getCount();
			
			HitCount hc = list.get(0);
			
			
			int count=hc.getMantriShoppingCenterPage();
			
			
			hc.setMantriShoppingCenterPage(++count);
			
			count=hc.getMantriShoppingCenterPage();
			
			System.out.println(count);*/
		 
		


			PagedListHolder<SaveStore> pagedListHolder=new PagedListHolder<SaveStore>(centers);
		       
		       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
		       
		       pagedListHolder.setPage(page);
		       pagedListHolder.setPageSize(12);
		       
		       
		       model.addAttribute("pagedListHolder", pagedListHolder);
		       
		       
		       
		     
				
				model.addAttribute("zipcodeCurrent", session.getAttribute("location"));
	  
	  return "viewStore";
    }
	
	
	
	/*---------------------------For Product Display from shoppingCenters stores----------------------------------*/
	@RequestMapping("/{storeId}@ShoppingCenter")
    public String viewProductOfShoppingCEnterStores(@PathVariable int storeId,HttpServletRequest request, Model model, HttpSession session) throws IOException{
     
	  
		 Store store=storeService.getStoreById(storeId);
		  
			
		  
		  List<Product> productList= storeService.getProductByStoreId(storeId);
		  
		  
		  
		  List<SaveReview> reviews=storeService.getReview(storeId);
		  
		  if (session !=null) {
				
				 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
				
				  if (userWithRole !=null) {
					  model.addAttribute("loggedInUser",userWithRole );
				  }
			}
		  
		  model.addAttribute("store",store);
		  model.addAttribute("productList",productList);
		  model.addAttribute("saveReview", new SaveReview());
		  model.addAttribute("reviews",reviews);
	  
	  return "viewProduct";
    }
	
	
	
	
	
	
	
	@RequestMapping(value="/review", method=RequestMethod.POST)
	public String review(@Valid @ModelAttribute("saveReview") SaveReview saveReview,Model model,HttpServletRequest request,BindingResult result, HttpSession session )
	{

		saveReview.setReviewDate(new Date().toString());
		
		storeService.addReview(saveReview);
		
		
		Store store=storeService.getStoreById(saveReview.getStoreId());
		  

		List<Product> productList= storeService.getProductByType(saveReview.getProductType(),saveReview.getStoreId() );
		  
		List<SaveReview> reviews=storeService.getReview(saveReview.getStoreId());
		  
		  
	   if (session !=null) {
				
				 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
				
				  if (userWithRole !=null) {
					  model.addAttribute("loggedInUser",userWithRole );
				  }
			}
		  
		  model.addAttribute("store",store);
		  model.addAttribute("productList",productList);
		  model.addAttribute("saveReview", new SaveReview());
		  model.addAttribute("reviews",reviews);
		  model.addAttribute("productType", saveReview.getProductType());
		  
	
		return "viewProduct";
		
	}
	
	
	@RequestMapping(value="/review", method=RequestMethod.GET)
	public String review(@Valid @ModelAttribute("saveReview") SaveReview saveReview,Model model)
	{
		
		
		List<SaveReview> reviews=storeService.getReview(saveReview.getStoreId());
		model.addAttribute("reviews",reviews);
		model.addAttribute("saveReview",new SaveReview());
		return "viewProduct";
		
	}
	
	
	
	/*---------------------Temp---------------------*/
	@RequestMapping(value="/affixExample", method=RequestMethod.GET)
	public String affixExample(Model model)
	{
		
		return "affixExample";
		
	}


	
	
	
/*---------------------------For Search-------------------------------------*/
	
	/*For Serach*/
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String search(@RequestParam String searchValue, Model model,HttpSession session) {	
		
		 if (session !=null) {
				
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		List<Store> storeList=storeService.serachStores(searchValue);
		model.addAttribute("value", searchValue);
		
		model.addAttribute("stores", storeList);
			
		return "search";
	}
	
	
	
	
	
	
	/*---------------------------auto complete-------------------------------------*/
	
	@RequestMapping(value = "/searchStores", method = RequestMethod.GET,headers="Accept=*/*")
	@ResponseBody 
	public String searchStores(@RequestParam("term") String query) {

		
			List<String> storeList=storeService.getStoreNameForSearch(query);
			
			String searchList = new Gson().toJson(storeList);
			
			return searchList;
			
		
	}

	
	/*---------------------------End Search-------------------------------------*/
	
	
	
	/*----------------------------------------Retireving Images----------------------------------------------------------------*/
	
	
	/*-------------------For retrieving of store imgs ------------------------------------*/
	@RequestMapping(value = "/img/StoreImg/{imageId}")
	@ResponseBody
	public byte[] getImage(@PathVariable long imageId, HttpServletRequest request) throws IOException  {
		String rpath=request.getSession().getServletContext().getRealPath("/");
		rpath=rpath+"/"+"img/StoreImg"+imageId; // whatever path you used for storing the file
		Path path = Paths.get(rpath);
		System.out.println(path.toString());
		byte[] data = Files.readAllBytes(path); 
		return data;
	}
	
	
	/*-------------------For retrieving of product imgs ------------------------------------*/
	@RequestMapping(value = "/img/ProductImg/{imageId}")
	@ResponseBody
	public byte[] getProductImage(@PathVariable long imageId, HttpServletRequest request) throws IOException  {
		String rpath=request.getSession().getServletContext().getRealPath("/");
		rpath=rpath+"/"+"img/ProductImg"+imageId; // whatever path you used for storing the file
		Path path = Paths.get(rpath);
		//System.out.println(path.toString());
		byte[] data = Files.readAllBytes(path); 
		return data;
	}
	
	/*-------------------For retrieving of main offer imgs ------------------------------------*/
	@RequestMapping(value = "/img/MainOfferImg/{imageId}")
	@ResponseBody
	public byte[] getOfferImage(@PathVariable long imageId, HttpServletRequest request) throws IOException  {
		String rpath=request.getSession().getServletContext().getRealPath("/");
		rpath=rpath+"/"+"img/MainOfferImg"+imageId;
		Path path = Paths.get(rpath);
		//System.out.println(path.toString());
		byte[] data = Files.readAllBytes(path); 
		return data;
	}
	
	
	/*-------------------For retrieving of shopping centerr imgs ------------------------------------*/
	@RequestMapping(value = "/img/ShoppingCenterImg/{imageId}")
	@ResponseBody
	public byte[] getShoppingCenterImage(@PathVariable long imageId, HttpServletRequest request) throws IOException  {
		String rpath=request.getSession().getServletContext().getRealPath("/");
		rpath=rpath+"/"+"img/ShoppingCenterImg"+imageId;
		Path path = Paths.get(rpath);
		//System.out.println(path.toString());
		byte[] data = Files.readAllBytes(path); 
		return data;
	}
	
	
	/*----------------------------------------End Retireving Images----------------------------------------------------------------*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*--------------------------------------------------for header and footer----------------------------------------------------*/
	
	/*For contact page*/
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public String contact(Model model,HttpSession session) {			
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		ContactUs contact=new ContactUs();
		model.addAttribute("contact", contact);
		return "contact";
	}
	
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public String contact(@Valid @ModelAttribute("contact") ContactUs contact, BindingResult result,Model model,HttpSession session,HttpServletRequest request,final RedirectAttributes redirectAttributes) throws Exception {			
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		if (result.hasErrors()) {
			 
			return "contact";
		 
		} else {
		 
			 String contactUserName=request.getParameter("contactUserName");
			 //String contactLastName=request.getParameter("contactLastName");
			 String contactEmail=request.getParameter("contactEmail");
			 //String contactSubject=request.getParameter("contactSubject");
			 String contactMessage=request.getParameter("contactMessage");
			 
			 contact.setContactUserName(contactUserName);
			 //contact.setContactLastName(contactLastName);
			 contact.setContactEmail(contactEmail);
			 //contact.setContactSubject(contactSubject);
			 contact.setContactMessage(contactMessage);
			 
			 storeService.addContact(contact);
			 
			redirectAttributes.addFlashAttribute("msg", "Your message/request sent successfully.... We will get you back soon...");
			return "redirect:contactSuccess.html";
		}
		
	}
	
	
	@RequestMapping(value="/contactSuccess", method=RequestMethod.GET)
	public String contactSucess(Model model,HttpSession session) {			
		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		return "contactSuccess";
	}
	
	
	
	
	/*For about page*/
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String about(Model model,HttpSession session) {	
		 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
		 
			if (session !=null) {
				
				
				
				  if (userWithRole !=null) {
					  model.addAttribute("loggedInUser",userWithRole );
				  }
			
			}
		
		return "about";
	}
	/*--------------------------------------------------for header and footer----------------------------------------------------*/	
	
	/*For termsAndConditions page*/
	@RequestMapping(value="/termsAndConditions", method=RequestMethod.GET)
	public String termsAndConditions(Model model,HttpSession session) {	
		 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
		 
			if (session !=null) {
				
				
				
				  if (userWithRole !=null) {
					  model.addAttribute("loggedInUser",userWithRole );
				  }
			
			}
		
		return "termsAndConditions";
	}
	
	
	
	/*---------------------------End header and footer-------------------------------------*/
	
	
	
	
	/*----------------------------------------Exception----------------------------------------------------------------*/
	
	/*For 400 page*/
	@RequestMapping(value="/400", method=RequestMethod.GET)
	public String Error400(Model model,HttpSession session) {
		 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
		 
			if (session !=null) {
				
				
				
				  if (userWithRole !=null) {
					  model.addAttribute("loggedInUser",userWithRole );
				  }
			
			}
		
		return "exception/400";
	}
	
	
	
	/*----------------------------------------Exception---------------------------------------------------------------*/
	
	
	
	
	
	

	
	
	
	
	

}
