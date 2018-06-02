<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>

<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<html>
	<head>
		<meta charset="utf-8">
		<title>注册</title>
	</head>
	<body>
<<<<<<< HEAD
		<form action="/pharmacy/user/addUser" method="post" >
=======
		<form action="addUser" method="post" >
>>>>>>> 9d9b4184685645e2ae8ba64bd85e99dc381c219a
		<table align="center">
			<tr>
				<td style="float: right;"><font color="red">*</font>用户名:</td>
				<td><input type="text" class="form-control" name="name"></td>
			</tr>
			<tr>
				<td style="float: right;"><font color="red">*</font>密码:</td>
				<td><input type="password" class="form-control" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button type="submit" class="btn btn-primary">注册</button>
					<button type="reset"  class="btn btn-defualt">取消</button>
				</td>
			</tr>
			</table>
		</form>
	</body>
</html>
