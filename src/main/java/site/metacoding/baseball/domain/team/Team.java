package site.metacoding.baseball.domain.team;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Team {
	private Integer id;
	private String teamname;
	private String stadiumId;
	private Timestamp createdAt;
	

}
