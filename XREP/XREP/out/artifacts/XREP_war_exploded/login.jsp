<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/7
  Time: 3:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>欢迎登录</title>
    <link rel="stylesheet" href="css/loginStyle.css">
</head>
<body>
<div class="container">
    <div class="left">
        <div>
            <br><br><br>
            <p class="pStyle">&nbsp;&nbsp;&nbsp;欢迎登录</p>
            <hr>
            <h6>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请先登录,才能使用</h6>
        </div>
    </div>
    <div class="right">
        <form action="userLogin.action">
            <br><br>
            &nbsp;&nbsp;&nbsp;&nbsp;
            账号：<input type="text" name="account" ><br>
            &nbsp;&nbsp;&nbsp;&nbsp;
            密码：<input type="password" name="password">
            <br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="addUser.jsp" target="_top">点此注册</a>
            <br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input class="buttonStyle" type="submit" name="access" value="登录">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input class="buttonStyle" type="reset" name="register" value="重置">
        </form>
    </div>
</div>
</body>
</html>
