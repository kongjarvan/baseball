package site.metacoding.baseball.domain.stadium;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.baseball.web.dto.response.stadium.WriteDto;

@AllArgsConstructor
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
	
	public void update(WriteDto writeDto) {
		this.stadiumname = writeDto.getStadiumname();
		this.location = writeDto.getLocation();
	}
	
}


