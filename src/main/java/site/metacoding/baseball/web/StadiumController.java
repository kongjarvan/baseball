package site.metacoding.baseball.web;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.service.StadiumService;
import site.metacoding.baseball.web.dto.response.stadium.WriteDto;
import site.metacoding.baseball.web.dto.response.CMRespDto;
import site.metacoding.baseball.web.dto.response.stadium.MainDto;


@RequiredArgsConstructor
@Controller
public class StadiumController {

	private final StadiumService stadiumService;
	
	@GetMapping({"/", "/stadium/stadiumList"})
	public String getStadiumList(Model model) {
		List<MainDto> stadium = stadiumService.구장목록보기();
		model.addAttribute("stadium", stadium);
		return "/stadium/stadiumList"; 
	}
	
	@GetMapping("/stadium/addStadium")
	public String getStadiumAddForm() {
		return "/stadium/addStadium";
	}
	
	@PostMapping("/stadium/add")
	public String addStadium(WriteDto writeDto) {		
		stadiumService.구장추가하기(writeDto);
		return "redirect:/";
	}
	
	@GetMapping("/stadium/{id}/updateForm")
	public String updateStadium(@PathVariable Integer id, Model model){
		MainDto stadium = stadiumService.구장수정화면가져오기(id);
		model.addAttribute("stadium", stadium);
		return "stadium/updateForm";
	}
	
	@PutMapping("/stadium/{id}/update")
	public @ResponseBody CMRespDto<?> update(@PathVariable Integer id, @RequestBody WriteDto writeDto){
		
		return null;
	}
	
	

	
	
}
