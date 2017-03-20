package com.store.controller.admin;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.store.model.MainOffer;
import com.store.model.Product;
import com.store.model.SaveProduct;
import com.store.model.SaveStore;
import com.store.model.ShoppingCenter;
import com.store.model.Store;
import com.store.model.User;
import com.store.model.UserWithRole;
import com.store.service.StoreService;
import com.store.service.UserService;

@Controller
public class AdminStoreController {
	
	
	@Autowired
	private StoreService   storeService;
	
	
	//For adding Store
	@RequestMapping(value="/addStore", method=RequestMethod.GET)
	public String addStore(Model model,HttpServletRequest request,HttpSession session) {	
		
		Store store=new Store();
		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		model.addAttribute(store);
		String id=request.getParameter("id");
		if(id== null)
		{
			return "addStore";
		}
		else
		{
			model.addAttribute("shoppingCenterId", id);
			return "addStore";
		}
		
		
		
		
	}
	
	
	
	

	@RequestMapping(value="/addStore", method=RequestMethod.POST)
	public String addStore(@RequestParam("storeImagePath") CommonsMultipartFile storeImagePath, HttpServletRequest request ,@Valid @ModelAttribute("store")SaveStore store, BindingResult result, Model model,HttpSession session,
			final RedirectAttributes redirectAttributes) throws Exception
	{
		
		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		
		
		
		
		
//		String si = request.getParameter("storeId");
		String storeName = request.getParameter("storeName");
		String storeProprietor=request.getParameter("storeProprietor");
		//getting Check box values
		String[] storeTypeString=request.getParameterValues("storeType");
		
		String storeType=String.join(",", storeTypeString);
		
		
		
		String storeDescription = request.getParameter("storeDescription");
		String storePriority = request.getParameter("storePriority");
		String storeLandLineNumber = request.getParameter("storeLandLineNumber");
		String storeMobileNumber = request.getParameter("storeMobileNumber");
		String storeAddress = request.getParameter("storeAddress");
		String storeArea = request.getParameter("storeArea");
		String storePincode=request.getParameter("storePincode");
		String storeCity=request.getParameter("storeCity");
		String storeTag=request.getParameter("storeTag");
		int shoppingCenterId=Integer.parseInt(request.getParameter("shoppingCenterId"));
		
		
		
		
		
		String storeImageName=storeName.replaceAll(" ","");
		
		String timestamp = new Timestamp(System.currentTimeMillis()).toString();
		
		timestamp = timestamp.substring(0, timestamp.length()-6).replaceAll(":","");
		timestamp=timestamp.replaceAll(" ","_");
//		String imgPath = "D:/NewWorkSpace/StoreProject/src/main/webapp/img/"+storeImageName+"_"+timestamp+".jpg";
//		System.out.println(imgPath);
		
		String physicalImagePath =request.getSession().getServletContext().getRealPath("/")+"img\\StoreImg\\"+storeImageName+"_"+timestamp+".jpg";
		
		BufferedImage imgStore  = null;
		
		if (storeImagePath!=null) {
			try {
			InputStream inputStram = 	storeImagePath.getInputStream();
			imgStore = ImageIO.read(inputStram);
			ImageIO.write(imgStore, "jpg", new File(physicalImagePath));
			
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}else {
			System.out.println("image is not stored for the "+storeName+" store");
		}
		
		String imgPathToDB="img/StoreImg/"+storeImageName+"_"+timestamp+".jpg";
		System.out.println(imgPathToDB);
		
		
			try {
				store.setStoreName(storeName);
				store.setStoreProprietor(storeProprietor);
				store.setStoreType(storeType);
				store.setStoreDescription(storeDescription);
				store.setStorePriority(storePriority);
				store.setStoreAddress(storeAddress);
				store.setStoreImagePath(imgPathToDB);//Stroe Image 
				store.setStoreLandLineNumber(storeLandLineNumber);
				store.setStoreMobileNumber(storeMobileNumber);
				store.setStoreArea(storeArea);
				store.setStoreCity(storeCity);
				store.setStorePincode(storePincode);
				store.setStoreTag(storeTag);
				store.setStoreEntryDate(new Date());
				store.setShoppingCenterId(shoppingCenterId);
						
				
					storeService.addStore(store);
					redirectAttributes.addFlashAttribute("storeList", store);
					return "redirect:addStoreSuccess.html";
					
			} catch (Exception e) {
				redirectAttributes.addFlashAttribute("ErrorMsg", "Failed To Add "+storeName+" Store Details");
				return "redirect:failurePage.html";
			}
				
				
				
				
		
		
		
		//List<SaveStore> storeList=storeService.getStores();
		
		
		//model.addAttribute("storeList", storeList);
		
		
		//redirectAttributes.addFlashAttribute("message","Added successfully.");
	}
	
	
	@RequestMapping(value="/addStoreSuccess", method=RequestMethod.GET)
	public String addStoreSuccess(Model model,HttpSession session)
	{
		//List<SaveStore> storeList=storeService.getStores();
		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		
		//model.addAttribute("storeList", storeList);
		return "addStoreSuccess";
	}
	
	
	
	//For Searching store
		@RequestMapping(value="/searchStore", method=RequestMethod.GET)
		public String searchStore(Model model,HttpSession session)
		{
			
			
			if (session !=null) {
				
				 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
				
				  if (userWithRole !=null) {
					  model.addAttribute("loggedInUser",userWithRole );
				  }
			}
		
			return "searchStore";
			
		}
		
		
		@RequestMapping(value="/searchStore", method=RequestMethod.POST)
		public String serachStore(@Valid @ModelAttribute("store")Store store,BindingResult result, Model model,HttpServletRequest request,HttpSession session) throws Exception
		{
			if (session !=null) {
				
				 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
				
				  if (userWithRole !=null) {
					  model.addAttribute("loggedInUser",userWithRole );
				  }
			}
		
				String storeName=request.getParameter("storeName");
				List<Store> storeList=storeService.getStoreByName(storeName);

				
				if(storeList==null)
				{
					model.addAttribute("msgStore","No Stores were found");
				}
				else
				{
					model.addAttribute("storeList",storeList);
				}
			return "searchStore";
		}
	
	
	/*For Adding product*/
	@RequestMapping(value="/addProduct", method=RequestMethod.GET)
	public String addProduct(Model model,HttpServletRequest request,HttpSession session)
	{
		SaveProduct saveProduct = new SaveProduct();
		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		
		model.addAttribute(saveProduct);
		String id=request.getParameter("id");
		if(id== null)
		{
			return "addProduct";
		}
		else
		{
			model.addAttribute("storeID", id);
			return "addProduct";
		}
		
	}
	
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public String addProduct(@RequestParam("productImagePath") CommonsMultipartFile productImagePath, HttpServletRequest request ,@Valid @ModelAttribute("saveProduct") SaveProduct saveProduct, 
			BindingResult result, Model model,HttpSession session,final RedirectAttributes redirectAttributes) throws Exception
	{

		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		
		
		
		
		String productName = request.getParameter("productName");
		String productDescription = request.getParameter("productDescription");
		int productPriority = Integer.parseInt(request.getParameter("productPriority"));
//    	String offerId=request.getParameter("offerId");
		int storeId=Integer.parseInt(request.getParameter("storeId"));
		/*String productEntryDate=request.getParameter("productEntryDate");*/
		
		
		Date offerStartTime=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("offerStartTime"));
		System.out.println(offerStartTime);
		Date offerEndTime=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("offerEndTime"));
		
		
		
