<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<style>
.box3 {
	width:800;
    padding: 0.005em 1em;
    margin: 1em 0;
    color: #2c2c2f;
    background: #cde4ff;/*背景色*/
    text-align: left;
}
.box3 p {
    margin: 0;
    padding: 0;
}
.wrapper {
  width: 980px;
  margin: 0 auto;
  overflow: hidden;
  }
.sidebar {
  position: absolute;
  width: 220px;
  left: 0px;
  float: left;
  top: 100px;
  }
.me-4 {
  position: absolute;
  width: 730px;
  left: 100px;
  float: right;
  top: 70px;
  }
.titleadd {
  position: fixed;
  bottom: 10px;
  right: 10px;
  }
.charassign {
	margin: 5;
}
</style>
<html>
<body>
<div class="box3">
<h1>${param.title}</h1>
</div>
<div id="wrapper">
<aside id="sidebar">
<a href="menu.jsp">メニュー</a>
<br><br>
<a href="StudentList.action">学生管理</a>
<br><br>
成績管理
<br>
<div class="charassign">
<a href="TestRegist.action">成績登録</a>
<br><br>
<a href="TestList.action">成績参照</a>
</div>
<br><br>
<a href="SubjectCreate.action">科目管理</a>
<br>
</aside>

<div class="me-4">${param.content}</div>

</div>
<div style="text-align: center">
<%@include file= "footer.html" %>
</div>
</body>
</html>

