<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<h1>팀 목록</h1>
	<div class="d-flex justify-content-end">
		<div style="width: 300px">
			<form class="d-flex" method="get" action="/">
				<input class="form-control me-2" type="text" placeholder="Search" name="keyword">
				<button class="btn btn-primary" type="submit">Search</button>
			</form>
		</div>
	</div>
	<br/>
	<table border="1" class="table table-bordered table-dark">
		<thead>
			<tr>
				<th>번호</th>
				<th>팀명</th>
				<th>경기장이름</th>
				<th>수정</th>
			</tr>
		</thead>
		<tbody class="table">
			<c:forEach var="mainDto" items="${mainDto}">
				<tr>
					<td>${mainDto.id}</td>
					<td>${mainDto.teamname}</td>
					<td>${mainDto.stadiumname}</td>
					<td><a href="/team/${mainDto.id}/updateForm">수정하기</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

</body>
</html>