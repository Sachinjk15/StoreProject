package com.store.controller.GlobelException;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobelExceptionHandler {
	
	
	private static final Logger logger = LoggerFactory.getLogger(GlobelExceptionHandler.class);
	
	@ExceptionHandler(value=SQLException.class)
	public String handleSQLException(HttpServletRequest request, Exception ex){
		logger.error("SQLException handler executed");
		return "exception/sqlException";
	}
	
	
	
	
	
	
	
	
/*---------------------------For Exception-------------------------------------*/
	
	
	/*For Null Pointer Exception page*/
	/*@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Exception e)
	{
	  // model.addAttribute("exception",e);
		return "exception/nullPointerException";
	}*/
	
	
	
	/*For IO Exception page*/
	@ExceptionHandler(value=IOException.class)
	public String handleIOException(Exception e)
	{
	  // model.addAttribute("exception",e);
		return "exception/ioException";
	}
	
	
	/*For IO Exception page*/
	@ExceptionHandler(value=ParseException.class)
	public String handleParseException(Exception e)
	{
	  // model.addAttribute("exception",e);
		return "exception/parseException";
	}
	
	
	/*@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value=Exception.class)
	public String handleBadRequestException(Exception e)
	{
	  // model.addAttribute("exception",e);
		return "exception/400";
	}
	
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ExceptionHandler(value=Exception.class)
	public String handleNotFoundException(Exception e)
	{
	  // model.addAttribute("exception",e);
		return "exception/404";
	}
	
	
	For Exception page
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String handleInternalServerErrorException(Exception e)
	{
	  // model.addAttribute("exception",e);
		return "exception/500";
	}
	
	@ResponseStatus(value=HttpStatus.SERVICE_UNAVAILABLE)
	@ExceptionHandler(value=Exception.class)
	public String handleServerUnavalableException(Exception e)
	{
	  // model.addAttribute("exception",e);
		return "exception/503";
	}*/
	
	
	/*---------------------------For Exception in web.xml-------------------------------------*/
	/*For 404 page*/
	@RequestMapping(value="/404", method=RequestMethod.GET)
	public String Error404(Model model) {			
		
		return "exception/404";
	}
	
	
	/*For 500 page*/
	@RequestMapping(value="/500", method=RequestMethod.GET)
	public String Error500(Model model) {			
		
		return "exception/500";
	}
	
	
	
	/*For 503 page*/
	@RequestMapping(value="/503", method=RequestMethod.GET)
	public String Error503(Model model) {			
		
		return "exception/503";
	}
	/*---------------------------End Exception-------------------------------------*/

}
