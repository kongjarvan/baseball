<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<h1>팀 정보 수정</h1>
	<form>
		<input id="id" class="hidden" value="${stadium.id}" />
		<div>
			<select id="stadiumId" onchange="selectBoxChange(this.value);" class="form-select">
				<c:forEach var="stadium" items="${stadium}">
					<option value="${stadium.id}">${stadium.stadiumname}</option>
				</c:forEach>
			</select> 팀명 : <input id="teamname" type="text">
			<button id="btnUpdateTeam" type="button">수정</button>
		</div>

	</form>
</div>

<script>

$("#btnUpdateTeam").click(() => {
	updateTeam();
});


$("#btnDeleteStadium").click(() => {
	deleteStadium();
});





function updateTeam() {
	let data = {
		teamname: $("#teamname").val(),
		stadiumId: $("#stadiumId").val()
	};
let id = $("#id").val();

	$.ajax("/team/" + id + "/update", {
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