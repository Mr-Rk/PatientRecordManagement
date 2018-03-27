
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<%@ page isELIgnored="false" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Medical Emergency Form a Responsive Widget Template :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Medical Emergency Form template Responsive, 
                        Login form web template,Flat Pricing tables,Flat Drop downs Sign up Web Templates, 
                       Flat Web Templates, Login sign up Responsive web template,
                        SmartPhone Compatible web template, free web designs for Nokia, 
                        Samsung, LG, SonyEricsson, Motorola web design">
                        
                        
<script type="application/x-javascript">

addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); 
function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!--fonts--> 
<link href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Droid+Sans:400,700" rel="stylesheet">
<!--//fonts--> 
</head>
<body>
<!--background-->
<h1> Medical Emergency Form</h1>
    <div class="bg-agile">
	<div class="book-appointment">
	<h2>Medical Information</h2>
			<form action="doRegistration.htm" method="post">
				<div class="left-agileits-w3layouts same">
					<div class="gaps">
						<p>First Name</p>
						<input type="text" name="firstName" placeholder="" required=""/>
					</div>	
					<div class="gaps">
						<p>Last Name</p>
							<input type="text" name="lastName" placeholder="" required=""/>
					</div>
					<div class="gaps">
						<p>Gender</p>	
							<select class="form-control" name="gender">
								<option></option>
								<option value="male">Male</option>
								<option value="female">Female</option>
							</select>
					</div>
					<div class="gaps">
						<p>Select Date</p>		
						<input  id="datepicker1"  name="admisionDate"  type="text" value="" onfocus="this.value = '';" 
						                             onblur="if (this.value == '') {this.value = 'mm/dd/yyyy';}" 
						                            
						                             required="">
					</div>
					<div class="gaps">
						<p>Insurance Company</p>
						<input type="text" name="insuranceDetails.insuranceCompany" placeholder="" required=""/>
					</div>			
					<div class="gaps">	
						<p>Policy Number</p>
						<input type="text" name="insuranceDetails.policyNumber" placeholder="" required=""/>
					</div>
					<div class="gaps">
						<p>Physician's Name</p>
						<input type="text" name="physicianName" placeholder="" required=""/>
					</div>		
					<div class="gaps">	
						<p>Phone Number</p>
						<input type="text" name="phNo" placeholder="" required=""/>
					</div>
				</div>
				<div class="right-agileinfo same">
					<div class="gaps">
						<p>Care Tacker Name</p>
						<input type="text" name="careTackerName" placeholder="" required=""/>
					</div>
					<div class="gaps">
						<p>Relationship</p>
						<input type="text" name="relationship" placeholder="" required=""/>
					</div>
					<div class="gaps">
						<p>Street</p>
						<input type="text" name="addrs.street" placeholder="" required=""/>
						</div>
					<div class="gaps">
						<p>City</p>
						<input type="text" name="addrs.cityName" placeholder="" required=""/>
					</div>
					
					<div class="gaps">
						<p>State</p>	
						<select class="form-control" name="addrs.stateName">
							<option></option>
							<option>Hyderabad</option>
							<option>Odisha</option>
							<option>Karnatak</option>
						</select>
					</div>
					<div class="gaps">
						<p>Country</p>	
						<select class="form-control" name="addrs.country">
							<option></option>
							<option>India</option>
							<option>USA</option>
							<option>Canada</option>
							<option>England</option>
						</select>
					</div>
				
				<div class="clear"></div>
				<input type="submit" value="Submit">
			</form>
		</div>
   </div>
 
		<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
		<!-- Calendar -->
				<link rel="stylesheet" href="css/jquery-ui.css" />
				<script src="js/jquery-ui.js"></script>
				  <script>
						  $(function() {
							$( "#datepicker,#datepicker1,#datepicker2,#datepicker3" ).datepicker();
						  });
				  </script>
			<!-- //Calendar -->

</body>
</html>