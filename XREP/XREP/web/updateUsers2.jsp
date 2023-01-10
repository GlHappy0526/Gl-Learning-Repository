<%@ page import="bean.Users" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/19
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户</title>
    <link rel="stylesheet" href="css/addStyle.css">
</head>
<body>
<div class="container">
    <div class="left">
    </div>
    <div class="center">
        <div class="top">
            <div class="middle">
                <%
                    Users list = (Users) session.getAttribute("selectUser");
                    if (list == null) {
                %>
                <div style="text-align: center; width: 880px;height: 600px; background-color: rgba(0,0,0,0.1);">
                    <p>暂无用户信息!</p>
                </div>
                <%
                } else {
                %>
                <form action="updateUser.action"
                      style="width: 880px;height: 550px;background-color: rgba(0,0,0,0.1);text-align: center; font-size: 15px;color: lightgray;">
                    <br>
                    <h2>修改用户</h2>
                    <br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    账号：<input type="text" name="account" value="<%=list.getAccount()%>"
                                readonly="readonly"
                                style="width: 378px; height: 40px;background-color: rgba(0,0,0,0.1);border: 1px solid black;"/><br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    密码（可修改）：<input type="text" name="password" value="<%=list.getPassword()%>"
                                style="width: 378px; height: 40px; background-color: rgba(0,0,0,0.1);border: 1px solid black;"><br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    昵称（可修改）：<input type="text" name="nickname" value="<%=list.getNickname()%>"
                                   style="width: 378px; height: 40px;background-color: rgba(0,0,0,0.1);border: 1px solid black;"/><br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    性别（可修改）：<input type="text" name="sex" value="<%=list.getSex()%>"
                                style="width: 378px; height: 40px;background-color: rgba(0,0,0,0.1);border: 1px solid black;"/><br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    生日（可修改）：<input type="text" name="birthday" value="<%=list.getBirthday()%>"
                              style="width: 378px; height: 40px;background-color: rgba(0,0,0,0.1);border: 1px solid black;"/><br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    家乡（可修改）：<input type="text" name="hometown" value="<%=list.getHometown()%>"
                              style="width: 378px; height: 40px;background-color: rgba(0,0,0,0.1);border: 1px solid black;"/><br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    邮箱（可修改）：<input type="text" name="email" value="<%=list.getEmail()%>"
                              style="width: 378px; height: 40px;background-color: rgba(0,0,0,0.1);border: 1px solid black;"/><br><br>
                    <input type="submit" value="确定修改" width="900px">
                    <%
                        }
                    %>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
