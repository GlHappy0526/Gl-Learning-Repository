<%@ page import="bean.Products" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/20
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改产品</title>
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
                    Products list = (Products) session.getAttribute("selectProducts");
                    if (list == null) {
                %>
                <div style="text-align: center; width: 880px;height: 600px; background-color: rgba(0,0,0,0.1);">
                    <p>暂无产品信息!</p>
                </div>
                <%
                } else {
                %>
                <form action="updateProducts.action"
                      style="width: 880px;height: 500px;background-color: rgba(0,0,0,0.1);text-align: center; font-size: 15px;color: lightgray;">
                    <br>
                    <h2>修改产品信息</h2>
                    <br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    产品id&nbsp;：<input type="text" name="pid" value="<%=list.getPid()%>"
                              readonly="readonly"
                              style="width: 378px; height: 40px;background-color: rgba(0,0,0,0.1);border: 1px solid black;"/><br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    产品名称（可修改）：<input type="text" name="pname" value="<%=list.getPname()%>"
                                   style="width: 378px; height: 40px; background-color: rgba(0,0,0,0.1);border: 1px solid black;"><br><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    产品简介（可修改）：<input type="text" name="introduction" value="<%=list.getIntroduction()%>"
                                   style="width: 378px; height: 40px;background-color: rgba(0,0,0,0.1);border: 1px solid black;"/><br><br><br><br><br><br><br><br><br>

                    <input type="submit" value="确定修改" width="900px">
                    <%
                        }
                    %>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
