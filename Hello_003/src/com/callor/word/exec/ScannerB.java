package com.callor.word.exec;
/*
 키보드를 통하여 학생이름, 국어, 영어, 수학 성적을 차례로 입력받고
 ──────────────────────────────────────────────────────────────────
 학생 이름 : OOO
 국어 : OOO
 영어 : OOO
 수학 : OOO
 ──────────────────────────────────────────────────────────────────
 총점 : OOO
 평균 : OOO
 ──────────────────────────────────────────────────────────────────
 */

import java.util.Scanner;

public class ScannerB {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String name = "";
			int koreanRecord = 0;
			int englishRecord = 0;
			int mathRecord = 0;
			while (true) {
				System.out.print("이름을 입력하세요 : ");
				name = sc.nextLine();
				System.out.print("국어 성적을 입력하세요 : ");
				String korean = sc.nextLine();
				if (!korean.matches("[0-9]+")) {
					System.out.println("잘못된 입력값입니다. 다시 입력하세요");
					continue;
				} else {
					koreanRecord = Integer.parseInt(korean);
				}
				System.out.print("영어 성적을 입력하세요 : ");
				String english = sc.nextLine();
				if (!english.matches("[0-9]+")) {
					System.out.println("잘못된 입력값입니다. 다시 입력하세요");
					continue;
				} else {
					englishRecord = Integer.parseInt(english);
				}
				System.out.print("수학 성적을 입력하세요 : ");
				String math = sc.nextLine();
				if (!math.matches("[0-9]+")) {
					System.out.println("잘못된 입력값입니다. 다시 입력하세요");
					continue;
				} else {
					mathRecord = Integer.parseInt(math);
				}
				break;
			}
			int sum = koreanRecord + englishRecord + mathRecord;
			float avg = ((float) koreanRecord + englishRecord + mathRecord) / 3;

			System.out.println("─".repeat(50));
			System.out.println("학생 " + name + " 의 성적");
			System.out.println("국어 : " + koreanRecord);
			System.out.println("영어 : " + englishRecord);
			System.out.println("수학 : " + mathRecord);
			System.out.println("─".repeat(50));
			System.out.println("총점 : " + sum);
			System.out.printf("평균 : %.2f", avg);
			
			// int intKor = 0; 헝가리안 표기법 / 변수명 시작을 변수의 type 명칭으로 시작하는 표기법
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
