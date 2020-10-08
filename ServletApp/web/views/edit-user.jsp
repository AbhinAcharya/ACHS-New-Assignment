<%@ page import="com.achs.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: abhinacharya
  Date: 10/8/20
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Edit user</title>
</head>
<body>

<h2> Update Customers</h2>
<form action='EditUserSaveServlet' method='post'>
            <input type='hidden' name='uid' value='${uid}'><br>
        UserName: <input type='text' name='username' value='${username}'> <br>
        Email:<input type='text' name='email' value='${email}'><br>
        Password:<input type='password' name='password' value='${password}'><br>
        Address:<input type='text' name='address' value='${address}'><br>
        ContactNo:<input type='text' name='phone' value='${phone}'><br>
        <input type='submit' value='Update'>
</form>

</body>
</html>
