<%--
  Created by IntelliJ IDEA.
  User: s9208
  Date: 2022/5/31
  Time: 下午 04:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/sessionRegis" method="get">
    <label>Book Id:</label>
    <input type="number" name="bookId">
    <br>
    <label>Book Name:</label>
    <input type="text" name="name">
    <br>
    <label>Price:</label>
    <input type="number" name="price">
    <br>
    <label>Author:</label>
    <input type="text" name="author">
    <br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
