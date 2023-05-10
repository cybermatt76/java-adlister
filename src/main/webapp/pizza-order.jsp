<%--
  Created by IntelliJ IDEA.
  User: cyberlorber
  Date: 5/10/23
  Time: 9:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Pizza Order Form" />
</jsp:include>
<body>
<jsp:include page="partials/navbar.jsp" />
<h1>Pizza Order Form</h1>
<form action="${pageContext.request.contextPath}/pizza-order" method="post">
    <%--@declare id="toppings"--%><label for="crust-type">Crust Type:</label>
    <select name="crust-type" id="crust-type">
        <option value="thin">Thin</option>
        <option value="thick">Thick</option>
        <option value="stuffed">Stuffed</option>
    </select><br><br>

    <label for="sauce-type">Sauce Type:</label>
    <select name="sauce-type" id="sauce-type">
        <option value="marinara">Marinara</option>
        <option value="alfredo">Alfredo</option>
        <option value="bbq">BBQ</option>
    </select><br><br>

    <label for="size-type">Size Type:</label>
    <select name="size-type" id="size-type">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select><br><br>

    <label for="toppings">Toppings:</label><br>
    <input type="checkbox" name="toppings" value="pepperoni" id="toppings-pepperoni">
    <label for="toppings-pepperoni">Pepperoni</label><br>
    <input type="checkbox" name="toppings" value="mushrooms" id="toppings-mushrooms">
    <label for="toppings-mushrooms">Mushrooms</label><br>
    <input type="checkbox" name="toppings" value="onions" id="toppings-onions">
    <label for="toppings-onions">Onions</label><br>
    <input type="checkbox" name="toppings" value="sausage" id="toppings-sausage">
    <label for="toppings-sausage">Sausage</label><br><br>

    <label for="delivery-address">Delivery Address:</label>
    <input type="text" name="delivery-address" id="delivery-address"><br><br>


    <input type="submit" value="Submit">
</form>
</body>
</html>
