package site.metacoding.baseball.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.service.PlayerService;
import site.metacoding.baseball.service.TeamService;
import site.metacoding.baseball.web.dto.response.CMRespDto;
import site.metacoding.baseball.web.dto.response.Player.ListDto;
import site.metacoding.baseball.web.dto.response.Player.WriteDto;
import site.metacoding.baseball.web.dto.response.team.MainDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final PlayerService playerService;
	private final TeamService teamService;

	@GetMapping({"/player", "/player/playerList"})
	public String getPlayerList(Model model) {
		List<ListDto> player = playerService.선수목록보기(); 
		model.addAttribute("player", player);
		return "/player/playerList";
	}
	
	@GetMapping("/player/addPlayer")
	public String addPlayerForm(Model model) {
		List<MainDto> team = teamService.팀목록보기();
		model.addAttribute("team", team);
		return "/player/addPlayer";
	}
	
	@PostMapping("/player/add")
	public @ResponseBody CMRespDto<?> addPlayer(@RequestBody WriteDto writeDto) {
		playerService.선수등록(writeDto);		
		return new CMRespDto<>(1, "선수등록 성공", null);
	}
	
}
