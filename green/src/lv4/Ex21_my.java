package lv4;

import java.util.Scanner;

public class Ex21_my {

	public static void main(String[] args) {
		/*
		 * # ���θ� [������]
		 * 1. ī�װ��� �������� �Է¹޾� �Ʒ��� ���ÿ� ���� �����Ѵ�.
		 * 2. ī�װ��� �� ���� ù��° ���� �����Ѵ�.
		 * 3. �������� �� ���� �ι�° ���� �����Ѵ�.
		 *    ��, �������� �������� �߰��� �� �ֵ��� ������(/)�� �����ڷ� �������ش�.
		 * ��)
		 * {
		 * 		{"����", "���/����/"},
		 * 		{"����", "Ȩ����/�ɸ���/"},
		 * 		{"����", "�ݶ�/"},
		 * 		{"����", "�Ұ��/"}
		 * 		...
		 * } 
		 */
		Scanner sc = new Scanner(System.in);
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		int itemCount = 0;
		while(true) {
			System.out.println("[������ ���]");
			System.out.println("[1]ī�װ� ����");
			System.out.println("[2]�� �� ��  ����");
			System.out.println("[3]��üǰ�� ���");
			System.out.print(": ");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.println("ī�װ����� �Է��ϼ���");
				String cate=sc.next();
				
				int check=-1;
				for(int i=0;i<itemCount;i++) {
					if(items[i][0].equals(cate)){
						check=1;
					}
				}
				
				if(check==-1) {
			//	for(int i=0;i<items.length;i++) {	for�� �ʿ����
				items[itemCount][0]=cate;		//�̺κ� itemCount�� �ϴ°ų�ħ
				itemCount++;
			//	}
				}else {
					System.out.println("�̹� �����ϴ� ī�װ��Դϴ�");
				}
				
				
			}
			else if(sel == 2) {
				for(int i=0;i<itemCount;i++) {
					System.out.printf("%d) %s\n",i+1, items[i][0]);
				}
				
				System.out.println("ī�װ� ��ȣ�� �����ϼ���");
				int choice=sc.nextInt();
				System.out.println("�����۸��� �Է��ϼ���");
				String item=sc.next();
				//for(int i=0;i<itemCount;i++) {		//for�� �ʿ����
					items[choice][1]+=item;
					items[choice][1]+="/";
			//	}
				
			}
			else if(sel == 3) {
				for(int i=0;i<itemCount;i++) {
					System.out.printf("%s: %s\n",items[i][0], items[i][1]);
				}
			}
		}



	}

}
