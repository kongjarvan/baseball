package site.metacoding.baseball.web.dto.response.Player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WriteDto {
	private String playername;
	private Integer teamId;
	private Integer age;
	private String position;
}
