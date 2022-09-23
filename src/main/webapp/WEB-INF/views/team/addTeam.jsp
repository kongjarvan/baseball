<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<h1>팀 등록</h1>
	<div>
		구장 이름: <select id="stadiumId" onchange="selectBoxChange(this.value);" class="form-select">
			<c:forEach var="stadium" items="${stadium}">
				<option value="${stadium.id}">${stadium.stadiumname}</option>
			</c:forEach>
		</select> 
		팀명 : <input id="teamname" type="text" value="${teamname}"/>
		<button id="btnAddTeam" type="button">등록</button>
	</div>
</div>

<script>

$("#btnAddTeam").click(() => {
	addTeam();
});



function addTeam() {


	let data = {
		stadiumId: $("#stadiumId").val(),
		teamname: $("#teamname").val(),
	}
	console.log(data.stadiumId);
	console.log(data.teamname);

 	$.ajax("/team/add", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			location.href = "/team/teamList";
		}else{
			alert(res.msg);
			history.back;
		}
	}); 
}

</script>


</body>
</html>