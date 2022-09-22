package site.metacoding.baseball.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CMRespDto<T> {
	private Integer code; // 1 정상, -1 실패
	private String msg; // 실패 이유, 성공 이유
	private T data; // 응답할 데이터
}
