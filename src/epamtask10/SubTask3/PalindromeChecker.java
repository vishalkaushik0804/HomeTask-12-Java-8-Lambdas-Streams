package epamtask10.SubTask3;

public class PalindromeChecker {
	static boolean isPalindrome(String word) {
		String result = "";
		for(int i=word.length()-1;i>=0;i--) {
			result+=word.charAt(i);
		}
		if(result.contentEquals(word)) {
			return true;
		}
		return false;
	}
}