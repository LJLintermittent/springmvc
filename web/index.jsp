<%--
  Created by IntelliJ IDEA.
  User: 20127
  Date: 2020/7/21
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <script type="text/javascript" src="JQuery/jquery-1.7.2.js"></script>
    <script type="text/javascript">
      function test() {
        $.ajax({
          url:"testAjax_DELETE",
          type:"DELETE",
          data:{id:1234},
          dataType:"json",
          success:function (obj) {
            alert(obj);
          }
        });
      }
    </script>
  </head>
  <body>
<a href="demo1">helloWorld!</a> <br/>
<a href="demo2">SpringMVC</a> <br/>
<form action="demo2" method="post">
  <input type="submit" value="测试post">
</form>  <br/>
<a href="testREST/1234">测试GET</a> <br/>

<form action="testREST" method="post">
  <input type="hidden" name="_method" value="PUT">
  <input type="submit" value="测试PUT">
</form>  <br/>

<input type="button" value="测试AJAX" onclick="test()">

  <h1> <a href="emps">查询员工信息</a></h1>
  
  <img src="img/a.png">

  </body>
</html>
