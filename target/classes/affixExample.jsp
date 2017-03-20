<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<%@ taglib prefix="tg"  tagdir="/WEB-INF/tags" %>

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
       Local Stores Near @ You 
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

	
	<link href="css/main.css" rel="stylesheet">
	<script src="js/jquery.autocomplete.min.js"></script>
	
	

	 

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
  
  
  
    <script src="js/bootstrap-hover-dropdown.js"></script>
    <script src="js/font.js"></script>
  <style>
  .affix {
      top: 0;
      width: 100%;
  }
  .affix + .container-fluid {
      padding-top: 70px;
  }
  
  
  .navbar-default .navbar-fnt {
    color: #FFFFFF;
}
.navbar-default .navbar-backgrnd {
    color: #CC3333;
}
  
  </style>
</head>
<body>

<div id="top">
        <div class="container">
            <div class="col-md-6 offer" data-animate="fadeInDown">
                <a href="#" class="btn btn-success btn-sm" data-animate-hover="shake">Offer of the day</a>  <a href="#">Get flat 35% off on orders over $50!</a>
            </div>
            <div class="col-md-6" data-animate="fadeInDown">
                <ul class="menu">
                   <c:choose>
                  		<c:when test="${empty loggedInUser.name}">
                           		<li><a href="login.html" >Login</a> </li>
                   			    <li><a href="signup.html" >Register</a></li>
                  		</c:when>
                  		<c:otherwise>
                  				<li><font color="white">Hello ${loggedInUser.name}</font></li>
                  				<li><a href="logout.html" >logout</a></li>
                  		</c:otherwise>
                  </c:choose> 
                    <li><a href="contact.html">Contact</a>
                    </li>
                   <li><a href="#" data-toggle="modal" data-target="#location-modal">Locate Me</a>
                  
                    </li>
                </ul>
            </div>
        </div>
      <%--  <div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="Login" aria-hidden="true">
            <div class="modal-dialog modal-sm">

                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <center><h4 class="modal-title" id="Login">Customer Login</h4></center>
                    </div>
                    <div class="modal-body">
                        <form:form id="myForm" method="post" commandName="userLogin">
                        
                         
                            <div class="form-group">
                            <form:label for="name"  path="name">User Name</form:label>
                                <form:input  class="form-control" id="name-modal" 
                                path="name"></form:input>
                            </div>
                            <div class="form-group">
                            	<form:label for="password" path="password">Password</form:label>
                                <form:input type="password" class="form-control" id="password-modal" 
                                path="password"></form:input>
                            </div>

                            <p class="text-center">
                                <button class="btn btn-primary"><i class="fa fa-sign-in"></i> Log in</button>
                            </p>

                        </form:form>

                        <p class="text-center text-muted">Not registered yet?</p>
                        <p class="text-center text-muted"><a  href="signup.html" ><strong>Register now</strong></a></p>

                    </div>
                </div>
            </div>
        </div> --%>


		
		<!--  Location Modal -->
        <div class="modal fade" id="location-modal" role="dialog">
				    <div class="modal-dialog">
				      <!-- Modal content-->
				      <div class="modal-content">
				       		<div class="modal-header">
								  <div class="row" data-example>
				          				<%-- <form>
								             <div class="form-group">
								               <input id="advanced-placepicker" class="form-control" data-map-container-id="collapseTwo"  disabled/>
								             </div>
								            <div id="collapseTwo" class="collapse">
								              <div class="another-map-class thumbnail"></div>
								           </div>
								      </form> --%>
								      
								     <center><h3><p id="demo" /></h3></center>
								    
								 </div>
							  </div>
							  <div class="modal-body">
							  	<section id="wrapper">

									<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=true"></script>
									    <article>
									
									    </article>
									<script>
									function success(position) {
									  var mapcanvas = document.createElement('div');
									  var address;
									  mapcanvas.id = 'mapcontainer';
									  mapcanvas.style.height = '400px';
									  mapcanvas.style.width = '570px';
									
									  document.querySelector('article').appendChild(mapcanvas);
									  var coords = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);
									  var geocoder = geocoder = new google.maps.Geocoder();
									  geocoder.geocode({ 'latLng': coords }, function (results, status) {
									  if (status == google.maps.GeocoderStatus.OK) {
									                    if (results[0]) {
															//here getting the current location
									                     
															document.getElementById("demo").innerHTML=results[0].formatted_address;
									                    }
									                }
									            });
									  
									  
									  var options = {
									    zoom: 16,
									    center: coords,
									    mapTypeControl: false,
									    navigationControlOptions: {
									    	style: google.maps.NavigationControlStyle.SMALL
									    },
									    mapTypeId: google.maps.MapTypeId.ROADMAP
									  };
									  var map = new google.maps.Map(document.getElementById("mapcontainer"), options);
									
									  var marker = new google.maps.Marker({ map: map,
									      position: coords,
									      clickable: true 
									  });
									  
									  
									  
									  marker.info = new google.maps.InfoWindow({
									  content: 'You are here' 
									});
									
									google.maps.event.addListener(marker, 'click', function() {
									  marker.info.open(map, marker);
									  
									            
									});
									}
									
									if (navigator.geolocation) {
									  navigator.geolocation.getCurrentPosition(success);
									} else {
									  error('Geo Location is not supported');
									}
									
									
									
									</script>
									</section>
									
									
							  	
							  </div>
							<div class="modal-footer">
								<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
							</div>
				    </div>
				  </div>
		</div>
		<!-- ****END LOC MODAL**** -->
		
		
		
    </div>

