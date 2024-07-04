package com.callor.hello;

/*
 정수형 배열 50개를 선언하고
 정수 2 ~ 100 범위의 Random 수를 각각 생성하여
 배열 요소에 저장
 
 배열에 저장된 정수들 중에 prime 수만 합산하여 출력
 배열에 저장된 정수들 중에 prime 수만 몇개인가 출력
 */
public class HelloL {
	public static void main(String[] args) {
		int[] array = new int[50];
		int prime = 0;
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = 2 + (int) (Math.random() * 99);
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime++;
					sum += array[i];
					break;
				}
			}
		}
		System.out.println("배열에 저장된 소수의 개수 : " + prime);
		System.out.println("배열에 저장된 소수의 합 : " + sum);
		
	}
}
