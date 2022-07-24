<%--
  Created by IntelliJ IDEA.
  User: huiyuanyang
  Date: 2022/7/24
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    double jpn = 4.5644;
    double usd = 0.0335;
    double cad = 0.0433;
    int amount = Integer.parseInt(request.getParameter("amount"));
%>

<h2>USD => <%= amount * usd %></h2>
<h2>JPN => <%= amount * jpn %></h2>
<h2>CAD => <%= amount * cad %></h2>

</body>
</html>
