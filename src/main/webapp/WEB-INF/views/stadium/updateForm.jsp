<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<h1>경기장 정보 수정</h1>
	<form>
		<input id="id" type="hidden" value="${stadium.id}" />
		<div>
			<button id="btnDeleteStadium" type="button" class="btn btn-danger">삭제하기</button>
		</div>
		<div>
			구장 이름 : <input id="stadiumname" type="text" value="${stadium.stadiumname}" /> 
			지역: <input id="location" type="text" value="${stadium.location}" />
			<button id="btnUpdateStadium" type="button" class="btn btn-primary">수정완료</button>
		</div>

	</form>
</div>

<script>

$("#btnUpdateStadium").click(() => {
	update();
});


$("#btnDeleteStadium").click(() => {
	deleteStadium();
});





function update() {
	let data = {
		stadiumname: $("#stadiumname").val(),
		location: $("#location").val()
	};
let id = $("#id").val();

	$.ajax("/stadium/" + id + "/update", {
		type: "PUT",
		dataType: "json", // 응답 데이터
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("수정 완료");
			location.href = "/"; // 새로고침(f5) 과 같은 기능
		} else {
			alert("업데이트에 실패하였습니다.");
		}
	});
}


function deleteStadium() {
	let id = $("#id").val();

	$.ajax("/stadium/" + id + "/delete", {
		type: "DELETE",
		dataType: "json" // 응답 데이터
	}).done((res) => {
		if (res.code == 1) {
			alert("구장삭제 완료");
			location.href = "/"; // 새로고침(f5) 과 같은 기능
		} else {
			alert("구장삭제에 실패하였습니다.");
		}
	});
}


</script>

</body>
</html>