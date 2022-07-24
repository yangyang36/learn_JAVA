<%--
  Created by IntelliJ IDEA.
  User: huiyuanyang
  Date: 2022/7/24
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% for (int j = 1; j<= 100; j++){ %>
1 + 2 + 3 + ..... + <%= j %> = <%= addUpTO(j)%>
<br/>
<%}%>

<%!
    private int addUpTO(int n){
        int result = 0;
        for(int i=0; i <=n;i++){
            result +=i ;
        }
        return result;
    }
%>


</body>
</html>
