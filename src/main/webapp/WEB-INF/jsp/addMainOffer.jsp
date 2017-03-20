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
        Add Main Offer
    </title>

  
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

	 <script src="js/jquery-1.11.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
 

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
                        <li>Add Main Offer</li>
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
                                <li>
                                    <a href="addProduct.html">Add Product</a>
                                </li>
								<li class="active">
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
      
						<center> <h1>Add Main Offer</h1></center>
						 <!-- //Need to change -->
						 <hr>
						 <div class="container">
							  <ul class="nav nav-tabs">
							    <li class="active"><a href="#home">For Single Offer</a></li>
							    <li><a href="#menu1">For Multiple Offer</a></li>
							  </ul>
						
						 <div class="tab-content">
						 	 <div id="home" class="tab-pane fade in active">
							      	 <form:form  action="addMainOffer.html" method="post" modelAttribute="mainOffer" enctype="multipart/form-data">
							           
										<div class="table-responsive">
										  <table  class="table">
											
								            
											<tr>
												<td>Main Offer Name</td>
												<td><form:input  path="mainOfferName" id="mainOfferName" required="true" /></td>
											</tr>
											
											<tr>
												<th>URL For Offer</th>
											</tr>
								
								            <tr>
								            	<td>For Electronics</td>
								                <td><form:radiobutton path="mainOfferUrl" id="mobileElectronics" value="mobileShop.html?type=mobileElectronics" />Mobile Shop</td>
								                <td><form:radiobutton path="mainOfferUrl" id="computerElectronics" value="computerShop.html?type=computerElectronics" />Computer Shop</td>
								                <td><form:radiobutton path="mainOfferUrl" id="homeApplianceElectronics" value="homeAppliance.html?type=homeApplianceElectronics" />Mobile Shop</td>
								            </tr>
								             
								             <tr>
												<td><label for="entertainment">For Entertainment: </label> </td>
												<td><form:radiobutton  path="mainOfferUrl" id="cinemaEntertainment" value="cinemaEntertainment.html?type=cinemaEntertainment" />Cinemas</td>
												<td><form:radiobutton path="mainOfferUrl" id="gamesEntertainment" value="gameEntertainment.html?type=gameEntertainment" />Games</td>
												<td><form:radiobutton path="mainOfferUrl" id="playsEntertainment" value="playEntertainment.html?type=palyEntertainment" />Plays</td>
												
											</tr>
											
											
											
											<tr>
												<td><label for="fashion">For Fashion: </label> </td>
												<td><form:radiobutton path="mainOfferUrl" id="menFashion" value="menFashion.html?type=menFashion" />Men Fashion</td>
												<td><form:radiobutton path="mainOfferUrl" id="womenFashion" value="womenFashion.html?type=womenFashion" />Women Fashion</td>
												<td><form:radiobutton path="mainOfferUrl" id="kidsFashion" value="kidsFashion.html?type=kidsFashion" />KidsFashion</td>
												<td><form:radiobutton path="mainOfferUrl" id="babyFashion" value="babyFashion.html?type=babyFashion" />Baby Fashion</td>
												
												<td><form:radiobutton path="mainOfferUrl" id="watchFashion" value="watchFashion.html?type=watchFashion" />Watch Fashion</td>
												<td><form:radiobutton path="mainOfferUrl" id="luggageFashion" value="luggageFashion.html?type=luggageFashion" />Luggage and Bags Fashion</td>
												<td><form:radiobutton path="mainOfferUrl" id="beautyFashion" value="beautyFashion.html?type=beautyFashion" />Beauty Fashion</td>
											
											</tr>
											
											<tr>
												<td><label for="food">Food:  </label></td>
												<td><form:radiobutton path="mainOfferUrl" id="bakeryFood" value="bakeryFood.html?type=bakeryFood" />Bakery</td>
												<td><form:radiobutton path="mainOfferUrl" id="restaurantFood" value="restaurantFood.html?type=restaurantFood" />Restaurant</td>
												<td><form:radiobutton path="mainOfferUrl" id="pubFood" value="pubFood.html?type=pubFood" />Pubs</td>
											</tr>
											
											<tr>
												<td><label for="health">Health & Personal Care: </label> </td>
												<td><form:radiobutton path="mainOfferUrl" id="clinicHealth" value="clinicHealth.html?type=clinicHealth" />Clinic</td>
												<td><form:radiobutton path="mainOfferUrl" id="hospitalHealth" value="hospitalHealth.html?type=hospitalHealth" />Hospital</td>
												<td><form:radiobutton path="mainOfferUrl" id="pharmacyHealth" value="pharmacyHealth.html?type=pharmacyHealth" />Pharmacy</td>
												<td><form:radiobutton path="mainOfferUrl" id="spaPersonalCare" value="spaPersonalCare.html?type=spaPersonalcare" />Spa Personal Care</td>
											</tr>
										
										<tr>
											<td><label for="appliences">Home Needs: </label> </td>
							                <td><form:radiobutton path="mainOfferUrl" id="houseHoldItems" value="houseHoldItems.html?type=furnitureHomeNeeds" />HouseHold Items</td>
							                <td><form:radiobutton path="mainOfferUrl" id="kitchenAppliance" value="kitchenAppliance.html?type=kitchenHomeNeeds" />Kitchen Appliances</td>
							                <td><form:radiobutton path="mainOfferUrl" id="groceryItems" value="groceryItems.html?type=groceryHomeNeeds" />Grocery Items</td>
							            </tr>
							            
							            
							           
							            <tr>
							            	
							            	<td><label for="shopingcenters">Shopping Centers: </label> </td>
							                <td><form:radiobutton path="mainOfferUrl" id="shoppingMalls" value="shoppingMalls.html?type=shoppingMall" />Shopping Mall</td>
							               <td><form:radiobutton path="mainOfferUrl" id="shoppingStreets" value="shoppingStreets.html?type=shoppingStreet" />Shopping Street</td>
							            </tr>
							            
							            
							            
										
										<tr>
							            	<td><label for="sports">Sports: </label> </td>
							                <td><form:radiobutton path="mainOfferUrl" id="sportApparel" value="sportApparel.html?type=sportsApparelSport" />Sports Apparel</td>
							                <td ><form:radiobutton path="mainOfferUrl" id="sportShoes" value="sportShoes.html?type=sportsShoesSport" />Sports Shoes</td>
							                 <td ><form:radiobutton path="mainOfferUrl" id="sportAccessories" value="sportAccessories.html?type=sportsAccessoriesSport" />Sports Accessories</td>
							            </tr>
								            
								            <tr>
								            	<td>Upload Offer Image</td>
								                <td><form:input id="mainOfferImagePath" path="mainOfferImagePath" type="file" class="form:input-large"  required="true"/></td>
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
											<td></td>
								       			<td><button type="submit"  class="btn btn-info" >ADD OFFER</button></td>
								       	   </tr> 
										</table>
									</div>
								            
							   	 </form:form>
							   </div>
							   <div id="menu1" class="tab-pane fade">
							   	  <form:form  action="offers.html" method="post" modelAttribute="mainOffer" enctype="multipart/form-data">
							           
										<div class="table-responsive">
										  <table  class="table">
											
								            
											<tr>
												<td>Main Offer Name</td>
												<td><form:input  path="mainOfferName" id="mainOfferName" required="true" /></td>
											</tr>
											
											<tr>
												<th>URL For Offer</th>
											</tr>
								
								            <tr>
								            	<td>For Electronics</td>
								                <td><form:checkbox path="mainOfferUrl" id="mobileElectronics" value="mobileElectronics" />Mobile Shop</td>
								                <td><form:checkbox path="mainOfferUrl" id="computerElectronics" value="computerElectronics" />Computer Shop</td>
								                <td><form:checkbox path="mainOfferUrl" id="homeApplianceElectronics" value="homeApplianceElectronics" />Mobile Shop</td>
								            </tr>
								             
								             <tr>
												<td><label for="entertainment">For Entertainment: </label> </td>
												<td><form:checkbox  path="mainOfferUrl" id="cinemaEntertainment" value="cinemaEntertainment" />Cinemas</td>
												<td><form:checkbox  path="mainOfferUrl" id="gamesEntertainment" value="gameEntertainment" />Games</td>
												<td><form:checkbox path="mainOfferUrl" id="playsEntertainment" value="palyEntertainment" />Plays</td>
												
											</tr>
											
											
											
											<tr>
												<td><label for="fashion">For Fashion: </label> </td>
												<td><form:checkbox path="mainOfferUrl" id="menFashion" value="menFashion" />Men Fashion</td>
												<td><form:checkbox path="mainOfferUrl" id="womenFashion" value="womenFashion" />Women Fashion</td>
												<td><form:checkbox path="mainOfferUrl" id="kidsFashion" value="kidsFashion" />KidsFashion</td>
												<td><form:checkbox path="mainOfferUrl" id="babyFashion" value="babyFashion" />Baby Fashion</td>
												
												<td><form:checkbox path="mainOfferUrl" id="watchFashion" value="watchFashion" />Watch Fashion</td>
												<td><form:checkbox path="mainOfferUrl" id="luggageFashion" value="luggageFashion" />Luggage and Bags Fashion</td>
												<td><form:checkbox path="mainOfferUrl" id="beautyFashion" value="beautyFashion" />Beauty Fashion</td>
											
											</tr>
											
											<tr>
												<td><label for="food">Food:  </label></td>
												<td><form:checkbox path="mainOfferUrl" id="bakeryFood" value="bakeryFood" />Bakery</td>
												<td><form:checkbox path="mainOfferUrl" id="restaurantFood" value="restaurantFood" />Restaurant</td>
												<td><form:checkbox path="mainOfferUrl" id="pubFood" value="pubFood" />Pubs</td>
											</tr>
											
											<tr>
												<td><label for="health">Health & Personal Care: </label> </td>
												<td><form:checkbox path="mainOfferUrl" id="clinicHealth" value="clinicHealth" />Clinic</td>
												<td><form:checkbox path="mainOfferUrl" id="hospitalHealth" value="hospitalHealth" />Hospital</td>
												<td><form:checkbox path="mainOfferUrl" id="pharmacyHealth" value="pharmacyHealth" />Pharmacy</td>
												<td><form:checkbox path="mainOfferUrl" id="spaPersonalCare" value="spaPersonalcare" />Spa Personal Care</td>
											</tr>
										
										<tr>
											<td><label for="appliences">Home Needs: </label> </td>
							                <td><form:checkbox path="mainOfferUrl" id="houseHoldItems" value="furnitureHomeNeeds" />HouseHold Items</td>
							                <td><form:checkbox path="mainOfferUrl" id="kitchenAppliance" value="kitchenHomeNeeds" />Kitchen Appliances</td>
							                <td><form:checkbox path="mainOfferUrl" id="groceryItems" value="groceryHomeNeeds" />Grocery Items</td>
							            </tr>
							            
							            
							           
							            <tr>
							            	
							            	<td><label for="shopingcenters">Shopping Centers: </label> </td>
							                <td><form:checkbox path="mainOfferUrl" id="shoppingMalls" value="shoppingMall" />Shopping Mall</td>
							               <td><form:checkbox path="mainOfferUrl" id="shoppingStreets" value="shoppingStreet" />Shopping Street</td>
							            </tr>
							            
							            
							            
										
										<tr>
							            	<td><label for="sports">Sports: </label> </td>
							                <td><form:checkbox path="mainOfferUrl" id="sportApparel" value="sportsApparelSport" />Sports Apparel</td>
							                <td ><form:checkbox path="mainOfferUrl" id="sportShoes" value="sportsShoesSport" />Sports Shoes</td>
							                 <td ><form:checkbox path="mainOfferUrl" id="sportAccessories" value="sportsAccessoriesSport" />Sports Accessories</td>
							            </tr>
								            
								            <tr>
								            	<td>Upload Offer Image</td>
								                <td><form:input id="mainOfferImagePath" path="mainOfferImagePath" type="file" class="form:input-large"  required="true"/></td>
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
											<td></td>
								       			<td><button type="submit"  class="btn btn-info" >ADD OFFER</button></td>
								       	   </tr> 
										</table>
									</div>
								            
							   	 </form:form>
							   </div>
						</div><!-- For end Tab-content -->
						
						</div>
                    </div>
               </div>
                           
            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->
 </div>
    <!-- /#all -->
    
    
    <script type="text/javascript">
		$(document).ready(function(){
		    $(".nav-tabs a").click(function(){
		        $(this).tab('show');
		    });
		});
	</script>
    <!-- *** SCRIPTS TO INCLUDE ***
 _________________________________________________________ -->
   
    <script src="js/jquery.cookie.js"></script>
    <script src="js/waypoints.min.js"></script>
    <script src="js/modernizr.js"></script>
    <script src="js/bootstrap-hover-dropdown.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/front.js"></script>

    
   


</body>

</html>