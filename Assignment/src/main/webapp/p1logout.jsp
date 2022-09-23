<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

</head>
<body>
<div class="logo">
<center>
<img src="images/sss.png" alt="image not found">
</center>
</div>


<h1 style="text-align:center;color:black;"><strong><span><%=session.getAttribute("user") %></span> you are successfully logged out. </strong></h1>
<a href=http://localhost:8080/Assignment/p1Login.jsp >home</a>



</body>
</html>