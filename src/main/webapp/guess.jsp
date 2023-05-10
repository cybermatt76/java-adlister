<%--
  Created by IntelliJ IDEA.
  User: cyberlorber
  Date: 5/10/23
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Guess a Number" />
</jsp:include>
<body>
<jsp:include page="partials/navbar.jsp" />
<h1>Guess a Number</h1>
<form action="guess" method="post">
    <label for="number">Enter a number between 1 and 3:</label>
    <input type="number" id="number" name="number" min="1" max="3">
    <button type="submit">Guess</button>
</form>
</body>
</html>
