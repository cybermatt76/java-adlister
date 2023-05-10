<%--
  Created by IntelliJ IDEA.
  User: cyberlorber
  Date: 5/10/23
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Pick a Color" />
</jsp:include>
<body>
<jsp:include page="partials/navbar.jsp" />
<h1>Pick a Color</h1>
<form method="POST" action="/pickcolor">
    <label for="color">Enter your favorite color:</label>
    <input type="text" name="color" id="color">
    <br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>

