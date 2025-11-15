<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Burger Tracker</title>
    <style>
        body { font-family: Arial; width: 600px; margin: auto; }
        table { width: 100%; border-collapse: collapse; }
        table, th, td { border: 1px solid black; padding: 8px; }
        h2 { color: #1f4e79; }
        .error { color: red; }
    </style>
</head>
<body>

<h2>Burger Tracker</h2>

<table>
    <thead>
    <tr>
        <th>Burger Name</th>
        <th>Restaurant Name</th>
        <th>Rating (out of 5)</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="b" items="${burgers}">
        <tr>
            <td>${b.burgerName}</td>
            <td>${b.resturentName}</td>
            <td>${b.rating}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<br><br>

<h2>Add a Burger:</h2>

<form:form action="/burgers" method="post" modelAttribute="burger">

    <p class="error">
        <form:errors path="*" />
    </p>

    <label>Burger Name</label><br>
    <form:input path="burgerName"/><br><br>

    <label>Restaurant Name</label><br>
    <form:input path="resturentName"/><br><br>

    <label>Rating</label><br>
    <form:input type="number" path="rating"/><br><br>

    <label>Notes</label><br>
    <form:textarea path="note"/><br><br>

    <button type="submit">Submit</button>

</form:form>

</body>
</html>
