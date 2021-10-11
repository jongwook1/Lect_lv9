package lv6;
//���� 09:05
//���� 10:05
//�ҿ� 01:00

/*
 * #����1
A �б������� ��ü Ƽ������ �ֹ��ϱ� ���� �л����� ���ϴ� Ƽ���� ����� �����߽��ϴ�. 
������ �� �ִ� Ƽ���� ������� ���� �������
 "XS", "S", "M", "L", "XL", "XXL" �� 6������ �ֽ��ϴ�.

�л����� ���ϴ� Ƽ���� ����� ������ ����� ����ִ� 
�迭 shirtSize�� �Ű������� �־��� ��,
 ������� Ƽ������ �� ���� �ʿ����� ���� ���� ��������� ������� �迭�� ���
 return �ϵ��� solution �޼ҵ带 �ϼ����ּ���.

---
##### �Ű����� ����
�л����� ���ϴ� ����� ������ ����� ����ִ� �迭
 shirtSize�� solution �޼ҵ��� �Ű������� �־����ϴ�.
* shirtSize �� ���̴� 1 �̻� 100 �����Դϴ�.
* shirtSize ���� ġ���� ��Ÿ���� ���ڿ� "XS", "S", "M", "L", "XL", "XXL" �� ����ֽ��ϴ�.

---
##### return �� ����
Ƽ������ ������� �� ���� �ʿ����� 
���� ���� ��������� ������� �迭�� ��� return ���ּ���.
* return �ϴ� �迭���� [ "XS" ����, "S" ����, "M" ����, "L" ����, "XL" ����, "XXL" ����]
 ������ ����־�� �մϴ�.

---
##### ����

| shirtSize                       | return        |
|----------------------------------|---------------|
| ["XS", "S", "L", "L", "XL", "S"] | [1, 2, 0, 2, 1, 0] |

##### ���� ����
* "XS"�� "XL"�� ���� �� �� ��û�߽��ϴ�.
* "S"�� "L"�� ���� �� �� ��û�߽��ϴ�.
* "M"�� "XXL"�� ��û�� �л��� �����ϴ�.

���� ������� [1, 2, 0, 2, 1, 0]�� �迭�� ��� return �ϸ� �˴ϴ�.

 */
import java.util.Arrays;

public class Test_Ex02 {
	String[] size = { "XS", "S", "M", "L", "XL", "XXL" };

	/*
	 * ##### ���� ���� "XS"�� "XL"�� ���� �Ѹ� ��û�߽��ϴ�. "S"�� "L"�� ���� �� �� ��û�߽��ϴ�. "M"�� "XXL"��
	 * ��û�� �л��� �����ϴ�.
	 */
	public int[] solution(String[] shirtSize) {
		int[] answer = new int[size.length];

		for (int i = 0; i < size.length; i++) {
			for (int j = 0; j < shirtSize.length; j++) {
				if (size[i].equals(shirtSize[j])) {
					answer[i]++;
				}

			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Test_Ex02 sol = new Test_Ex02();
		String[] shirtSize = { "XS", "S", "L", "L", "XL", "S" };
		int[] ret = sol.solution(shirtSize);
		System.out.println("��: " + Arrays.toString(ret) + " .");
	}

}