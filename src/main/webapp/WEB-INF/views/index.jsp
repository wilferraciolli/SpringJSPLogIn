<%--
  Created by IntelliJ IDEA.
  User: wilferaciolli
  Date: 20/10/2017
  Time: 22:24
  To change this template use File | Settings | File Templates.

  Once the user has successfully logged on he will be redirect to this page.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>WilFerraciolli Log In Example</title>
</head>
<body>
<h2>Spring Security 4 - Custom login form example</h2>
<hr/>
<h4>${message}</h4>
<br>
<a href='<spring:url value="/hello"/>'>Hello</a>
<a href='<spring:url value="/signout"/>'>Logout</a>
</body>
</html>
