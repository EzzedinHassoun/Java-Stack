<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Read Share</title>
    
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
     
</head>
<body>
	<div class=" d-flex justify-content-between m-5">
		<h1 class="welcome">Welcome ${user.userName}!!!</h1>
		<div>
			<a href="/logout" class="btn btn-outline-danger"> Logout</a>			
		</div>
		<div>			
		<a href="/books/new" class="btn btn-outline-danger"> + Add a to my shelf!</a>
		</div>
	</div>
	    <h2 class="mt-5">Books From everyone's shelves:</h2>
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>ID</th>
                <th>title</th>
                <th>Author Name:</th>
                <th>Posted By:</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.id}</td>
                <td><a href="/books/${book.id}"><c:out value="${book.title}" /></a></td>
                <td><c:out value="${book.author_name}" /></td>
                <td><c:out value="${book.user.userName}" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</body>
</html>