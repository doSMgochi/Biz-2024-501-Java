package com.callor.hello;
/*───────────────────────────────────────
 
 main() method 를 선언하고
 정수형 숫자 30과 40을 변수에 저장한 후
 4칙연산 결과를 출력하시오
 
 ───────────────────────────────────────*/
public class HelloE {
	public static void main(String[] args) {
		
		/*────────────────────
		 변수 선언, 대입
		 ────────────────────*/
		
		int a = 30;
		int b = 40;
		
		/*────────────────────
		 계산
		 ────────────────────*/
		
		int sum = a + b;
		int diff = a - b;
		int mul = a * b;
		double div = (double) a / b;
		
		/*────────────────────
		 출력
		 ────────────────────*/
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + diff);
		System.out.println(a + " x " + b + " = " + mul);
		System.out.println(a + " ÷ " + b + " = " + div);
		
	}
}
