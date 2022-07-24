<%--
  Created by IntelliJ IDEA.
  User: huiyuanyang
  Date: 2022/7/24
  Time: 15:47
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

<h2>USD => <%= currency.getUsd() %></h2>
<h2>JPN => <%= currency.getJpn() %></h2>
<h2>CAD => <%= currency.getCad()%></h2>

</body>
</html>
