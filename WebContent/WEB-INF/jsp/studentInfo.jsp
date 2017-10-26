<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息</title>
</head>
<body>
	<table border="1">
		<tr>
		<th>学号</th>
		<th>姓名</th>
		<th>性别</th>
		<th>联系方式</th>
		<th>照片</th>
		<th colspan="1">操作</th>
		</tr>
		<c:choose>
			<c:when test="${! empty student}">
				<c:forEach items="${student}" var="s">
				<tr>
				<td>${s.studentRoNo}</td>
				<td>${s.studentName}</td>
				<td>${s.studentGender}</td>
				<td>${s.studentMobile}</td>
				<td><img style="width: 60px; height: 80px" alt="${s.studentPhoto}" src="/ClassManageSys/studentPhoto/${s.studentPhoto}"/></td>
				<td><a href="#">移出</a></td>
				</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
			<tr>(空)</tr>
             </c:otherwise>
		</c:choose>
	</table>
</body>
</html>