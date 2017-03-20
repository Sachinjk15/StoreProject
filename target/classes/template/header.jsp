<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tg"  tagdir="/WEB-INF/tags" %>
<%@ page session="false" %>


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
    
    <link rel="shortcut icon" href="favicon.png">
	<link href="css/main.css" rel="stylesheet">
	
    <!-- theme stylesheet -->
    <link href="css/style.default.css" rel="stylesheet" id="theme-stylesheet">

    <!-- your stylesheet with modifications -->
    <link href="css/custom.css" rel="stylesheet">
    
    <link href="css/magnific-popup.css" rel="stylesheet">
    <link href="css/for_review.css" rel="stylesheet">
    
  
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
   

	
	
	
 
<style type="text/css">
label.error{
	color:red;
}	

/* for limit the displaying text of store description	 */
.store_desc {
	overflow: hidden;
	text-overflow: ellipsis;
	display: -webkit-box;
	line-height: 16px; /* fallback */
	max-height: 32px; /* fallback */
	max-width: 200px;
	-webkit-line-clamp: 1; /* number of lines to show */
	-webkit-box-orient: vertical;
}
</style>



<!-- For forgot password -->
<style type="text/css">

.bt-login,.bt-login:hover, .bt-login:active, .bt-login:focus {
    background-color: #41b39c;
    color: #ffffff;
    padding-bottom: 10px;
    padding-top: 10px;

    transition: background-color 300ms linear 0s;
}


.login-tab {
	margin: 0 auto;
	max-width: 380px;
}

.modal-header {
	background: #f59494;
	color: #fff;
}

.modal-header .modal-title {
	color: #fff;
}

.modal-header .close {
	color: #fff;
}

.login-modal i {
	color: #000;
}

.login-modal form {
	max-width: 340px;
}

.tab-pane form {
	margin: 0 auto;
}
.modal-footer{
	margin-top:15px;
	margin-bottom:15px;
}


</style>
 
 
 
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

 <!-- <script type="text/javascript">
 $(document).ready(function(){
	 $('.').hide();
	 $(".navbar-buttons").mouseout(            
	            function() {
	            	$('.in').addClass(); 
	                 
	            }); 
 });
 </script> -->
 
 <script type="text/javascript">
 
 $(document).ready(function() {
	 $('.image-popup-no-margins').magnificPopup({
			type: 'image',
			closeOnContentClick: true,
			closeBtnInside: false,
			fixedContentPos: true,
			mainClass: 'mfp-no-margins mfp-with-zoom', // class to remove default margin from left and right side
			image: {
				verticalFit: true
			},
			zoom: {
				enabled: true,
				duration: 300 // don't foget to change the duration also in CSS
			}
		});
	});
 
 </script>
 
 
 
 
  
</head>

<body>
    <!-- *** TOPBAR ***
 _________________________________________________________ -->
    <div id="top">
        <div class="container">
            <div class="col-md-7 offer" data-animate="fadeInDown">
                 <a href="#" class="btn btn-success btn-sm" data-animate-hover="shake">Offer of the day</a></a>
                 <form  role="search" method="post" action="search.html">
                   <div class="input-group" class="col-md-4">
						<input type="text" name="searchValue" id="input-search" class="form-control" placeholder="Search Stores" required="true"/>
                        <span class="input-group-btn">
							<button type="submit" class="btn btn-primary"><i class="fa fa-search"></i></button>
						</span>
						
				</div>
				</form>
            </div>
            <div class="col-md-5" data-animate="fadeInDown">
                <ul class="menu">
                   <c:choose>
                  		<c:when test="${empty loggedInUser.name}">
                           		<li><a href="login.html" >Login</a> </li>
                   			    <li><a href="signup.html" >Register</a></li>
                   			   
                  		</c:when>
                  		<c:otherwise>
                  				<li >
                  					<a href="#">Hello ${loggedInUser.name}</a>
                  				</li>
                  				<li><a href="logout.html" >Logout</a></li>
                  				 <li><a href="pincodeChange.html">Change Pincode</a>
                  		</c:otherwise>
                  </c:choose> 
                  	
                    <li><a href="contact.html">Contact Us</a>
                    
                    </li>
                    
                </ul>
            </div>
            
            
            	
	         
				
						      		
			
        </div>
    

		
    </div>

    <!-- *** TOP BAR END *** -->