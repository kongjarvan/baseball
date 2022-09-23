<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<h1>선수 목록</h1>
	<table border="1" class="table table-bordered table-dark">
		<thead>
			<tr>
				<th>번호</th>
				<th>선수 이름</th>
				<th>팀명</th>
				<th>나이</th>
				<th>포지션</th>
				<th>수정</th>
			</tr>
		</thead>
		<tbody class="table">
			<c:forEach var="player" items="${player}">
				<tr>
					<td>${player.id}</td>
					<td>${player.playername}</td>
					<td>${player.teamname}</td>
					<td>${player.age}</td>
					<td>${player.position}</td>
					<td><a href="/player/${player.id}/updateForm">수정하기</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

</body>
</html>