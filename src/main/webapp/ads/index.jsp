<%--
  Created by IntelliJ IDEA.
  User: cyberlorber
  Date: 5/11/23
  Time: 11:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ad Listing</title>
</head>
<body>
<h1>All Ads</h1>
<ul>
    <c:forEach items="${ads}" var="ad">
        <li>
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
        </li>
    </c:forEach>
</ul>
</body>
</html>
