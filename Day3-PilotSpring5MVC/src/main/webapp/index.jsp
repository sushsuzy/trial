<html>
<head>
<!-- <link href="./resources/css/myStyle.css" style="text/css" rel="stylesheet"> -->
<!-- /* .errMessage{
color:red;
font-size: 14px;
font


} */ -->
<link href="./resources/css/myStyles.css" style="text/css" rel="stylesheet">
<!-- <script type="text/javascript">
function validateForm(){
	var uname=myform.username.value;
	var flag=false;
	if(uname==""||uname==null){
		document.getElementById('userErrMsg').innerHTML="*Please enter username*"
	}
	else if(upwd=""||upwd==null){
		flag=false;
		document.getElementById('userErrMsg').innerHTML="";
		document.getElementById('pwdErrMsg').innerHTML="";
	}
	return flag;
} 
</script> -->
</head>
<body onload="">
	<h2 align="center">My Spring 5 MVC App</h2>
	<hr>
	<!-- <a href="hello">Click Here</a> -->
	
	<fieldset style="width: 500px; margin-left: 200px;">
	<legend align="top">Login Form</legend>
	<form method="post"  action="validateLogin">
		<table>
		<div id="imgcnt1">
<img alt="micky" src="./resources/images/mickey1.jpg">
</div>
			<tr>
				<th colspan="3">Login form</th>
			</tr>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="username"></td>
				<!-- <td><div id="errMsg" class="errMessage"> </div> </td> -->
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="login" value="login"></td>
			</tr>
		</table>
	</form>
	
	</fieldset>
	<hr>
	<div>
		<div style="float: left;">Capgemini FLP 2018</div>
		<div style="float: right;">Java FLP</div>
	</div>
</body>
</html>

