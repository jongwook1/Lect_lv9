package lv4;

import java.util.Scanner;

public class Ex21_t_shoping {

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

		Scanner sc= new Scanner(System.in);
		String[][] items = new String[100][2];			//{{"ī�װ���1",null},{"ī�װ���2",null},{null,null},{null,null}..}
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";					//null�� Ǯ���ذ�
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
				System.out.println("�߰��� ī�װ��� �Է�: ");
				String name=sc.next();
				
				int check=1;
				for(int i=0; i<itemCount;i++) {
					if(name.equals(items[i][0])) {	//�ߺ�Ȯ�� (���ڿ� �񱳴� ==�񱳿����� ���X -> equals() �޼ҵ� ���O)
						check=-1;
					}
				}
				if(check==1) {
					//���
					items[itemCount][0]=name;				//�ܺ��ε��� itemCount�� ���ִ°� �ٽ�
					itemCount++;
				}else {
					//����
					System.out.println("�̹� �����ϴ� ī�װ��Դϴ�.");
				}								
				
			}
			else if(sel == 2) {
				for(int i=0; i<itemCount;i++) {
					System.out.printf("%d) %s\n", i+1, items[i][0]);
				}
				System.out.print("ī�װ� ����: ");
				int choice =sc.nextInt()-1;
				
				if (itemCount > 0 && choice < itemCount) {
					System.out.print("������ �Է�: ");
					String item = sc.next();

//					if (items[choice][1] != null) {			//���� 27�������� nullǪ�� ���
					items[choice][1] += item;
//					} else {
						items[choice][1] += "/";
//					}
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
