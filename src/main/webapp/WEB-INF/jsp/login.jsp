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

           <!--  <div class="navbar-buttons">

               
                /.nav-collapse

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
                        <input type="text" name="searchValue"  id="input-search" class="form-control" placeholder="Search Stores" required="true"/>
                        <span class="input-group-btn">

				<button type="submit" class="btn btn-primary"><i class="fa fa-search"></i></button>

		    </span>
                    </div>
                </form>

            </div>
            

		    </span>
                    </div>
                </form>

            </div> -->
            <!--/.nav-collapse -->

        </div>
        <!-- /.container -->
    </div>
    <!-- /#navbar -->

    <!-- *** NAVBAR END *** -->

    <div id="all">

        	<div id="content">
               <div class="container">
                <div class="col-md-6 col-md-offset-3">
                    <div class="box">
                        <h1>Login</h1>
                        <hr>
                        
                        <c:if test="${not empty emailSent}"> 
	                        <div class="alert alert-success">
							  <strong>Success!</strong> ${emailSent}.
							</div>
                        </c:if>
                        
                        <c:if test="${not empty resetSucces}"> 
	                        <div class="alert alert-success">
							  <strong>Success!</strong> ${resetSucces}.
							</div>
                        </c:if>
                        
                        <c:if test="${not empty resetFailure}"> 
	                        <div class="alert alert-danger">
							  <strong>Failure!</strong> ${resetFailure}.
							</div>
                        </c:if>
                        
                          <c:if test="${not empty emailNotRegistered}"> 
	                        <div class="alert alert-danger">
							  <strong>Failure!</strong> ${emailNotRegistered}.
							</div>
                        </c:if>
                        
                        
                        <p><font color="red">${errorMessage}</font></p>
                        <form:form  id="myLoginForm"  method="post" commandName="userLogin">
                            <div class="form-group">
                            
                                <form:label for="email"  path="email">User Email<font color="red">*</font></form:label>
                                 <form:input  class="form-control" id="email" path="email" placeholder="Your Email_id"></form:input>
                            </div>
                            <div class="form-group">
                                <form:label for="password" path="password">Password<font color="red">*</font></form:label>
                                <form:input type="password" class="form-control" id="password" required="true"   path="password" placeholder="Your Password"></form:input>
                            </div>
                            <div class="text-center">
                                <button type="submit" class="btn btn-primary"><i class="fa fa-sign-in"></i> Log in</button>
                            </div>
                             <div class="pull-right">
                                	 	<a href="#" data-toggle="modal" data-target="#myForgotModal">Forgot Password?</a>
                            </div>
                            <br>
                            <div class="text-center">
                            	If not a memeber please<a href="signup.html"> Register </a>here
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
            <!-- /.container -->
               <div id="myForgotModal" class="modal fade" role="dialog">
				  <div class="modal-dialog">
				
				    <!-- Modal content-->
				    <div class="modal-content">
				      <div class="modal-header">
				       		 <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        					<h4 class="modal-title text-center" id="modalLabel">Forgot Password</h4>
				      </div>
				      <div class="modal-body">
				        
						    		<form action="forgotPassword.html"  id="forgotPasswordFoorm" method="post" >
										<div class="form-group">
									    	<div class="input-group">
									      		<div class="input-group-addon"><i class="fa fa-user"></i></div>
									      		<input type="text" class="form-control" id="f_email" name="f_email" placeholder="Email" />
									      		
									    	</div>
									    	<span class="help-block has-error" data-error='0' id="femail-error"></span>
									    	
									  	</div>
									  	 <div class="text-center">
									  	
							  				<button type="submit"  id="reset_btn" class="btn bt-login " data-loading-text="Please wait....">Reset Password</button>
							  			</div>
										<div class="clearfix"></div>
										<!-- <div class="login-modal-footer">
							  				<div class="row">
												<div class="col-xs-6 col-sm-6 col-md-6">
													<i class="fa fa-lock"></i>
													<a href="login.html"> Sign In </a>
												
												</div>
												
												<div class="col-xs-6 col-sm-6 col-md-6 pull-right">
													<i class="fa fa-check"></i>
													<a href="signup.html"> Sign Up </a>
												</div>
											</div>
							  			</div> -->
									</form>
						    	
				      </div>
				     
				    </div>
				
				  </div>
				</div>
        </div>
        <!-- /#content -->



<script type="text/javascript">
 $(document).ready(function() {
	  $('#forgotPasswordFoorm').validate({
		  rules:{
			  f_email:{
				 required:true,
				 email :true
					  
				 }
		  },
		  messages: {
			  f_email: {
	            	required :"Please Enter Registered Email!!!",
	            	email :"Please Enter Valid Email-id.!!!"
	            	
	            }
	        }
		  
	  });
	  
	  
	  
	  
	  
	  $('#myLoginForm').validate({
		  rules:{
			  email:{
				 required:true
				
				  
				 },
			
			password:{
				required: true,
				minlength:5
			}
		  },
		  messages: {
			  email: {
	            	required :"Please Enter User Email!!!"
	            	
	            },
	            
	            password: {
	                required: "Please Enter User Password !!!",
	                minlength: "Please Enter Atleast 5 charecters"
	            }
	        }
		  
	  });
	});
 
 
 
/*  
 //for email checking
 function checkemail()
{
 var email=document.getElementById( "f_email" ).value;
	
 if(email)
 {
  $.ajax({
  type: 'get',
  url: '${pageContext. request. contextPath}/searchEmail.html',
  data: {
   user_email:email,
  },
  success: function (response) {
   //$( '#email_status' ).html(response);
   if(response=="OK")	
   {
	   alert("done email present");	
   }
   else
   {
	   alert("sorry email not present");
   }
  }
  }); 
  //alert("done");
 }
 else
 {
 $( '#email_status' ).html("");
  return false; 
  alert("sorry");
 } 
} */
 </script>


        <!-- *** FOOTER ***
 _________________________________________________________ -->

<%@ include file="/WEB-INF/jsp/template/footer.jsp" %>