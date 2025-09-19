package com.example.board.common;

public class ValidationUtils {
	
	// 공백/Null체크
	static void notBlank(String value, String field) {
		if(value==null || value.trim().isEmpty())
			throw new BusinessException(ErrorCode.INVALID_INPUT, field + "는 필수입니다.");
	}
	
	// 최대 길이 제한
	
	// 최소 길이 제한
}
