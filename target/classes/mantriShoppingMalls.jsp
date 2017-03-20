<%@ include file="/WEB-INF/jsp/template/header.jsp" %>      

<!--  ---------------- header ------------- -->

    <!-- *** NAVBAR ***
 _________________________________________________________ -->

    <div class="navbar navbar-default yamm " role="navigation" id="navbar">
        <div class="container-fluid">
            <div class="navbar-header">

          
                <div class="navbar-buttons">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation">
                        <span class="sr-only">Toggle navigation</span>
                        <i class="fa fa-align-justify"></i>
                    </button>
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#search">
                        <span class="sr-only">Toggle search</span>
                        <i class="fa fa-search"></i>
                    </button>
                    
                    
                     
                </div>
                   <!--  <a class="btn btn-default navbar-toggle" href="basket.html">
                        <i class="fa fa-location-arrow"></i>  <span class="hidden-xs">3 items in cart</span>
                    </a> -->
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
                                                <li><a href="cenemaEntertainment.html?type=cenemaEntertainment">Show Cenema Centers</a>
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
                    <li class="dropdown yamm-fw active">
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

            </div>
            <!--/.nav-collapse -->


            <div class="navbar-buttons">

              
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
                        <input type="text" name="searchValue" class="form-control" placeholder="Search Stores" required="true"/>
                        <span class="input-group-btn">

				<button type="submit" class="btn btn-primary"><i class="fa fa-search"></i></button>

		    </span>
                    </div>
                </form>

            </div>
            
            
         
           
            <!--/.nav-collapse -->

        </div>
        <!-- /.container -->
    
    <!-- /#navbar -->
    
    

    <!-- *** NAVBAR END *** -->




    <div id="all">

        <div id="content">
            <div class="container-fluid">

                <div class="col-md-12">
                    <ul class="breadcrumb">
                        <li><a href="#"> Shopping Malls</a>
                        </li>
                        <li>Mantri Square</li>
                    </ul>
                </div>

       
                <div class="col-md-12">

                <div class="row products">
                
	                <jsp:useBean id="pagedListHolder" scope="request" 
	                	type="org.springframework.beans.support.PagedListHolder"/>
	                <c:url value="/mantriShoppingMalls.html?type=mantriMall" var="pagedLink">
	                	<c:param name="p" value="~" />
	                </c:url>
	               <c:forEach items="${pagedListHolder.pageList}" var="store">
						
	                        <div class="col-md-2 col-sm-4">
	                            <div class="product" data-animate="fadeInDown">
	                                <div class="flip-container">
	                                    <div class="flipper">
	                                        <div class="front">
	                                            <a href="#">
	                                                <img src=<c:url value="${store.getStoreImagePath()}"/> class="img-responsive"/>
	                                            </a>
	                                        </div>
	                                        <div class="back">
	                                            <a href="#">
	                                                 <img src=<c:url value="${store.getStoreImagePath()}"/> class="img-responsive"/>
	                                            </a>
	                                        </div>
	                                    </div>
	                               	 </div>
	                                <a href="#" class="invisible">
	                                    <img src=<c:url value="${store.getStoreImagePath()}"/> class="img-responsive"/>
	                                </a>
	                                <div class="text">
	                                    <h3><a href="#">${store.getStoreName()}</a></h3>
	                                   
	                                    <p class="buttons">
	                                        <a href="<spring:url value="/${store.storeId}.html?productType=mantri"/>" class="btn btn-default">View detail</a>
	                                    </p>
	                                </div>
	                                
	                            </div>
	                           
	                        </div>
	                      
	                   </c:forEach> 

             		 </div>       
                    
       
                    
                     <div class="pages">
                    <!-- tg present in header -->
                     	 <tg:paging pagedListHolder="${pagedListHolder}"
  					 		 pagedLink="${pagedLink}"/>
                     </div>

                      
                </div>
                <!-- /.col-md-9 -->
            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->


        <!-- *** FOOTER ***
 _________________________________________________________ -->
<%@ include file="/WEB-INF/jsp/template/footer.jsp" %>