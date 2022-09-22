<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<h1>경기장 목록</h1>
	<div class="d-flex justify-content-end">
		<div style="width: 300px">
			<form class="d-flex" method="get" action="/">
				<input class="form-control me-2" type="text" placeholder="Search" name="keyword">
				<button class="btn btn-primary" type="submit">Search</button>
			</form>
		</div>
	</div>
	<br />
	<table border="1" class="table table-bordered table-dark">
		<thead>
			<tr>
				<th>번호</th>
				<th>경기장</th>
				<th>지역</th>
				<th>수정하기</th>
			</tr>
		</thead>
		<tbody class="table">
			<c:forEach var="stadium" items="${stadium}">
				<tr>
					<td>${stadium.id}</td>
					<td>${stadium.stadiumname}</td>
					<td>${stadium.location}</td>
					<td><a href="/stadium/${stadium.id}/updateForm">수정하기</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>