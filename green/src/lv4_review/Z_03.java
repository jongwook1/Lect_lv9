package lv4_review;

import java.util.Scanner;

public class Z_03 {

	public static void main(String[] args) {
		//���� 13:35
		//���� 13:45
		//�ҿ� 00:10
		
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
				
				int check=1;
				for(int i=0;i<itemCount;i++) {					
						if(items[i][0]==cate) {				
						check=-1;
					}
				}
				if(check==1) {
				items[itemCount][0]=cate;
				itemCount++;
				}else {
					
				}
			}
			else if(sel == 2) {
				for(int i=0;i<itemCount;i++) {
					System.out.printf("%d)  %s\n",i+1,items[i][0]);
				}
				System.out.println("������ ī�װ�����");
				sel=sc.nextInt()-1;
				
				if(itemCount>0&&sel<itemCount) {
					System.out.println("�����۸��Է�");
					String item=sc.next();
					items[sel][1]+=item;
					items[sel][1]+="/ ";
					
				}
			}
			else if(sel == 3) {
				for(int i=0;i<itemCount; i++) {
					System.out.printf("%s: %s\n", items[i][0], items[i][1]);
				}
			}
		}
	}

}
