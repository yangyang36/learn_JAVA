<%--
  Created by IntelliJ IDEA.
  User: s9208
  Date: 2022/6/1
  Time: 上午 09:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Obj.Currency" %>
<%@ page errorPage="error.jsp" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int amount = Integer.parseInt(request.getParameter("amount"));
    Currency currency = new Currency(amount);
%>

<h2>美金: <%= amount * currency.getUsd() %></h2>
<h2>日幣: <%= amount * currency.getJpn() %></h2>
<h2>人民幣: <%= amount * currency.getCny() %></h2>
</body>
</html>
