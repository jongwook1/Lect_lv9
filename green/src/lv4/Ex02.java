package lv4;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * # �����̵�[2�ܰ�]
		 * 1. ����2�� ĳ�����̴�.
		 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
		 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
		 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
		 * 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
		 * 5. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.       ���Ĵ� �������ġ�� ������� �������ִ�
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };
		int p = -1;
		while (true) {
			for (int i = 0; i < 9; i++) {
				System.out.print(game[i]+" ");
				if (game[i] == 2) {
					p = i;					
				}
			}
			
			System.out.println("\n�̵�����ġ�����ϼ���");
			System.out.println("1.��  2.��  3.����  4.����");
			int sel = sc.nextInt();
			if (sel == 1 && p - 1 >= 0 ) {
				game[p] = 0;
				game[p - 1] = 2;
			}

			else if (sel == 2 && p + 1 <9) {
				game[p] = 0;
				game[p + 1] = 2;
			} else if (sel == 3) {
				if(game[p-1]==1||game[p+1]==1) {
					System.out.println("�����Һ��� �����̸� 1,   �������̸� 2");
					sel=sc.nextInt();
					if(sel==1) {
						game[p-1]=0;
						System.out.println("�����μ����ϴ�");
					}else if(sel==2) {
						game[p+1]=0;
						System.out.println("�����μ����ϴ�");						
					}
				}else {
					System.out.println("���� �����ϴ� �ٽ�Ȯ���ϼ���");
				}		
				
			}

			else if (sel == 4) {
				System.out.println("������");
				break;
			}

		}

	}

}

