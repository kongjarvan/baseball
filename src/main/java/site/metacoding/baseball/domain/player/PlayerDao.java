package site.metacoding.baseball.domain.player;

import java.util.List;

import site.metacoding.baseball.web.dto.response.Player.ListDto;
import site.metacoding.baseball.web.dto.response.Player.WriteDto;



public interface PlayerDao {
	public void insert(WriteDto writeDto);
	public List<ListDto> findAll();
	public Player findById(Integer id);
	public void update(Player player);
	public void deleteById(Integer id);
}
