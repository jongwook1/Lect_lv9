package lv1;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�[2�ܰ�]
		 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
		 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
		 */
	Scanner sc = new Scanner(System.in);

	int max = 0;
	int cnt = 1;
	while(cnt <= 3 ) {
		System.out.println(cnt+ "��° �����Է� :");
		int num = sc.nextInt();
		
		if(max< num) {
			max = num;
		}		
		cnt ++;		
	}
	System.out.println("�ִ밪: " + max);
	
	}

}
