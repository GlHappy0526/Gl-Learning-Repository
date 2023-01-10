<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.Users" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/11
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除用户</title>
    <link rel="stylesheet" href="css/addStyle.css">
</head>
<body>
<div class="container">
    <div class="left">
    </div>
    <div class="center">
        <div class="middle">
            <form action="deleteUser.action" style="width: 880px;height: 500px;background-color: rgba(0,0,0,0.1);text-align: center; font-size: 15px;color: lightgray;">
                <br>
                <h2>删除用户</h2>
                <br>
                请选择你要删除的用户id：<br><br>
                <select name="allUsersAccount" style="width: 300px;height: 40px;line-height: 40px;background-color: rgba(0,0,0,0.1);">
                    <%
                        ArrayList list = (ArrayList) session.getAttribute("allUsersAccount");
                        if (list.isEmpty()) {
                    %>
                    <option value="null">暂无留言</option>
                    <%
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            Users user = (Users) list.get(i);
                    %>
                    <option value="<%=user.getAccount()%>"><%=user.getAccount()%>
                    </option>
                    <%
                            }
                        }
                    %>
                </select>
                <br><br>
                <input type="submit" value="确定" style="width: 60px;height: 30px;background-color: lightgray;border: 0px;">
            </form>
        </div>
    </div>
</div>
</body>
</html>
