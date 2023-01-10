<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.Messages" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/18
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改留言</title>
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
                    Messages list = (Messages) session.getAttribute("selectMessage");
                    if (list == null) {
                %>
                <div style="text-align: center; width: 880px;height: 600px; background-color: rgba(0,0,0,0.1);">
                    <p>暂无留言信息!</p>
                </div>
                <%
                } else {
                %>
                <form action="updateMessage.action"
                      style="width: 880px;height: 500px;background-color: rgba(0,0,0,0.1);text-align: center; font-size: 15px;color: lightgray;">
                    <br>
                    <h2>修改留言</h2>
                    <br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    留言ID：<input type="text" name="mid" value="<%=list.getMid()%>"
                           readonly="readonly"
                           style="width: 378px; height: 40px;background-color: rgba(0,0,0,0.1);border: 1px solid black;"/><br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    留言时间：<input type="text" name="messagetime" value="<%=list.getMessagetime()%>" readonly="readonly"
                           style="width: 378px; height: 40px; background-color: rgba(0,0,0,0.1);border: 1px solid black;"><br><br>
                    留言内容(可修改)：<textarea rows="6" cols="50" name="message"
                              style="background-color: rgba(0,0,0,0.1);border: 1px solid black;"><%=list.getMessage()%></textarea><br/><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    留言用户：<input type="text" name="nickname" value="<%=list.getNickname()%>" readonly="readonly"
                           style="width: 378px; height: 40px;background-color: rgba(0,0,0,0.1);border: 1px solid black;"/><br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    留言账号：<input type="text" name="account" value="<%=list.getAccount()%>" readonly="readonly"
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
