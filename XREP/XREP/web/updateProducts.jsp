<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.Products" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/20
  Time: 22:54
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
                <form action="idUpdateProducts.action" style="width: 880px;height: 500px;background-color: rgba(0,0,0,0.1);text-align: center; font-size: 15px;color: lightgray;">
                    <br>
                    <h2>修改产品信息</h2>
                    <br>
                    请选择要修改的产品的id：<br><br>
                    <select name="allProductsID" style="width: 300px;height: 40px;line-height: 40px;background-color: rgba(0,0,0,0.1);">
                        <%
                            ArrayList list = (ArrayList) session.getAttribute("allProductsId");
                            if (list.isEmpty()) {
                        %>
                        <option value="null">暂无用户信息</option>
                        <%
                        } else {
                            for (int i = 0; i < list.size(); i++) {
                                Products products = (Products) list.get(i);
                        %>
                        <option value="<%=products.getPid()%>"><%=products.getPid()%>
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
