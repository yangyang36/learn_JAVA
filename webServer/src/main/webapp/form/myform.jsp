<%--
  Created by IntelliJ IDEA.
  User: huiyuanyang
  Date: 2022/7/19
  Time: 01:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/sessionRegis" method="GET">
    <label for="bookId">BookId: </label>
    <input type="number" name="bookId" id="bookId">
    <br>
    <label for="name">Book name: </label>
    <input type="text" name="name" id="name">
    <br>
    <label for="price">Price: </label>
    <input type="number" name="price" id="price">
    <br>
    <label for="author">Author: </label>
    <input type="text" name="author" id="author">

    <button type="submit">SUBMIT</button>

</form>
</body>
</html>
