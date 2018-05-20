<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

 

		
		<form method="post" action="updateUser">
		
		<table align="center">
			<tr>
				<td style="float: right;"><font color="red">*</font>用户名:</td>
				<td><input type="text" class="form-control" value="${c.name}" name="name"></td>
			</tr>
			<tr>
				<td style="float: right;"><font color="red">*</font>密码:</td>
				<td><input type="text" class="form-control" value="${c.password}" name="password"></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="hidden" value="${c.id}" name="id"></td>
			</tr>
			
			<tr>
				<td></td>				
				<td>
					<button type="submit" class="btn btn-primary">提交</button>
					<button type="reset"  class="btn btn-defualt">取消</button>
				</td>
			</tr>			
		</table>

		</form>

