package com.store.controller.admin;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
import com.store.model.UserWithRole;
import com.store.service.StoreService;

@Controller

public class AdminCrudOperation {
	
	@Autowired
	private StoreService   storeService;
	

		
	
	/*------------------------Listing--------------------*/
	@RequestMapping(value="/listStore", method=RequestMethod.GET)
	public String listStore(Model model,HttpServletRequest request,HttpSession session)
	{
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		List<SaveStore> storeList=storeService.getStores();
		model.addAttribute("storeList", storeList);
		return "listStore";
	}
	
	@RequestMapping(value="/listProduct", method=RequestMethod.GET)
	public String listProduct(Model model,HttpServletRequest request,HttpSession session)
	{
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		List<SaveProduct> productList=storeService.getProducts();
		model.addAttribute("productList", productList);
		return "listProduct";
	}
	
	
	@RequestMapping(value="/listOffer", method=RequestMethod.GET)
	public String listOffer(Model model,HttpServletRequest request,HttpSession session)
	{
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		List<MainOffer> mainOfferList=storeService.getMainOffers();
		model.addAttribute("mainOfferList", mainOfferList);
		return "listOffer";
	}
	
	@RequestMapping(value="/listShoppingCenter", method=RequestMethod.GET)
	public String listShoppingCenter(Model model,HttpServletRequest request,HttpSession session)
	{
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		List<ShoppingCenter> shoppingCenterList=storeService.getShoppingCenters();
		model.addAttribute("shoppingCenterList", shoppingCenterList);
		return "listShoppingCenter";
	}
	
	
	
	@RequestMapping(value="/listExpiredProduct", method=RequestMethod.GET)
	public String listExpiredProduct(Model model,HttpServletRequest request,HttpSession session)
	{
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		
		
		/*Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		
		String today = format1.format(cal.getTime());
		System.out.println(today);*/
		
		
		List<SaveProduct> expiredProductList=storeService.getExpiredProducts();
		model.addAttribute("expiredProductList", expiredProductList);
		return "listExpiredProduct";
	}
	
	
	
	
	@RequestMapping(value="/listExpiredOffer", method=RequestMethod.GET)
	public String listExpiredOffer(Model model,HttpServletRequest request,HttpSession session)
	{
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		/*Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		
		String today = format1.format(cal.getTime());
		System.out.println(today);*/
		
		List<MainOffer> expiredOfferList=storeService.getExpiredOffers();
		model.addAttribute("expiredOfferList", expiredOfferList);
		return "listExpiredOffer";
	}
	
	
	/*------------------------End Listing--------------------*/
	
	
	/*----------------------------------For Store edit operation--------------------------------------------------*/
	
	@RequestMapping(value ="/editStore", method = RequestMethod.GET)
	public String editStore(ModelMap model,HttpServletRequest request) {
	int storeId=Integer.parseInt(request.getParameter("storeId"));
	
	
	model.addAttribute("store",this.storeService.getStoreByIdForEdit(storeId));
   /* model.addAttribute("listPersons", this.personService.listPersons());*/
	return "editStore";
	}
	
	@RequestMapping(value="/editStore", method=RequestMethod.POST)
	public String editStore(@RequestParam("storeImagePath") CommonsMultipartFile storeImagePath, 
			HttpServletRequest request ,@Valid @ModelAttribute("store")SaveStore store, BindingResult result, Model model,final RedirectAttributes redirectAttributes)
	{
//		String si = request.getParameter("storeId");
		String storeName = request.getParameter("storeName");
		String storeProprietor=request.getParameter("storeProprietor");
		
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
		
		
		storeService.updateStore(store);
		
		redirectAttributes.addFlashAttribute("storeList",store);
		
		return "redirect:updateStoreSuccess.html";
		
	}
	
	
	
	@RequestMapping(value="/updateStoreSuccess", method=RequestMethod.GET)
	public String updateMainOfferSuccess(Model model,HttpSession session)
	{
		
		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		return "updateStoreSuccess";
	}
	
	
	
	
	
