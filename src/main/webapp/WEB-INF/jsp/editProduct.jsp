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
       Edit Product
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
               	
                   
                    <li><h6><font color="white">Welcome ${nameAdmin}</font></h6></li>
                    <li><a href="logout.html">Logout</a> </li>
                  
                
                    
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
                        <li>Edit Product</li>
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
                                <li>
                                    <a href="addStore.html">Add Store</a>
                                </li>
                                <li  class="active">
                                    <a href="addProduct.html">Add Product</a>
                                </li>
								<li>
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
      
						<center> <h1>Edit Product</h1></center>
						 <!-- //Need to change -->
						 <hr>
					      	 <form:form  action="editProduct.html" method="post" modelAttribute="saveProduct" enctype="multipart/form-data">
					           
								<div class="table-responsive">
								  <table  class="table">
									<tr>
						            	<td>Product ID</td>
						                <td><form:input id="productId" path="productId"  class="form:input-large"  required="true" readonly="true"/></td>
						                
						               
						            </tr>
						            
									<tr>
										<td>Product Name</td>
										<td><form:input  path="productName" id="productName" required="true" /></td>
									</tr>
									
					
						        	<tr>
						          		<td>Product Description</td>
						                <td><form:textarea path="productDescription" id="productDescription" class="form-Control"  required="true"/></td>
						           </tr>
						
						            <tr>
						            	<td>Product Priority</td>
						                <td><form:input path="productPriority" id="productPriority" class="form-Control"  required="true"/></td>
						                
						            </tr>
						              
						          	 <tr>
										<th>Product Type</th>
									</tr>
									
									<tr>
										<td>Electronics</td>
										<td><form:radiobutton path="productType" id="electronics"  value="mobile" />Mobile</td>
										<td><form:radiobutton path="productType" id="electronics" value="computer" />Computer</td>
										<td><form:radiobutton path="productType" id="electronics" value="homeAppliance" />Home Appliances</td>
									</tr>
									
									<tr>
										<td>Entertainment</td>
										<td><form:radiobutton path="productType" id="entertainment" value="cinema" />Cinema</td>
										<td><form:radiobutton path="productType" id="entertainment" value="game" />Games</td>
										<td><form:radiobutton path="productType" id="entertainment" value="play" />Plays</td>
									</tr>
									
									
									
									<tr>
										<td>Fashion</td>
										<td><form:radiobutton path="productType" id="fashion" value="men" />Men Fashion</td>
										<td><form:radiobutton path="productType" id="fashion" value="women" />Women Fashion</td>
										<td><form:radiobutton path="productType" id="fashion" value="kids" />Kids Fashion</td>
										<td><form:radiobutton path="productType" id="fashion" value="baby" />Baby Fashion</td>
										<td><form:radiobutton path="productType" id="fashion" value="watch" />Watch Fashion</td>
										<td><form:radiobutton path="productType" id="fashion" value="luggageBag" />Luggage And Bags Fashion</td>
										<td><form:radiobutton path="productType" id="fashion" value="beauty" />Beauty Fashion</td>
									</tr>
									
									<tr>
										<td>Food And Beverages</td>
										<td><form:radiobutton path="productType" id="food" value="bakery" />Bakery</td>
										<td><form:radiobutton path="productType" id="food" value="restaurant" />Restaurants</td>
										<td><form:radiobutton path="productType" id="food" value="pub" />pub</td>
									
									</tr>
									
									<tr>
										<td>Health</td>
										<td><form:radiobutton path="productType" id="health" value="clinic" />Clinic</td>
										<td><form:radiobutton path="productType" id="health" value="hospital" />Hospital</td>
										<td><form:radiobutton path="productType" id="health" value="pharmacy" />Pharmacy</td>
										<td><form:radiobutton path="productType" id="personalCare" value="spaPersonalCare" />Spa Personal Care</td>
									</tr>
								
									<tr>
										<td>Home Needs</td>
						                <td><form:radiobutton path="productType" id="appliences" value="furniture" />Furniture</td>
						                <td><form:radiobutton path="productType" id="appliences" value="grocery" />Grocery Items</td>
						                <td><form:radiobutton path="productType" id="appliences" value="kitchen" />Kitchen Appliance</td>
						                
						            </tr>
					            
						            <tr>
						            	<td>Shopping Centers</td>
						                <td><form:radiobutton path="productType" id="shopingcenters" value="manrti" />Mantri Mall</td>
						                <td ><form:radiobutton path="productType" id="shopingcenters" value="orion" />Orion Mall</td>
						                <td><form:radiobutton path="productType" id="shopingcenters" value="gopalan" />Gopalan Archage</td>
						                
						                <td>Shopping Streets</td>
						                <td><form:radiobutton path="productType" id="shopingstreets" value="gandhiBazar" />Gandhi Bazar</td>
						                <td ><form:radiobutton path="productType" id="shopingstreets" value="malleshwaram" />Malleshwaram </td>
						            </tr>
						            
						            <tr>
										<td>Sports</td>
						                <td><form:radiobutton path="productType" id="sports" value="sportsApparel" />Sports Apparel</td>
						                <td><form:radiobutton path="productType" id="sports" value="sportsShoes" />Sports Shoes</td>
						                <td><form:radiobutton path="productType" id="sports" value="sportsAccessories" />Sports Accessories</td>
						                
						            </tr>
						            
						            
						            <tr>
						            	<td>Upload Product Picture</td>
						                <td><form:input id="productImagePath" path="productImagePath" type="file" class="form:input-large"  required="true"/></td>
						           </tr>
						
						
									
									
									<tr>
										<td>Offer Start Time</td>
										<td><form:input type="date"  path="offerStartTime" id="offerStartTime" required="true"  placeholder="yyyy-MM-dd" /></td>
									</tr>
									
									<tr>
										<td>Offer End Time</td>
										<td><form:input type="date"  path="offerEndTime" id="offerEndTime" required="true" placeholder="yyyy-MM-dd"/></td>
									</tr>
						 
						 			<tr>
										<td>Product Entry Date</td>
										<td><form:input type="date"  path="productEntryDate" id="productEntryDate" readonly="true"/></td>
									</tr>
									
									<tr>
						            	<td>StoreID</td>
						                <td><form:input id="storeId" path="storeId"  class="form:input-large"  required="true" readonly="true"/></td>
						               
						            </tr>
						        	
									<tr>
									<td></td>
						       			<td><button type="submit"  class="btn btn-info" >UPDATE PRODUCT</button></td>
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
    <!-- *** SCRIPTS TO INCLUDE ***
 _________________________________________________________ -->
    <script src="js/jquery-1.11.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.cookie.js"></script>
    <script src="js/waypoints.min.js"></script>
    <script src="js/modernizr.js"></script>
    <script src="js/bootstrap-hover-dropdown.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/front.js"></script>


</body>

</html>