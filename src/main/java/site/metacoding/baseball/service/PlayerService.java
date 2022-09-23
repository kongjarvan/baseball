package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.player.PlayerDao;
import site.metacoding.baseball.web.dto.response.Player.ListDto;
import site.metacoding.baseball.web.dto.response.Player.WriteDto;

@RequiredArgsConstructor
@Service
public class PlayerService {

	private final PlayerDao playerDao;
	
	public List<ListDto> 선수목록보기(){
		List<ListDto> player = playerDao.findAll();
		return player;
	}
	
	public void 선수등록(WriteDto writeDto) {
		playerDao.insert(writeDto);
	}
}
