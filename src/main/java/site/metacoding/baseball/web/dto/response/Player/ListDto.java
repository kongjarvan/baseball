package site.metacoding.baseball.web.dto.response.Player;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ListDto {
	private Integer id;
	private String playername;
	private String teamname;
	private Integer age;
	private String position;
}
