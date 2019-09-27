<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="">

    <title>body</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
<link rel="stylesheet" type="text/css" href="<c:url value='/jsps/css/user/loing1.css'/>">
    <title>用户注册</title>
    <script type="text/javascript" src="jquery/jquery-1.5.1.js"></script>
    <script type="text/javascript" src="jsps/js/user/regist.js"></script>



</head>
<body >
<div id="divbody">
    <div id="divMain">
        <span id="spanMain">
            新用户注册
        </span>
    </div>
    <div id="divButtom">
        <form action="/goods/UserServlet" method="post" enctype="application/x-www-form-urlencoded" id="form1">
            <input type="hidden" name="method" value="login"/>
        <table id="table1">
            <tr>
                <td class="td1">用户名：</td>
                <td class="td2"><input type="text" name="username" class="inputclass" id = "Username"/></td>
                <td class="td3"><label class="errerClass" id="errorUsername"></label></td>
            </tr>
            <tr>
                <td class="td1">密码：</td>
                <td class="td2"><input type="password" name="password" class="inputclass" id = "Password" /></td>
                <td class="td3"><label class="errerClass" id="errorPassword"></label></td>
            </tr>  <tr>
                <td class="td1">确认密码：</td>
                <td class="td2"><input type="password" name="nextpassword" class="inputclass" id = "Repassword" /></td>
                <td class="td3"><label class="errerClass" id="errorRepassword"></label></td>
            </tr>  <tr>
                <td class="td1">邮箱：</td>
                <td class="td2"><input type="text" name="email" class="inputclass" id="Email1"/></td>
                <td class="td3"><label class="errerClass" id="errorEmail1"></label></td>
            </tr>
            <tr>
                <td class="td1">验证码：</td>
                <td class="td2"><input type="text" name="verficode" class="inputclass" id="Verifycode"/></td>
                <td class="td3"><label class="errerClass" id="errorVerifycode"></label></td>
            </tr>
            <tr>
                <td></td>
                <td><div id="divCode"><img id="imgCode" src="<c:url value='/VerifyCodeServlet'/>"/></div></td>
                <td><a href="javascript:_hyz();">换一张</a> </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="image" id = "imgsub" src="/goods/images/regist1.jpg"></td>
                <td></td>
            </tr>
        </table>
        </form>
    </div>
</div>
</body>
</html>
