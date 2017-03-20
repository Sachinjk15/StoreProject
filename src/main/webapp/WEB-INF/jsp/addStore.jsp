<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="robots" content="all,follow">
    <meta name="googlebot" content="index,follow,snippet,archive">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Obaju e-commerce template">
    <meta name="author" content="Ondrej Svestka | ondrejsvestka.cz">
    <meta name="keywords" content="">

    <title>
        Add Store
    </title>

    <meta name="keywords" content="">

    <link href='http://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100' rel='stylesheet' type='text/css'>

    <!-- styles -->
    <link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/owl.carousel.css" rel="stylesheet">
    <link href="css/owl.theme.css" rel="stylesheet">

    <!-- theme stylesheet -->
    <link href="css/style.default.css" rel="stylesheet" id="theme-stylesheet">

    <!-- your stylesheet with modifications -->
    <link href="css/custom.css" rel="stylesheet">

    <script src="js/respond.min.js"></script>

    <link rel="shortcut icon" href="favicon.png">


</head>

<body>
    <!-- *** TOPBAR ***
 _________________________________________________________ -->
    <div id="top">
        <div class="container">
            
            <div  data-animate="fadeInDown" class="pull-right">
                <ul class="menu">
               	
                   
                    <c:choose>
                  		<c:when test="${empty loggedInUser.name}">
                           		<li><a href="login.html" >Login</a> </li>
                  		</c:when>
                  		<c:otherwise>
                  				<li><font color="white">Hello ${loggedInUser.name}</font></li>
                  				<li><a href="logout.html" >Logout</a></li>
                  		</c:otherwise>
                  </c:choose> 
                  
                
                    
                </ul>
            </div>
        </div>
    </div>

 
 
  <div id="all">

        <div id="content">
            <div class="container-fluid">
				 <div class="col-md-12">
                    <ul class="breadcrumb">
                        <li><a href="#">Admin</a>
                        </li>
                        <li>Add Store</li>
                    </ul>

                </div>
              
                <div class="col-md-2">
                    <!-- *** PAGES MENU ***
 _________________________________________________________ -->
                    <div class="panel panel-default sidebar-menu">

                        <div class="panel-heading">
                            <h3 class="panel-title">Pages</h3>
                        </div>

                        <div class="panel-body">
                            <ul class="nav nav-pills nav-stacked">
                                <li class="active">
                                    <a href="addStore.html">Add Store</a>
                                </li>
                                <li>
                                    <a href="addProduct.html">Add Product</a>
                                </li>
								<li >
                                    <a href="addMainOffer.html">Add Main Offer</a>
                                </li>
								
								 <li >
                                    <a href="addShoppingCenter.html">Add Shopping Center</a>
                                </li>
                            
                                <li >
                                    <a href="listStore.html">List Stores</a>
                                </li>
                                <li >
                                    <a href="listProduct.html">List Products</a>
                                </li>
                                
                                 <li >
                                    <a href="listOffer.html">List Main Offers</a>
                                </li>
                                
                                 <li >
                                    <a href="listShoppingCenter.html">List Shopping Centers</a>
                                </li>
                                
                              
                                
                                 <li >
                                    <a href="listExpiredProduct.html">List Expired Products</a>
                                </li>
                                
                                 <li >
                                    <a href="listExpiredOffer.html">List Expired Offers</a>
                                </li>
                            </ul>

                        </div>
                    </div>

                    <!-- *** PAGES MENU END *** -->


              
                </div>

                <div class="col-md-10">
                    <div class="box" id="contact">
                    	 
						<h3>${msg}</h3>
      
				 <center><h1>Add New Store</h1></center>
				 <hr>
			    
			      	 <form:form 
			                   action="addStore.html" method="post" modelAttribute="store" enctype="multipart/form-data">
			                   
			                   <%-- <form:input type="hidden" path="storeId" id="id"/> --%>
			         
						
						<div class="table-responsive">
								<table class="table">
								
									
						            <tr>
						             	<td><label for="shoppingCenter">ShoppingCenter Id: </label> </td>
						                <td><form:input path="shoppingCenterId" id="shoppingCenterId" class="form-Control" value="${shoppingCenterId}" required="true"/></td>
						                 <td> To know Shopping Center Id <a href="searchShoppingCenter.html"> Click Here</a></td>
						                 <td style="color:red;" >Note*** If Store not regards to any Shopping Center please make sure ID is 1.. </td>
						            </tr> 
									<tr>
										<td><label for="storeName">Store Name: <font color="red">*</font></label> </td>
										<td><form:input  path="storeName" id="storeName" required="true" /></td>
									</tr>
									<tr>
											
										<td><label for="storeProprietor">Store Owner Name: <font color="red">*</font></label> </td>		
										<td><form:input  path="storeProprietor" id="storeProprietor" required="true" /></td>
									</tr>
									<tr>
										<th>Store Type<font color="red">*</font></th>
									</tr>
									
									<tr>
										<td><label for="electronics">Electronics: </label> </td>
										<td><form:checkbox path="storeType" id="electronics"  value="mobileElectronics" />Mobile Shop</td>
										<td><form:checkbox path="storeType" id="electronics" value="computerElectronics" />ComputerShop</td>
										<td><form:checkbox path="storeType" id="electronics" value="homeApplianceElectronics" />Home Appliance</td>
									
									</tr>
									
									<tr>
										<td><label for="entertainment">Entertainment: </label> </td>
										<td><form:checkbox  path="storeType" id="entertainment" value="cinemaEntertainment" />Cinemas</td>
										<td><form:checkbox  path="storeType" id="entertainment" value="gameEntertainment" />Games</td>
										<td><form:checkbox path="storeType" id="entertainment" value="playEntertainment" />Plays</td>
										
									</tr>
									
									
									
									<tr>
										<td><label for="fashion">Fashion: </label> </td>
										<td><form:checkbox path="storeType" id="fashion" value="menFashion" />Men Fashion</td>
										<td><form:checkbox path="storeType" id="fashion" value="womenFashion" />Women Fashion</td>
										<td><form:checkbox path="storeType" id="fashion" value="kidsFashion" />KidsFashion</td>
										<td><form:checkbox path="storeType" id="fashion" value="babyFashion" />Baby Fashion</td>
										
										<td><form:checkbox path="storeType" id="fashion" value="watchFashion" />Watch Fashion</td>
										<td><form:checkbox path="storeType" id="fashion" value="luggageFashion" />Luggage and Bags Fashion</td>
										<td><form:checkbox path="storeType" id="fashion" value="beautyFashion" />Beauty Fashion</td>
									
									</tr>
									
									<tr>
										<td><label for="food">Food:  </label></td>
										<td><form:checkbox path="storeType" id="food" value="bakeryFood" />Bakery</td>
										<td><form:checkbox path="storeType" id="food" value="restaurantFood" />Restaurant</td>
										<td><form:checkbox path="storeType" id="food" value="pubFood" />Pubs</td>
									</tr>
									
									<tr>
										<td><label for="health">Health & Personal Care: </label> </td>
										<td><form:checkbox path="storeType" id="health" value="clinicHealth" />Clinic</td>
										<td><form:checkbox path="storeType" id="health" value="hospitalHealth" />Hospital</td>
										<td><form:checkbox path="storeType" id="health" value="pharmacyHealth" />Pharmacy</td>
										
										<td><form:checkbox path="storeType" id="health" value="spaPersonalCare" />Spa Personal Care</td>
									</tr>
								
								<tr>
									<td><label for="appliences">Home Needs: </label> </td>
					                <td><form:checkbox path="storeType" id="appliences" value="furnitureHomeNeeds" />HouseHold Items</td>
					                <td><form:checkbox path="storeType" id="appliences" value="kitchenHomeNeeds" />Kitchen Appliances</td>
					                <td><form:checkbox path="storeType" id="appliences" value="groceryHomeNeeds" />Grocery Items</td>
					            </tr>
					            
					            
					           
					            <tr>
					            	
					            	<td><label for="shopingcenters">Shopping Centers: </label> </td>
					            	<td><font color="red">If this Store belongs to Shopping Centers please make it Check Mark,If not don't mark it</font></td>
					                <td><form:checkbox path="storeType" id="shopingcenters" value="shoppingMall" />Shopping Mall</td>
					               <td><form:checkbox path="storeType" id="shopingcenters" value="shoppingStreet" />Shopping Street</td>
					            </tr>
					            
					            
					            
								
								<tr>
					            	<td><label for="sports">Sports: </label> </td>
					                <td><form:checkbox path="storeType" id="sports" value="sportsApparelSport" />Sports Apparel</td>
					                <td ><form:checkbox path="storeType" id="sports" value="sportsShoesSport" />Sports Shoes</td>
					                 <td ><form:checkbox path="storeType" id="sports" value="sportsAccessoriesSport" />Sports Accessories</td>
					            </tr>
					            
					            
					        	<tr>
					          	
					          		<td><label for="storeDescription">Description: <font color="red">*</font></label> </td>
					                <td><form:textarea path="storeDescription" id="storeDescription" class="form-Control"  required="true"/></td>
					           </tr>
					
					            <tr>
					            
					            	<td><label for="storePriority">Priority: <font color="red">*</font></label> </td>
					                <td><form:input  path="storePriority" id="storePriority" class="form-Control" required="true"
									    oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);"
									    type = "number"
									    maxlength = "10"
									 /></td>
					            </tr>
					            
					            <tr>
					            	<td><label for="storeLandLineNumber">Landline Number: <font color="red">*</font></label> </td>
					                <%-- <td><form:input type="number" path="storeLandLineNumber" id="storeLandLineNumber" class="form-Control"  max="12" required="true"/></td> --%>
					                <td><form:input  path="storeLandLineNumber" id="storeLandLineNumber" class="form-Control" required="true"
									    oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);"
									    type = "number"
									    maxlength = "10"
									 /></td>
					            </tr>
					            
					            <tr>
					                <td><label for="storeMobileNumber">Mobile Number:<font color="red">*</font></label> </td>
					                <%-- <td><form:input type="number" path="storeMobileNumber" id="storeMobileNumber" class="form-Control" max="10" required="true"/></td> --%>
					                <td><form:input  path="storeMobileNumber" id="storeMobileNumber" class="form-Control" required="true"
									    oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);"
									    type = "number"
									    maxlength = "10"
									 /></td>
					            </tr>
					            
					            <tr>
					                <td><label for="storeAddress">Store Address: <font color="red">*</font></label> </td>
					                <td><form:input path="storeAddress" id="storeAddress" class="form-Control" required="true" /></td>
					                 <td><form:errors path="storeAddress" cssStyle="color:#ff0000;" /></td>
					            </tr>
					            
					             <tr>
					                <td><label for="storeArea">Store Area: <font color="red">*</font></label> </td>
					                <td><form:input path="storeArea" id="storeArea" class="form-Control"  required="true"/></td>
					                <td><form:errors path="storeArea" cssStyle="color:#ff0000;" /></td>
					            </tr>
					            	
					            <tr>
					             	<td><label for="storeCity">Store City: <font color="red">*</font></label> </td>
					                <td><form:input path="storeCity" id="storeCity" class="form-Control"  required="true"/></td>
					                
					            </tr>
						
					        	  <tr>
					             	<td><label for="storePincode">Store Pincode: <font color="red">*</font></label> </td>
					               <%--  <td><form:input type="number" path="storePincode" id="storePincode" class="form-Control" max="6" required="true"/></td> --%>
					                
					                <td><form:input  path="storePincode" id="storePincode" class="form-Control" required="true"
									    oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);"
									    type = "number"
									    maxlength = "6"
									 /></td>
					                
					            </tr>
					
					            <tr>
					            	<td><label for="storeImage">Upload Store Picture: <font color="red">*</font></label> </td>
					                <td><form:input id="storeImagePath" path="storeImagePath" type="file" class="form:input-large"  required="true"/></td>
					           </tr>
					           
					            <tr>
					             	<td><label for="lattitude_longitude">Store Lattitude And Longitude : <font color="red">*</font></label> </td>
					                <td><form:input path="lattitude_longitude" id="lattitude_longitude" class="form-Control"  required="true"/></td>
					               
					            </tr> 
					           
								
								 <tr>
					             	<td><label for="storeTag">Store Tag(Available Products): <font color="red">*</font></label> </td>
					                <td><form:input path="storeTag" id="storeTag" class="form-Control"  required="true"/></td>
					                <td><form:input type="date"  path="storeEntryDate" id="storeEntryDate" hidden="true" /></td>
					            </tr> 
					            
					            
					            
					        	
								<tr>
									<td></td>
									<td></td>
					       			<td><button type="submit"  class="btn btn-info" >ADD STORE</button></td>	 	
					       	   </tr> 
								</table>
							</div>
							
					            
					   	 </form:form>
                    </div>
               </div>
                           
            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->
 </div>
    <!-- /#all -->
    
    <script type="text/javascript">
 $(document).ready(function() {
	  $('#addProductForm').validate({
		  rules:{
			  
			  storeName:{
				  required:true,
				  minlength:4
			  },
			  
			  storeDescription:{
				  required:true,
				  minlength:10,
				  maxlength:200
				  
			  },
			 
		  },
		  messages: {
			  storeName:{
				  required: "Please Enter Store Name !!!",
	              minlength: "Please Enter Atleast 10 Char Long !!!"
			  },
			  storeDescription:{
				  required: "Please Enter Store Description !!!",
	              minlength: "Please Enter Atleast 10 Char Long !!!",
	              maxlenght: "your Message exceeds max 200 length"
				  
			  },
			  
			  
	        }
		  
	  });
	});
 </script>
    <!-- *** SCRIPTS TO INCLUDE ***
 _________________________________________________________ -->
    <script src="js/jquery-1.11.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.cookie.js"></script>
    <script src="js/waypoints.min.js"></script>
    <script src="js/modernizr.js"></script>
    <script src="js/jquery.validate.js"></script>
    <script src="js/bootstrap-hover-dropdown.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/front.js"></script>


</body>

</html>