<nav class="navbar navbar-default navbar-fnt navbar-backgrnd">
  <ul class="nav navbar-nav navbar-left">
                    <li ><a href="index.html"><img  src="img/homeButton.png"  height="20" width="20"></a>
                    </li>
                    <li class="dropdown yamm-fw">
                        <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="200">Electronics<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-4">
                                            <h5>Mobiles</h5>
                                            <ul>
                                                <li><a href="mobileShop.html?type=mobileElectronics">Show Shops</a>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5>Computer And Accessories </h5>
                                            <ul>
                                                <li><a href="computerShop.html?type=computerElectronics">Show Shops</a>
                                                </li>
                                               
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5>Home Appliances</h5>
                                            <ul>
                                                <li><a href="homeAppliance.html?type=homeApplianceElectronics">Show Shops</a>
                                                </li>
                                               
                                            </ul>
                                        </div>
                                    
                                    </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>

                    <li class="dropdown yamm-fw ">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Entertainment <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-4">
                                            <h5>Cinemas</h5>
                                            <ul>
                                                <li><a href="cenemaEntertainment.html?type=cenemaEntertainment">Show Cenema centers</a>
                                                </li>
                                                
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5>Games</h5>
                                            <ul>
                                                <li><a href="gameEntertainment.html?type=gameEntertainment">Show Game centers</a>
                                                </li>
                                            </ul>  
                                    </div>
                                    <div class="col-sm-4">
                                            <h5>Plays</h5>
                                            <ul>
                                                <li><a href="playEntertainment.html?type=playEntertainment">Show Play centers</a>
                                                </li>
                                            </ul>  
                                    </div>
                                </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>
                    
                    <li class="dropdown yamm-fw active">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Fashion<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h5>Cloths Centers</h5>
                                            <ul>
                                               <li><a href="menFashion.html?type=menFashion">Men</a>
                                                </li>
                                                <li><a href="womenFashion.html?type=womenFashion">Women</a>
                                                </li>
                                                 <li><a href="kidsFashion.html?type=kidsFashion">Kids</a>
                                                </li>
                                                 <li><a href="babyFashion.html?type=babyFashion">Baby</a>
                                                </li>
                                             
                                            </ul>
                                        </div>
                                         <div class="col-sm-3">
                                            <h5>Wathces</h5>
                                            <ul>
                                                <li><a href="watchFashion.html?type=watchFashion">Show shops</a>
                                                </li>
                                                
                                             
                                            </ul>
                                        </div>
                                        <div class="col-sm-3">
                                            <h5>Luggage & Bags</h5>
                                            <ul>
                                               <li><a href="luggageAndBagsFashion.html?type=luggageFashion">Show shops</a>
                                                </li>
                                                
                                             
                                            </ul>
                                        </div>
                                         <div class="col-sm-3">
                                            <h5>Beauty</h5>
                                            <ul>
                                               <li><a href="beautyFashion.html?type=beautyFashion">Show  shops</a>
                                                </li>
                                            </ul>
                                        </div>
                                        
                                     </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>
                    
                    
                    
                   <!--  Food -->
                    <li class="dropdown yamm-fw">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Food & Beverages<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-4">
                                            <h5>Bakery</h5>
                                            <ul>
                                                <li><a href="bakeryFood.html?type=bakeryFood">Show shops</a>
                                                </li>
                                               
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5>Restaurants</h5>
                                            <ul>
                                                <li><a href="restaurantFood.html?type=restaurantFood">Show Restaurants</a>
                                                </li>
                                             
                                            </ul>
                                        </div>
                                        
                                        <div class="col-sm-4">
                                            <h5>Pubs</h5>
                                            <ul>
                                                <li><a href="pubFood.html?type=pubFood">Show Pubs</a>
                                                </li>
                                             
                                            </ul>
                                        </div>
                                 </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>
                    
                     <!--  Health -->
                    <li class="dropdown yamm-fw">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Health & Personal Care<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <h5>Health</h5>
                                            <ul>
                                                
                                                <li><a href="clinicHealth.html?type=clinicHealth">Show Clinics</a>
                                                </li>
                                                  <li><a href="hospitalHealth.html?type=hospitalHealth">Show Hospitals</a>
                                                </li>
                                                 <li><a href="pharmacyHealth.html?type=pharmacyHealth">Show Pharmacy shops</a>
                                                </li>
                                                
                                            </ul>
                                        </div>
                                        <div class="col-sm-6">
                                            <h5>Personal Care</h5>
                                            <ul>
                                                <li><a href="spaPersonalCare.html?type=spaPersonalCare">Show Spa Shops</a>
                                                </li>
                                             
                                            </ul>
                                        </div>
                                       
                                     </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>
                    
                     <!--  Home Needs-->
                    <li class="dropdown yamm-fw">
                        <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="200">Home Needs<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-4">
                                            <h5>Furnitures</h5>
                                            <ul>
                                                
                                                <li><a href="houseHoldItems.html?type=furnitureHomeNeeds">Show Furniture Shops</a>
                                                </li>
                                                
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5>Grocery Item</h5>
                                            <ul>
                                                <li><a href="groceryItems.html?type=groceryHomeNeeds">Show Grocery Item Shops</a>
                                                </li>
                                            </ul>
                                        </div>
                                        
                                        <div class="col-sm-4">
                                            <h5>Kitchen Appliances</h5>
                                            <ul>
                                                <li><a href="kitchenApplience.html?type=kitchenHomeNeeds">Show Kitchen Appliances Shops</a>
                                             
                                                </li>
                                             
                                            </ul>
                                        </div>
                                        
                                     </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>
                    
                    
                      <!--  Shopping Centers -->
                    <li class="dropdown yamm-fw">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Shopping Centers <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <h5>Shopping Malls</h5>
                                            <ul>
                                                <li><a href="mantriShoppingMalls.html?type=mantriMall">Mantri Square</a>
                                                </li>
                                                <li><a href="orionShoppingMalls.html?type=orionMall">Orion Square</a>
                                                </li>
                                                <li><a href="gopalanArchadeShoppingMalls.html?type=gopalanArchadeMall">Gopalan Archade</a>
                                                </li>
                                               
                                                
                                            </ul>
                                        </div>
                                        <div class="col-sm-6">
                                            <h5>Shopping Streets</h5>
                                            <ul>
                                                <li><a href="shopingStreetGandhiBazar.html?type=gandhiBazarStreet">Gandhi Bazar</a>
                                                </li>
                                                <li><a href="shopingStreetMaleshwaram.html?type=malleshwaramStreet">Malleshwarm</a>
                                                </li>
                                               
                                             
                                            </ul>
                                        </div>
                                 </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>
                    
                     <!--  Sports -->
                    <li class="dropdown yamm-fw">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Sports <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-4">
                                            <h5>Sports Apparel</h5>
                                            <ul>
                                                <li><a href="sportApparel.html?type=sportsApparelSport">Show shops</a>
                                                </li>
                                              
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5>Sports Shoes</h5>
                                            <ul>
                                                <li><a href="sportShoes.html?type=sportsShoesSport">Show Shops</a>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5>Sports Accessories</h5>
                                            <ul>
                                                <li><a href="sportAccessories.html?type=sportsAccessoriesSport">Show Shops</a>
                                                </li>
                                            </ul>
                                        </div>
                                 </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>
                   
                </ul>

</nav>

<div class="container-fluid" style="height:1000px">
  <h1>Some text to enable scrolling</h1>
  <h1>Some text to enable scrolling</h1>
  <h1>Some text to enable scrolling</h1>
  <h1>Some text to enable scrolling</h1>
  <h1>Some text to enable scrolling</h1>
  <h1>Some text to enable scrolling</h1>
  <h1>Some text to enable scrolling</h1>
  <h1>Some text to enable scrolling</h1>
  <h1>Some text to enable scrolling</h1>
  <h1>Some text to enable scrolling</h1>
  <h1>Some text to enable scrolling</h1>
</div>

<script>
$(document).ready(function(){
    /* affix the navbar after scroll below header */
    $(".navbar").affix({offset: {top: $("#top").outerHeight(true)} });
});
</script>

</body>
</html>