	@RequestMapping(value ="/deleteStore", method = RequestMethod.GET)
	public String deleteStore(ModelMap model,HttpServletRequest request,final RedirectAttributes redirectAttributes) {
	int storeId=Integer.parseInt(request.getParameter("storeId"));
	
	/*String storeImageName=request.getParameter("storeName").replaceAll(" ","");*/
	try {
		
		
		Store store=storeService.getStoreById(storeId);
		String imagePathToDelete=store.getStoreImagePath();
		
		System.out.println(imagePathToDelete);
		
		String[] parts = imagePathToDelete.split("/");
		String part1 = parts[0]; // 004
		String part2 = parts[1]; // 034556
		String part3 = parts[2];
		System.out.println(part1);
		System.out.println(part2);
		
		File file = new File(request.getSession().getServletContext().getRealPath("/")+"img\\StoreImg\\"+part3);
		file.delete();
		System.out.println(file.getName()+"deleted");
				
		
		storeService.deleteStore(storeId);
		
		List<SaveStore> storeList=storeService.getStores();
		
		
		redirectAttributes.addFlashAttribute("storeList", storeList);
		redirectAttributes.addFlashAttribute("SuccessMsg", "Deleted Successfully  Store ID:"+ storeId +"'s data");
		return "redirect:deleteStoreSuccess.html";
		
	} catch (Exception e) {
		List<SaveStore> storeList=storeService.getStores();
		redirectAttributes.addFlashAttribute("storeList", storeList);
		redirectAttributes.addFlashAttribute("ErrorMsg", "Can not be deleted because Store ID:"+ storeId +" refers some other data");
		e.printStackTrace();
		
		return "redirect:failurePage.html";
	}
	
	}
	
	
	
	
	@RequestMapping(value ="/deleteStoreSuccess", method = RequestMethod.GET)
	public String deleteStoreSucess(ModelMap model,HttpSession session) {

		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
	return "deleteStoreSuccess";
	}
	
	/*----------------------------------End Store edit operation--------------------------------------------------*/	
	
	
	
	
	/*----------------------------------For Product edit operation--------------------------------------------------*/
	
	@RequestMapping(value ="/editProduct", method = RequestMethod.GET)
		public String editProduct(ModelMap model,HttpServletRequest request) {
		
		int productId=Integer.parseInt(request.getParameter("productId"));
		model.addAttribute("saveProduct", this.storeService.getProductById(productId));
		
		return "editProduct";
	}
	
	
	
	@RequestMapping(value="/editProduct", method=RequestMethod.POST)
	public String editProduct(@RequestParam("productImagePath") CommonsMultipartFile productImagePath, HttpServletRequest request ,@Valid @ModelAttribute("saveProduct") SaveProduct saveProduct, 
			BindingResult result, Model model,final RedirectAttributes redirectAttributes) throws ParseException
	{

		String productName = request.getParameter("productName");
		String productDescription = request.getParameter("productDescription");
		int productPriority = Integer.parseInt(request.getParameter("productPriority"));
//    	String offerId=request.getParameter("offerId");
		int storeId=Integer.parseInt(request.getParameter("storeId"));
		/*String productEntryDate=request.getParameter("productEntryDate");*/
		
		
		Date offerStartTime=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("offerStartTime"));
		Date offerEndTime=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("offerEndTime"));
		offerEndTime.setTime(offerEndTime.getTime()+86399000);
		String productType=request.getParameter("productType");
		
		String productImageName=productName.replaceAll(" ","");
		
		String timestamp = new Timestamp(System.currentTimeMillis()).toString();
		
		timestamp = timestamp.substring(0, timestamp.length()-6).replaceAll(":","");
		timestamp=timestamp.replaceAll(" ","_");
		
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
		saveProduct.setProductName(productName);
		saveProduct.setProductDescription(productDescription);
		saveProduct.setProductPriority(productPriority);
		saveProduct.setProductImagePath(productImgPathToDB);
		saveProduct.setStoreId(storeId);
		saveProduct.setProductEntryDate(new Date());
		saveProduct.setOfferStartTime(offerStartTime);
		saveProduct.setOfferEndTime(offerEndTime);
		saveProduct.setProductEntryDate(new Date());
		saveProduct.setProductType(productType);
		
		storeService.updateProduct(saveProduct);
		
		redirectAttributes.addFlashAttribute("product", saveProduct);
		
		
		return "redirect:updateProductSuccess.html";
		
	}
	
	
	
	@RequestMapping(value="/updateProductSuccess", method=RequestMethod.GET)
	public String updateProductSuccess(Model model,HttpSession session)
	{
		
		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		return "updateProductSuccess";
	}
	
	
	
	@RequestMapping(value ="/deleteProduct", method = RequestMethod.GET)
	public String deleteProduct(ModelMap model,HttpServletRequest request,final RedirectAttributes redirectAttributes) {
	int productId=Integer.parseInt(request.getParameter("productId"));
	try {
		
		
		SaveProduct product=storeService.getProductById(productId);
		
		String imagePathToDelete=product.getProductImagePath();
		
		System.out.println(imagePathToDelete);
		
		String[] parts = imagePathToDelete.split("/");
		String part1 = parts[0]; // 004
		String part2 = parts[1]; // 034556
		String part3 = parts[2]; // 034556
		System.out.println(part1);
		System.out.println(part2);
		System.out.println(part3);
		
	
			File fileProduct = new File(request.getSession().getServletContext().getRealPath("/")+"img\\+ProductImg\\"+part3);
			fileProduct.delete();
			System.out.println(fileProduct.getName()+" deleted");
		
		storeService.deleteProduct(productId);
		
		List<SaveProduct> productList=storeService.getProducts();
		redirectAttributes.addFlashAttribute("productList", productList);
		redirectAttributes.addFlashAttribute("SuccessMsg", "Deleted Successfully  Product ID:"+ productId +"'s data");
		
	} catch (Exception e) {
		List<SaveProduct> productList=storeService.getProducts();
		redirectAttributes.addFlashAttribute("productList", productList);
		redirectAttributes.addFlashAttribute("ErrorMsg", "Can not be deleted because Product ID:"+ productId +" refers some other data");
	}
	return "redirect:deleteProductSucess.html";
	}
	
	@RequestMapping(value ="/deleteProductSucess", method = RequestMethod.GET)
	public String deleteProductSucess(ModelMap model,HttpSession session) {

		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
	return "deleteProductSucess";
	}
	
	
	/*----------------------------------End Product edit operation--------------------------------------------------*/
	

	
	
	
	
