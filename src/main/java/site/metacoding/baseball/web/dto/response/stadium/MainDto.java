package site.metacoding.baseball.web.dto.response.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@Setter
@Getter
public class MainDto {
	private Integer id;
	private String stadiumname;
	private String location;
	private Timestamp createdAt;
}
