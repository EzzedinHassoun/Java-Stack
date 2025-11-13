<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Details</title>
</head>
<body>

<h1>Book Details</h1>

<label>ID: <c:out value="${book.id}"/></label><br>
<label>Title: <c:out value="${book.title}"/></label><br>
<label>Description: <c:out value="${book.description}"/></label><br>
<label>Language: <c:out value="${book.language}"/></label><br>
<label>Pages: <c:out value="${book.numberOfPages}"/></label><br>

</body>
</html>
