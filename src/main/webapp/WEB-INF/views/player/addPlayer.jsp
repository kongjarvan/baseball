<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<h1>선수 등록</h1>
	<div>
		선수 이름 : <input id="playername" type="text" /> 
		팀명: <select id="teamId" onchange="selectBoxChange(this.value);" class="form-select">
			<c:forEach var="team" items="${team}">
				<option value="${team.id}">${team.teamname}</option>
			</c:forEach>
		</select> 
		나이: <input id="age" type="text" /> 
		포지션: <input id="position" type="text" />
		<button id="btnAddPlayer" type="button">등록</button>
	</div>
</div>

<script>

$("#btnAddPlayer").click(() => {
	addPlayer();
});





function addPlayer() {


	let data = {
		playername: $("#playername").val(),
		teamId: $("#teamId").val(),
		age: $("#age").val(),		
		position: $("#position").val(),		
	}
	

	
 	$.ajax("/player/add", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			location.href = "/player/playerList";
		}else{
			alert(res.msg);
			history.back;
		}
	}); 
}

</script>

</body>
</html>