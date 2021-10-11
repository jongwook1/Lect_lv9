package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex28_ttttt {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int size = 10;
		int[][] map = new int[size][size];
		
		int snakeSize = 4;
		int[] y = new int[snakeSize];
		int[] x = new int[snakeSize];
		
		
		// ������ũ �����ϱ�
		for(int i=0; i<snakeSize; i++) {
			x[i] = i;
			y[i] = 0;
			
			map[y[i]][x[i]] = i + 1;
		}
		
		//-------------------------------
		// ������ �����ϱ�
		int itemCount = 8;
		int item = 9;
		
		while(itemCount != 0) {
			int rY = ran.nextInt(size);
			int rX = ran.nextInt(size);
			
			if(map[rY][rX] == 0) {
				map[rY][rX] = item;
				itemCount = itemCount - 1;
			}
		}
		//-------------------------------
		
		while(true) {
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					if(map[i][j] == item) {
						System.out.print("* ");
					}else {
						System.out.print(map[i][j] + " ");
					}
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.println("     ��(8)");
			System.out.println("��(4) ��(5) ��(6)");
			
			int choice = scan.nextInt();
			
			// ���� �Ӹ��� �ӽú����� ����
			int tempY = y[0];
			int tempX = x[0];
			
			if(choice == 4) { tempX = tempX - 1; }
			else if(choice == 5) { tempY = tempY + 1; }
			else if(choice == 6) { tempX = tempX + 1; }
			else if(choice == 8) { tempY = tempY - 1; }
			
			if(size <= tempY || tempY < 0) continue;
			if(size <= tempX || tempX < 0) continue;
			
			// �ڽ��� ���� ������ ����
			if(map[tempY][tempX] != 0 && map[tempY][tempX] != item) {
				System.out.println("�ñ��!");
				break;
			}

			// �������� ������
			if(map[tempY][tempX] == item) {
				if(snakeSize == 8) continue;
				
				int[] yy = y;
				int[] xx = x;
				
				y = new int[snakeSize + 1];
				x = new int[snakeSize + 1];
				
				for(int i=0; i<snakeSize; i++) {
					y[i] = yy[i];
					x[i] = xx[i];
				}
				
				snakeSize = snakeSize + 1;
			}
			
			// ������ ���� ǥ��Ǿ� �ִ� mapȭ�� �ʱ�ȭ
			for(int i=0; i<snakeSize; i++) {
				map[y[i]][x[i]] = 0;
			}

			// ���� �̵��ϱ�
			for(int i=snakeSize - 1; i>0; i--) {
				y[i] = y[i - 1];
				x[i] = x[i - 1];
			}
			
			// �Ӹ� �̵��ϱ�
			y[0] = tempY;
			x[0] = tempX;
			
			// mapȭ�鿡 �̵��� ���� ��ġ�� �ٽ� ǥ���ϱ�
			for(int i=0; i<snakeSize; i++) {
				map[y[i]][x[i]] = i + 1;
			}
			
		}














	}

}
