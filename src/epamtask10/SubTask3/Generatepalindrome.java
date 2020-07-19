package epamtask10.SubTask3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generatepalindrome {
	boolean wordCheck(Palindrome p , String word) {
		return p.check(word);
	}
	static List<String> compute(List<String> input){
		Generatepalindrome object = new Generatepalindrome();
		List<String> result = new ArrayList<>();
		input.forEach(word->{
			if(object.wordCheck(PalindromeChecker::isPalindrome, word)) {
				result.add(word);
			}
		});
		return result;
	}
	void takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the list");
		int size = sc.nextInt();
		System.out.println("Enter list");
		List<String> input = new ArrayList<>();
		for(int i=0;i<size;i++) {
			input.add(sc.next());
		}
		List<String> outputarray = compute(input);
		for(String word: outputarray) {
			System.out.println(word);
		}
		sc.close();
	}
}