		offerEndTime.setTime(offerEndTime.getTime()+86399000);
		
		String productType=request.getParameter("productType");
		
		
		String productImageName=productName.replaceAll(" ","");
		
		String timestamp = new Timestamp(System.currentTimeMillis()).toString();
		
		timestamp = timestamp.substring(0, timestamp.length()-6).replaceAll(":","");
		timestamp=timestamp.replaceAll(" ","_");
		
		/*String imgPath = "D:/NewWorkSpace/StoreProject/src/main/webapp/img/ProductImg/"+productImageName+"_"+timestamp+".jpg";*/
		
		
		String physicalImagePath =request.getSession().getServletContext().getRealPath("/")+"img\\ProductImg\\"+productImageName+"_"+timestamp+".jpg";
		BufferedImage imgProduct  = null;
		
		if (productImagePath!=null) {
			try {
			InputStream inputStram = 	productImagePath.getInputStream();
			imgProduct = ImageIO.read(inputStram);
			ImageIO.write(imgProduct, "jpg", new File(physicalImagePath));
			
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		
		String productImgPathToDB="img/ProductImg/"+productImageName+"_"+timestamp+".jpg";
		
		try {
			saveProduct.setProductName(productName);
			saveProduct.setProductDescription(productDescription);
			saveProduct.setProductPriority(productPriority);
			saveProduct.setProductImagePath(productImgPathToDB);
			saveProduct.setStoreId(storeId);
			saveProduct.setProductEntryDate(new Date());
			saveProduct.setOfferStartTime(offerStartTime);
			saveProduct.setOfferEndTime(offerEndTime);
			saveProduct.setProductType(productType);
			
			storeService.addProduct(saveProduct);
			
			redirectAttributes.addFlashAttribute("product",saveProduct);
			
			model.addAttribute("product",productName);
			List<SaveProduct> productList=storeService.getProducts();
			model.addAttribute("productList", productList);
			
			return "redirect:addProductSuccess.html";
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("ErrorMsg", "Failed To Add "+productName+" Product Details");
			return "redirect:failurePage.html";
		}
		
	}
	
	@RequestMapping(value="/addProductSuccess", method=RequestMethod.GET)
	public String addProductSuccess(Model model,HttpSession session)
	{
		//List<SaveProduct> productList=storeService.getProducts();
		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		//model.addAttribute("productList", productList);
		return "addProductSuccess";
	}
	
	
	
	//For Searching Product
			@RequestMapping(value="/searchProduct", method=RequestMethod.GET)
			public String searchProduct(Model model,HttpSession session)
			
			{
				if (session !=null) {
					
					 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
					
					  if (userWithRole !=null) {
						  model.addAttribute("loggedInUser",userWithRole );
					  }
				}
			
				return "searchProduct";
				
			}
			
			
			@RequestMapping(value="/searchProduct", method=RequestMethod.POST)
			public String searchProduct(@Valid @ModelAttribute("product")SaveProduct product,BindingResult result, Model model,HttpServletRequest request) throws Exception
			{
				
			
					String productName=request.getParameter("productName");
					List<SaveProduct> productList=storeService.getProductByName(productName);

					
					if(productName==null)
					{
						model.addAttribute("msgStore","No Stores were found");
					}
					else
					{
						model.addAttribute("productList",productList);
					}
				return "searchProduct";
			}
	
			
/*----------------------------------Start Main Offer--------------------------------------------------*/
			
			@RequestMapping(value ="/addMainOffer", method = RequestMethod.GET)
			public String addMainOffer(ModelMap model,HttpSession session)
			{
			
				
				if (session !=null) {
					
					 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
					
					  if (userWithRole !=null) {
						  model.addAttribute("loggedInUser",userWithRole );
					  }
				}
				
				
				model.addAttribute("mainOffer", new MainOffer());
				
				return "addMainOffer";
			}
			
			
			
				
			
			@RequestMapping(value="/addMainOffer", method=RequestMethod.POST)
			public String addMainOffer(@RequestParam("mainOfferImagePath") CommonsMultipartFile mainOfferImagePath, HttpServletRequest request ,@Valid @ModelAttribute("mainOffer") MainOffer mainOffer, BindingResult result,
					Model model,HttpSession session,final RedirectAttributes redirectAttributes) throws Exception
			{

				
				if (session !=null) {
					
					 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
					
					  if (userWithRole !=null) {
						  model.addAttribute("loggedInUser",userWithRole );
					  }
				}
				
				
				
				
				
				String mainOfferName= request.getParameter("mainOfferName");
				//String mainOfferUrl = request.getParameter("mainOfferUrl");
				
				String[] mainOfferUrlString=request.getParameterValues("mainOfferUrl");
				
				String mainOfferUrl=String.join(",", mainOfferUrlString);
				
				
				Date offerStartTime=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("offerStartTime"));
				System.out.println(offerStartTime);
				Date offerEndTime=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("offerEndTime"));
				
				
				
