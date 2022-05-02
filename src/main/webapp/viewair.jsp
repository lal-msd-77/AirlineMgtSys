<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Airline Management</title>
</head>
<body>
<div>
	<p>VIEW AIRLINE</p>
	<form action="viewair" method="get">
		ID:<input type="text" name="id"><br>
		<input type="submit" value="VIEW">
	</form>
</div>
<div>
	<p>VIEW ALL AIRLINE</p>
	<form action="viewallair" method="get">
		<input type="submit" value="VIEW ALL">
	</form>
</div>
</body>
</html>