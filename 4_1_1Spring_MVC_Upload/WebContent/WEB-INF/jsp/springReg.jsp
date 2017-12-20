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
	<!-- commandName="stu"是与@ModelAttribute设置在request请求中的实体类类型的名称保持一致 -->
	<f:form action="springReg.do" commandName="stu" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><f:input path="sname"/></td>
				<td><span style="color: red"><f:errors path="sname"/></span></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><f:password path="pwd"/></td>
				<td><span style="color: red"><f:errors path="pwd"/></span></td>
			</tr>
			<tr>
				<td>生日</td>
				<td><f:input path="birthday"/></td>
				<td><span style="color: red"><f:errors path="birthday"/></span></td>
			</tr>
			<tr>
				<td>邮箱</td>
				<td><f:input path="email"/></td>
				<td><span style="color: red"><f:errors path="email"/></span></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><f:button>注册</f:button></td>
				<td>&nbsp;</td>
			</tr>			
		</table>
	</f:form>
	<form action="reg.do" method="post">
		
	</form>
	<p><span style="color: red">${msg }</span></p>
</div>
</body>
</html>