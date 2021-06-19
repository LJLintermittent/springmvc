<%--
  Created by IntelliJ IDEA.
  User: 20127
  Date: 2020/7/23
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/index_work.css">
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/js/jquery-1.8.2.min.js"> </script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                   url:"testJson",
                   type:"POST",
                   dataType:"text",
                   success:function (msg) {
                       var tb = "<table>";
                       tb += "<tr><th>姓名</th><th>编号</th><th>性别</th><th>邮箱</th></tr>";
                       tb += "<table>";
                       $("body").append(tb);
                       // alert(msg);
                       }
                });
            });
        });
    </script>
</head>
<body>
<a href="test">测试重定向</a>

<form action="test" method="post">
    <input type="text" name="username">
    <input type="submit" value="提交">
</form><br/>

<a href="testJson">测试Json</a> <br/>

<input id="btn" type="button" value="测试ajax"><br/>

<a href="down">下载图片</a><br/>

<form action="up" method="post" enctype="multipart/form-data">
    头像：<input type="file" name="uploadFile"/>
    描述：<input type="text" name="desc"/>
    <input type="submit" value="上传">
</form><br/>

<a href="testJson2">测试Json2</a><br/>

<a href="testInterceptor">测试拦截器</a><br/>

<a href="testException">测试异常</a><br/>

</body>
</html>
