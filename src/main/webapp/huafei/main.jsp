<%--
  Created by IntelliJ IDEA.
  User: fzw
  Date: 2022/6/19
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="css/main.css"/>
<html>
<head>
    <title>
        套餐服务
    </title>
</head>
<body>
<div id="body">
    <div class="top-form">
        <div class="top-form-1">
            <div class="top-form-1-title">
                您的当前套餐：
            </div>
            <div class="top-form-1-text">
                49元冰激凌套餐
            </div>
            <button class="top-form-1-button" onclick="goInfoPage()">
                查看详情
            </button>
        </div>
        <div class="top-form-2">
            <div class="top-form-1-title">
                订购其他套餐：
            </div>
            <select class="top-form-1-text">
                <option value="">50元冰激凌套餐</option>
                <option value="2">51元冰激凌套餐</option>
                <option value="3">52元冰激凌套餐</option>
            </select>
            <button class="top-form-1-button" onclick="goInfoPage()">
                查看详情
            </button>
        </div>
    </div>
    <div class="bottom-form">
        <div class="bottom-form-1">
            <input placeholder="请输入您要查询的号码" class="bottom-form-1-text">
            <button class="bottom-form-1-button" onclick="goSearch()">
                套餐查询
            </button>
        </div>
    </div>
</div>
</body>
<script>
    function goInfoPage() {
        window.location.href = "/huafei/info"
    }
    function goSearch() {
        window.location.href = "/huafei/search"
    }
</script>
</html>
