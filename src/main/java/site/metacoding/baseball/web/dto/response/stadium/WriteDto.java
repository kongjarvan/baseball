package site.metacoding.baseball.web.dto.response.stadium;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseball.domain.stadium.Stadium;


@Setter
@Getter
public class WriteDto {
	private String stadiumname;
	private String location;
	
	
	
	public Stadium toEntity() {
		Stadium stadium = new Stadium(this.stadiumname, this.location);
		return stadium;
	}
}
