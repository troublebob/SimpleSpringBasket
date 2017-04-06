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
<a href="${pageContext.request.contextPath}/">Click Here to go to Product List</a>
<br>
<p>The total price of items in your basket is £:${totalPrice}</p>
<br>
<br>


<c:forEach items="${basketList}" var="item">
    <!--  -->
    <a href="remove/${item.title}">${item.title}, £${item.price}</a><br>
</c:forEach>
<br>
<br>
<a href="${pageContext.request.contextPath}/orderplaced">Click Here to go submit order</a>
</body>
</html>