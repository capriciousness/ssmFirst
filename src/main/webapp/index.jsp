<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>夏小凉</title>
</head>
<body>
    <h3>测试查询</h3>
    <a href="account/findAll">测试查询所有账户</a>

    <h3>测试保存</h3>
    <form action="account/save" method="post">
        姓名:<input type="text" name="name"/><br/>
        金额:<input type="text" name="money"/><br/>
        <input type="submit" value="保存"><br/>
    </form>

</body>
</html>
