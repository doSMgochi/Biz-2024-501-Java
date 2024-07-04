package com.callor.hello;
/*
 정수형 배열 100개를 선언하고,
 1 ~ 100 범위의 Random 수를 생성하여 배열 100개에 할당하기
 */
public class HelloI {
	public static void main(String[] args) {
		int[] array = new int[100];
		
		for (int i = 0 ; i < array.length ; i++) {
			array[i] = 1 + (int) (Math.random() * 100);
			System.out.println(array[i]);
		}
	}
}
