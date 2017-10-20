<%--
  Created by IntelliJ IDEA.
  User: wilferaciolli
  Date: 20/10/2017
  Time: 22:22
  To change this template use File | Settings | File Templates.

This page will be used by spring to redirect the user when he is not logged on
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>WilFerraciolli Spring Log In example</title>
</head>
<body>
<h2>Spring Security 4 - Custom login form example</h2>
<hr />
<h4>Login Form</h4>

<form action='<spring:url value="/signin"/>' method="post">
    <table>
        <tr>
            <td>Username</td>
            <td><input type="text" name="userid"></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="passwd"></td>
        </tr>
        <tr>
            <td><button type="submit">Login</button></td>
        </tr>
    </table>
</form>
<br/>
<c:if test="${not empty sessionScope.message}">
    <span style="color:green"><c:out value="${sessionScope.message}"/></span>
    <c:remove var="message" scope="session" />
</c:if>
</body>
</html>