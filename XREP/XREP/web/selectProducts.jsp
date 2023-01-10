<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.Products" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/11
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询产品</title>
    <link rel="stylesheet" href="./css/selectStyle.css">
</head>
<body>
<br>
<h2>&nbsp;&nbsp;&nbsp;&nbsp;产品展示</h2><hr>
<%
    ArrayList list = (ArrayList) session.getAttribute("selectProducts");
    if(list.isEmpty())
    {
%>
<div class="news">
    暂无新闻
</div>
    <%}else{
        for (int i = 0; i < list.size(); i++)
        {
            Products product = (Products) list.get(i);
    %>
    <div class="news">
        <div class="newsTitle">
            <%=product.getPname()%>
        </div>
        <div class="newsContent">
            <%=product.getIntroduction()%>
        </div>
    </div>
            <%
            }
        }
%>
</table>

</body>
</html>
