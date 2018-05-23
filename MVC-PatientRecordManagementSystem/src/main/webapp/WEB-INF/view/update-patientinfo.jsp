<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 
 <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>   
    
<!DOCTYPE html 
PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
 
 

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
	<h2>Update patient information </h2>
			<form:form method="post" commandName="patientInfo" modelAttribute="patientInfo">
				<div class="left-agileits-w3layouts same">
				
				    <div class="gaps">
						<p>PatientId</p>
						<form:input type="text" path="patientId" placeholder="" required=""/>
					</div>	
				
					<div class="gaps">
						<p>First Name</p>
						<form:input type="text" path="firstName" placeholder="" required=""/>
					</div>	
					<div class="gaps">
						<p>Last Name</p>
							<form:input type="text" path="lastName" placeholder="" required=""/>
					</div>
					<div class="gaps">
						<p>Gender</p>	
							<form:select class="form-control" path="gender">
								<form:option value="male" >Male</form:option>
								<form:option value="female">Female</form:option >
							</form:select>
					</div>
					<div class="gaps">
						<p>Select Date</p>		
						<form:input  id="datepicker1"  path="admisionDate" type="text" value="" onfocus="this.value = '';" 
						                             onblur="if (this.value == '') {this.value = 'mm/dd/yyyy';}" 
						                            
						                             required=""/>
					</div>
					<div class="gaps">
						<p>Insurance Company</p>
						<form:input type="text" name="insuranceDetails.insuranceCompany" path="insuranceDetails.insuranceCompany"
						                                           placeholder="" required=""/>
					</div>			
					<div class="gaps">	
						<p>Policy Number</p>
						<form:input type="text" path="insuranceDetails.policyNumber" placeholder="" required=""/>
					</div>
					<div class="gaps">
						<p>Physician's Name</p>
						<form:input type="text" path="physicianName" placeholder="" required=""/>
					</div>		
					<div class="gaps">	
						<p>Phone Number</p>
						<form:input type="text" path="phNo" placeholder="" required=""/>
					</div>
				</div>
				<div class="right-agileinfo same">
					<div class="gaps">
						<p>Care Tacker Name</p>
						<form:input type="text" path="careTackerName" placeholder="" required=""/>
					</div>
					<div class="gaps">
						<p>Relationship</p>
						<form:input type="text" path="relationship" placeholder="" required=""/>
					</div>
					<div class="gaps">
						<p>Street</p>
						<form:input type="text" path="addrs.street" placeholder="" required=""/>
						</div>
					<div class="gaps">
						<p>City</p>
						<form:input type="text" path="addrs.cityName" placeholder="" required=""/>
					</div>
					
					<div class="gaps">
						<p>State</p>	
						<form:select class="form-control" path="addrs.stateName">
							<form:option value=""></form:option>
							<form:option value="Hyderabad">Hyderabad</form:option>
							<form:option value="Odisha">Odisha</form:option>
							<form:option value="Karnatak">Karnatak</form:option>
						</form:select>
					</div>
					<div class="gaps">
						<p>Country</p>	
						<form:select class="form-control" path="addrs.country">
						   
						    <form:option value=""></form:option>
							<form:option value=""></form:option>
							<form:option value="India">India</form:option>
							<form:option value="USA">USA</form:option>
							<form:option value="Canada">Canada</form:option>
							<form:option value="Englankd">England</form:option>
						</form:select>
					</div>
				
				<div class="clear"></div>
				<input type="submit" value="update">
			</form:form>
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