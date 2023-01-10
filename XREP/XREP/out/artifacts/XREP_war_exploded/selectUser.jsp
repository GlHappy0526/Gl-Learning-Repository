<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.Users" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/11
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询用户</title>
</head>
<body>
<table border="1" width="80%" align="center" cellspacing="0">
    <caption>所有用户</caption>
    <tr>
        <th>用户账号</th>
        <th>用户密码</th>
        <th>用户昵称</th>
        <th>用户性别</th>
        <th>用户生日</th>
        <th>用户家乡</th>
        <th>用户邮箱</th>
    <tr>
        <%
        ArrayList list = (ArrayList) session.getAttribute("Users");
        if(list.isEmpty())
        {
            %>
    <tr><td colspan="7">暂无数据</td></tr>
    <%}else{
        for (int i = 0; i < list.size(); i++)
        {
            Users users = (Users) list.get(i);
    %>
    <tr>
        <td><%=users.getAccount()%></td>
        <td><%=users.getPassword()%></td>
        <td><%=users.getNickname()%></td>
        <td><%=users.getSex()%></td>
        <td><%=users.getBirthday()%></td>
        <td><%=users.getHometown()%></td>
        <td><%=users.getEmail()%></td>
    <tr>
            <%
            }
        }
%>
</table>
</body>
</html>
