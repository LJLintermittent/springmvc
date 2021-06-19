<%--
  Created by IntelliJ IDEA.
  User: 20127
  Date: 2020/7/23
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>展示员工列表</title>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/index_work.css" />
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/jquery-1.8.2.min.js">

    </script>
    <script type="text/javascript">
        $(function () {
            $(".del").click(function () {
                if(confirm("你确认要删除吗")){
                    $("form").attr("action",$(this).attr("href")).submit();
                    return false;
                }
                return false;
            });
        });
    </script>
</head>
<body>
<table>
    <tr>
        <th>员工编号</th>
        <th>姓名</th>
        <th>邮箱</th>
        <th>性别</th>
        <th>部门名称</th>
        <th>操作(<a href="emp">添加</a>)</th>
    </tr>
    <c:forEach items="${emps}" var="emp">
        <tr>
           <td>${emp.id}</td>
           <td>${emp.lastName}</td>
           <td>${emp.email}</td>
           <td>${emp.gender==0?'女':'男'}</td>
           <td>${emp.department.departmentName}</td>
           <td>
               <a href="emp/${emp.id}" >修改</a>
               <a class="del" href="emp/${emp.id}">删除</a>
           </td>
        </tr>

    </c:forEach>
</table>
<form method="post" >
<input type="hidden" name="_method" value="DELETE"/>
</form>
</body>
</html>
