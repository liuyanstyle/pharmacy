<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<table class="table">
    <tr>
        <td>编号</td>
        <td>药品名</td>
        <td>种类</td>
        <td>功效</td>
        <td>适用人群</td>
        <td>价格</td>
        <td>购买</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.category}</td>
            <td>${c.effect}</td>
            <td>${c.ban}</td>
            <td>${c.price}</td>
            <td><a href="/pharmacy/order/orderItemAdd?id=${c.id}">购买</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="4"><a href="/pharmacy/order/listOrderItem">查看购物车</a></td>

    </tr>
</table>
