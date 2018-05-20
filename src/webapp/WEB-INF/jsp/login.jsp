<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>

<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<html>
	<head>
		<meta charset="utf8">
		<title>登录</title>
	</head>
	<body>
		<form action="/pharmacy/user/login" method="post" >
		
		<table align="center">
			<tr>
				<td align="right">用户名:</td>
				<td><input type="text" class="form-control" name="name" placeholder="用户名"></td>
			</tr>
			<tr>
				<td align="right">密码:</td>
				<td><input type="password" class="form-control" name="password" placeholder="密码"></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button type="submit" class="btn btn-primary">登录</button>
					<button type="reset"  class="btn btn-defualt">取消</button>
 					<a href="regist.jsp" class="btn btn-defalut ">注册</a>
				</td>
			</tr>
		</table>
	    </form>
	</body>
</html>
