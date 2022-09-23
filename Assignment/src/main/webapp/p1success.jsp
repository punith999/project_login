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


<h1 style="text-align:center;color:black;"><strong>Welcome <span><%=session.getAttribute("user") %></span></strong></h1>
<form action="logout" method="get">
<input type="submit" value="logout">
<hr>
</form>
<form action="view" method="post">
<label>VIEW DETAILS</label>
<input id="sub" type="submit" value="View Details">
</form>


</body>

</html>