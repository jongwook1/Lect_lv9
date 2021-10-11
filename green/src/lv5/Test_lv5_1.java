package lv5;
//���� 15:00
//���� 15:10
//�ҿ� 00:10
import java.util.Random;
import java.util.Scanner;

public class Test_lv5_1 {

	public static void main(String[] args) {
		/*
		 * # Ÿ�ڿ��� ����[2�ܰ�]
		 * 1. ������ ���´�.(shuffle)
		 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
		 * 3. �� ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ���
		 * ��)
		 * ���� : mys*l
		 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
		 * ���� : *sp
		 * �Է� : jsp
		 * ...
		 */
		
			Scanner sc = new Scanner(System.in);
			Random ran = new Random();
			String[] words = { "java", "mysql", "jsp", "spring" };
			
			//�ܾ���� ����
			for(int i=0;i<words.length;i++) {
				int rN=ran.nextInt(words.length);
				String temp=words[0];
				words[0]=words[rN];
				words[rN]=temp;
			}

			int i=0;
			while(i<words.length) {
				int size=words[i].length();
				int r=ran.nextInt(size);
				System.out.print("���� "+(i+1));
				System.out.println();
				for(int j=0;j<size;j++) {
					if(j==r) {
						System.out.print("*");
					}else {
						System.out.print(words[i].charAt(j));
					}
				}
				System.out.println();
				System.out.println("�Է�: ");
				String inputWord=sc.next();
				if(inputWord.equals(words[i])) {
					i++;
				}
			}
	}

}
