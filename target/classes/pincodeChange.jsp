<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
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
   	<script src="js/jquery.validate.js"></script>
    <script src="js/autocomplete-0.3.0.js"></script>  
   	<script src="js/jquery.magnific-popup.js"></script>
 	<!-- For autocomplete 
 	 _________________________________________________________ -->
   <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
   <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>





</head>

<body>
    <!-- *** TOPBAR ***
 _________________________________________________________ -->
    <div id="top">
        <div class="container">
            <div class="col-md-8 offer" data-animate="fadeInDown">
                <a href="#" class="btn btn-success btn-sm" data-animate-hover="shake">Offer of the day</a>
                <form  role="search" method="post" action="search.html">
                   <div class="input-group" class="col-md-4">
						<input type="text" name="searchValue" id="input-search" class="form-control" placeholder="Search Stores" required="true"/>
                        <span class="input-group-btn">
							<button type="submit" class="btn btn-primary"><i class="fa fa-search"></i></button>
						</span>
						
				</div>
				</form>
            </div>
            <div class="col-md-4" data-animate="fadeInDown">
                <ul class="menu">
                    <c:choose>
                  		<c:when test="${empty loggedInUser.name}">
                           		<li><a href="login.html" >Login</a> </li>
                   			    <li><a href="signup.html" >Register</a></li>
                   			   
                  		</c:when>
                  		<c:otherwise>
                  				<li><a href="#">Hello ${loggedInUser.name}</a></li>
                  				<li><a href="logout.html" >Logout</a></li>
                  				 <li><a href="pincodeChange.html">Change Pincode</a>
                  		</c:otherwise>
                  </c:choose> 
                  	
                    <li><a href="contact.html">Contact</a>
                    
                    </li>
                   
                </ul>
            </div>
        </div>
     
        
       
    </div>

    <!-- *** TOP BAR END *** -->

    <!-- *** NAVBAR ***
 _________________________________________________________ -->

   <div class="navbar navbar-default yamm" role="navigation" id="navbar">
        <div class="container-fluid">
            <div class="navbar-header">

          
                <div class="navbar-buttons">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation">
                        <span class="sr-only">Toggle navigation</span>
                        <i class="fa fa-align-justify"></i>
                    </button>
                   <!--  <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#search">
                        <span class="sr-only">Toggle search</span>
                        <i class="fa fa-search"></i>
                    </button> -->
                   
                </div>
            </div>
            <!--/.navbar-header -->

           
        <div class="navbar-collapse collapse" id="navigation">

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
                                            <h5><a href="mobileShop.html?type=mobileElectronics">Mobiles</a></h5>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5><a href="computerShop.html?type=computerElectronics">Computer And Accessories</a> </h5>
                                            
                                        </div>
                                        <div class="col-sm-4">
                                            <h5><a href="homeAppliance.html?type=homeApplianceElectronics">Home Appliances</a></h5>
                                            
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
                                            <h5><a href="cinemaEntertainment.html?type=cinemaEntertainment">Cinemas</a></h5>
                                            
                                        </div>
                                        <div class="col-sm-4">
                                            <h5><a href="gameEntertainment.html?type=gameEntertainment">Games</a></h5>
                                           
                                    </div>
                                    <div class="col-sm-4">
                                            <h5><a href="playEntertainment.html?type=playEntertainment">Plays</a></h5>
                                    </div>
                                </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>
                    
                    <li class="dropdown yamm-fw ">
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
                                            <h5><a href="watchFashion.html?type=watchFashion">Wathces</a></h5>
                                           
                                        </div>
                                        <div class="col-sm-3">
                                            <h5><a href="luggageAndBagsFashion.html?type=luggageFashion">Luggage & Bags</a></h5>
                                            
                                        </div>
                                         <div class="col-sm-3">
                                            <h5><a href="beautyFashion.html?type=beautyFashion">Beauty</a></h5>

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
                                            <h5><a href="bakeryFood.html?type=bakeryFood">Bakery</a></h5>
                                            
                                        </div>
                                        <div class="col-sm-4">
                                            <h5><a href="restaurantFood.html?type=restaurantFood">Restaurants</a></h5>
                                        </div>
                                        
                                        <div class="col-sm-4">
                                            <h5><a href="pubFood.html?type=pubFood">Pubs</a></h5>
                                            
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
                                                
                                                <li><a href="clinicHealth.html?type=clinicHealth">Clinics</a>
                                                </li>
                                                  <li><a href="hospitalHealth.html?type=hospitalHealth">Hospitals</a>
                                                </li>
                                                 <li><a href="pharmacyHealth.html?type=pharmacyHealth">Pharmacy</a>
                                                </li>
                                                
                                            </ul>
                                        </div>
                                        <div class="col-sm-6">
                                            <h5><a href="spaPersonalCare.html?type=spaPersonalCare">Personal Care</a></h5>
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
                                            <h5><a href="houseHoldItems.html?type=furnitureHomeNeeds">Furnitures</a></h5>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5><a href="groceryItems.html?type=groceryHomeNeeds">Grocery Item</a></h5>
                                        </div>
                                        
                                        <div class="col-sm-4">
                                            <h5><a href="kitchenAppliance.html?type=kitchenHomeNeeds">Kitchen Appliances</a></h5>
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
                                            <h5><a href="shoppingMalls.html?type=shoppingMall">Shopping Malls</a></h5>
                                        </div>
                                        <div class="col-sm-6">
                                            <h5><a href="shoppingStreets.html?type=shoppingStreet">Shopping Streets</a></h5>
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
                                            <h5><a href="sportApparel.html?type=sportsApparelSport">Sports Apparel</a></h5>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5><a href="sportShoes.html?type=sportsShoesSport">Sports Shoes</a></h5>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5><a href="sportAccessories.html?type=sportsAccessoriesSport">Sports Accessories</a></h5>
                                        </div>
                                 </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>
                   
                </ul>

            </div>
            <!--/.nav-collapse -->

           <%--  <div class="navbar-buttons">

               
                <!--/.nav-collapse -->

                <div class="navbar-collapse collapse right" id="search-not-mobile">
                    <button type="button" class="btn navbar-btn btn-primary" data-toggle="collapse" data-target="#search">
                        <span class="sr-only">Toggle search</span>
                        <i class="fa fa-search"></i>
                    </button>
                </div>

            </div>

            <div class="collapse clearfix" id="search">

                <form class="navbar-form" role="search" method="post" action="search.html">
                    <div class="input-group">
                        <input type="text" name="searchValue" id="input-search" class="form-control" placeholder="Search Stores" required="true"/>
                        <span class="input-group-btn">

				<button type="submit" class="btn btn-primary"><i class="fa fa-search"></i></button>

		    </span>
                    </div>
                </form>

            </div> --%>
            
            <!--/.nav-collapse -->

        </div>
        <!-- /.container -->
    </div>
    <!-- /#navbar -->

    <!-- *** NAVBAR END *** -->

    <div id="all">

        <div id="content">
            <div class="container">

               <div class="container">
              
				 
                <div class="col-md-8 col-md-offset-2">
                    <div class="box">
                        <h4>Current Pincode is:${currentPincode}</h4>
                        <h4>Willing to search stores present in another area?..Please enter  area pincode here</h4>
                        <form action="pincodeChange.html" method="post">
                       	
                       	<center>
	                       	<input id="changedPincode" name="changedPincode" required="true" style=" border: 0; border-bottom: 1px solid black; outline: 0; size=6;"
	                       	 oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);"
									    type = "number"
									    maxlength = "6"
	                       	/>
	                       	<button type="submit">Change Pincode</button>
                       	</center>
                       	
                       	</form>
                    </div>
                </div>
               
            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->


        <!-- *** FOOTER ***
 _________________________________________________________ -->
         <div id="footer" data-animate="fadeInUp">
            <div class="container">
                <div class="row">
                	<center>
	                    <a href="about.html">About Us</a><span> |</span>
						<a href="contact.html">Contact Us</a><span> |</span>
						<a href="termsAndConditions.html">Terms And Conditions</a>
						<hr>
						<h5>Stay in touch</h5>
					</center>
					 <div class="col-md-6 col-sm-offset-5">
					
						
						 <p class="social">
	                            <a href="https://facebook.com/" class="facebook external" data-animate-hover="shake"><i class="fa fa-facebook"></i></a>
	                            <a href="https://twitter.com/" class="twitter external" data-animate-hover="shake"><i class="fa fa-twitter"></i></a>
	                            <a href="https://youtube.com/" class="instagram external" data-animate-hover="shake"><i class="fa fa-youtube-play"></i></a>
	                            <a href="#" class="gplus external" data-animate-hover="shake"><i class="fa fa-google-plus"></i></a>
	                            
	                        </p>
					</div>
					
                </div>
                <!-- /.row -->

            </div>
            <!-- /.container -->
        </div>
        <!-- /#footer -->

        <!-- *** FOOTER END *** -->

        <!-- *** COPYRIGHT ***
 _________________________________________________________ -->
        <div id="copyright">
            <div class="container">
                 <marquee >&copy 2016@Veetarag Technologies</marquee>
              
            </div>
        </div>
        <!-- *** COPYRIGHT END *** -->



    </div>
    </div>
    <!-- /#all -->
<!-- For autocomplete -->
<script type="text/javascript">
$(document).ready(function() {
    $(function() {
            $("#input-search").autocomplete({     
            source : function(request, response) {
            $.ajax({
                    url : "${pageContext. request. contextPath}/searchStores.html",
                    type : "GET",
                    data : {
                            term : request.term
                    },
                    dataType : "json",
                    success : function(data) {
                    	 if (data.length == 0) {
                             alert('No entries found!');
                             $("#input-search").autocomplete("close");
                           }
                    	 else
                    		 {
                    		 	response(data);
                    		 }
                            
                    }
            });
    }
});
});
    
   
    
  
});

</script>

 


</body>

</html>
