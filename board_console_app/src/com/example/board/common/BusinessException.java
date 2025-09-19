package com.example.board.common;

public class BusinessException extends RuntimeException {
	private final ErrorCode errorCode; // 에러 코드
	
	public BusinessException(ErrorCode code, String detail) {
		super(code.getMessage() + (detail!=null? " - " + detail : ""));
		this.errorCode = code;
	}
	
	public BusinessException(ErrorCode code) {
		super(code.getMessage());
		this.errorCode = code;
	}
	
	//Getter
	public ErrorCode getErrorCode() {
		return errorCode;
	}
}
