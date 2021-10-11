package lv7;

import java.util.Scanner;

class Subject33 {
	private String name;
	private int score;

	public String getName() {
		return this.name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setScore(int s) {
		this.score = s;
	}

	public int getScore() {
		return this.score;
	}

}

class Student33 {
	private String name;
	Subject33[] subjects;

	public Subject33 getSubjects(int i) {
		return this.subjects[i];
	}
	


	public Subject33[] getSubjects() {
		return this.subjects;
	}

	public void setSubjects(Subject33 arr[]) {
		this.subjects = arr;
	}

//	public void setSubjects(Subject33 arr[],int n) {
//		this.subjects=arr[n];
//	}

	public void setSubjects(int n) {
		this.subjects[n] = new Subject33();
	}
	
//	for (int i = 0; i < size; i++) {
//	list[sel].subjects[i] = temp[i];
//	
//}
	public void setSubjects(int n,Subject33 arr[]) {
		this.subjects[n]=arr[n];
	} 

	public String getName() {
		return this.name;
	}

	public void setName(String n) {
		this.name = n;
	}

}

class Manager33 {
	Scanner sc = new Scanner(System.in);

	private Student33[] st = new Student33[3];

	private Student33[] list = new Student33[3];
	private int cnt = 0;

	public int getCnt() {
		return this.cnt;
	}

	public void setCnt() {
		this.cnt = this.cnt + 1;
	}

	public void printMenu() {
		System.out.println("[1] 학생 추가하기"); // 이름 입력받아 추가
		System.out.println("[2] 과목 추가하기"); // 이름과 과목 입력받아 추가
		System.out.println("[3] 성적 추가하기"); // 이름과 과목 그리고 성적 입력받아 추가
		System.out.println("[4] 종료");
	}

	public void select() {
		while (true) {
			printMenu();
			print();
			System.out.println("메뉴선택");
			int choice = sc.nextInt();
			if (choice == 1) {
				addStudent();
			} else if (choice == 2) {
				addSubject();
			} else if (choice == 3) {
//				addScore();
			} else if (choice == 4) {
				break;
			}
		}
	}

	public void addStudent() {
		if (this.getCnt() == 3) {
			System.out.println("더이상 학생추가불가");
		} else {
			System.out.println("학생이름입력: ");
			String name = sc.next();
			this.list[this.getCnt()] = new Student33();
			this.list[this.getCnt()].setName(name);
			this.setCnt();
		}
	}

	public void addSubject() {
		for (int i = 0; i < this.getCnt(); i++) {
			System.out.println(i + 1 + "번\t" + list[i].getName() + "학생");
		}
		System.out.println("학생번호선택 : ");
		int sel = sc.nextInt() - 1;

		System.out.println("과목선택");
		String sj = sc.next();

		if (list[sel].getSubjects() == null) {
			list[sel].setSubjects(new Subject33[1]);

			list[sel].setSubjects(0);
			list[sel].getSubjects(0).setName(sj);
		} else {
			int size = list[sel].getSubjects().length;
			Subject33[] temp = list[sel].getSubjects();
			list[sel].setSubjects(new Subject33[size + 1]);

			for (int i = 0; i < size; i++) {
//				list[sel].subjects[i] = temp[i];
				list[sel].setSubjects(i, temp);
			}
//			list[sel].subjects[size] = new Subject33();			
			list[sel].setSubjects(size);
//			list[sel].subjects[size].setName(sj);
			list[sel].getSubjects(size).setName(sj);
		}
	}
	
	

	public void addScore() {
		for (int i = 0; i < this.getCnt(); i++) {
			System.out.println(i + 1 + "번\t " + list[i].getName() + "학생");
		}
		System.out.println("학생번호선택");
		int sel = sc.nextInt() - 1;

		if (list[sel].subjects != null) {
			for (int i = 0; i < list[sel].subjects.length; i++) { // list[sel].getSubjects().length
				System.out.printf("%d과목 %s  ", i + 1, list[sel].getSubjects(i).getName());
			}
		} else {
			System.out.println("학생의 과목이없습니다");
		}

		System.out.println("\n과목선택");
		int n = sc.nextInt() - 1;

		System.out.println("성적입력");
		int scores = sc.nextInt();

		list[sel].getSubjects(n).setScore(scores);

	}

	public void print() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(i + 1 + "번\t" + list[i].getName() + "학생");
			if (list[i].subjects != null) {
				for (int j = 0; j < list[i].subjects.length; j++) {
//					System.out.print(j+1+"과목 "+list[i].subjects[j].name+);
					System.out.printf("%d과목 %s %d점 ", j + 1, list[i].subjects[j].getName(),
							list[i].subjects[j].getScore());
				}
				System.out.println();
			}
		}
	}

	public void run() {

		select();

	}

}

public class Ex09_학생과목성적추가_Review {

	public static void main(String[] args) {
		Manager33 manager = new Manager33();
		manager.run();

	}

}
