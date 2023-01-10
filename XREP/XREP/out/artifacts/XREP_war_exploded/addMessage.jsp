<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/11
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加留言</title>
    <link rel="stylesheet" type="text/css" href="css/addStyle.css">
</head>
<body>
<div class="container">
    <div class="left">
    </div>
    <div class="center">
        <div class="middle">
            <form action="addMessage.action" style="width: 880px;height: 500px;background-color: rgba(0,0,0,0.1);text-align: center; font-size: 15px;color: lightgray;">
                <br>
                <h2>添加留言</h2>
                <br>
                账号：<input type="text" name="account"><br><br>
                昵称：<input type="text" name="nickname"><br><br>
                留言：<input type="text" name="message"><br><br>
                <input type="submit" value="添加" style="width: 60px;height: 30px;background-color: lightgray;border: 0px;">
                <input type="reset" value="重置" style="width: 60px;height: 30px;background-color: lightgray;border: 0px;">
            </form>
        </div>
    </div>
</div>
</body>
</html>
