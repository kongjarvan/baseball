package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.stadium.StadiumDao;
import site.metacoding.baseball.web.dto.response.stadium.WriteDto;
import site.metacoding.baseball.web.dto.response.stadium.MainDto;


@RequiredArgsConstructor
@Service
public class StadiumService {

	private final StadiumDao stadiumDao;
	
	public List<MainDto> 구장목록보기(){
		List<MainDto> mainDto = stadiumDao.findAll();
		return mainDto;
	}
	
	
	public void 구장추가하기(WriteDto writeDto) {
		Stadium stadium = writeDto.toEntity();
		stadiumDao.insert(stadium);
	}
	
	public MainDto 구장수정화면가져오기(Integer id) {
		MainDto stadium = stadiumDao.findById(id);
		return stadium;
		
	}
	
	
}
