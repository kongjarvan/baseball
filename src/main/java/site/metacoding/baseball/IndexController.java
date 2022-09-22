package site.metacoding.baseball;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	

	
	@GetMapping({"/", "/stardium/stardiumList"})
	public String stardiumList() {
		return "/stardium/stardiumList";
	}
	
	@GetMapping("/stardium/addStardium")
	public String addStardium() {
		return "/stardium/addStardium";
	}
	
	@GetMapping("/team/teamList")
	public String teamList() {
		return "/team/teamList";
	}
	
	@GetMapping("/team/addTeam")	
	public String addTeam() {
		return "/team/addTeam";
	}
	
	@GetMapping("/player/playerList")	
	public String playerList() {
		return "/player/playerList";
	}
	
	@GetMapping("/player/addPlayer")	
	public String addPlayer() {
		return "/player/addPlayer";
	}
	
	@GetMapping("/player/playerPositionList")	
	public String playerPositionList() {
		return "/player/playerPositionList";
	}
	
	@GetMapping("/player/kickedOutPlayerList")	
	public String kickedOutPlayerList() {
		return "/player/kickedOutPlayerList";
	}
	
	@GetMapping("/player/addKickOut")	
	public String addKickOut() {
		return "/player/addKickOut";
	}
	
}
