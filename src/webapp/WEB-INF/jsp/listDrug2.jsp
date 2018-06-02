<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<table class="table">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>price</td>
        <td>edit</td>
        <td>delete</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.price}</td>
            <td><a href="editDrug?id=${c.id}">编辑</a></td>
            <td><a href="deleteDrug?id=${c.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>




<form method="post" action="addDrug">
    <table align="center">
        <tr>
            <td style="float: right;"><font color="red">*</font>药品名:</td>
            <td><input type="text" class="form-control" name="name"></td>
        </tr>
        <tr>
            <td style="float: right;"><font color="red">*</font>价格:</td>
            <td><input type="password" class="form-control" name="password"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit" class="btn btn-primary">添加药品</button>
                <button type="reset"  class="btn btn-defualt">取消</button>
            </td>
        </tr>
    </table>
</form>
