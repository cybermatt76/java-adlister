<%--
  Created by IntelliJ IDEA.
  User: cyberlorber
  Date: 5/10/23
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<jsp:include page="partials/head.jsp">
  <jsp:param name="title" value="View Color" />
</jsp:include>
<body style="background-color: <%= request.getParameter("color") %>;">
<jsp:include page="partials/navbar.jsp" />
<h1>View Color</h1>
<p>Your favorite color is <%= request.getParameter("color") %>.</p>
</body>
</html>