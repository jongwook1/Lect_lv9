package lv6;

public class ttt {
	boolean solution(String sentence) {

		String str = "";
		for (int i = 0; i < sentence.length(); i++) {

			if (sentence.charAt(i) != '.' && sentence.charAt(i) != ' ') {
				str += sentence.charAt(i);
			}
		}
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) { // 순서를 뒤집어서 비교.
			temp += str.charAt(i);
		}
		int check = -1;
		for (int i = 0; i < str.length(); i++) {
			int a = str.charAt(i);
			int b = temp.charAt(i);
			if (a - b == 32 || a - b == -32) {
				check = 1;
			}
		}
		if (str.equals(temp) || check == 1) {
			return true;
		} else {

			return false;
		}

	}

	public static void main(String[] args) {
		ttt sol = new ttt();
		String sentence1 = "Never odd or even.";
		boolean ret1 = sol.solution(sentence1);
		System.out.println("답 : " + ret1 + " .");

		String sentence2 = "palindrome";
		boolean ret2 = sol.solution(sentence2);
		System.out.println("답 : " + ret2 + " .");

		String sentence3 = "aB bA.";
		boolean ret3 = sol.solution(sentence3);
		System.out.println("답 : " + ret3 + " .");
	}

}
