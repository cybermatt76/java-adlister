<%--
  Created by IntelliJ IDEA.
  User: cyberlorber
  Date: 5/10/23
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Outcome" />
</jsp:include>
<body>
<jsp:include page="partials/navbar.jsp" />
<h1><%= request.getAttribute("message") %></h1>
</body>
</html>
