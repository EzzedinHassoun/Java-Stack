<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Time Template</title>
    <script>
        window.onload = function() {
            alert("This is the time template");
        };
    </script>
</head>
<body>
<h2>Current Time</h2>
<p>Time: <c:out value="${currentTime}" /></p>
</body>
</html>
