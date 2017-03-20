<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


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
       Signup
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
            <div class="col-md-6 offer" data-animate="fadeInDown">
                <a href="#" class="btn btn-success btn-sm" data-animate-hover="shake">Offer of the day</a>  <a href="#">Get flat 35% off on orders over $50!</a>
            </div>
            <div class="col-md-6" data-animate="fadeInDown">
                <ul class="menu">
                    <li><font color="white">Welcome ${name}</font></li>
                    <li><a href="logout.html">Logout</a>
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
                    <!-- <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#search">
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
                        <a href="#" class="dropdown-toggle active" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Electronics<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-4">
                                            <h5>Mobiles</h5>
                                            <ul>
                                                <li><a href="mobileShop.html?type=mobile shop">Show Shops</a>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5>Computer And Accessories </h5>
                                            <ul>
                                                <li><a href="computerShop.html?type=computer shop">Show Shops</a>
                                                </li>
                                               
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5>Home Appliances</h5>
                                            <ul>
                                                <li><a href="homeAppliance.html?type=homeAppliance">Show Shops</a>
                                                </li>
                                               
                                            </ul>
                                        </div>
                                    
                                    </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>

                    <li class="dropdown yamm-fw">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Entertainment <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-4">
                                            <h5>Cinemas</h5>
                                            <ul>
                                                <li><a href="cinemaEntertainment?type=cinema">Show Cinema centers</a>
                                                </li>
                                                
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5>Games</h5>
                                            <ul>
                                                <li><a href="gameEntertainment.html?type=games">Show Game centers</a>
                                                </li>
                                            </ul>  
                                    </div>
                                    <div class="col-sm-4">
                                            <h5>Plays</h5>
                                            <ul>
                                                <li><a href="playEntertainment.html?type=plays">Show Play centers</a>
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
                                                
                                                <li><a href="houseHoldItems.html?type=furniture">Show Furniture Shops</a>
                                                </li>
                                                
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5>Grocery Item</h5>
                                            <ul>
                                                <li><a href="groceryItems.html?type=gocerry">Show Grocery Item Shops</a>
                                                </li>
                                            </ul>
                                        </div>
                                        
                                        <div class="col-sm-4">
                                            <h5>Kitchen Appliances</h5>
                                            <ul>
                                                <li><a href="kitchenAppliance.html?type=kitchen">Show Kitchen Appliances Shops</a>
                                             
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
                                                <li><a href="mantriShoppingMalls.html?type=mantri">Mantri Square</a>
                                                </li>
                                                <li><a href="orionShoppingMalls.html?type=orion">Orion Square</a>
                                                </li>
                                                <li><a href="gopalanArchadeShoppingMalls.html?type=gopalan archade">Gopalan Archade</a>
                                                </li>
                                               
                                                
                                            </ul>
                                        </div>
                                        <div class="col-sm-6">
                                            <h5>Shopping Streets</h5>
                                            <ul>
                                                <li><a href="shopingStreetGandhiBazar.html?type=gandhiBazar">Gandhi Bazar</a>
                                                </li>
                                                <li><a href="shopingStreetMaleshwaram.html?type=malleshwaram">Malleshwarm</a>
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
                                                <li><a href="sportApparel.html?type=sportsApparel">Show shops</a>
                                                </li>
                                              
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5>Sports Shoes</h5>
                                            <ul>
                                                <li><a href="sportShoes.html?type=sportsShoes">Show Shops</a>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <h5>Sports Accessories</h5>
                                            <ul>
                                                <li><a href="sportAccessories.html?type=sportsAccessories">Show Shops</a>
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

            </div>
            <!--/.nav-collapse -->


            <%-- <div class="navbar-buttons">

               
                <!--/.nav-collapse -->

                <div class="navbar-collapse collapse right" id="search-not-mobile">
                    <button type="button" class="btn navbar-btn btn-primary" data-toggle="collapse" data-target="#search">
                        <span class="sr-only">Toggle search</span>
                        <i class="fa fa-search"></i>
                    </button>
                </div>

            </div>

            <div class="collapse clearfix" id="search">

                <form class="navbar-form" role="search">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search">
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
		             <h2>Work in progress.......</h2>
		             
		             
            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->


        <!-- *** FOOTER ***
 _________________________________________________________ -->
        <div id="footer" data-animate="fadeInUp">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <h4>Pages</h4>

                        <ul>
                            <li><a href="aboutUs.html">About us</a>
                            </li>
                            <li><a href="termsAndCondition.html">Terms and conditions</a>
                            </li>
                            <li><a href="contact.html">Contact us</a>
                            </li>
                        </ul>

                        <hr>

                        <h4>User section</h4>

                        <ul>
                            <li><a href="login.html">Login</a>
                            </li>
                            <li><a href="signup.html">Register</a>
                            </li>
                        </ul>

                        <hr class="hidden-md hidden-lg hidden-sm">

                    </div>
                    <!-- /.col-md-3 -->

                    <div class="col-md-3 col-sm-6">

                        <h4>Top categories</h4>

                        <h5>Electronics</h5>

                        <ul>
                            <li><a href="mobileShop.html?type=mobile shop">Mobiles</a>
                            </li>
                            <li><a href="computerShop.html?type=computer shop">Computer And Accessories</a>
                            </li>
                            <li><a href="homeAppliance.html?type=homeAppliance">Home Appliances</a>
                            </li>
                        </ul>

                        <h5>Shopping Streets</h5>
                        <ul>
                            <li><a href="shopingStreetGandhiBazar.html?type=gandhiBazar">Gandhi Bazar</a>
                            </li>
                            <li><a href="shopingStreetMaleshwaram.html?type=malleshwaram">Malleshwaram</a>
                            </li>
                        </ul>

                        <hr class="hidden-md hidden-lg">

                    </div>
                    <!-- /.col-md-3 -->

                    <div class="col-md-3 col-sm-6">

                        <h4>Customer Support</h4>

                        <p>
                        	<br>Ph:+91-9844559074
                            <br>Ph:+91-8710830213
                            <br>Email:sagar.hundekar@gmail.com
                            <br><strong>INDIA</strong>
                        </p>

                       

                        <hr class="hidden-md hidden-lg">

                    </div> 
                    <!-- /.col-md-3 -->



                    <div class="col-md-3 col-sm-6">

                        <h4>Get the news</h4>

                        <p class="text-muted">We will inform you about best offers near you.</p>

                        <form>
                            <div class="input-group">

                                <input type="text" class="form-control">

                                <span class="input-group-btn">

			   						<button class="btn btn-default" type="button">Subscribe!</button>

								</span>

                            </div>
                            <!-- /input-group -->
                       </form>

                        <hr>

                        <h4>Stay in touch</h4>

                        <p class="social">
                            <a href="https://facebook.com/" class="facebook external" data-animate-hover="shake"><i class="fa fa-facebook"></i></a>
                            <a href="https://twitter.com/" class="twitter external" data-animate-hover="shake"><i class="fa fa-twitter"></i></a>
                            <a href="https://youtube.com/" class="instagram external" data-animate-hover="shake"><i class="fa fa-youtube-play"></i></a>
                            <a href="#" class="gplus external" data-animate-hover="shake"><i class="fa fa-google-plus"></i></a>
                            
                        </p>


                    </div>
                    <!-- /.col-md-3 -->

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
                 <marquee style="padding-top:10px">&copy 2016@Veetarag Technologies</marquee>
              
            </div>
        </div>
        <!-- *** COPYRIGHT END *** -->



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
