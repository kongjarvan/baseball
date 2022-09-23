package site.metacoding.baseball.domain.team;

import java.util.List;

import site.metacoding.baseball.web.dto.response.team.WriteDto;
import site.metacoding.baseball.web.dto.response.team.MainDto;


public interface TeamDao {
	public void insert(WriteDto WriteDto);
	public List<MainDto> findAll();
	public MainDto findById(Integer id);
	public void update(WriteDto WriteDto);
	public void deleteById(Integer id);
}