				offerEndTime.setTime(offerEndTime.getTime()+86399000);
				
				
				
				
				String mainOfferImage=mainOfferName.replaceAll(" ","");
				
				String timestamp = new Timestamp(System.currentTimeMillis()).toString();
				
				timestamp = timestamp.substring(0, timestamp.length()-6).replaceAll(":","");
				timestamp=timestamp.replaceAll(" ","_");
				
				
				
				String physicalImagePath =request.getSession().getServletContext().getRealPath("/")+"img\\MainOfferImg\\"+mainOfferImage+"_"+timestamp+".jpg";
				System.out.println("path is:"+physicalImagePath);
				BufferedImage imgProduct  = null;
				
				if (mainOfferImagePath!=null) {
					try {
					InputStream inputStram = 	mainOfferImagePath.getInputStream();
					imgProduct = ImageIO.read(inputStram);
					ImageIO.write(imgProduct, "jpg", new File(physicalImagePath));
					
					} catch (Exception e) {
						
						e.printStackTrace();
					}
				}
				
				
				String mainOfferImagePathToDB="img/MainOfferImg/"+mainOfferImage+"_"+timestamp+".jpg";
				System.out.println(mainOfferImagePathToDB);
				
				try {
					mainOffer.setMainOfferName(mainOfferName);
					mainOffer.setMainOfferUrl(mainOfferUrl);
					mainOffer.setMainOfferImagePath(mainOfferImagePathToDB);
					mainOffer.setOfferStartTime(offerStartTime);
					mainOffer.setOfferEndTime(offerEndTime);

					
					
					storeService.addMainOffer(mainOffer);
					
					
					redirectAttributes.addFlashAttribute("offer",mainOffer);
					/*List<MainOffer> offerImageList=storeService.getMainOfferImage();
					model.addAttribute("offerImageList", offerImageList);*/
					
					return "redirect:addMainOfferSuccess.html";
				} catch (Exception e) {
					redirectAttributes.addFlashAttribute("ErrorMsg", "Failed To Add "+mainOfferName+" Main Offer Details");
					return "redirect:failurePage.html";
				}
				
			}
			
			@RequestMapping(value="/addMainOfferSuccess", method=RequestMethod.GET)
			public String addMainOfferSuccess(Model model,HttpSession session)
			{
				
				
				if (session !=null) {
					
					 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
					
					  if (userWithRole !=null) {
						  model.addAttribute("loggedInUser",userWithRole );
					  }
				}
				
				List<MainOffer> offerImageList=storeService.getMainOfferImage();
				model.addAttribute("offerImageList", offerImageList);
				return "addMainOfferSuccess";
			}


			/*----------------------------------End Main Offer--------------------------------------------------*/
			
			
			
			
			
			
			
