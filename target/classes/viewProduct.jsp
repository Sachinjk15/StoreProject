 <%@ include file="/WEB-INF/jsp/template/header.jsp" %>
    
    
  

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
            <!-- <div class="navbar-buttons">

              
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

            </div>
             -->
            <!--/.nav-collapse -->
        </div>
        <!-- /.container -->
    <!-- /#navbar -->
    <!-- *** NAVBAR END *** -->

	

   

	<div class="container">
	 	 <div class="box" id="details">
	 	 	<!-- About Store -->
		    <div class="row">	
	  			<div class="box" id="details" style="	border-radius: 25px;" ><!--data-animate="fadeInDown" -->
						<div class="row">
							 <div class="col-md-12">
				 				<h2  style="color:  #72b3c6  ;">${store.storeName} </h2>
				 				<hr>
				 			</div>
				 		</div> 
				 		
				 		<div class="row">
								 <div class="col-md-9">
									<h4>About Store </h4>	
									<p style="font-style: oblique;">${store.getStoreDescription()}</P>			
								</div>	
								<div class="col-md-3" >
										<h4>Location</h4>
										<p style="font-style: oblique;">${store.getStoreProprietor()}</p>
										<p style="font-style: oblique;"><i class="fa fa-phone"></i>: ${store.getStoreLandLineNumber()},
						                <i class="fa fa-mobile"></i>:${store.getStoreMobileNumber()}</P>
						                <P style="font-style: oblique;">${store.getStoreAddress()},${store.getStoreArea()},${store.getStorePincode()}.</p>
						                <p style="font-style: oblique;">${store.getStoreCity()}</p>
						             
								</div>
						</div>
	 		    </div><!-- End About Store -->
	 		   
	 		   
	 		    <!--Product Display -->
				<div class="row zoom-gallery">
				
				 <c:choose>
					 <c:when test="${not empty productList}">
						<c:forEach items="${productList}" var="products">
							<%-- <c:set var="dt" value="<%=new java.util.Date()%>" /> --%>
									     	
									     	
							<c:set var="dt1" value="<%= new java.util.Date().getTime() %>" />
									     	
									     	
							<c:set var="dt2" value="${products.getOfferEndTime().getTime() }" />
									     	
							<c:if test="${dt1<=dt2}"> 
									     	
									     	
								<div class="col-md-3" >
									<a class="image-popup-no-margins" href="${products.getProductImagePath()}">
										<img src="${products.getProductImagePath()}" class="img-thumbnail"  class="img-responsive">
									</a>
									<%-- <img  src="${products.getProductImagePath()}" class="img-thumbnail"  class="img-responsive"> --%>
									
									<div class="details" class="text-center">
										<p>${products.getProductDescription()}</p>
									</div>  
											     	
								</div>
							
							</c:if>
										 
						</c:forEach>   
					
					</c:when>
					
					<c:otherwise>
		                    <div class="container col-md-12">
								  <div class="box">
						                 <h2 class="text-muted text-center">Currently No Offers On Products Were Present In This Store..............!!</h2>
						          </div>
						 	</div>
						
					</c:otherwise>
					
					</c:choose>
					
					
				</div>
				<!-- End Product Display -->			
				
							<!-- <div class="row">
						    	<div class="pull-right">
					 				<button type="button" class="btn btn-primary btn-lg btn-round" ><i class="fa fa-eye" aria-hidden="true"></i></button>
					 				<button type="button" class="btn btn-primary btn-lg btn-round"><i class="fa fa-thumbs-up" aria-hidden="true"></i></button>
					 				<button type="button" class="btn btn-primary btn-lg btn-round"><i class="fa fa-share" aria-hidden="true"></i></button>
				 				</div>
 			 				</div> -->
		    </div><!-- End Store Details --> 
		    
		 </div>
	</div><!-- End Product Image -->
	
	
		
		
		<!-- For Review Display -->
		
		<div class="container" >
		
                  		<c:if test="${!empty loggedInUser.name}">
                           		<div class="well well-sml">
									<form:form  action="review.html" method="post" modelAttribute="saveReview">
								      
								       
								          <div class="form-group">
								          		
								          		 <div class="star-rating" >
								          		 My Rating:
												      <div class="star-rating__wrap">
												      
												        <form:radiobutton class="star-rating__input" id="star-rating-5"  path="reviewRating" name="rating" value="5"/>
												        <label class="star-rating__ico fa fa-star-o fa-lg" for="star-rating-5" title="5 out of 5 stars"></label>
												        <form:radiobutton class="star-rating__input" id="star-rating-4"  path="reviewRating" name="rating" value="4"/>
												        <label class="star-rating__ico fa fa-star-o fa-lg" for="star-rating-4" title="4 out of 5 stars"></label>
												        <form:radiobutton class="star-rating__input" id="star-rating-3"  path="reviewRating" name="rating" value="3"/>
												        <label class="star-rating__ico fa fa-star-o fa-lg" for="star-rating-3" title="3 out of 5 stars"></label>
												        <form:radiobutton class="star-rating__input" id="star-rating-2"  path="reviewRating" name="rating" value="2"/>
												        <label class="star-rating__ico fa fa-star-o fa-lg" for="star-rating-2" title="2 out of 5 stars"></label>
												        <form:radiobutton class="star-rating__input" id="star-rating-1"  path="reviewRating" name="rating" value="1"/>
												        <label class="star-rating__ico fa fa-star-o fa-lg" for="star-rating-1" title="1 out of 5 stars"></label>
												      </div>
												  </div>
										</div>  
												
										<div class="form-group">
										
										 		<div>
								          		I Liked:	<form:radiobutton  path="isLiked" id="isLiked"  value="true"/>
												 </div>   		
												      		
												      		
												      		<%-- <form:radiobutton class="star-rating__input" path="isLiked" id="isLiked"  value="true"/>
												        <label class="star-rating__ico fa fa-star-o fa-lg" for="star-rating-1" title="1 out of 5 stars"></label> --%>
												 	
											
											
											<%--  <div>
												 
												    <form:radiobutton path="isLiked" id="isLiked"  value="true"/>
											   
											 </div> --%>
											
											<div >
												    <form:radiobutton path="isLiked" id="isLiked"  value="false" hidden="true" />
											 </div>
													     
								        </div>
								        
								          <div class="form-group">
								            <label for="message-text" class="control-label">Review:</label>
								            <form:textarea path="reviewDescription"  required="true" class="form-control" id="message-text" placeholder="Enter your review here..."/>
								          </div>
								          
								           <div class="form-group">
								          	<form:input   path="storeId" id="storeId"  value="${store.getStoreId()}"  hidden="true"/>
								          </div>
								          
								          <div class="form-group">
								          	<form:input   path="userName" id="userName" value="${loggedInUser.name}" hidden="true" />
								          </div>
								          
								           <div class="form-group">
								          	<form:input   path="productType" id="productType"  value="${productType}"  hidden="true"/>
								          </div>
								        
								      
								      
								      <hr>
								      <div class="text-right">
								       	<button type="submit" class="btn btn-primary">Submit</button>
								     </div>
								      </form:form>
									
								</div>
                  		</c:if>
			
					<div class="well well-sml">
						<c:forEach items="${reviews}" var="reviews">
						
							<div  class="row">
								<h5>${reviews.getUserName()},</h5>
								<h4>${reviews.getReviewDescription()}</h4>
							</div>
							
							<div  class="row">
								<div class="pull-right">
									  Updated On: ${reviews.getReviewDate()}
								</div>
							</div>
							<hr>
						</c:forEach>
					</div>
				<!-- </div> -->
		</div> 
	

 <div id="all">
       <!-- *** FOOTER ***
 _________________________________________________________ -->
        <!-- <div id="footer" data-animate="fadeInUp">
            <div class="container">
                <div class="row text-center">
                	
	                    <a href="about.html">About Us</a><span> |</span>
						<a href="contact.html">Contact Us</a><span> |</span>
						<a href="termsAndConditions.html">Terms And Conditions</a>
						<hr>
						<h5>Stay in touch</h5>
					
					 <div class="col-md-6 col-sm-offset-5">
					
						
						 <p class="social">
	                            <a href="https://facebook.com/" class="facebook external" data-animate-hover="shake"><i class="fa fa-facebook"></i></a>
	                            <a href="https://twitter.com/" class="twitter external" data-animate-hover="shake"><i class="fa fa-twitter"></i></a>
	                            <a href="https://youtube.com/" class="instagram external" data-animate-hover="shake"><i class="fa fa-youtube-play"></i></a>
	                            <a href="#" class="gplus external" data-animate-hover="shake"><i class="fa fa-google-plus"></i></a>
	                            
	                        </p>
					</div>
					
                </div>
                /.row

            </div>
            /.container
        </div>
        /#footer

        *** FOOTER END ***

        *** COPYRIGHT ***
 _________________________________________________________
 
 		<div align="center"><a href="http://www.simplehitcounter.com" target="_blank"><img src="http://simplehitcounter.com/hit.php?uid=2127804&f=16777215&b=0" border="0" height="18" width="83" alt="web counter"></a></div>
		End of SimpleHitCounter Code
		
		
        <div id="copyright">
            <div class="container">
                 <marquee>&copy 2016@Veetarag Technologies</marquee>
              
            </div>
        </div>
        *** COPYRIGHT END ***



    </div>
    
    /#all


    

    *** SCRIPTS TO INCLUDE ***
 _________________________________________________________
  	<script src="js/jquery-1.11.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.cookie.js"></script>
    <script src="js/waypoints.min.js"></script>
    <script src="js/modernizr.js"></script>
    <script src="js/bootstrap-hover-dropdown.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/front.js"></script>



</body>

</html> -->

<%@ include file="/WEB-INF/jsp/template/footer.jsp" %>