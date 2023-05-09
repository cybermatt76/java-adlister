<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="partials/head.jsp" />

<body>
    <h1>Implicit Objects in action:</h1>
    <p>Path: <%= request.getRequestURL()%></p>
    <p>Query String: <%= request.getRequestURL()%></p>
    <p>"name" parameter: <%= request.getParameter("name")%></p>

    <h2>EL / Expression Language</h2>
    <p>"name" parameter: ${param["name"]}</p>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
</body>
</html>
