package com.callor.hello;

/*─────────────────────────────────────────────────
 
 prime(int num) method 를 생성하고
 매개변수로 전달받은 num 의 값이 소수 인지 판별하여
 결과를 return 하기
 
 소수 = 1과 자기 자신으로밖에 나누어지지 않는 수
 
 ─────────────────────────────────────────────────*/

public class HelloE {
	public static boolean prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int number = 5;
		boolean result = prime(number);

		if (result) {
			System.out.println("숫자 " + number + " 는 소수입니다.");
		} else {
			System.out.println("숫자 " + number + " 는 소수가 아닙니다.");
		}
	}
}
