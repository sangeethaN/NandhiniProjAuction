<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Stocks</title>
</head>
<body>
<form action="StockController" method=post name=register>
<input type=checkbox value=google name="company">google<br>
<input type=checkbox value=amway name="company">amway<br>
<input type=checkbox value="cisco systems" name="company">cisco systems<br>
<input type=checkbox value=intel name="company">intel<br>
<input type=checkbox value=mcgraw-hill name="company">McGraw-Hill<br>
USERNAME:<input type=text name="username">
<br>
<input type="submit" value="submit">




</form>
</body>
</html>