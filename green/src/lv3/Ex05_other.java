package lv3;

import java.util.Scanner;

public class Ex05_other {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5};		
		char code[] = {'a','b','c','d','e'};
		
		//arr �迭���� �Է¹��� ���� ã���� -> �ش� �ڵ带 ���
		
		
		System.out.println("���� �Է�: ");
		int data = sc.nextInt();
		
		
		int idx =0;						///// �ε��� ������ �����ϴ� ������ ������ �ʱ�ȭ�� ����
										///�ε��� ���� 0���� �����ϱ⶧���� -> �����Ѱ� ex)0 ���� �ʱ�ȭ�ϸ� ���� �߸� �����Ҽ�����
		
		for(int i=0; i<5; i++) {
			if(data == arr[i]) {
				idx = i;
			}
		}
		
		//idxȰ��-->code ���
		System.out.println(code[idx]);
		if(idx == -1) {
			System.out.println("�������� �ʴ� ���Դϴ�!");
		}else {
			System.out.println(code[idx]);
		}

	}

}
