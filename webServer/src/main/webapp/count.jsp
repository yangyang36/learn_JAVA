<%--
  Created by IntelliJ IDEA.
  User: huiyuanyang
  Date: 2022/7/24
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="counter" class="Obj.Counter" scope="application"></jsp:useBean>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% counter.increaseCount(); %>
    <p>You are vistor number <%= counter.getCount()%></p>
</body>
</html>
