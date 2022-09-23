package site.metacoding.baseball.domain.stadium;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.baseball.web.dto.response.stadium.UpdateDto;
import site.metacoding.baseball.web.dto.response.stadium.WriteDto;


@NoArgsConstructor
@Setter
@Getter
public class Stadium {
	private Integer id;
	private String stadiumname;
	private String location;
	private Timestamp createdAt;
	
	
	public Stadium(String stadiumname, String location) {
		this.stadiumname = stadiumname;
		this.location = location;
	}
	
	public void update(UpdateDto updateDto) {
		this.stadiumname = updateDto.getStadiumname();
		this.location = updateDto.getLocation();
	}
	
}


