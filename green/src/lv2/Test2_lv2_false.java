package lv2;

import java.util.Scanner;

public class Test2_lv2_false {

	public static void main(String[] args) {
		// ���� 10:05
		// ���� 10:
		// �ҿ� 00��		
		
		/*
		 * # ����Ų���31
		 * 1. p1�� p2�� �����ư��鼭 1~3�� �Է��Ѵ�.
		 * 2. br�� p1�� p2�� �Է°��� �����ؼ� �����Ѵ�.
		 * 3. br�� 31�� ������ ������ ����ȴ�.
		 * 4. �¸��ڸ� ����Ѵ�.
		 * 
		 * ��) 
		 * 1�� : p1(2)	br(2)
		 * 2�� : p2(1)	br(3)
		 * 3�� : p1(3)	br(6)
		 * ...
		 */
		Scanner sc = new Scanner(System.in);
		int turn = 0;
		int br = 0;
		int answer = 0;
		boolean run = true;
		
		
		while(run) {
			System.out.println("������ br��"+br);
			if(turn % 2 ==0) {
				System.out.println("p1�� �����Է����ּ���");
				answer = sc.nextInt();
				
			}else  {
				System.out.println("p2�� �����Է����ּ���");
				answer = sc.nextInt();
				
				}
			turn++;
			if(answer>=1 && answer <=3){
				br += answer;
				if(br>=31) {
					if(turn == 0) {
						System.out.println("p2�� �¸��ϼ˽��ϴ�");
					}
					else if(turn ==1) {
						System.out.println("p2�� �¸��ϼ˽��ϴ�");
					}
				}run = false;
			}
			
			
			else {
				System.out.println("1~3�� ���ڸ� �Է����ּ���");
				turn--;
			}
			
			
		}
		
		

	}

}
