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
                  				<li><a href="logout.html" >logout</a></li>
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
                        <li>Edit Main Offer</li>
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
      
						<center> <h1>Edit Main Offer</h1></center>
						 <!-- //Need to change -->
						 <hr>
					      	 <form:form  action="editMainOffer.html" method="post" modelAttribute="mainOffer" enctype="multipart/form-data">
					           
								<div class="table-responsive">
								  <table  class="table">
									
						            
						            <tr>
										<td>Main Offer Id</td>
										<td><form:input  path="mainOfferId" id="mainOfferID" required="true" readonly="true" /></td>
									</tr>
						            
									<tr>
										<td>Main Offer Name</td>
										<td><form:input  path="mainOfferName" id="mainOfferName" required="true" /></td>
									</tr>
									
					
						
						            <tr>
						            	<td>URL Of Offer</td>
						                <td><form:input path="mainOfferUrl" id="mainOfferUrl" class="form-Control"  required="true" placeholder="mobileShop.html?type=mobile shop"/></td>
						                
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
										<td><form:input type="date"  path="offerEndTime" id="offerEndTime" required="true"/></td>
									</tr>
						
									
						        	
									<tr>
									<td></td>
						       			<td><button type="submit"  class="btn btn-info" >UPDATE OFFER</button></td>
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