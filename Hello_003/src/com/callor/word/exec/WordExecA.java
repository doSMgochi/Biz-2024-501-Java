package com.callor.word.exec;

import com.callor.word.service.WordService;
import com.callor.word.service.impl.WordServiceImplV1;

public class WordExecA {
	public static void main(String[] args) {
		String wordFile = "src/com/callor/word/word.txt";
		WordService wordService = null;
		try {
			wordService = new WordServiceImplV1(wordFile);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("파일을 찾지 못하였습니다.");
		}
		wordService.wordFileRead();
		wordService.wordListPrint();
	}
}
