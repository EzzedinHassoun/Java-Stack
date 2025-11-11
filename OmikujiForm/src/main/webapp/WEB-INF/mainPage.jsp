<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Omikuji Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h1 class="text-center text-primary mb-4">Send an Omikuji!</h1>

    <form action="/send" method="post" class="border p-4 shadow rounded bg-light">

        <div class="mb-3">
            <label for="numberSelect" class="form-label">Pick any number from 5 to 25:</label>
            <select id="numberSelect" class="form-select" name="number">
                <c:forEach var="i" begin="5" end="25">
                    <option>${i}</option>
                </c:forEach>
            </select>
        </div>

        <div class="mb-3">
            <label for="cityInput" class="form-label">Enter the name of any city:</label>
            <input type="text" class="form-control" id="cityInput" name="city" placeholder="e.g. Nairobi">
        </div>

        <div class="mb-3">
            <label for="personInput" class="form-label">Enter the name of any real person:</label>
            <input type="text" class="form-control" id="personInput" name="person" placeholder="e.g. Bob Dylan">
        </div>

        <div class="mb-3">
            <label for="hobbyInput" class="form-label">Enter a professional endeavor or hobby:</label>
            <input type="text" class="form-control" id="hobbyInput" name="hobby" placeholder="e.g. selling origamis">
        </div>

        <div class="mb-3">
            <label for="animalInput" class="form-label">Enter any type of living thing:</label>
            <input type="text" class="form-control" id="animalInput" name="animal" placeholder="e.g. ferret">
        </div>

        <div class="mb-3">
            <label for="niceMessage" class="form-label">Say something nice to someone:</label>
            <textarea class="form-control" id="niceMessage" rows="3" name="nice" placeholder="e.g. You do not realize how happy you make others."></textarea>
        </div>

        <div class="text-center">
            <h3 class="mb-3">Send and show a friend</h3>
            <button type="submit" class="btn btn-primary px-4">Send</button>
        </div>
    </form>
</div>
</body>
</html>
