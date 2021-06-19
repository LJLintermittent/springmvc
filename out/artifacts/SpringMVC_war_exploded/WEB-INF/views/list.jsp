<%--
  Created by IntelliJ IDEA.
  User: 20127
  Date: 2020/7/22
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
    <style>
        table{
            border: 1px solid blueviolet;
            width: 500px;
            height: 300px;
            border-collapse: collapse;
        }

        th,td{
           border: 1px solid blueviolet;
        }
    </style>
</head>
<body>
<table align="center" >
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>性别</th>
        <th>年龄</th>
    </tr>
    <c:forEach items="${allUser}" var="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.gender}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
