<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.News" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/11
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询新闻</title>
    <link rel="stylesheet" href="./css/selectStyle.css">
</head>
<body>
<br>
<h2>&nbsp;&nbsp;&nbsp;&nbsp;新闻浏览</h2><hr>
<%
    ArrayList list = (ArrayList) session.getAttribute("selectNews");
    if(list.isEmpty())
    {
%>
<div class="news">
    暂无新闻
</div>
    <%}else{
        for (int i = 0; i < list.size(); i++)
        {
            News news = (News) list.get(i);
    %>
    <div class="news">
        <div class="newsTitle">
            <%=news.getTitle()%>
        </div>
        <div class="newsContent">
            <%=news.getNcontent()%>
        </div>
    </div>
            <%
            }
        }
%>
</table>
</body>
</html>
