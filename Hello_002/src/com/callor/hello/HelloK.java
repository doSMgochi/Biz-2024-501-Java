package com.callor.hello;

/*
 2 ~ 100 범위의 임의의 Random 수 1개를 만들고
 그 수가 prime 인지 아닌지 판단
 */
public class HelloK {
	public static boolean prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int number = 2 + (int) (Math.random() * 99);
		boolean result = prime(number);

		if (result) {
			System.out.println("숫자 " + number + " 는 소수입니다.");
		} else {
			System.out.println("숫자 " + number + " 는 소수가 아닙니다.");
		}
	}
}
