package lv7;

// # �л� �߰� ���� ��Ʈ�ѷ�
//   => ��Ʈ�ѷ��� �ϼ��� �Ʒ� 3���� ������ �߰��Ͻÿ�.
//   ��ö�� : ����3�� ���� 50 ����50 ���� 60 
//   �̸��� : ����2�� ���� 20 ���� 30 
//   �̿��� : ����1�� ���� 100
import java.util.Scanner;

class Subject99 {
	String name;
	int score;
}

class Student99 {
	Subject99[] subjects;			//�迭 �����ص�
	String name;
}

class Manager99 {
	Scanner sc = new Scanner(System.in);
	int cnt = 0; // �л� ��
	Student99[] st = new Student99[3];
	Student99[] list = new Student99[3];
	
	
//	void set() {
//		
//		//  ��ö�� : ����3�� ���� 50 ����50 ���� 60
//			st[0]=new Student99();
//			st[0].subjects=new Subject99[3];  
//			for(int i=0;i<3;i++) {
//				st[0].subjects[i]=new Subject99();
//			}
//		//   �̸��� : ����2�� ���� 20 ���� 30 
//			st[1]=new Student99();
//			st[1].subjects=new Subject99[2]; 
//			st[1].subjects[0]=new Subject99();
//			st[1].subjects[1]=new Subject99();
//		//   �̿��� : ����1�� ���� 100
//			st[2]=new Student99();
//			st[2].subjects=new Subject99[1]; 
//			st[2].subjects[0]=new Subject99();
//	}
	
	void play() {

		while (true) {

			System.out.println("[1] �л� �߰��ϱ�"); // �̸� �Է¹޾� �߰�
			System.out.println("[2] ���� �߰��ϱ�"); // �̸��� ���� �Է¹޾� �߰�
			System.out.println("[3] ���� �߰��ϱ�"); // �̸��� ���� �׸��� ���� �Է¹޾� �߰�
			System.out.println("[4] ����");
			System.out.println("�޴�����");
			int choice = sc.nextInt();

			if (choice == 1) {
				if (cnt == 3) {
					System.out.println("���̻� �л��߰��Ұ�");
				} else {
					System.out.print("�л��̸��Է� : ");
					String name = sc.next();
					list[cnt] = new Student99();
					list[cnt].name = name;
					cnt++;
				}
			} else if (choice == 2) {
				for (int i = 0; i < cnt; i++) {
					System.out.println(i + 1 + "��\t" + list[i].name + "�л�");
				}
				System.out.println("�л���ȣ���� : ");
				int sel = sc.nextInt() - 1;

				System.out.println("������");
				String subject = sc.next();

				if (list[sel].subjects == null) {
					list[sel].subjects = new Subject99[1];

					list[sel].subjects[0] = new Subject99();
					list[sel].subjects[0].name = subject;
				} else {
					int size = list[sel].subjects.length;
					Subject99[] temp = list[sel].subjects;
					list[sel].subjects = new Subject99[size + 1];

					for (int i = 0; i < size; i++) {
						list[sel].subjects[i] = temp[i];
					}
					list[sel].subjects[size] = new Subject99();
					list[sel].subjects[size].name = subject;
				}

			} else if (choice == 3) {
				for (int i = 0; i < cnt; i++) {
					System.out.println(i + 1 + "��\t" + list[i].name + "�л�");
				}
				System.out.println("�л���ȣ���� : ");
				int sel = sc.nextInt() - 1;

				if (list[sel].subjects != null) {
					for (int i = 0; i < list[sel].subjects.length; i++) {
						System.out.printf("%d���� %s ", i + 1, list[sel].subjects[i].name);
					}
				} else {
					System.out.println("�л��� ������ �����ϴ�");
				}
				System.out.println("���� ���� : ");
				int num = sc.nextInt() - 1;

				System.out.print("���� �Է� : ");
				int score = sc.nextInt();

				list[sel].subjects[num].score = score;
			} else if (choice == 4) {
				break;
			}

		}

	}

	void print() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(i + 1 + "��\t" + list[i].name + "�л�");
			if (list[i].subjects != null) {
				for (int j = 0; j < list[i].subjects.length; j++) {
//					System.out.print(j+1+"���� "+list[i].subjects[j].name+);
					System.out.printf("%d���� %s %d�� ", j + 1, list[i].subjects[j].name, list[i].subjects[j].score);
				}
				System.out.println();
			}
		}
	}

	void run() {
		play();
		print();
	};

}

public class Ex09_�л��������߰� {

	public static void main(String[] args) {
		Manager99 manager = new Manager99();
		manager.run();

	}

}
