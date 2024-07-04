package com.callor.hello;

/*
 10 ~ 50 범위의 임의 Random 정수를 1개를 생성하고
 생성한 Random 수 만큼의 정수형 배열을 선언하고
 배열의 각 요소에 1 ~ 100 까지 범위의 Random 수를 저장
 배열에 저장된 값을 출력
 */
public class HelloJ {
	public static void main(String[] args) {
		int num = 10 + (int) (Math.random() * 41);
		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			array[i] = 1 + (int) (Math.random() * 100);

		}
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			sum += array[i];
		}
		System.out.println("\n"+"=".repeat(30));
		System.out.println("숫자의 합 : " + sum);
		System.out.printf("숫자의 합의 평균 : %.2f", (float)sum/num);
	}
}
