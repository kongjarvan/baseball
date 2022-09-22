<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
<h1>경기장 목록</h1>
<table border="1" class="table table-bordered table-dark">
		<thead>
			<tr>
				<th>번호</th>
				<th>경기장</th>
				<th>지역</th>
				<th>개장일</th>
			</tr>
		</thead>
<%-- 		<tbody class="table table-bordered table-striped table-hover">
			<c:forEach var="boards" items="${pagingDto.mainDtos}">
				<tr>
					<td>${boards.id}</td>
					<td><a href="/boards/${boards.id}">${boards.title}</a></td>
					<td>${boards.username}</td>
				</tr>
			</c:forEach>
		</tbody> --%>
	</table>
</div>
</body>
</html>