/*----------------------------------For editMainOffer operation--------------------------------------------------*/
	
	@RequestMapping(value ="/editMainOffer", method = RequestMethod.GET)
		public String editMainOffer(ModelMap model,HttpServletRequest request) {
		
		int mainOfferId=Integer.parseInt(request.getParameter("mainOfferId"));
		model.addAttribute("mainOffer", this.storeService.getMainOfferById(mainOfferId));
		
		return "editMainOffer";
	}
	
	
	
	@RequestMapping(value="/editMainOffer", method=RequestMethod.POST)
	public String editMainOffer(@RequestParam("mainOfferImagePath") CommonsMultipartFile mainOfferImagePath, HttpServletRequest request ,@Valid @ModelAttribute("mainOffer") MainOffer mainOffer, BindingResult result,
			Model model,HttpSession session,final RedirectAttributes redirectAttributes) throws Exception
	{

		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		
		
		
		
		String mainOfferName= request.getParameter("mainOfferName");
		String mainOfferUrl = request.getParameter("mainOfferUrl");
		
		
		
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
		
		mainOffer.setMainOfferName(mainOfferName);
		mainOffer.setMainOfferUrl(mainOfferUrl);
		mainOffer.setMainOfferImagePath(mainOfferImagePathToDB);
		mainOffer.setOfferStartTime(offerStartTime);
		mainOffer.setOfferEndTime(offerEndTime);

		
		
		storeService.updateMainOffer(mainOffer);
		
		
		redirectAttributes.addFlashAttribute("offer",mainOffer);
		/*List<MainOffer> offerImageList=storeService.getMainOfferImage();
		model.addAttribute("offerImageList", offerImageList);*/
		
		return "redirect:updateMainOfferSuccess.html";
		
	}
	
	
	
	@RequestMapping(value="/updateMainOfferSuccess", method=RequestMethod.GET)
	public String updateMainOffer(Model model,HttpSession session)
	{
		
		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		return "updateMainOfferSuccess";
	}
	
	
	
	@RequestMapping(value ="/deleteMainOffer", method = RequestMethod.GET)
	public String deleteMainOffer(ModelMap model,HttpServletRequest request,final RedirectAttributes redirectAttributes) {
	int mainOfferId=Integer.parseInt(request.getParameter("mainOfferId"));
	try {
		
			MainOffer mainoffer=storeService.getMainOfferById(mainOfferId);
			
		
			String imagePathToDelete=mainoffer.getMainOfferImagePath();
			
			System.out.println(imagePathToDelete);
			
			String[] parts = imagePathToDelete.split("/");
			String part1 = parts[0]; // 004
			String part2 = parts[1]; // 034556
			String part3 = parts[2]; // 034556
			System.out.println(part1);
			System.out.println(part2);
			System.out.println(part3);
		
	
			File fileMainOffer = new File(request.getSession().getServletContext().getRealPath("/")+"img\\+MainOfferImg\\"+part3);
			
			fileMainOffer.delete();
			System.out.println(fileMainOffer.getName()+" deleted");
		
		
		
		
		storeService.deleteMainOffer(mainOfferId);
		
		List<MainOffer> mainOfferList=storeService.getMainOffers();
		redirectAttributes.addFlashAttribute("mainOfferList", mainOfferList);
		
		redirectAttributes.addFlashAttribute("SuccessMsg", "Deleted Successfully "+ mainOfferId +"'s data");
		
		//model.addAttribute("SuccessMsg", "Deleted Successfully  Product ID:"+ mainOfferId +"'s data");
	} catch (Exception e) {
		List<MainOffer> mainOfferList=storeService.getMainOffers();
		redirectAttributes.addFlashAttribute("mainOfferList", mainOfferList);
		
		redirectAttributes.addFlashAttribute("ErrorMsg", "Can not be deleted because Offer ID:"+ mainOfferId +" refers some other data");
		
	}
	return "redirect:deleteMainOfferSuccess.html";
	}
	
	
	@RequestMapping(value ="/deleteMainOfferSuccess", method = RequestMethod.GET)
	public String deleteMainOfferSuccess(ModelMap model,HttpSession session) {

		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
	return "deleteMainOfferSuccess";
	}
	
	/*----------------------------------End Main Offer --------------------------------------------------*/
	
	
	
