<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ninja Gold Game</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f9f9f9;
        }
        .container {
            width: 80%;
            margin: auto;
        }
        .boxes {
            display: flex;
            justify-content: space-around;
            margin: 20px 0;
        }
        .box {
            background-color: #fff;
            border: 2px solid #ccc;
            width: 20%;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 2px 2px 10px rgba(0,0,0,0.1);
        }
        .activities {
            width: 80%;
            margin: auto;
            height: 200px;
            border: 2px solid #ccc;
            background-color: #fff;
            overflow-y: scroll;
            text-align: left;
            padding: 10px;
            border-radius: 10px;
        }
        .gold {
            font-size: 22px;
            font-weight: bold;
        }
        .earned { color: green; }
        .lost { color: red; }
        button {
            padding: 8px 15px;
            background-color: #008CBA;
            color: white;
            border: none;
            border-radius: 6px;
            cursor: pointer;
        }
        button:hover {
            background-color: #006F9A;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Ninja Gold Game</h1>
    <p class="gold">Your Gold: <c:out value="${gold}"/></p>

    <div class="boxes">
        <form action="/process" method="post" class="box">
            <h3>Farm</h3>
            <p>(earns 10–20 gold)</p>
            <input type="hidden" name="place" value="farm">
            <button type="submit">Find Gold!</button>
        </form>

        <form action="/process" method="post" class="box">
            <h3>Cave</h3>
            <p>(earns 5–10 gold)</p>
            <input type="hidden" name="place" value="cave">
            <button type="submit">Find Gold!</button>
        </form>

        <form action="/process" method="post" class="box">
            <h3>House</h3>
            <p>(earns 2–5 gold)</p>
            <input type="hidden" name="place" value="house">
            <button type="submit">Find Gold!</button>
        </form>

        <form action="/process" method="post" class="box">
            <h3>Quest</h3>
            <p>(earns/takes 0–50 gold)</p>
            <input type="hidden" name="place" value="quest">
            <button type="submit">Find Gold!</button>
        </form>
    </div>

    <form action="/reset" method="post">
        <button type="submit">Reset Game</button>
    </form>

    <h3>Activities:</h3>
    <div class="activities">
        <c:forEach var="msg" items="${activities}">
            <p class="${msg.contains('earned') ? 'earned' : 'lost'}">${msg}</p>
        </c:forEach>
    </div>
</div>
</body>
</html>
