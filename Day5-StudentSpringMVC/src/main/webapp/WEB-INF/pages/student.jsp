<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<h1 align="center">Student details</h1>


<c:if test="${!empty student}">
<form:form method="post" modelAttribute="student" action="updateStudent">
	<table>
		<tr>
			<td>Student Id:</td>
			<td>
				<!-- instead of form,displaying Id as text field -->
				<form:hidden path="stduentId"  value="${student.stduentId}" readonly="true"/>
				${student.stduentId}
			</td>
		</tr>
	
		<tr>
			<td>Student Name:</td>
			<td>
				<form:input path="studentName"  value="${student.studentName}"/>
			</td>
		</tr>
		
		<tr>
			<td>Student Location:</td>
			<td>
				<%-- <form:input path="location"  value="${student.location}"/> --%>
				<form:select path="location" value="${student.location}">
					<c:if test="${!empty locations }">
						<c:forEach items="${locations}" var="location">
						<form:option value="${location}"></form:option>
						</c:forEach>
					</c:if>
				</form:select>
				
			</td>
		</tr>
		
		<c:if test="${student.stduentId == 0}">
		<tr>
			<td></td>
			<td>
				<input type="submit" value="Save">
			</td>
		</tr>
		</c:if>
		<c:if test="${student.stduentId != 0 }">
		<tr>
			<td></td>
			<td>
				<input type="submit" value="Update">
			</td>
		</tr>
		</c:if>
		
	</table>
</form:form>
</c:if>

<div style="margin-left: 200px;">
<c:if test="${!empty studs }">
	<table>
		<tr>
			<th>StudentID</th>
			<th>StudentName</th>
			<th>Location</th>
				<th>Edit</th>
		</tr>
		
		<c:forEach items="${studs}" var="student">
		<tr>
			<td>${ student.stduentId}</td>
			<td>${ student.studentName}</td>
			<td>${ student.location}</td>
			<td>
				<a href="update/${student.stduentId}">update</a>
			</td>
			</tr>
		</c:forEach>
	
	</table>


</c:if>
</div>


</body>
</html>