<%-- ログインJSP --%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
.box3 {
	width:800;
    padding: 0.005em 1em;
    margin: 1em 0;
    color: #2c2c2f;
    background: #cde4ff;/*背景色*/
    text-align: left;
}
.box2 {
	width:500;
    padding: 0.005em 1em;
    margin: 1em 0;
    color: #2c2c2f;
    background: #C0C0C0;/*背景色*/
    text-align: center;
}
.txt {
	width:350;
    padding: 20 0 0 0;
    margin: 1em 0;
    color: #2c2c2f;
    background: #cde4ff;/*背景色*/
	padding-left: 30px;
}
.box4 {
	position: absolute;
  	top: 6%;
  	left: 18%
}
.box5 {
	position: absolute;
  	top: 42%;
  	left: 18%
}
.radius-percent-10 {
  border-radius: 10%;
}
</style>
<center>
<div class="box3">
<h1>得点管理システム</h1>
</div>
</center>
<center>
<div class="box2">

<h2>ログイン</h2>

</div>
<div style="padding: 0px; margin-bottom: 0px; border: 1px dotted #333333; width: 530; height: 270; position:relative; top: -17; left: 0;">
<form action = "LoginExecute.action" method = "post" >
<p><input type = "text" class = "txt" size = "50" name = "id" alt="ID" ></p>
<div class="box4">
<p><font color=#a0a0a0>ID</font></p> </div>
<p><input type = "password" class = "txt" size = "50" name = "password" ></p>
<div class="box5"><p><font color=#a0a0a0>パスワード</font></p></div>
<p><input type = "checkbox" name="chk_d_ps">パスワードを表示</p>
<p><input class="radius-percent-10" type = "submit" value="ログイン" style="color:white; background-color:blue; width:100; height:40; " ></p>
</form>
</div>
<%@include file= "footer.html" %>
</center>


