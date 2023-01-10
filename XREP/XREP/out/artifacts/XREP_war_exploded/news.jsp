<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/7
  Time: 4:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.List,bean.News"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>news</title>
</head>
<body>
    <table border="1" width="80%" align="center" cellspacing="0">
        <caption>新闻列表</caption>
        <tr><th>新闻id</th><th>新闻标题</th><th>新闻内容</th><tr>
            <%List<News>  news=(List<News>)request.getAttribute("news");
if(news==null)
{
%>
        <tr><td colspan="3">没有符合条件的数据</td></tr>
        <%}else{
            for(News news1:news)
            {

        %>
        <tr><td><%=news1.getNid() %></td>
            <td><%=news1.getTitle() %></td>
            <td><%=news1.getNcontent()  %></td>
        <tr>
                <%}} %>
    </table>
</form>
</body>
</html>
