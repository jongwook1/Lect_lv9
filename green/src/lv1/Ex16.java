package lv1;
import java.util.Scanner;

//"Random" +��Ʈ�� �����̽�
import java.util.Random;
public class Ex16 {

	public static void main(String[] args) {
		/*
		 * # ��� ���� ���߱� ����
		 * 1. 150~250 ������ ���� ���� ���� 
		 * 2. ���� ������ ��� ���ڸ� ���ߴ� �����̴�.
		 * ��)
		 * 		249		: 4
		 */		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int quiz = rn.nextInt(101) +150;	//150~250 (101��)
		
		
		System.out.println(quiz);
		
		
	
		//����
		
		//�Է�
		
		
		int answer = quiz / 10 % 10;	// ��� ��
		System.out.println("��� ���ڸ� �����ּ���");		
		int input = sc.nextInt();
		
		if(input == answer) {
			System.out.println("����");
		}else {
			System.out.println("��");
		}
	}
}
