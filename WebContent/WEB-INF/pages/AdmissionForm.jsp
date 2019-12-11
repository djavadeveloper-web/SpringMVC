<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply here !</title>
</head>
<body>
  <h2>Please Enter your name here ! </h2>
<form action="/SpringMVC/admissionSubmit.html" method="post">
  First name:<br>
  <input type="text" name="firstname"  >
  <br>
  Last name:<br>
  <input type="text" name="lastname"   >
  <br><br>
  City :<br>
  <input type="text" name="address.city"  >
  <br>
  State :<br>
  <input type="text" name="address.state"   >
  <br>
  Pincode :<br>
  <input type="text" name="address.pincode"  >
  <br>
  
  <input type="submit" >
</form> 

</body>
</html>