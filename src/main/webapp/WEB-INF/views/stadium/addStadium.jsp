<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<h1>경기장 등록</h1>
	<form action="/stadium/add" method="post">
		<div>
			구장 이름 : <input id="stadiumname" type="text" /> 
			지역: <input id="location" type="text" />
			<button id="btnAddStadium" type="button">등록</button>
		</div>
	</form>
</div>

<script>

$("#btnAddStadium").click(() => {
	addStadium();
});



function addStadium() {


	let data = {
		stadiumname: $("#stadiumname").val(),
		location: $("#location").val(),
	}

	$.ajax("/stadium/add", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			location.href = "/";
		}else{
			alert(res.msg);
			history.back;
		}
	});
}
</script>


</body>
</html>