package lv1;


// �Է¹ޱ�

import java.util.Scanner;		//1. util ��Ű���� Scanner�� import

public class Ex06 {

	public static void main(String[] args) {
		// ���� �ϱ�
		//2. Scanner ���� ����� �ʱ�ȭ
		
		Scanner scan = new Scanner(System.in);
		
		//3. �Է¹޴� ���� ������ ���� ����
		String name;

		//4. Scanner�� Ȱ���� �Է¹ޱ�
		name = scan.next();		//String �ڷ����� �Է¹��� �Լ�
	
		System.out.println(name);
		
		System.out.println("���� �Է� : ");
		int data = scan.nextInt();
		System.out.println("data : " + data);
		
		System.out.println(data + 123);
	}

}
