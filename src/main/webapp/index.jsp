<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>ServletJspExample</title>
</head>
<body>
	<form action="servletexample" method = "post">
		<table><tr><td>Firstname: </td><td><input type = "text" name="firstname"></td>
		<tr><td>Lastname: </td><td><input type = "text" name="lastname"></td>
		<tr><td colspan="2"><input type ="submit" value="submit"> </td>
		</table> 
	</form>
</body>
</html>