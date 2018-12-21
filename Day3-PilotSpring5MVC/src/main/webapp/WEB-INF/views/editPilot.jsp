<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<fieldset style="width: 800px; margin-left: 50px;">
	<legend align="top">Pilot Form</legend>
		<form:form action="showPilot" method="post" modelAttribute="pilot">
		<div id="imgcnt">
<img alt="micky" align="left" src="./resources/images/micky.jpg">
</div>
			<table align="center">
				<tr>
					<th colspan="3">
						<h2>
							<b>Pivot Details</b>
						</h2></th>
				</tr>
				<tr>
					<td>Pilot ID:</td>
					<td><form:hidden path="pilotId"/></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><form:input type="text" path="firstName" size="30"/></td>
					<td> 
					<form:errors path="firstName" cssClass="errMessage"></form:errors>
					</td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input type="text" path="lastName" size="30"/></td>
					<td> 
					<form:errors path="lastName" cssClass="errMessage"></form:errors>
					</td>
				</tr>
				<tr>
					<td>Date of Birth:</td>
					<td><form:input type="text" path="dateOfBirth" /></td>
					<td> 
					<form:errors path="dateOfBirth" cssClass="errMessage"></form:errors>
					</td>
				</tr>
				<tr>
					<td>Date of Joining:</td>
					<td><form:input type="text" path="dateOfJoin" /></td>
					<td> 
					<form:errors path="dateOfJoin" cssClass="errMessage"></form:errors>
					</td>
				</tr>
				<tr>
					<td>Is certified?:</td>
					<td>
					<form:radiobutton path="isCertified" value="true"/>yes
					<form:radiobutton path="isCertified" value="false"/>no
					</td>
				</tr>
				<tr>
					<td>Salary:</td>
					<td><form:input type="text" path="salary" size="30"/></td>
					<td> 
					<form:errors path="salary" cssClass="errMessage"></form:errors>
					</td>
				</tr>
				<tr>
					<td colspan="3"><input type="submit" value="save"></td>
				</tr>

			</table>
			
			<c:if test="${!empty pilots}">
			
			<table>
			<tr>
			<th>Pilot Id</th>
			<th>firstName</th>
			<th>LastName</th>
			<th>date Of Birth</th>
			<th>date Of Join</th>
			<th>Is Certified?</th>
			<th>Salary</th>
			</tr>
		<c:forEach items="${pilots}" var="pilot">
			<tr>
				<td>${pilot.pilotId }</td>
				<td>${pilot.firstName }</td>
				<td>${pilot.lastName }</td>
				<td>${pilot.dateOfBirth }</td>
				<td>${pilot.dateOfJoin }</td>
				<td>${pilot.isCertified }</td>
				<td>${pilot.salary }</td>
				<td>
				
					<a href="delete/${pilot.pilotId}">Delete</a>&nbsp;&nbsp;
					<a href="update/${pilot.pilotId}">Edit</a>
				</td>
				
			</tr>
		
		</c:forEach>
	
	</table>
	
	</c:if>
			
			
		</form:form>
	</fieldset>
</body>
</html>