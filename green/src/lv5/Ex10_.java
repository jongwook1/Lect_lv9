package lv5;

import java.util.Scanner;

public class Ex10_ {

	public static void main(String[] args) {
		/*
		 * # �ܾ� �˻�
		 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
		 * 2. �ܾ �����ϸ� true
		 *    �ܾ ������ false�� ����Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);
		String text = "Life is, too short!";
		System.out.println(text);
		for(int i=0;i<text.length();i++) {
			System.out.print(i);
		}
		System.out.println(text.length());
		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = sc.next();


	char temp[]=new char[text.length()];
		for(int i=0;i<temp.length;i++) {
			temp[i]=text.charAt(i);
			
//			System.out.print(temp[i]);
		}
//		System.out.println("temp����"+temp.length);
		int size=word.length();
		
		int check=-1;		
		
		for(int i=0;i<temp.length-size+1;i++) {
			int cnt=0;
			for(int j=0;j<size;j++) {
				if(temp[i+j]==word.charAt(j)) {
					cnt++;
				}				
			}
			if(cnt==word.length()) {
				check=1;
			}
		}
		if(check==1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
