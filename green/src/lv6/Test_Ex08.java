package lv6;
//����: 09:10
//����: 10:00
//�ҿ�: 00:50
/*
 * #����9
���ĺ� ���ڿ��� �־��� ��, �����ϴ� �ߺ� ���ڸ� �����Ϸ��� �մϴ�. 
���� ���, "senteeeencccccceeee"��� ���ڿ��� �־����ٸ�, "sentence"��� ������� ���ɴϴ�.

���� �ҹ��� ���ĺ����� �̷���� ������ ���ڿ� characters�� �Ű������� �־��� ��, 
�����ϴ� �ߺ� ���ڵ��� ������ ����� return �ϵ��� solution �޼ҵ带 �ۼ��Ͽ����ϴ�. 
�׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, �ڵ尡 �ùٸ��� �������� �ʽ��ϴ�.
 �־��� �ڵ忡�� _**�� ��**_�� �����ؼ� ��� �Է¿� ���� �ùٸ��� �����ϵ��� �����ϼ���.

---

#####�Ű����� ����
���� �ҹ��� ���ĺ����� �̷���� ������
 ���ڿ� characters�� solution �޼ҵ��� �Ű������� �־����ϴ�. 
* characters�� ���ĺ� �ҹ��ڷθ� �̷�����ֽ��ϴ�.
* characters�� ���̴� 10 �̻� 100 �����Դϴ�.

---

#####return �� ����
characters���� �����ϴ� �ߺ� ���ڸ� ������ ���ڿ��� return ���ּ���.

---

#####����

| characters                  | return    |
|-------------------------|-----------|
| "senteeeencccccceeee" | "sentence" |

 */

import java.util.Arrays;

public class Test_Ex08 {
	public String solution(String characters) {

		String result = "";
		char temp1[] = new char[characters.length()];

		for (int i = 0; i < temp1.length; i++) {
			temp1[i] = characters.charAt(i);
		}

		char temp2[] = new char[100];
		int cnt = 0;
		for (int i = 0; i < temp1.length; i++) {
			int check = 1;
			temp2[cnt] = temp1[i];
			if (cnt != 0) {
				if (temp2[cnt - 1] == temp2[cnt]) {
					check = -1;
				}
			}
			if (check == 1) {
				cnt++;
			}
		}
		for (int i = 0; i < cnt; i++) {
			result += temp2[i];
		}
		return result;

	}

	// The following is main method to output testcase. The main method is correct
	// and you shall correct solution method.
	public static void main(String[] args) {
		Test_Ex08 sol = new Test_Ex08();
		String characters = "senteeeencccccceeee";
		String ret = sol.solution(characters);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + ret + " .");

	}

}