/*----------------------------------Start Shopping Center--------------------------------------------------*/
			
			@RequestMapping(value ="/addShoppingCenter", method = RequestMethod.GET)
			public String addShoppingCenter(ModelMap model,HttpSession session)
			{
			
				
				if (session !=null) {
					
					 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
					
					  if (userWithRole !=null) {
						  model.addAttribute("loggedInUser",userWithRole );
					  }
				}
				
				
				model.addAttribute("shoppingCenter", new ShoppingCenter());
				
				return "addShoppingCenter";
			}
			
			
			
				
			
			@RequestMapping(value="/addShoppingCenter", method=RequestMethod.POST)
			public String addShoppingCenter(@RequestParam("shoppingCenterImagePath") CommonsMultipartFile shoppingCenterImagePath, HttpServletRequest request ,@Valid @ModelAttribute("shoppingCenter") ShoppingCenter shoppingCenter, 
					BindingResult result, Model model,HttpSession session, final RedirectAttributes redirectAttributes ) throws Exception
			{

				
				if (session !=null) {
					
					 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
					
					  if (userWithRole !=null) {
						  model.addAttribute("loggedInUser",userWithRole );
					  }
				}
				
				
				
				
				
				String shoppingCenterName= request.getParameter("shoppingCenterName");
				
				String shoppingCenterImage=shoppingCenterName.replaceAll(" ","");
				
				String shoppingCenterType=request.getParameter("shoppingCenterType");
				
				String shoppingCenterCity=request.getParameter("shoppingCenterCity");
				
				String shoppingCenterPincode=request.getParameter("shoppingCenterPincode");
				
				String timestamp = new Timestamp(System.currentTimeMillis()).toString();
				
				timestamp = timestamp.substring(0, timestamp.length()-6).replaceAll(":","");
				timestamp=timestamp.replaceAll(" ","_");
				
				
				
				String physicalImagePath =request.getSession().getServletContext().getRealPath("/")+"img\\ShoppingCenterImg\\"+shoppingCenterImage+"_"+timestamp+".jpg";
				System.out.println("path is:"+physicalImagePath);
				BufferedImage imgShoppingCenter  = null;
				
				if (shoppingCenterImagePath!=null) {
					try {
					InputStream inputStram = 	shoppingCenterImagePath.getInputStream();
					imgShoppingCenter = ImageIO.read(inputStram);
					ImageIO.write(imgShoppingCenter, "jpg", new File(physicalImagePath));
					
					} catch (Exception e) {
						
						e.printStackTrace();
					}
				}
				
				
				String shoppingCenterImagePathToDB="img/ShoppingCenterImg/"+shoppingCenterName+"_"+timestamp+".jpg";
				System.out.println(shoppingCenterImagePathToDB);
				
				try {
					shoppingCenter.setShoppingCenterName(shoppingCenterName);
					shoppingCenter.setShoppingCenterType(shoppingCenterType);
					shoppingCenter.setShoppingCenterCity(shoppingCenterCity);
					shoppingCenter.setShoppingCenterPincode(shoppingCenterPincode);
					shoppingCenter.setShoppingCenterImagePath(shoppingCenterImagePathToDB);
					shoppingCenter.setShoppingCenterEntryDate(new Date());
					
					
					storeService.addShoppingCenter(shoppingCenter);
					
					/*List<ShoppingCenter> shoppingCenterList=storeService.getShoppingCenterList();
					model.addAttribute("shoppingCenterList", shoppingCenterList);*/
					
					redirectAttributes.addFlashAttribute("shoppingCenter", shoppingCenter);
					
					return "redirect:addShoppingCenterSuccess.html";
				} catch (Exception e) {
					redirectAttributes.addFlashAttribute("ErrorMsg", "Failed To Add "+shoppingCenterName +" Shopping Center Details");
					return "redirect:failurePage.html";
				}
				
			}
			
			@RequestMapping(value="/addShoppingCenterSuccess", method=RequestMethod.GET)
			public String addShoppingCenterSuccess(Model model,HttpSession session)
			{
				
				
				if (session !=null) {
					
					 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
					
					  if (userWithRole !=null) {
						  model.addAttribute("loggedInUser",userWithRole );
					  }
				}
				
				List<ShoppingCenter> shoppingCenterList=storeService.getShoppingCenterList();
				model.addAttribute("shoppingCenterList", shoppingCenterList);
				return "addShoppingCenterSuccess";
			}
			
			
			
			
			//For Searching store
			@RequestMapping(value="/searchShoppingCenter", method=RequestMethod.GET)
			public String searchShoppingCenter(Model model,HttpSession session)
			{
				
				
				if (session !=null) {
					
					 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
					
					  if (userWithRole !=null) {
						  model.addAttribute("loggedInUser",userWithRole );
					  }
				}
			
				return "searchShoppingCenter";
				
			}
			
			
			@RequestMapping(value="/searchShoppingCenter", method=RequestMethod.POST)
			public String searchShoppingCenter(@Valid @ModelAttribute("shoppingCenter")ShoppingCenter shoppingCenter,BindingResult result, Model model,HttpServletRequest request,HttpSession session) throws Exception
			{
				if (session !=null) {
					
					 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
					
					  if (userWithRole !=null) {
						  model.addAttribute("loggedInUser",userWithRole );
					  }
				}
			
					String shoppinCenterName=request.getParameter("shoppingCenterName");
					List<ShoppingCenter> shoppingCenterList=storeService.getShoppingCenterByName(shoppinCenterName);

					
					if(shoppingCenterList==null)
					{
						model.addAttribute("msgStore","No Stores were found");
					}
					else
					{
						model.addAttribute("shoppingCenterList",shoppingCenterList);
					}
				return "searchShoppingCenter";
			}


			/*----------------------------------End Shopping Center--------------------------------------------------*/
			
			
			
			@RequestMapping(value="/offers", method=RequestMethod.GET)
			public String offers(Model model,HttpServletRequest request,HttpSession session)
			{
				
				 if (session !=null) {
						
					 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
					
					  if (userWithRole !=null) {
						  model.addAttribute("loggedInUser",userWithRole );
					  }
				}
				
				System.out.println("executing.................");
				final String location=(String) session.getAttribute("location");
				String types=request.getParameter("type");
				
				List<String> typesList = new ArrayList<String>(Arrays.asList(types.split(",")));
				
				System.out.println(types);
				
				
				List<Store> stores = storeService.getOfferSoreList(typesList,location);
				
				PagedListHolder<Store> pagedListHolder=new PagedListHolder<Store>(stores);
				       
				       int page= ServletRequestUtils.getIntParameter(request, "p", 0);
				       
				       pagedListHolder.setPage(page);
				       pagedListHolder.setPageSize(12);
				       
				       model.addAttribute("pagedListHolder", pagedListHolder);
				       
				       //get List according to city
				       final String currentCity= (String) session.getAttribute("currentCity");
				       
					    List<Store> cityStores = storeService.getCitySoreList(types,currentCity);
					       
					    model.addAttribute("cityStores",cityStores);
					    
				return "offers";
			}
			
			@RequestMapping(value="/offers", method=RequestMethod.POST)
			public String offer(@RequestParam("mainOfferImagePath") CommonsMultipartFile mainOfferImagePath, HttpServletRequest request ,@Valid @ModelAttribute("mainOffer") MainOffer mainOffer, BindingResult result,
					Model model,HttpSession session,final RedirectAttributes redirectAttributes) throws Exception
			{

				
				if (session !=null) {
					
					 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
					
					  if (userWithRole !=null) {
						  model.addAttribute("loggedInUser",userWithRole );
					  }
				}
				
				
				
				
				
				String mainOfferName= request.getParameter("mainOfferName");
				//String mainOfferUrl = request.getParameter("mainOfferUrl");
				
				String[] mainOfferUrlString=request.getParameterValues("mainOfferUrl");
				
				
				
				String mainOfferUrl=String.join(",", mainOfferUrlString);
				
				String mainOfferType="offers.html?type=";
				
				String mainOfferUrlToDB=mainOfferType.concat(mainOfferUrl);
				
				Date offerStartTime=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("offerStartTime"));
				System.out.println(offerStartTime);
				Date offerEndTime=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("offerEndTime"));
				
				
				
				offerEndTime.setTime(offerEndTime.getTime()+86399000);
				
				
				
				
				String mainOfferImage=mainOfferName.replaceAll(" ","");
				
				String timestamp = new Timestamp(System.currentTimeMillis()).toString();
				
				timestamp = timestamp.substring(0, timestamp.length()-6).replaceAll(":","");
				timestamp=timestamp.replaceAll(" ","_");
				
				
				
				String physicalImagePath =request.getSession().getServletContext().getRealPath("/")+"img\\MainOfferImg\\"+mainOfferImage+"_"+timestamp+".jpg";
				System.out.println("path is:"+physicalImagePath);
				BufferedImage imgProduct  = null;
				
				if (mainOfferImagePath!=null) {
					try {
					InputStream inputStram = 	mainOfferImagePath.getInputStream();
					imgProduct = ImageIO.read(inputStram);
					ImageIO.write(imgProduct, "jpg", new File(physicalImagePath));
					
					} catch (Exception e) {
						
						e.printStackTrace();
					}
				}
				
				
				String mainOfferImagePathToDB="img/MainOfferImg/"+mainOfferImage+"_"+timestamp+".jpg";
				System.out.println(mainOfferImagePathToDB);
				
				try {
					mainOffer.setMainOfferName(mainOfferName);
					mainOffer.setMainOfferUrl(mainOfferUrlToDB);
					mainOffer.setMainOfferImagePath(mainOfferImagePathToDB);
					mainOffer.setOfferStartTime(offerStartTime);
					mainOffer.setOfferEndTime(offerEndTime);

					
					
					storeService.addMainOffer(mainOffer);
					
					
					redirectAttributes.addFlashAttribute("offer",mainOffer);
					/*List<MainOffer> offerImageList=storeService.getMainOfferImage();
					model.addAttribute("offerImageList", offerImageList);*/
					
					return "redirect:addMainOfferSuccess.html";
				} catch (Exception e) {
					redirectAttributes.addFlashAttribute("ErrorMsg", "Failed To Add "+mainOfferName +" Main Offer Details");
					return "redirect:failurePage.html";
				}
				
			}
			
			@RequestMapping(value="/failurePage", method=RequestMethod.GET)
			public String failurePage(Model model,HttpSession session) {			
				
				if (session !=null) {
					
					 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
					
					  if (userWithRole !=null) {
						  model.addAttribute("loggedInUser",userWithRole );
					  }
				}
				return "failurePage";
			}
			
			
			
		   
}

