package site.metacoding.baseball.web;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.service.StadiumService;
import site.metacoding.baseball.web.dto.response.stadium.UpdateDto;
import site.metacoding.baseball.web.dto.response.stadium.WriteDto;
import site.metacoding.baseball.web.dto.response.CMRespDto;


@RequiredArgsConstructor
@Controller
public class StadiumController {

	private final StadiumService stadiumService;
	
	@GetMapping({"/", "/stadium/stadiumList"})
	public String getStadiumList(Model model) {
		List<Stadium> stadium = stadiumService.구장목록보기();
		model.addAttribute("stadium", stadium);
		return "/stadium/stadiumList"; 
	}
	
	@GetMapping("/stadium/addStadium")
	public String getStadiumAddForm() {
		return "/stadium/addStadium";
	}
	
	@PostMapping("/stadium/add")
	public @ResponseBody CMRespDto<?> addStadium(@RequestBody WriteDto writeDto) {		
		stadiumService.구장추가하기(writeDto);
		return new CMRespDto<>(1, "구장수정 성공", null);
	}
	
	@GetMapping("/stadium/{id}/updateForm")
	public String updateStadium(@PathVariable Integer id, Model model){
		Stadium stadium = stadiumService.구장수정화면가져오기(id);
		model.addAttribute("stadium", stadium);
		return "stadium/updateForm";
	}
	
	@PutMapping("/stadium/{id}/update")
	public @ResponseBody CMRespDto<?> update(@PathVariable Integer id, @RequestBody UpdateDto updateDto){
		Stadium stadium = stadiumService.구장수정하기(id, updateDto);
		return new CMRespDto<>(1, "구장수정 성공", null);
	}
	
	@DeleteMapping("/stadium/{id}/delete")
	public @ResponseBody CMRespDto<?> delete(@PathVariable Integer id){
		stadiumService.구장삭제(id);
		return new CMRespDto<>(1, "구장삭제 성공", null);
	}

	
	
}
