<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Data Template</title>
    <script>
        window.onload = function() {
            alert("This is the time template");
        };
    </script>
</head>
<body>
<h2>Current Date</h2>
<p>Date: <c:out value="${currentDate}"/></p>
</body>
</html>
