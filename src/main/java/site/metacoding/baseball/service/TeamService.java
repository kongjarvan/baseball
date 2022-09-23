package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.StadiumDao;
import site.metacoding.baseball.domain.team.TeamDao;
import site.metacoding.baseball.web.dto.response.team.MainDto;
import site.metacoding.baseball.web.dto.response.team.WriteDto;

@RequiredArgsConstructor
@Service
public class TeamService {

	private final TeamDao teamDao;
	private final StadiumDao stadiumDao;
	
	public List<MainDto> 팀목록보기(){
		List<MainDto> mainDto = teamDao.findAll();
		return mainDto;
	}
	
	public void 팀추가(WriteDto writeDto) {
		teamDao.insert(writeDto);
	}
	

	
	/*
	 * public MainDto 팀수정(Integer id, WriteDto writeDto) { MainDto team =
	 * teamDao.findById(id); team.update(writeDto); }
	 */
	
}
