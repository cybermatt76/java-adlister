<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />
    <div class="container">
        <h1>Welcome to the Adlister!</h1>
    </div>
    <br>
    <br>
    <div style="display: flex; justify-content: space-between;">
        <a href="http://localhost:8080/pizza-order"><button style="margin-right: 10px;">Pizza Order Form</button></a>
        <a href="http://localhost:8080/pickcolor"><button style="margin-right: 10px;">Color Page</button></a>
        <a href="http://localhost:8080/guess"><button>Guessing Game</button></a>
    </div>


</body>
</html>
