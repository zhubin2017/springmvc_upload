<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传页面</title>
</head>
<body>
<div align="center">
	<form action="doUpload.do" method="post" enctype="multipart/form-data">
		picture:<input type="file" name="mf" value=""/><br/>
		<input type="submit" value="提交"/>
	</form>
	
</div>
</body>
</html>