package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.stadium.StadiumDao;
import site.metacoding.baseball.web.dto.response.stadium.UpdateDto;
import site.metacoding.baseball.web.dto.response.stadium.WriteDto;


@RequiredArgsConstructor
@Service
public class StadiumService {

	private final StadiumDao stadiumDao;
	
	public List<Stadium> 구장목록보기(){
		List<Stadium> stadium = stadiumDao.findAll();
		return stadium;
	}
	
	
	public void 구장추가하기(WriteDto writeDto) {
		Stadium stadium = writeDto.toEntity();
		stadiumDao.insert(stadium);
	}
	
	public Stadium 구장수정화면가져오기(Integer id) {
		Stadium stadium = stadiumDao.findById(id);
		return stadium;
		
	}
	
	
	public Stadium 구장수정하기(Integer id, UpdateDto updateDto) {
		Stadium stadium = stadiumDao.findById(id);
		stadium.update(updateDto);
		stadiumDao.update(stadium);
		return stadium;
	}
	
	public void 구장삭제(Integer id) {
		stadiumDao.deleteById(id);
	}
	
}
