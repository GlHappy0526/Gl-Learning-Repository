<%@ page import="bean.Users" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/13
  Time: 1:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="css/indexStyle.css">
</head>
<body>
<div class="container">
    <div class="top">
    </div>
    <div class="center">
        <div class="leftCenter">
            <ul >
                <a href="firstIndex.jsp"  target="frame1"><li class="mainMenuLI">首页</li></a>
                <a href="selectNews.action" target="frame1"><li class="mainMenuLI">新闻浏览</li></a>
                <a href="selectProducts.action" target="frame1"><li class="mainMenuLI">产品展示</li></a>
                <li class="mainMenuLI">
                    <a>留言板</a>
                    <ul class="menuUL">
                        <li><a href="addMessage.jsp" target="frame1">添加留言信息</a></li>
                        <li><a href="selectMessage.action" target="frame1">查询留言信息</a></li>
                    </ul>
                </li>
                <a href="index.jsp"><li class="mainMenuLI">退出</li></a>
            </ul>
        </div>
        <div class="rightCenter">
            <iframe class="iframe1" name="frame1" frameborder="no">
            </iframe>
        </div>
    </div>
</div>
</body>
</html>