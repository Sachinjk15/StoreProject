<%@ include file="/WEB-INF/jsp/template/header.jsp" %>      

<!--  ---------------- header ------------- -->


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
                                            <h5><a href="cenemaEntertainment.html?type=cenemaEntertainment">Cinemas</a></h5>
                                            
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
                                            <h5><a href="kitchenApplience.html?type=kitchenHomeNeeds">Kitchen Appliances</a></h5>
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

            <div class="navbar-buttons">

              
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
                        <input type="text" class="form-control" id="input-search" placeholder="Search">
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
                        <li><a href="#">Fashion</a>
                        </li>
                        <li>Textiles </li>
                    </ul>
                </div>

       
                 <div class="col-md-12">
                   <!--  <div class="box">
                        <h1>Computer Shops</h1>
                        <p>In ourMobile shop department we offer wide selection of the best shops we have found and carefully selected near you.</p>
                    </div> -->

                    <%-- <div class="box info-bar">
                        <div class="row">
                            <div class="col-sm-12 col-md-4 products-showing">
                                Showing <strong>12</strong> of <strong>25</strong> products
                            </div>

                            <div class="col-sm-12 col-md-8  products-number-sort">
                                <div class="row">
                                    <form class="form-inline">
                                        <div class="col-md-6 col-sm-6">
                                            <div class="products-number">
                                                <strong>Show</strong>  <a href="#" class="btn btn-default btn-sm btn-primary">12</a>  <a href="#" class="btn btn-default btn-sm">24</a>  <a href="#" class="btn btn-default btn-sm">All</a> products
                                            </div>
                                        </div>
                                        <div class="col-md-6 col-sm-6">
                                            <div class="products-sort-by">
                                                <strong>Sort by</strong>
                                                <select name="sort-by" class="form-control">
                                                    <option>Price</option>
                                                    <option>Name</option>
                                                    <option>Sales first</option>
                                                </select>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    --%>
                   
                    
            
                <div class="row products">
               
                 <c:forEach items="${stores}" var="store">
					<c:if test="${store.getStoreType() == 'textiles'}" >
                        <div class="col-md-2 col-sm-4">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="front">
                                            <a href="#">
                                                <img src=<c:url value="${store.getStoreImage()}"/> class="img-responsive"/>
                                            </a>
                                        </div>
                                        <div class="back">
                                            <a href="#">
                                                 <img src=<c:url value="${store.getStoreImage()}"/> class="img-responsive"/>
                                            </a>
                                        </div>
                                    </div>
                               	 </div>
                                <a href="#" class="invisible">
                                    <img src=<c:url value="${store.getStoreImage()}"/> class="img-responsive"/>
                                </a>
                                <div class="text">
                                    <h3><a href="#">${store.getStoreName()}</a></h3>
                                   
                                    <p class="buttons">
                                        <a href="<spring:url value="/${store.storeId}.html"/>" class="btn btn-default">View detail</a>
                                    </p>
                                </div>
                                
                            </div>
                           
                        </div>
                       </c:if>
                   </c:forEach>

              </div>       
                    
       
                    
                   <!--  <div class="pages">

                        <p class="loadMore">
                            <a href="#" class="btn btn-primary btn-lg"><i class="fa fa-chevron-down"></i> Load more</a>
                        </p>

                        <ul class="pagination">
                            <li><a href="#">&laquo;</a>
                            </li>
                            <li class="active"><a href="#">1</a>
                            </li>
                            <li><a href="#">2</a>
                            </li>
                            <li><a href="#">3</a>
                            </li>
                            <li><a href="#">4</a>
                            </li>
                            <li><a href="#">5</a>
                            </li>
                            <li><a href="#">&raquo;</a>
                            </li>
                        </ul>
                    </div> -->


                </div>
                <!-- /.col-md-9 -->
            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->


        <!-- *** FOOTER ***
 _________________________________________________________ -->

<%@ include file="/WEB-INF/jsp/template/footer.jsp" %>