<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h2>Welcome to your ${message}</h2>

<p>Hello , ${student.firstname} ${student.lastname}</p>
<br>
<p>Your complete address is : ${student.address.city},${student.address.state},${student.address.pincode}</p>

</body>
</html>