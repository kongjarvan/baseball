<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<h1>경기장 등록</h1>
	<form action="/stadium/add" method="post">
		<div>
			구장 이름 : <input type="text" name="stadiumname"/> 
			지역: <input type="text" name="location"/>
			<button type="submit">등록</button>
		</div>
	</form>
</div>

</body>
</html>