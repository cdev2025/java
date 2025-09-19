package com.example.board.common;

public enum ErrorCode {
	NOT_FOUND("리소스를찾을 수 없습니다."), 
	INVALID_INPUT("입력 값이 올바르지 않습니다.");
	
	private final String message;
	
	ErrorCode(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}

