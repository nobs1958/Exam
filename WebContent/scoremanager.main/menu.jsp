<%-- 学生一覧JSP --%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/common/base.jsp">
<c:param name="title">
得点管理システム
</c:param>

<c:param name="scripts"></c:param>
<c:param name="content">

<section class="me-4">
	<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">メニュー</h2>
<div class="col d-flex align-items-center justufy-content-center mx-2 rounded shadow"
	style="height: 10rem; backgroud-color: #dbb;">

<br><br>
<a href="StudentList.action">学生管理</a>
<br><br>
成績管理
<br>
<a href="TestRegist.action">成績登録</a>
<br><br>
<a href="TestList.action">成績参照</a>
<br><br>
<a href="SubjectCreate.action">科目管理</a>
<br>
</div>
<hr>

</section>

</c:param>
</c:import>