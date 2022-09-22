<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<h1>경기장 정보 수정</h1>
	<form>
	<input id="id" type="hidden" value="${stadium.id}"/>
		<div>
			구장 이름 : <input type="text" name="stadiumname" value="${stadium.stadiumname}"/> 
			지역: <input type="text" name="location" value="${stadium.location}"/>
			<button id="btnUpdateBoards" type="button" class="btn btn-primary">수정완료</button>
		</div>
	</form>
</div>

</body>
</html>