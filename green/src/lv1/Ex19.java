package lv1;
import java.util.Random;
import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		/*
		 * # ������ ��ȣ ���߱� ����
		 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
		 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
		 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
		 * 	  1) ����	  2)  �E��     3) ����	 4) ������
		 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
		 * ��) 3 ? 4  = 7
		 *    1) + 2) - 3) * 4) %
		 *    ���� : 2��
		 */
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int a = rn.nextInt(10) +1;
		int b = rn.nextInt(10) +1;
		
		int op = rn.nextInt(4)+1;
		
		int result = 0;
		
		if(op == 1) {
			
		}
		else if(op == 1) {
			result = a + b;
		}
		else if(op == 2) {
			result = a - b;
		}
		else if(op == 3) {
			result = a * b;
		}
		else if(op == 4) {
			result = a / b;
		}
		
		//���������ֱ�
		System.out.println(a + "? " +b + "=" + result);
		System.out.println("�����ڴ�? 1)+ 2)- 3)* 4) %");
		
		
		int answer = sc.nextInt();
		
		//�˻�
		if(answer == op) {
			System.out.println("����");
		}else{
			System.out.println("��");
		}
		
		
		
		
		
		
		
		/*	Scanner sc = new Scanner(System.in);
			Random rn = new Random();
			int rN1 = rn.nextInt(10) +1;
			int rN2 = rn.nextInt(10) +1;
			int rN3 = rn.nextInt(4) +1;			//������ ��ȣ
			
			System.out.println(rN1+ "?" + rN2 + "=" + (rN1 + rN2));
			System.out.println("������ �´� ������ ?");
			System.out.println("1. ���� 2. ���� 3. ���� 4.������");
			System.out.println("������ �Է��ϼ���");
			
			int input = sc.nextInt();
			
			if(input == 1) {				
				System.out.println("����");
				System.out.println("���� : " + input +"��");
			}else if(input == 2) {
				System.out.println("����");
				System.out.println("���� : " + input +"��");
			}else if(input == 3) {
				System.out.println("����");
				System.out.println("���� : " + input +"��");
			}else if(input == 4) {
				System.out.println("������");
				System.out.println("���� : " + input +"��");
			}else {
				System.out.println("�߸������ϼ̽��ϴ�");			
			}			
			*/			
	}
}

/*
 if(input == 1) {				
				System.out.println("����");
			}else if(input == 2) {
				System.out.println("����");
			}else if(input == 3) {
				System.out.println("����");
			}else if(input == 4) {
				System.out.println("������");
			}
 */
 
