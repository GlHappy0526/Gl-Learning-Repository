<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/8
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息管理</title>
    <link rel="stylesheet" href="css/adminManagementStyle.css">
</head>
<body>
<div class="container">
    <div class="top">
    </div>
    <div class="center">
        <div class="leftCenter">
            <ul >
                <li class="mainMenuLI">
                    <a>用户管理</a>
                    <ul class="menuUL">
                        <li><a href="addUser.jsp" target="frame2">添加用户信息</a></li>
                        <li><a href="allUsersAccount.action" target="frame2">修改用户信息</a></li>
                        <li><a href="idSelectUserAccount.action" target="frame2">删除用户信息</a></li>
                        <li><a href="selectUser.action" target="frame2">查询用户信息</a></li>
                    </ul>
                </li>
                <li class="mainMenuLI">
                    <a>新闻管理</a>
                    <ul class="menuUL">
                        <li><a href="addNews.jsp" target="frame2">添加新闻信息</a></li>
                        <li><a href="allNewsID.action" target="frame2">修改新闻信息</a></li>
                        <li><a href="idDelNews.action" target="frame2">删除新闻信息</a></li>
                        <li><a href="selectNews.action" target="frame2">查询新闻信息</a></li>
                    </ul>
                </li>
                <li class="mainMenuLI">
                    <a>产品管理</a>
                    <ul class="menuUL">
                        <li><a href="addProducts.jsp" target="frame2">添加产品信息</a></li>
                        <li><a href="allProductsID.action" target="frame2">修改产品信息</a></li>
                        <li><a href="idDelProducts.action" target="frame2">删除产品信息</a></li>
                        <li><a href="selectProducts.action" target="frame2">查询产品信息</a></li>
                    </ul>
                </li>
                <li class="mainMenuLI">
                    <a>留言管理</a>
                    <ul class="menuUL">
                        <li><a href="addMessage.jsp" target="frame2">添加留言信息</a></li>
                        <li><a href="SelectMessageID.action" target="frame2">修改留言信息</a></li>
                        <li><a href="idDelMessage.action" target="frame2">删除留言信息</a></li>
                        <li><a href="selectMessage.action" target="frame2">查询留言信息</a></li>
                    </ul>
                </li>
                <li class="mainMenuLI"><a href="index.jsp">退出</a></li>
            </ul>
        </div>
        <div class="rightCenter">
            <iframe class="iframe2" name="frame2" frameborder="no">
            </iframe>
        </div>
    </div>
</div>
</body>
</html>
