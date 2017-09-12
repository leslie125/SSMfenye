<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateUser" method="post">
id:<input type="text" name="id" value="${user.id }" readonly="true">
username:<input type="text"  name="username" value="${user.username }" >
password:<input type="text" name="password" value="${user.password }">
<input type="submit" value="提交">
</form>
</body>
</html>