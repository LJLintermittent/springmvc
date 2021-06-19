<%--
  Created by IntelliJ IDEA.
  User: 20127
  Date: 2020/7/23
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加员工信息</title>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/index_work.css" />
</head>
<body>
<form action="emp" method="post">
    <table>
        <tr>
            <th colspan="2">添加员工信息</th>
        </tr>
        <tr>
            <td>姓名</td>
            <td>
                <input type="text" name="lastName" />
            </td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td>
                <input type="text" name="email" />
            </td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <input type="radio" name="gender" value="1" />男
                <input type="radio" name="gender" value="0" />女
            </td>
        </tr>
        <tr>
            <td>部门</td>
            <td>
                <select name="department.id">
                    <option>-请选择部门-</option>
                    <c:forEach items="${depts }" var="dept">
                        <option value="${dept.id }">${dept.departmentName }</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="提交" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
