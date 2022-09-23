package site.metacoding.baseball.web.dto.response.team;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter
public class MainDto {

	private Integer id;
	private String teamname;
	private String stadiumname;
}
