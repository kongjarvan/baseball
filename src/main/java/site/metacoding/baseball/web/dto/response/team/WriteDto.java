package site.metacoding.baseball.web.dto.response.team;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseball.domain.team.Team;


@Setter
@Getter
public class WriteDto {
	private String teamname;
	private String stadiumId;
}
