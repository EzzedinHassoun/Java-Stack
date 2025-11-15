<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Burger</title>
    <style>
        body { width: 700px; margin: auto; padding-top: 20px; font-family: Arial; }
        input, textarea { width: 100%; margin-bottom: 10px; padding: 6px; }
        .note-box { background: #fff3b0; padding: 10px; border: 1px solid #e0c300; }
    </style>
</head>
<body>

<h1>Edit Burger</h1>
<a href="/burger/new">Go back</a>

<form:form action="/burger/${burger.id}" modelAttribute="burger" method="post">
    <input type="hidden" name="_method" value="put"/>

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

<div class="note-box">
    Some validations for creating a burger...
</div>

</body>
</html>
