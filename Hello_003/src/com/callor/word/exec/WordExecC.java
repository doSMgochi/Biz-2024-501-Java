package com.callor.word.exec;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.callor.word.models.WordVO;
import com.callor.word.service.WordService;
import com.callor.word.service.impl.WordServiceImplV2;

/*
 * main() method 를 생성하고
 * WordService, WordServiceImplV2 를 사용하여
 * 임의의 단어를 한 개 추출하고
 * 한글 번역을 보여준 후 영어 단어를 입력받아
 * 단어가 맞았는지 틀렸는지 판별하는 코드를 작성
 */
public class WordExecC {
	public static void main(String[] args) {
		String wordFile = "src/com/callor/word/word.txt";
		WordService wordService = null;
		try {
			wordService = new WordServiceImplV2(wordFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (true) {
			WordVO wordVO = wordService.getWord();
			System.out.println(wordVO.korean + " 의 뜻을 가진 영단어를 입력하세요");
			System.out.print(">>");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			String word = wordVO.english;
			if (input.equalsIgnoreCase(word)) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("오답입니다.");
				System.out.println("입력한 답 : " + input);
				System.out.println("올바른 답 : " + word);
			}
		}
	}
}
