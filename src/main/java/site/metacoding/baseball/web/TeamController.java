package site.metacoding.baseball.web;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.service.StadiumService;
import site.metacoding.baseball.service.TeamService;
import site.metacoding.baseball.web.dto.response.CMRespDto;
import site.metacoding.baseball.web.dto.response.team.MainDto;
import site.metacoding.baseball.web.dto.response.team.WriteDto;

@RequiredArgsConstructor
@Controller
public class TeamController {

	private final TeamService teamService;
	private final StadiumService stadiumService;
	
	@GetMapping({"/team", "/team/teamList"})
	public String getTeamList(Model model) {
		List<MainDto> mainDto = teamService.팀목록보기();
		model.addAttribute("mainDto", mainDto);
		return "/team/teamList"; 
	}
	
	
	@GetMapping("/team/addTeam")
	public String addTeamForm(Model model) {
		List<Stadium> stadium = stadiumService.구장목록보기();
		model.addAttribute("stadium", stadium);
		return "/team/addTeam";
	}
	
	
	@PostMapping("/team/add")
	public @ResponseBody CMRespDto<?> addTeam(@RequestBody WriteDto writeDto) {
		teamService.팀추가(writeDto);
		return new CMRespDto<>(1, "팀추가 성공", null);
	}
	
	@GetMapping("/team/{id}/updateForm")
	public String updateTeamForm(@PathVariable Integer id, Model model) {
		List<Stadium> stadium = stadiumService.구장목록보기();
		model.addAttribute("stadium", stadium);
		return "/team/updateForm";
	}
	
	/*
	 * @PostMapping("/team/{id}/update") public String updateTeam(@PathVariable
	 * Integer id, WriteDto writeDto) { teamService.팀수정() return "/team"; }
	 */
	
}
