<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Omikuji Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center text-success mb-4">Here's Your Omikuji!</h1>

    <div class="card shadow-sm p-4">
        <div class="card-body">
            <p class="fs-5">In <span class="fw-bold"><c:out value="${number}" /></span> years, you will live in <span class="fw-bold"><c:out value="${city}" /></span> with <span class="fw-bold"><c:out value="${person}" /></span> as your roommate, <span class="fw-bold"><c:out value="${hobby}" /></span> for a living.</p>
            <p class="fs-5">The next time you see a <span class="fw-bold"><c:out value="${animal}" /></span>, you will have good luck.</p>
            <p class="fs-5">Also, <span class="fw-bold"><c:out value="${nice}" /></span></p>
        </div>
    </div>

    <div class="text-center mt-4">
        <a href="/" class="btn btn-primary">Go Back</a>
    </div>
</div>
</body>
</html>
