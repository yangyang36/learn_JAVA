<%--
  Created by IntelliJ IDEA.
  User: s9208
  Date: 2022/6/1
  Time: 上午 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="counter" class="Obj.Counter" scope="page"></jsp:useBean>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% counter.increaseCount(); %>
    <p>You are visitor number <%= counter.getCount() %></p>
</body>
</html>
