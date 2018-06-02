<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<ol class="breadcrumb">
    <li class="active">寻医问药网</li>
    <li><a href="login">登录</a></li>
    <li><a href="regist">注册</a></li>
    <li><a href="admin">管理员</a></li>
    <li></li><c:if test="${!empty user}">当前用户: ${user.name}</c:if></li>

        <form action="drug/search" method="post">
            <select name="searchName" >
                <option value="drug">药品</option>
                <option value="drugstore">药店</option>
                <option value="drugEffect">药品功效</option>
            </select>
            <input type="text" name="searchContent"><input type="submit" value="搜索">
        </form>
</ol>


<h>药品推荐</h>
<div style="text-align:center">
<table class="table">
    <tr>
        <td>编号</td>
        <td>药品名</td>
        <td>种类</td>
        <td>功效</td>
        <td>适用人群</td>
        <td>价格</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.category}</td>
            <td>${c.effect}</td>
            <td>${c.ban}</td>
            <td>${c.price}</td>
        </tr>
    </c:forEach>
</table>


