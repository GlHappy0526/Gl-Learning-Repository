<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.Messages" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/11
  Time: 21:53
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
                <form action="idSelectMessage.action" style="width: 880px;height: 500px;background-color: rgba(0,0,0,0.1);text-align: center; font-size: 15px;color: lightgray;">
                    <br>
                    <h2>修改留言</h2>
                    <br>
                    请选择要修改的留言的id：<br><br>
                    <select name="allMessageId" style="width: 300px;height: 40px;line-height: 40px;background-color: rgba(0,0,0,0.1);">
                        <%
                            ArrayList list = (ArrayList) session.getAttribute("allMessageId");
                            if (list.isEmpty()) {
                        %>
                        <option value="null">暂无留言</option>
                        <%
                        } else {
                            for (int i = 0; i < list.size(); i++) {
                                Messages messages = (Messages) list.get(i);
                        %>
                        <option value="<%=messages.getMid()%>"><%=messages.getMid()%>
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
</div>
</body>
</html>
