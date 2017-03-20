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
	<link rel="shortcut icon" href="favicon.png">
    <!-- your stylesheet with modifications -->
    <link href="css/custom.css" rel="stylesheet">

    <script src="js/respond.min.js"></script>
	<!-- <script src="https://code.jquery.com/jquery-1.12.4.js"></script> -->
    

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


<style type="text/css">

#mapdiv {
	margin: 0;
	padding: 0;
	width: 500px;
	height: 500px;
}


* {
    margin: 0 auto;
    padding: 0;
}

/* body {
    background-color: #F2F2F2;
} */

 .container {
    margin: 0 auto;
    padding: 150px 20px;
   
} 

h3 {
    text-align: center;
    margin-bottom: 50px;
}

p {
    margin: 20px;
}

#location {
    margin-bottom: 30px;
}

/* #map {
    width: 800px;
    height: 400px;
} */

#proceed {
  display: none;
}



body { 
background: url(img/background/back.jpg) no-repeat center center fixed; 
-webkit-background-size: cover;
-moz-background-size: cover;
-o-background-size: cover;
background-size: cover;
}
</style>

<script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=true"></script>
<script>
	var watchId = null;
	function geoloc() {
	if (navigator.geolocation) {
		var optn = {
				enableHighAccuracy : true,
				timeout : Infinity,
				maximumAge : 0
		};
	watchId = navigator.geolocation.watchPosition(showPosition, showError, optn);

	} else {
			alert('Geolocation is not supported in your browser');
	}
	}

function showPosition(position) {
		var googlePos = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);
		var mapOptions = {
			zoom : 15,
			center : googlePos,
			mapTypeId : google.maps.MapTypeId.ROADMAP
		};
		var mapObj = document.getElementById('mapdiv');
		var googleMap = new google.maps.Map(mapObj, mapOptions);
		var markerOpt = {
			map : googleMap,
			position : googlePos,
			title : 'Hi , I am here',
			animation : google.maps.Animation.DROP
		};
		var googleMarker = new google.maps.Marker(markerOpt);
		var geocoder = new google.maps.Geocoder();
		geocoder.geocode({
			'latLng' : googlePos
			}, function(results, status) {
				if (status == google.maps.GeocoderStatus.OK) {
				if (results[0]) {
					document.getElementById("locationResult").value = results[0].formatted_address;
					document.getElementById("locationResultInModel").value = results[0].formatted_address;
					
					
					
					  for (var i = 0; i < results[0].address_components.length; i++) {
			                var types = results[0].address_components[i].types;

			                for (var typeIdx = 0; typeIdx < types.length; typeIdx++) {
			                    if (types[typeIdx] == 'postal_code') {
			                        var zipcode=results[0].address_components[i].short_name;
			                        
			                        //alert(zipcode);
			                        
			                        document.getElementById("locationFind").value = zipcode;
			                    }
			                }
			                
			                
			                for (var typeIdx = 0; typeIdx < types.length; typeIdx++) {
			                    if (types[typeIdx] == 'locality') {
			                        var currentCity=results[0].address_components[i].long_name;
			                        
			                        document.getElementById("currentCity").value = currentCity;
			                        
			                        //alert(zipcode);
			                        
			                       // alert(currentCity);
			                    }
			                }
			                
					  }
					  
					var popOpts = {
						content : results[0].formatted_address,
						position : googlePos
					};

				
				var popup = new google.maps.InfoWindow(popOpts);
				google.maps.event.addListener(googleMarker, 'click', function() {
				popup.open(googleMap);
			});
				} else {
					alert('No results found');
				}
				} else {
					alert('Geocoder failed due to: ' + status);
				}
			});
			}

			function stopWatch() {
				if (watchId) {
					navigator.geolocation.clearWatch(watchId);
					watchId = null;

				}
			}
 
		function showError(error) {
		var err = document.getElementById('mapdiv');
		switch(error.code) {
		case error.PERMISSION_DENIED:
		err.innerHTML = "User denied the request for Geolocation."
		break;
		case error.POSITION_UNAVAILABLE:
		err.innerHTML = "Location information is unavailable please refresh the page."
		break;
		case error.TIMEOUT:
		err.innerHTML = "The request to get user location timed out."
		break;
		case error.UNKNOWN_ERROR:
		err.innerHTML = "An unknown error occurred."
		break;
		}
		}
		</script>
		
		
		<script type="text/javascript">
			$(document).ready(function() {
				
				 $("#locationButton").click(function(){
				  setTimeout(function() {
				    $("#proceed").show();
				  }, 5000);
				  
				 });
				});   
	</script>

	</head>
<body>

		<div class="container">
		    <div class="col-sm-12">
			    <div class="input-group">
			      <input type="text" class="form-control form-control-lg"  id="locationResult" placeholder="Your Location" disabled="disabled"/>
				      <span class="input-group-btn">
				        <button class="btn btn-secondary" type="button" onclick="geoloc();" id="locationButton" data-toggle="modal" data-target="#myModal">LOCATE ME</button>
				      </span>
			    </div>
			  </div>
		</div>
		
		 <div class="modal fade" id="myModal" role="dialog">
			    <div class="modal-dialog">
			    
			      <!-- Modal content-->
			      <div class="modal-content">
			        <div class="modal-header">
			          <button type="button" class="close" data-dismiss="modal">&times;</button>
			           <input  id="locationResultInModel" type="text" class="form-control input-lg input-search" placeholder="Your Location" disabled="disabled" style="height:50px;"/>
			        </div>
			        <div class="modal-body">
			          	<div id="mapdiv" style="width:auto; height: 500px;"></div>
			          	<h6 style="color:#F75D59;"> Note:**Its not your address please refresh and press LOCATE ME**</h6>
			        </div>
			        <div class="modal-footer">
				         <form:form  action="location.html" method="post" modelAttribute="location">
								
								<center><input type="submit" id="proceed" class="btn btn-info" value="SHOW OFFERS"></center>
								<input type="hidden" name="location" id="locationFind">
								<input type="hidden" name="currentCity" id="currentCity">	
						</form:form>
			        </div>
			      </div>
			      
			    </div>
 		 </div>
		
		
		
	

</body>
</html>
