package lv3_review;

import java.util.Scanner;

public class L3_Ex29 {

	public static void main(String[] args) {
		/*
		 * [�ݺ��� ��ȭ����]
		 * 
		 * 1. -1�� ���� ������ �Ϸ��� ���� �Է¹޴´�.
		 * 2. �� �� �� key ���� �� ��°�� ���ԵǾ� �ִ°��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 3. ��, key�� ������ ���ԵǾ� ���� ��� �տ� ��Ÿ�� ���� ��ġ�� ����Ͻÿ�.
		 * 4. key�� �Ϸ��� �� �ȿ� ���� ��� "not found"�� ����Ͻÿ�.
		 * 
		 * ��) 
		 * result �� �Է� : 99
		 * 
		 * �Է� : 10
		 * �Է� : 99
		 * �Է� : 20
		 * �Է� : 99
		 * �Է� : 30
		 * �Է� : 99
		 * �Է� : 10
		 * �Է� : -1
		 * 
		 * ��� : key�� 99�� ù���� ��Ÿ�� ���� 2��° �̴�.
		 */
		// ����� �� ==> -1 ==> Ű�� �Է¹���������.
        // ����� �� ==> 99 , 77 , -1 ==> Ű�� 1���̴� 
        // ����� �� ==> 55, 99 , 99, 99, 99, 3 , -1 ==> Ű�� 2���̴�
		Scanner sc = new Scanner(System.in);
		 int result = 99;
	        
			
			boolean run=true;
			int idx=-1;							//Ű���� ���°�� �����ϴ����� �Ǻ��ϱ����� ����
			int cnt=1;							//���ڼ��� 1���� ���Ƿ�
			while(run) {
				System.out.print("key�� �Է� : ");
				int key = sc.nextInt();

				if (key == -1) {
					if (idx == -1) {
						System.out.println("not found");
					}else {
						System.out.println("Ű����"+idx+"��°��");
					}
					run=false;
				}else if(key==result&&idx==-1) {
					idx=cnt;
				}
				cnt++;				
				
			}
			
			
        
		
	}

}