/*----------------------------------For Shopping Center --------------------------------------------------*/
	
	@RequestMapping(value ="/editShoppingCenter", method = RequestMethod.GET)
		public String editShoppingCenter(ModelMap model,HttpServletRequest request,HttpSession session) {
		
		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
		int shoppingCenterId=Integer.parseInt(request.getParameter("shoppingCenterId"));
		model.addAttribute("shoppingCenter", this.storeService.getShoppingCenterById(shoppingCenterId));
		
		return "editShoppingCenter";
	}
	
	
	
	@RequestMapping(value="/editShoppingCenter", method=RequestMethod.POST)
	public String editShoppingCenter(@RequestParam("shoppingCenterImagePath") CommonsMultipartFile shoppingCenterImagePath, HttpServletRequest request ,@Valid @ModelAttribute("shoppingCenter") ShoppingCenter shoppingCenter, 
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
				
				shoppingCenter.setShoppingCenterName(shoppingCenterName);
				shoppingCenter.setShoppingCenterType(shoppingCenterType);
				shoppingCenter.setShoppingCenterCity(shoppingCenterCity);
				shoppingCenter.setShoppingCenterPincode(shoppingCenterPincode);
				shoppingCenter.setShoppingCenterImagePath(shoppingCenterImagePathToDB);
				shoppingCenter.setShoppingCenterEntryDate(new Date());
				
				
				storeService.updateShoppingCenter(shoppingCenter);
				
				/*List<ShoppingCenter> shoppingCenterList=storeService.getShoppingCenterList();
				model.addAttribute("shoppingCenterList", shoppingCenterList);*/
				
				redirectAttributes.addFlashAttribute("shoppingCenter", shoppingCenter);
				
				return "redirect:updateShoppingCenterSuccess.html";
				
			}
			
			@RequestMapping(value="/updateShoppingCenterSuccess", method=RequestMethod.GET)
			public String updateShoppingCenterSuccess(Model model,HttpSession session)
			{
				
				
				if (session !=null) {
					
					 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
					
					  if (userWithRole !=null) {
						  model.addAttribute("loggedInUser",userWithRole );
					  }
				}
				
				
				return "updateShoppingCenterSuccess";
			}
	
	
	
	@RequestMapping(value ="/deleteShoppingCenter", method = RequestMethod.GET)
	public String deleteShoppingCenterSuccess(ModelMap model,HttpServletRequest request,final RedirectAttributes redirectAttributes,HttpSession session) {
		
		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
		
	int shoppingCenterId=Integer.parseInt(request.getParameter("shoppingCenterId"));
	try {
		
		
		
		
		storeService.deleteShoppingCenter(shoppingCenterId);
		
		List<ShoppingCenter> shoppingCenterList=storeService.getShoppingCenterList();
		
		redirectAttributes.addFlashAttribute("shoppingCenterList", shoppingCenterList);
		
		redirectAttributes.addFlashAttribute("SuccessMsg", "Deleted Successfully Shopping Center Id:"+ shoppingCenterId +"'s data");
		
		//model.addAttribute("SuccessMsg", "Deleted Successfully  Product ID:"+ mainOfferId +"'s data");
	} catch (Exception e) {
		
		List<ShoppingCenter> shoppingCenterList=storeService.getShoppingCenterList();
		
		redirectAttributes.addFlashAttribute("shoppingCenterList", shoppingCenterList);
		
		redirectAttributes.addFlashAttribute("ErrorMsg", "Can not be deleted because Shopping Center ID:"+ shoppingCenterId +" refers some other data");
		
	}
	return "redirect:deleteShoppingCenterSuccess.html";
	}
	
	
	@RequestMapping(value ="/deleteShoppingCenterSuccess", method = RequestMethod.GET)
	public String deleteShoppingCenterSuccess(ModelMap model,HttpSession session) {

		if (session !=null) {
			
			 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
		}
	return "deleteShoppingCenterSuccess";
	}
	
	/*----------------------------------End Shopping center --------------------------------------------------*/
	
	
	
	
	
	
	

}
