<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center"  style="color: blue;">Pilot Details</h2>
Pilot Id: ${pilot.pilotId}<br>
Pilot Name: ${pilot.firstName} &nbsp;&nbsp;&nbsp; ${pilot.lastName}<br>
Date Of Birth: ${pilot.dateOfBirth}<br>
Date of Joining: ${pilot.dateOfJoin}<br>
Is Certified?: ${pilot.isCertified}<br>
Salary: ${pilot.salary}<br>


</body>
</html>