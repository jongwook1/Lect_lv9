package lv8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
//����: 18:00
//����: 18:40
//�ҿ�: 00:40

class Subject9 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Student9 {
	private String name;
	ArrayList<Subject9> subject9 = new ArrayList<Subject9>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Subject9> getSubject9() {
		return subject9;
	}

	public void setSubject9(ArrayList<Subject9> subject9) {
		this.subject9 = subject9;
	}

}

class Manager9 {
	Scanner sc = new Scanner(System.in);

//	ArrayList<Student9> st = new ArrayList<Student9>();
	ArrayList<Student9> list = new ArrayList<Student9>();

//	public ArrayList<Student9> getList() {
//		return list;
//	}
//
//	public void setList(ArrayList<Student9> list) {
//		this.list = list;
//	}

	private int cnt = 0;

	public void printMenu() {
		System.out.println("[1] �л� �߰��ϱ�"); // �̸� �Է¹޾� �߰�
		System.out.println("[2] ���� �߰��ϱ�"); // �̸��� ���� �Է¹޾� �߰�
		System.out.println("[0] ����");
	}

	public void select() {
		while (true) {
			printMenu();
			print();
			System.out.println("�޴�����");
			int choice = sc.nextInt();
			if (choice == 1) {
				addStudent();
			} else if (choice == 2) {
				addSubject();
			} else if (choice == 0) {
				break;
			}
		}
	}

	private void addSubject() {
		for (int i = 0; i < this.cnt; i++) {
			System.out.println(i + 1 + "��\t" + list.get(i).getName() + "�л�");
		}
		System.out.println("�л���ȣ ����: ");
		int sel = sc.nextInt() - 1;

		System.out.println("������");
		String suject = sc.next();

		Subject9 sj = new Subject9();
		sj.setName(suject);
		list.get(sel).getSubject9().add(sj);

	}

	private void addStudent() {
		
			System.out.println("�л��̸��Է�");
			String n = sc.next();
			Student9 std = new Student9();
			std.setName(n);
			list.add(std);
			cnt++;		

	}

	public void print() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(i + 1 + "��\t" + list.get(i).getName() + "�л�");
			if (list.get(i).subject9 != null) {
				for (int j = 0; j < list.get(i).getSubject9().size(); j++) {
					System.out.printf("%d���� %s", j + 1, list.get(i).getSubject9().get(j).getName());
					System.out.println();
				}
			}
		}
	}

	public void run() {
		select();
	}

}

public class lv8_test05 {

	public static void main(String[] args) {
		Manager9 manager = new Manager9();
		manager.run();

	}

}
