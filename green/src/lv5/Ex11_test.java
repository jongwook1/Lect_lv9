package lv5;

import java.util.Scanner;

public class Ex11_test {

	public static void main(String[] args) {
//		 * # �ܾ� ��ü�ϱ�(replace)
//		 * 1. text���� ���� �ӿ��� �����ϰ� ���� �ܾ �Է¹޾�,
//		 * 2. ��ü���ִ� ����� �����Ѵ�.
//		 * ��)
//		 * 		Life is too short.
//		 * 		�����ϰ� ���� �ܾ��Է� : Life
//		 * 		�ٲ� �ܾ��Է� : Time
//		 * 
//		 * 		Time is too short.

		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("�����ϰ� ���� �ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();
		
		char[] arr = new char[text.length()];
		for(int i = 0; i < text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		//�˻��� for�� (arr[i]�� �����ϰ� ���� �ܾ ����ִ���)
		int idx = -1;
		int check = -1;
		int size = word.length();
		for(int i = 0; i < arr.length-size+1; i++) {
			int cnt = 0;
			for(int j = 0; j < size; j++) {
				if(arr[i+j] == word.charAt(j)) {
					cnt++;
				}
			}
			if(cnt == size) {
				check = 1;
				idx = i;			//ife�˻��� idx=1 fe �˻��� idx=2 
			}
		}
//		System.out.println("idx "+idx);
		if(check == 1) {
			//�ٲ� �ܾ �Է��ϸ� --> �����ϰ��� �ϴ� �ܾ�� �ڸ� ��ü. 
			//�ٲ� �ܾ� �Է�.
			System.out.print("�ٲ� �ܾ �Է��ϼ��� : ");
			String transWord = scan.nextLine();
			
			//�����ϰ��� �ϴ� �ܾ� Ȯ�� �� ��ü.
			// 0) idx~idx+word.length() �� (����)
			// 1) idx�� �������� �պκ��� substring�ϰ�, idx+word.length()���ķ� �߶󳻱�.
			// 2) front + new + back
			
			String front = text.substring(0,idx);
			String back = text.substring(idx+word.length());
			
//			front = transWord;
//			System.out.println(front);
			System.out.println(back);
			
			text = front + transWord + back;
			System.out.println(text);
//			System.out.println(front + transWord + back);
			
		}
		else {
			System.out.println("������ �ܾ �����ϴ�.");
		}




	}

}
