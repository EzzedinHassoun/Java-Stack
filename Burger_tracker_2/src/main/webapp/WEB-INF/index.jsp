<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Burger Tracker</title>
    <style>
        body { width: 700px; margin: auto; padding-top: 20px; font-family: Arial; }
        table { width: 100%; border-collapse: collapse; margin-bottom: 20px; }
        table, th, td { border: 1px solid black; }
        th, td { padding: 8px; }
        input, textarea { width: 100%; margin-bottom: 10px; padding: 6px; }
    </style>
</head>
<body>

<h1>Burger Tracker</h1>

<table>
    <tr>
        <th>Burger Name</th>
        <th>Restaurant Name</th>
        <th>Rating</th>
        <th>Action</th>
    </tr>

    <c:forEach var="b" items="${burgers}">
        <tr>
            <td>${b.burgerName}</td>
            <td>${b.restaurantName}</td>
            <td>${b.rating}</td>
            <td><a href="/burger/edit/${b.id}">edit</a></td>
        </tr>
    </c:forEach>
</table>

<h3>Add a Burger:</h3>

<form:form action="/burgers" method="post" modelAttribute="burger">

    <label>Burger Name:</label>
    <form:input path="burgerName"/>

    <label>Restaurant Name:</label>
    <form:input path="restaurantName"/>

    <label>Rating:</label>
    <form:input type="number" path="rating"/>

    <label>Notes:</label>
    <form:textarea path="notes"/>

    <button type="submit">Submit</button>
</form:form>

</body>
</html>
