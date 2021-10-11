package lv6;
//시작: 14:35
//종료: 15:35
//소요: 01:00
/*
 * #문제8
앞에서부터 읽을 때와 뒤에서부터 읽을 때 똑같은 단어 또는 문장을 
팰린드롬(palindrome)이라고 합니다. 예를 들어서 racecar, noon은 팰린드롬 단어입니다. 

소문자 알파벳, 공백(" "), 그리고 마침표(".")로 이루어진 문장이 
팰린드롬 문장인지 점검하려 합니다. 문장 내에서 알파벳만 
추출하였을 때에 팰린드롬 단어이면 팰린드롬 문장입니다.
 예를 들어, "Never odd or even."과 같은 문장은 팰린드롬입니다.

소문자 알파벳, 공백(" "), 그리고 마침표(".")로 이루어진 문장
 sentence가 주어질 때 팰린드롬인지 아닌지를 return 하도록 solution 메소드를 작성했습니다.
 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다.
 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정해주세요.

---
##### 매개변수 설명
소문자 알파벳, 공백(" "), 그리고 마침표(".")로 이루어진 문장
 sentence가 solution 메소드의 매개변수로 주어집니다.

* sentence의 길이는 1이상 100이하입니다.
* sentence에는 적어도 하나의 알파벳이 포함되어 있습니다.
* setntence의 각 문자는 소문자 알파벳, 공백(" "), 또는 마침표(".")입니다.

---
##### return 값 설명
주어진 문장이 팰린드롬인지 아닌지를 return 해주세요.

---
##### 예시

| sentence             	| return 	|
|----------------------	|--------	|
| "never odd or even." 	| true   	|
| "palindrome"         	| false  	|


##### 예시 설명
예시 #1
알파벳과 숫자만 추출하여 소문자로 변환해보면 "neveroddoreven"이 되며 이 단어는 팰린드롬입니다.

예시 #2
문장의 맨 앞 문자인 "p"와 맨 뒤 문자인 "e"가 다르므로 팰린드롬이 아닙니다.


 */
import java.util.Arrays;

//sentence.charAt(i)>=65&&sentence.charAt(i)<=90&&sentence.charAt(i)>=97&&sentence.charAt(i)<=122
public class Test_Ex07 {
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
		Test_Ex07 sol = new Test_Ex07();
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
