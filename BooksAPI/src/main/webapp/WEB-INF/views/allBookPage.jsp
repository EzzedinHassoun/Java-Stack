<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>All Books</title></head>
<body>
<h1>All Books</h1>
<table border="1">
    <tr><th>ID</th><th>Title</th><th>Language</th><th>Number of pages</th></tr>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td><a href="/book/${book.id}">${book.title}</a></td>
            <td>${book.language}</td>
            <td>${book.numberOfPages}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
