package lv8;
//ArrayList�� Ȱ���� ��Ʈ�ѷ� ����

import java.util.ArrayList;
import java.util.Scanner;

//class Integer{
//	
//	
//	
//}

public class Ex01 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 1.�߰� 2.���� 3.���� 4.���� //����(�ε���) ����(��) ������ �߰��ϱ�
			System.out.println(arr);
			System.out.println("1.�߰� 2. ����(�ε���)  3. ����(��)  4. ���� 5. ���� 6. ����");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("�߰��� ���� �Է��ϼ���");
				Integer num = sc.nextInt();
				arr.add(num);

			} else if (sel == 2) {
				System.out.println("������ �ε��� �Է����ּ���");
				Integer index = sc.nextInt();
//				arr.add(index, num);
			} else if (sel == 3) {
				System.out.println("������ ���� �Է����ּ���");
				Integer delData = sc.nextInt();
				arr.remove(delData);
			} else if (sel == 4) {
				System.out.println("������ ��ġ�� �Է����ּ���");
				Integer addIdx = sc.nextInt();
				System.out.println("������ ���� �Է����ּ���");
				Integer addData = sc.nextInt();
				arr.add(addIdx, addData);
			} else if (sel == 5) {
				System.out.println("������ ��ġ�� �Է����ּ���");
				Integer setIdx = sc.nextInt();
				System.out.println("������ ���� �Է����ּ���");
				Integer setData = sc.nextInt();
				arr.set(setIdx, setData);
			} else if (sel == 6) {
				System.out.println("�����ϰڽ��ϴ�");
				break;
			}

		}

	}

}
