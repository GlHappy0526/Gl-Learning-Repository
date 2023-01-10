<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.News" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/20
  Time: 0:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改新闻</title>
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
                    News list = (News) session.getAttribute("selectNews");
                    if (list == null) {
                %>
                <div style="text-align: center; width: 880px;height: 600px; background-color: rgba(0,0,0,0.1);">
                    <p>暂无新闻!</p>
                </div>
                <%
                } else {
                %>
                <form action="updateNews.action"
                      style="width: 880px;height: 500px;background-color: rgba(0,0,0,0.1);text-align: center; font-size: 15px;color: lightgray;">
                    <br>
                    <h2>修改新闻</h2>
                    <br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    新闻ID：<input type="text" name="nid" value="<%=list.getNid()%>"
                                readonly="readonly"
                                style="width: 378px; height: 40px;background-color: rgba(0,0,0,0.1);border: 1px solid black;"/><br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    新闻标题(可修改)：<input type="text" name="title" value="<%=list.getTitle()%>"
                                style="width: 378px; height: 40px; background-color: rgba(0,0,0,0.1);border: 1px solid black;"><br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    新闻内容(可修改)：<textarea rows="6" cols="50" name="ncontent"
                                        style="background-color: rgba(0,0,0,0.1);border: 1px solid black;"><%=list.getNcontent()%></textarea>
                    <br/><br><br><br><br><br><br>
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