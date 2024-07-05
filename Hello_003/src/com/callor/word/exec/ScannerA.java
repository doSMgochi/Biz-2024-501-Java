package com.callor.word.exec;

import java.util.Scanner;

public class ScannerA extends FileA {
	public static void main(String[] args) {
		System.out.print("문자를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("입력받은 문자열 : " + input);
	}
}
