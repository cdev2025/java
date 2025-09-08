package com.mycompany.test;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// 값이 없는 경우 (null 대체)
		Optional<Integer> maybeNull = Optional.ofNullable(null);
		
		// 값이 있으면 그대로, 없으면 기본값(0) 사용
		int safeValue = maybeNull.orElse(0); 
		System.out.println("값이 없으면 기본값 사용: " + safeValue);
		
		// 값이 있으면 언박싱해서 출력, 없으면 아무 동작 안함
		maybeNull.ifPresent(val ->System.out.println("값 존재: " + val));
		
		// 값이 없으면 대체 동작 실행
		maybeNull.ifPresentOrElse(
				val ->System.out.println("값 존재: " + val), 
				()->System.out.println("값이 없으므로 대체 로직 실행"));
		
		// 값이 있는 경우 (null이 아닌 경우)
		Optional<Integer> notNull = Optional.of(42);
		System.out.println("값 존재, 언박싱: " + notNull.get());
	}

}
