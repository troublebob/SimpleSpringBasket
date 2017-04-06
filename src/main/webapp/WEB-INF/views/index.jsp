<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple Product List</title>
</head>
<body>
<p>Hello and welcome to the simple basket app. Click on a product to add it to your basket</p>
<br>
<a href="basket">Click Here to view your basket</a>
<br>
<br>
<br>

<c:forEach items="${productList}" var="item">
    <!--Getters don't need to be called with get for some reason  -->
    <a href="add/${item.title}">${item.title}, £${item.price}</a><br>
</c:forEach>



</body>
</html>