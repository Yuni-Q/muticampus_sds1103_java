package test02;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String[] words = {"abc","aaa","hello"};
		
		List<String> wordList = Arrays.asList(words);
		
		for(String word: wordList){
			System.out.println("´Ü¾î:"+word);
		}
	}
}
