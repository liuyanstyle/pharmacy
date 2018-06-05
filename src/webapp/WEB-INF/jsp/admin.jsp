<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<style>
    h1{
        font:italic bold 30px "微软雅黑";
        color: blue;
        text-align: center;
    }
    a{
        text-decoration: none;
    }

</style>
<h1>医药管理系统<small>(管理用户:${admin.name})</small></h1>
<div style="text-align:center">

    <div class="btn-group">
        <button type="button" class="btn btn-primary dropdown-toggle "  data-toggle="dropdown">
            用户管理
            <span class="caret"></span>
        </button>

        <ul class="dropdown-menu" role="menu">
            <li>
                <a href="listUser">用户修改</a>
            </li>

        </ul>
    </div>
    <div class="btn-group">
        <button type="button" class="btn btn-success dropdown-toggle "  data-toggle="dropdown">
            药品管理
            <span class="caret"></span>
        </button>

        <ul class="dropdown-menu" role="menu">
            <li>
                <a href="/pharmacy/drug/listDrug">药品修改</a>
            </li>
            <li role="presentation">
                <a href="#"></a>
            </li>

            <li role="presentation">
                <a href="#"></a>
            </li>
            <li role="presentation">
                <a href="#"></a>
            </li>
        </ul>
    </div>

    <div style="height:100px"></div>
</div>
