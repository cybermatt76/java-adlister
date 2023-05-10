<%--
  Created by IntelliJ IDEA.
  User: cyberlorber
  Date: 5/9/23
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Your Blog" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />
<div class="container">
    <h1>Create a Blog Post</h1>
    <form action="createPost" method="post">
        <label for="post">Your post;</label>
        <textarea name="post" id="post" cols="30" rows="10"></textarea>
        <input type="submit" value="submit">
    </form>
<c:if test="${post != null}}">
    <h3>Your blog Post</h3>
    <p>${post}</p>
</c:if>
</div>

</body>
</html>
