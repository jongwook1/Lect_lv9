package lv6;
//����: 14:10
//����: 14:35
//�ҿ�: 00:25
/*
 * #����5
�־��� �迭�� ������ ���������� �մϴ�.

���� ��� �־��� �迭�� [1, 4, 2, 3]�̸�, ������ ������ �迭�� [3, 2, 4, 1]�Դϴ�.

������ ����ִ� �迭 arr�� �Ű������� �־����� ��,
arr�� ����� return �ϵ��� solution �޼ҵ带 �ۼ��Ϸ� �մϴ�.
 ��ĭ�� ä�� ��ü �ڵ带 �ϼ����ּ���.

---
##### �Ű����� ����
������ ����ִ� �迭 arr�� solution �޼ҵ��� �Ű������� �־����ϴ�.
* arr�� ���̴� 1 �̻� 100 �����Դϴ�.
* arr�� ���Ҵ� -100 �̻� 100 ������ �����Դϴ�.

---
##### return �� ����
�迭 arr�� ������ ����� return ���ּ���.

---
##### ����

| arr          | return       |
|--------------|--------------|
| [1, 4, 2, 3] | [3, 2, 4, 1] |

##### ���� ����
[1, 4, 2, 3]�� �ڿ������� ������ 3, 2, 4, 1�Դϴ�. 
���� [1, 4, 2, 3]�� ������ ������ ����� [3, 2, 4, 1]�� �˴ϴ�.
 */

import java.util.Arrays;

public class Test_Ex06 {

	public int[] solution(int[] arr) {
		int temp[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			temp[arr.length - i - 1] = arr[i];
		}
		return temp;

	}

	public static void main(String[] args) {

		Test_Ex06 sol = new Test_Ex06();
		int[] arr = { 1, 4, 2, 3 };
		int[] ret = sol.solution(arr);

		System.out.println("�� : " + Arrays.toString(ret) + " .");
	}

}
