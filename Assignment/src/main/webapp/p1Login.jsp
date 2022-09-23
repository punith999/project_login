<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title style="color:red;"> Sopra Steria - Login Page</title>
<link type="text/css" rel="stylesheet" href="css/peace.css" >

</head>
<body>
<div class="logo">
</div>
<center>
<label><h1></h1><img alt="image not found" src="images/sss.png"></h1></label>
</center>
<div class="det" >
<form action="login" method="post">
<center>
<label><h1 class="tex">Login</h1></label>
<lable  for="user" style="font-size:120%;" >user name:</lable><br>
<input class="box" type="text" id="user" name="user" placeholder="Enter the username" ><br><br>
<lable for="pass" style="font-size:120%;" >password: </lable><br>
<input class="box" type="password" id="pass" name="pass" placeholder="Enter the password"); "><br><br>
<input type="submit" value="log In" ><br>
<input type="checkbox" id="check">
<lable class="tex"  for="check" style="color:blue;">Remember me</lable><br>

<p Style="color:red;">Don't have an account?<span><a href="http://localhost:8080/Assignment/P1reg.jsp" style="text-decoration:none;color:green;"> Sign Up for a Free Trial</a></span></p>
</center>
</form>
</div>

</body>
</html>