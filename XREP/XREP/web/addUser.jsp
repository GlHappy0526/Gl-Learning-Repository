<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/11
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
    <link rel="stylesheet" href="css/addStyle.css">
</head>
<body>
<div class="container">
    <div class="left">
    </div>
    <div class="center">
        <div class="middle">
            <form action="addUser.action" style="width: 880px;height: 540px;background-color: rgba(0,0,0,0.1);text-align: center; font-size: 15px;color: lightgray;">
                <br>
                <h2>用户注册</h2>
                <br>
                昵称：<input type="text" name="nickname"><br><br>
                密码：<input type="text" name="password"><br><br>
                性别：<input type="text" name="sex"><br><br>
                生日：<input type="text" name="birthday"><br><br>
                家乡：<input type="text" name="hometown"><br><br>
                邮箱：<input type="text" name="email"><br><br>
                <input type="submit" value="添加" style="width: 60px;height: 30px;background-color: lightgray;border: 0px;">
                <input type="reset" value="重置" style="width: 60px;height: 30px;background-color: lightgray;border: 0px;">
            </form>
        </div>
    </div>
</div>
</body>
</html>
