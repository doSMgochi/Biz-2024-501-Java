package com.callor.hello;
/*──────────────────────────────────────────────────
 
 main() method 를 선언하고
 정수형 숫자 30과 40을 변수에 저장한 후
 1. 정수 30과 40을 덧셈하고
 2. 정수 30과 덧셈한 결과를 뺄셈하고
 3. 정수 40과 뺄셈한 결과를 곱셈하고
 4. 덧셈한 결과와 뺄셈한 결과를 나눗셈
 
 ──────────────────────────────────────────────────*/
public class HelloF {
	public static void main(String[] args) {
		
		/*──────────────────────────────────────────────────
		 변수 선언, 대입
		 ──────────────────────────────────────────────────*/
		
		int a = 30;
		int b = 40;
		int resultA;
		int resultB;
		int resultC;
		double resultD;
		
		/*──────────────────────────────────────────────────
		 계산
		 ──────────────────────────────────────────────────*/
		
		resultA = a + b;
		resultB = a - resultA;
		resultC = b * resultB;
		resultD = (double) resultA / resultB;
		
		/*──────────────────────────────────────────────────
		 출력
		 ──────────────────────────────────────────────────*/
		
		System.out.printf("%d + %d = %d\n", a, b, resultA);
		System.out.printf("%d - %d = %d\n", a, resultA, resultB);
		System.out.printf("%d x %d = %d\n", b, resultB, resultC);
		System.out.printf("%d ÷ %d = %2.2f\n", resultA, resultB, resultD);
	}
}
