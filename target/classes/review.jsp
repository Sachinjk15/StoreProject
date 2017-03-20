<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form:form  action="review.html" method="post" modelAttribute="saveReview">
					           
								
								  <table  >
						            
									<tr>
										<td>Enter Your Review</td>
										<td><form:input  path="reviewDescription" id="reviewDescription" required="true" /></td>
									</tr>
									
					
						             <tr>
						            	<td>Review Rating</td>
						                <td><form:select path="reviewRating" id="reviewRating" class="form-Control"  required="true">
						                	<option value="1">1</option>
						                	<option value="2">2</option>
						                	<option value="3">3</option>
						                	<option value="4">4</option>
						                	<option value="5">5</option>
						                </form:select></td>
						                <td>
						                
						            </tr>
									
									<tr>
										<td>Is Liked</td>
										<td><form:radiobutton path="isLiked" id="isLiked"  value="true" />True</td>
										<td><form:radiobutton path="isLiked" id="isLiked" value="false" />False</td>
									</tr>
									
						        	<tr>
						        		
										<td><form:input   path="storeId" id="storeId"  value="${store.getStoreId()}"  hidden="true"/></td>
									</tr> 
									
									<tr>
						        		<td>User Id</td>
										<td><form:input   path="userID" id="userID"  /></td>
									</tr>  
									
									<tr>
										<td></td>
						       			<td> <input type="submit" value="Done" ></td>
						       	   </tr> 
							</table>
								
						            
					   	 </form:form>
			         

</body>
</html>