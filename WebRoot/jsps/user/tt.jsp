<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tt.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href=<c:url value='/jsps/css/user/tt.css'/>>

  </head>
  
  <body>
    <div class=divbody>
    <div class=divtitle>
    	<span class=spanid>新用户注册</span>
    </div>
    <div class=butdiv>
    <form action="<c:url value='/jsps/msg.jsp'/>" method="post">
    <table>
    <tr>
    <td class="tdlabel">用户名:</td>
    <td class="tdinput">
    <input type="text" name="username" class="input"/>
    </td>
    <td><label class="labelerror" id="loginnameError">用户名不能为空</label></td>
    </tr>
    <tr>
    <td class="tdlabel">登陆密码:</td>
    <td class="tdinput"><input type="text" name="password" class="input"/></td>
    <td class="tderror"><label></label></td>
    </tr>
    <tr>
    <td class="tdlabel">确认密码:</td>
    <td class="tdinput"><input type="text" name="againword" class="input"/></td>
    <td class="tderror"><label class="labelerror"></label></td>
    </tr>
    <tr>
    <td class="tdlabel">Email:</td>
    <td class="tdinput"><input type="text" name="email" class="input"/></td>
    <td class="tderror"><label class="labelerror"></label></td>
    </tr>
    <tr>
    <td class="tdlabel">验证码:</td>
    <td class="tdinput"><input type="text" name="vCode" class="input"/></td>
    <td class="tderror"><label class="labelerror"></label></td>
    </tr>
    <tr>
    <td class="tdlabel"></td>
    <td><span class="verifyCodeImg"><img id="vCode" width="100" src="<c:url value='/VerifyCodeServlet'/>" /></span></td>
    <td><a herf="">换一张</a></td>
    </tr>
    <tr>
    <td>&nbsp;</td>
    <td><input type="image" src="<c:url value='/images/regist1.jpg'/>" id="sumbit"/></td>
    <td>&nbsp;</td>
    </tr>
    </table>
    </form>
    </div>
    </div>
  </body>
</html>
