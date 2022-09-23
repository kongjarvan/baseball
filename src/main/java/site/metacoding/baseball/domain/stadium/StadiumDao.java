package site.metacoding.baseball.domain.stadium;

import java.util.List;

import site.metacoding.baseball.web.dto.response.stadium.UpdateDto;



public interface StadiumDao {
	public void insert(Stadium stadium);
	public List<Stadium> findAll();
	public Stadium findById(Integer id);
	public void update(Stadium stadium);
	public void deleteById(Integer id);
}
