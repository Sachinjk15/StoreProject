package com.store.controller;


import java.util.List;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;
import com.store.model.User;
import com.store.model.UserLogin;
import com.store.model.UserWithRole;
import com.store.service.MailService;
import com.store.service.UserService;

@Controller
@SessionAttributes("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	
	@Autowired
	private MailService mailService; 
	
	
	/*--------------------For Registration--------------------------------*/
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signup(Model model) {
		User user = new User();	
		model.addAttribute("user", user);	
		return "signup";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String signup(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {		
		if(result.hasErrors()) {
			return "signup";
		} else if(userService.findByUserName(user.getEmail())) {
			model.addAttribute("message", "User Email Already exists !!!");
			return "signup";
		}else {
			userService.save(user);
			model.addAttribute("message", "Successfully resistered..please Login!");
			return "redirect:successRegistration.html";
		}
	}
	
	@RequestMapping(value="/successRegistration", method=RequestMethod.GET)
	public String successRegistration(Model model) {
			
		return "successRegistration";
	}

	
	/*--------------------For Login--------------------------------*/
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model,@ModelAttribute("userLogin") UserLogin userLogin) {			
		
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute("userLogin") UserLogin userLogin, BindingResult result,@RequestParam String email,
			ModelMap model,HttpServletRequest request, HttpSession session) {
		
	/*	if (result.hasErrors()) {
			model.put("errorMessage","Please Enter Required Credentials");
			return "login";
		} else {*/
			try {
				boolean found = userService.findByLogin(userLogin.getEmail(), userLogin.getPassword());
				
				if (found & userService.findRoleOfUser(email).getRole().equals("user")) {	
					
					
					
						//model.put("name", userName);
						
						UserWithRole userWithRole = userService.findRoleOfUser(email);
						
						session.setAttribute("loggedInUser", userWithRole);
						
						session.setAttribute("isLogin", "yes");
						model.addAttribute("loggedInUser", userWithRole);
						
						
					return "redirect:index.html";
						
					
					
					
				}else if(found & userService.findRoleOfUser(email).getRole().equals("admin"))
				{
					model.put("nameAdmin", userLogin.getUserName());
					
					UserWithRole userWithRole = userService.findRoleOfUser(email);
					
					session.setAttribute("loggedInUser", userWithRole);
					
					session.setAttribute("isLogin", "yes");
					
					model.addAttribute("loggedInUser", userWithRole);
					
					return "adminPage";
				}
				else {	
					model.put("errorMessage","Invalid Credentials");
					return "login";
				}
			} catch (Exception e) {
				model.put("errorMessage","Invalid Credentials");
				return "login";
			}
		/*}*/
		
	}
	
	
	
	/*--------------------For Logout--------------------------------*/
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(ModelMap model,HttpServletRequest request) {		
		
		HttpSession session=request.getSession(false);
		if(session != null)
		{
			session.removeAttribute("loggedInUser");;
			
		}
	
		return "logout";//returned page to logout
	}
	
	
	
	
	

	/*For admin page*/
	@RequestMapping(value="/adminPage", method=RequestMethod.GET)
	public String adminPage(Model model,HttpSession session) 
	{		
		 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
		 
		if (session !=null) {
			
			
			
			  if (userWithRole !=null) {
				  model.addAttribute("loggedInUser",userWithRole );
			  }
			  
			  
			 
		}
		
		
		
		if(userWithRole.getRole().equals("admin"))
		  {
			  return "adminPage";
		  }
		return "redirect:permissionDenied.html";
		
		
	}
	
	
	@RequestMapping(value="/permissionDenied", method=RequestMethod.GET)
	public String permissionDenied(Model model,HttpSession session) {	
		
		 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
		 
			if (session !=null) {
				
				
				
				  if (userWithRole !=null) {
					  model.addAttribute("loggedInUser",userWithRole );
				  }
				  
				  
				 
			}
		
		return "exception/permissionDenied";
	}
	
	
	
	
	@RequestMapping(value="/location", method=RequestMethod.GET)
	public String locationFinding() {		
		
		return "location";
	}
	
	@RequestMapping(value="/location", method=RequestMethod.POST)
	public String locationFinding(ModelMap model,HttpServletRequest request,HttpSession session) {	
		
		String zipcode=request.getParameter("location");
		
		String currentCity=request.getParameter("currentCity");
		
		System.out.println("Current City :"+currentCity);
		
		System.out.println("Current Pincode :"+zipcode);
		
		
		
		session.setAttribute("currentCity", currentCity);
		session.setAttribute("location", zipcode);
		
		session.setAttribute("isLocationFind", "yes");
		
		
		return "redirect:index.html";
	}
	
	

	@RequestMapping(value="/pincodeChange", method=RequestMethod.GET)
	public String pincodeChange(HttpSession session,Model model) {	
		
		 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
		 
			if (session !=null) {
				
				
				
				  if (userWithRole !=null) {
					  model.addAttribute("loggedInUser",userWithRole );
				  }
				  
				  
				 
			}
		model.addAttribute("currentPincode", session.getAttribute("location"));
		return "pincodeChange";
	}
	
	@RequestMapping(value="/pincodeChange.html", method=RequestMethod.POST)
	public String pincodeChanged(HttpSession session,Model model,HttpServletRequest request,@RequestParam("changedPincode") String pincode) {		
		
		
		/*String changedPincode=request.getParameter("changePincode");*/
		
		 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
		 
			if (session !=null) {
				
				
				
				  if (userWithRole !=null) {
					  model.addAttribute("loggedInUser",userWithRole );
				  }
				  
				  
				 
			}
		
		session.setAttribute("location", pincode);
		
		return "redirect:index.html";
	}
	
	

	@RequestMapping(value="/forgotPassword", method=RequestMethod.GET)
	public String forgotPassword(HttpSession session,Model model) {	
		
		 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
		 
			if (session !=null) {
				
				
				
				  if (userWithRole !=null) {
					  model.addAttribute("loggedInUser",userWithRole );
				  }
				  
				  
				 
			}
		//model.addAttribute("currentPincode", session.getAttribute("location"));
		return "forgotPassword";
	}
	
	
	@RequestMapping(value="/forgotPassword.html", method=RequestMethod.POST)
	public String forgotPassword1(HttpSession session,Model model,@RequestParam(value="f_email") String email,final RedirectAttributes redirectAttributes) {	
		
		 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
		 
			if (session !=null) {
				
				
				
				  if (userWithRole !=null) {
					  model.addAttribute("loggedInUser",userWithRole );
				  }
				  
				  
				 
			
		//model.addAttribute("currentPincode", session.getAttribute("location"));
			
			
			}
			
			boolean checkEmail=userService.searchEmail(email);
			if(checkEmail)
			{
			
				mailService.sendMail(email);
				
				redirectAttributes.addFlashAttribute("emailSent","Please check your "+email+" registerd email to reset your Password....");
			}
			else
			{
				redirectAttributes.addFlashAttribute("emailNotRegistered",email+" this email-id is not registered..!!!");
			}
			
			
			
			
			return "redirect:login.html";
	}
	
	
	

	@RequestMapping(value="/resetPassword", method=RequestMethod.POST)
	public String resetPassword(HttpSession session,Model model ,final RedirectAttributes redirectAttributes,HttpServletRequest request) {	
		
		 UserWithRole userWithRole= (UserWithRole) session.getAttribute("loggedInUser");
		 
			if (session !=null) {
				
				
				
				  if (userWithRole !=null) {
					  model.addAttribute("loggedInUser",userWithRole );
				  }
			
			}
			
			String userPassword=request.getParameter("password");
			String userEmail=request.getParameter("userEmail");
			
			try {
				userService.resetPassword(userEmail,userPassword);
			} catch (Exception e) {
				redirectAttributes.addFlashAttribute("resetFailure","Unable to reset your Password please try again...");
			}
			
			
			
			System.out.println(userEmail);
			System.out.println(userPassword);
			
			//mailService.sendMail(email);
			
			redirectAttributes.addFlashAttribute("resetSucces","You have reset your Password please login....");
			
			return "redirect:login.html";
	}
	
	
	
/*---------------------------Search Email-------------------------------------*/
	
	@RequestMapping(value = "/searchEmail", method = RequestMethod.POST,headers="Accept=*/*")
	@ResponseBody 
	public boolean searchEmail(@RequestParam("f_email") String email) {

		
			//List<String> storeList=storeService.getStoreNameForSearch(query);
			
			//String searchList = new Gson().toJson(storeList);
		
			boolean checkEmail=userService.searchEmail(email);
			
			return checkEmail;
			
		
	}

	
	/*---------------------------End Search-------------------------------------*/
	
	
}
