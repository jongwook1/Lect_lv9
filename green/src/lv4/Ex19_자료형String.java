package lv4;

import java.util.Scanner;

public class Ex19_�ڷ���String {

	public static void main(String[] args) {
		//�ڷ���
		//1. int
		//2. double
		//3. char
		//4. boolean
		//5. String (�⺻�ڷ����� �ƴ�)
				
		
		// ���ڿ� : ����(char)�� ����(�迭)
		
		String name= "ȫ�浿";
		//									{'ȫ','��','��'}
		//									  0    1   2 
		
		System.out.println(name);
		System.out.println(name.length());
		
//		//�Է¹ޱ�
//		Scanner sc= new Scanner(System.in);
//		System.out.println("�̸� �Է�: ");
//		
//		String data = sc.next();		//���ڿ� �Է� ó��
//		System.out.println(data);
		
		//���ڿ� �޼ҵ�
		
		//����
		String temp= "ȫ�浿";
		if(name.equals(temp)){//equals ������ ����!    //(name ==temp) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
		
		//�����ڿ��� ��Һ�(����)
		// ���ڿ�.compareTo(�񱳹��ڿ�)
		// ���ڿ��� �������� �񱳹��ڿ��� ��������,���ڿ��� ��ġ
		
		temp="������";
		System.out.println(name.compareTo(temp));
		
		
		
	}

}
