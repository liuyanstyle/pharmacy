<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<table class="table">
    <tr>
        <td>商品</td>
        <td>数量</td>
        <td>价格</td>
        <td>总计</td>
    </tr>
    <c:forEach items="${ois}" var="c" varStatus="st">
        <tr>
            <td>${c.drug.name}</td>
            <td>${c.num}</td>
            <td>${c.drug.price}</td>
            <td>${c.drug.price*c.num}</td>
        </tr>
    </c:forEach>

    <tr>
        <td colspan="4"><a href="/pharmacy/order/createOrder">生成订单</a></td>

    </tr>
</table>

</html>
