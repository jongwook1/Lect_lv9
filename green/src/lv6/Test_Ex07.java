package lv6;
//����: 14:35
//����: 15:35
//�ҿ�: 01:00
/*
 * #����8
�տ������� ���� ���� �ڿ������� ���� �� �Ȱ��� �ܾ� �Ǵ� ������ 
�Ӹ����(palindrome)�̶�� �մϴ�. ���� �� racecar, noon�� �Ӹ���� �ܾ��Դϴ�. 

�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ������ 
�Ӹ���� �������� �����Ϸ� �մϴ�. ���� ������ ���ĺ��� 
�����Ͽ��� ���� �Ӹ���� �ܾ��̸� �Ӹ���� �����Դϴ�.
 ���� ���, "Never odd or even."�� ���� ������ �Ӹ�����Դϴ�.

�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ����
 sentence�� �־��� �� �Ӹ�������� �ƴ����� return �ϵ��� solution �޼ҵ带 �ۼ��߽��ϴ�.
 �׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, ��� �Է¿� ���ؼ��� �ùٸ��� �������� �ʽ��ϴ�.
 �־��� �ڵ忡�� _**�� ��**_�� �����ؼ� ��� �Է¿� ���� �ùٸ��� �����ϵ��� �������ּ���.

---
##### �Ű����� ����
�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ����
 sentence�� solution �޼ҵ��� �Ű������� �־����ϴ�.

* sentence�� ���̴� 1�̻� 100�����Դϴ�.
* sentence���� ��� �ϳ��� ���ĺ��� ���ԵǾ� �ֽ��ϴ�.
* setntence�� �� ���ڴ� �ҹ��� ���ĺ�, ����(" "), �Ǵ� ��ħǥ(".")�Դϴ�.

---
##### return �� ����
�־��� ������ �Ӹ�������� �ƴ����� return ���ּ���.

---
##### ����

| sentence             	| return 	|
|----------------------	|--------	|
| "never odd or even." 	| true   	|
| "palindrome"         	| false  	|


##### ���� ����
���� #1
���ĺ��� ���ڸ� �����Ͽ� �ҹ��ڷ� ��ȯ�غ��� "neveroddoreven"�� �Ǹ� �� �ܾ�� �Ӹ�����Դϴ�.

���� #2
������ �� �� ������ "p"�� �� �� ������ "e"�� �ٸ��Ƿ� �Ӹ������ �ƴմϴ�.


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
		for (int i = str.length() - 1; i >= 0; i--) { // ������ ����� ��.
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
		System.out.println("�� : " + ret1 + " .");

		String sentence2 = "palindrome";
		boolean ret2 = sol.solution(sentence2);
		System.out.println("�� : " + ret2 + " .");

		String sentence3 = "aB bA.";
		boolean ret3 = sol.solution(sentence3);
		System.out.println("�� : " + ret3 + " .");
		
	}

}
