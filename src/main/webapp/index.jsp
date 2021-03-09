
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
  <body>
    <p>第一个springmvc项目</p>
    <p><a href="user/some.do"> 发送一个some.do请求</a></p>
    <form action="user/other.do" method="post">
        姓名：<input name="name" type="text"><br/>
        年龄：<input name="age" type="text"><br/>
        <input type="submit" value="提交参数">
    </form>
    <form action="user/first.do" method="post">
        姓名：<input name="name" type="text"><br/>
        年龄：<input name="age" type="text"><br/>
        <input type="submit" value="提交参数">
    </form>
    <form action="user/receiveObject.do" method="post">
        姓名：<input name="name" type="text"><br/>
        年龄：<input name="age" type="text"><br/>
        <input type="submit" value="提交参数">
    </form>



  </body>
</html>
