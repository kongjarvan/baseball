package site.metacoding.baseball.domain.stadium;

import java.util.List;

import site.metacoding.baseball.web.dto.response.stadium.MainDto;



public interface StadiumDao {
	public void insert(Stadium stadium);
	public List<MainDto> findAll();
	public MainDto findById(Integer id);
	public Stadium findByStadiumname(String stadiumname);
	public void update(Stadium stadium);
	public void deleteById(Integer id);
}
