package lv5;

import java.util.Scanner;

public class Ex10__ {

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
		System.out.print("\n�˻��� �ܾ �Է��ϼ��� : ");
		String word = sc.next();
		
		
		//text���� temp�迭
		char temp[]=new char[text.length()];
		
//		System.out.println(temp.length);			//temp�迭��ũ�Ⱑ text.length�� ������ Ȯ��
		
		//temp�� text���� �ֱ�
		for(int i=0;i<temp.length;i++) {
			temp[i]=text.charAt(i);
//			System.out.println(temp[i]);			//���� �ߵ��� Ȯ��
		}
		
		//�˻��� �ܾ��� word�� ���̸� size������ ����
		int size=word.length();
		
		boolean check=false;
		for(int i=0;i<temp.length-size+1;i++) {		//temp.length-size+1�� ���� size�� ���� ������ i�� size�� �Ȼ���ŭ �� ���Ƽ� �ƿ��ٿ���� //+1�� ���������� text�� ���� �����Ͽ� �˻������� +1�� ���ϸ� ã������
			int cnt=0;
			for(int j=0;j<size;j++) {
				if(temp[i+j]==word.charAt(j)) {
					cnt++;
				}
			}
			if(cnt==word.length()) {
				check=true;
			}
		}
		if(check==true) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}		
	}
}
