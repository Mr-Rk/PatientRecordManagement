<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>patient info</title>
</head>
<body background="images/orange wall.jpg">


  <div style="color:green;background-color: white;width:750px;">
    
     <div style="color:pink;background-color: black;width:650px;">
        
        <c:choose>
          <c:when test="${! empty patientList}">
            <h1>All patients report</h1>
            <table border="2">
           <!--  private int patientId;
	private String firstName;
	private String lastName;
	private String gender;
	private Date admisionDate;
	private InsuranceDetails insuranceDetails;
	                          	private String insuranceCompany;//nsuranceCompany
	                            private long policyNumber;
	 
	private String physicianName;
	private long phNo;
	private String careTackerName;
	private String relationship;
	private PatientAddress addrs; -->
             <tr> <th>Patient Id</th> <th>name</th> <th>Admision Date</th> <th>PolicyNumber</th> <th>Insurance Name</th> <th>Address</th> <th>RecordOperation</th></tr>
             <c:forEach var="pInfo" items="${patientList}">
               <tr>
               <td><c:out value="${pInfo.patientId}"></c:out></td>
               <td><c:out value="${pInfo.firstName}"></c:out></td>
               <td><c:out value="${pInfo.admisionDate}"></c:out></td>
               <td><c:out value="${pInfo.insuranceDetails.policyNumber}"></c:out></td>
               <td><c:out value="${pInfo.insuranceDetails.insuranceCompany}"></c:out></td>
               <td><c:out value="${pInfo.addrs.street}"></c:out></td>
               <td><a href="updatePatient.htm?pId=${pInfo.patientId}" style="background-color: green">Update</a> &nbsp;&nbsp;&nbsp;&nbsp;
                   <a href="deletePatient.htm?pId=${pInfo.patientId}" style="background-color: red">Delete</a></td>
             </c:forEach>
            </table>
          </c:when>
          <c:otherwise>
           <h2>No patient records are avilable</h2>
          </c:otherwise>
        </c:choose>
        
        
     </div>
  
  </div>

</body>
</html>