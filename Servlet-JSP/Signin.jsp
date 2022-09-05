<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignIn</title>
</head>
<body>
<div align=left>
<h2> User SignIn</h2>
</div>

<form action=SignInServlet method=post>

<table>
<tr><td>Enter the UserName:</td><td><input type=text name=usersName></td></tr>
<tr><td>Enter the Password:</td> <td><input type=password name=userPwd></td></tr>
<tr><td><input type=submit value=Signin></td><td><input type=reset></td></tr>
</table>
	
</form>
</body>
</html>