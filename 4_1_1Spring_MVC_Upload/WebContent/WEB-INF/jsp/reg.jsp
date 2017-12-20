<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body>
<div align="center">
	<form action="reg.do" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="sname" value="${stu.sname }"/></td>
				<td><span style="color: red"><f:errors path="stu.sname"/></span></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="pwd" value="${stu.pwd }" /></td>
				<td><span style="color: red"><f:errors path="stu.pwd"/></span></td>
			</tr>
			<tr>
				<td>生日</td>
				<td><input type="text" name="birthday" value=""/></td>
				<td><span style="color: red"><f:errors path="stu.birthday"/></span></td>
			</tr>
			<tr>
				<td>邮箱</td>
				<td><input type="text" name="email" value="${stu.email }"/></td>
				<td><span style="color: red"><f:errors path="stu.email"/></span></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="注册"/></td>
				<td>&nbsp;</td>
			</tr>			
		</table>
	</form>
	<p><span style="color: red">${msg }</span></p>
</div>
</body>
</html>