package lv4;

import java.util.Random;
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50�� ==> 1 to 18
		 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
		 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
		 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
		 * 4. ���� 1~9�� front �迭�� �����ϰ�,
		 *    ���� 10~18�� back �迭�� �����Ѵ�.
		 */

		final int SIZE = 9;
		int[] front = new int[SIZE];
		int[] back = new int[SIZE];

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		//�迭�� ���־��ֱ�
		int gameN=1;
		int idx=-1;		
		for(int i=0;i<SIZE;i++) {
			front[i]=i+1;
			back[i]=i+10;
			idx++;
		}
		//����
		for(int i=0;i<1000;i++) {
			int rIdx=ran.nextInt(SIZE);
			int temp=front[idx];
			front[idx]=front[rIdx];
			front[rIdx]=temp;
		}
	
		for(int i=0;i<1000;i++) {
			int rIdx=ran.nextInt(SIZE);
			int temp=back[idx];
			back[idx]=back[rIdx];
			back[rIdx]=temp;
		}
		
		//run
		
		while(true) {
			//���
			for(int i=0;i<SIZE;i++) {
				System.out.print(front[i]+" ");
				if(i%3==2) {
					System.out.println();
				}
			}
			if(gameN>SIZE*2) {
				System.out.println("Ŭ����");
				break;
			}
			
				System.out.println("���� �������� ��ȣ�� �Է��ϼ���");
				int inputIdx = sc.nextInt() - 1;
				for(int i=0;i<SIZE;i++) {
				if (inputIdx >= 0 && inputIdx < SIZE) {
					if (front[inputIdx] == gameN) {
						front[inputIdx] = back[inputIdx];
						back[inputIdx] = 0;
						gameN++;
					}
				}
			}
			
			
			
			
			
			
		}
		
		

	}

}
