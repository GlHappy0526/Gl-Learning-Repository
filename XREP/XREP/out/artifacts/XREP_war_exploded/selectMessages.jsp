<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/11
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.List,bean.Messages"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>查询留言</title>
    <link rel="stylesheet" href="./css/selectStyle.css">
</head>
<body>
<br>
<h2>&nbsp;&nbsp;&nbsp;&nbsp;留言浏览</h2><hr>
        <%
        ArrayList list = (ArrayList) session.getAttribute("selectMessage");
        if(list.isEmpty())
        {
            %>
<div class="news">
    暂无产品
</div>
    <%}else{
            for (int i = 0; i < list.size(); i++)
            {
                Messages message = (Messages) list.get(i);
                %>
<div class="news">
    <div class="newsTitle">
        <%=message.getNickname()%>
    </div>
    <div class="newsContent">
        <%=message.getMessage()%>
    </div>
</div>
        <%
            }
        }
%>
</body>
</html>
