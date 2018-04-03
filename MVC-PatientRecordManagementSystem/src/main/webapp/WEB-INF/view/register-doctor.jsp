<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
 
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Doctor registration</title>
</head>
<body bgcolor="gray">
 
     <div style="margin-left:450px;margin-top:100px;">
       <h2 style="color:green;text-shadow: silver;">
                                                Doctor registration form</h2>
     
        <form:form commandName="doctorData" method="post">
        
        Doctor name::<form:input type="text"  path="doctorName"/>
        Experience ::<form:input type="text"  path="expr"/>
        DOB        ::<form:input type="date"  path="dob"/>
        phno       ::<form:input type="text"  path="phno"/>
        specialist ::<form:input type="text"  path="specialist"/>
        <input type="submit" value="Register"/>
        <input type="reset" value="clear"/>
       </form:form>
     </div>

</body>
</html>