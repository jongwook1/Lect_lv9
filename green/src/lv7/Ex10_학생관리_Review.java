package lv7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

class Subject22 {
	private String title;
	private int score;

	public String getTitle() {
		return this.title;
	}

	public int getScore() {
		return this.score;
	}

	public void printInfo() {
		System.out.printf("과목명 : %s / 성적 : %d\n", this.getTitle(), this.getScore());
	}

}

class Student22 {
	private int stuCode;
	private String name;

	private int subCnt;
	private Subject22 subjects[];

	public int getStuCode() {
		return this.stuCode;
	}

//	public void setStuCode(int n) {
//		this.stuCode=n;
//	}

	public String getName() {
		return this.name;
	}

	public int getSubCnt() {
		return this.subCnt;
	}

	public Subject22[] getSubjects() {
		return this.subjects;
	}

//	public void addSubjects(Subject22) {		
//		this.subjects=;
//	}

	public void addSubjects(Subject22 sb) {

		Subject22 temp[] = this.subjects;
		this.subjects = new Subject22[this.subCnt + 1];

//		if(this.getSubCnt()>0) {
//			for(int i=0;i<this.subCnt;i++) {
//				this.subjects[i]=temp[i];
//			}
//			
//		}

	}

	public Subject22 getSubjects(int n) {
		return this.subjects[n];
	}

	void setInfo(String name, int stuCode) {
		this.name = name;
		this.stuCode = stuCode;
	}

	void printInfo() {
		System.out.println(this.getStuCode() + " " + this.getName());
		if (this.subjects != null) {
			for (int i = 0; i < this.subjects.length; i++) {
				this.subjects[i].printInfo();
			}
		}
	}

}

class Manager22 {
	static Scanner sc = new Scanner(System.in);
	static Random rn = new Random();
	// "1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드"
	private int cnt;

	private Student22[] students;

	public int getCnt() {
		return this.cnt;
	}

//	public void setCnt

	public Student22[] getStudents() {
		return this.students;
	}

	public Student22 getStudents(int n) {
		return this.students[n];
	}

	public void setStudents(Student22 arr[]) {
		this.students = arr;
	}

	public void setStudents(int n, Student22 arr[]) {
		this.students[n] = arr[n];
	}

//	public void addStu(int n,Student22 st) {
//		this.students[n]=st[n];
//	}

	public void addStudents(int n) { //
		this.students[n] = new Student22();
	}

	// Student22 temp=new Student22();
	// addStu(temp);
	public void addStu(Student22 st) { ////////
		System.out.println("학생명: ");
		String name = sc.next();
		st.setInfo(name, getCnt());
		this.cnt++;
//		Student22 temp[]=this.students;
//		this.students=new Student22[this.cnt+1]; 
//	   
//	    
//	    if (this.getCnt() > 0) {
//			for (int i = 0; i < this.getCnt(); i++) {
////				this.setStudents(i, temp);
//				this.students[i]=temp[i];
//			}
//		}
	}

	public void printMenu() {
		System.out.println("1.가입 2.탈퇴 3.정렬(이름순) 4.출력 5.과목추가 6.성적입력 7.저장 8.로드");
		System.out.println("메뉴: ");
		int sel = sc.nextInt();
		if (sel > 0 && sel <= 8) {
			runtMenu(sel);
		}
	}

	void runtMenu(int select) {
		if (select == 1) {
			join();
		} else if (select == 2) {
			removeStudent();
		} else if (select == 3) {
			alignStudents();
		} else if (select == 4) {
			printStudents();
		} else if (select == 5) {
			addSubject();
		} else if (select == 6) {
//			addScore();
		} else if (select == 7) {
//			save();
		} else if (select == 8) {
//			load();
		}
	}

	public void join() {
//		System.out.println("학생명: ");
//		String name = sc.next();

		Student22 temp = new Student22();

		addStu(temp);

//		this.addStudents(getCnt()); // 
//		this.students[this.getCnt()].setInfo(name, ranCode());
//		this.cnt++;
	}

	public int studentIndex() {
		int idx = -1;
		System.out.println("학생명:");
		String name = sc.next();

		for (int i = 0; i < this.cnt; i++) {
			if (name.equals(this.students[i].getName())) {
				System.out.println(this.students[i].getStuCode());
			}
		}
		System.out.println("학번입력: ");
		int code = sc.nextInt();

		for (int i = 0; i < this.cnt; i++) {
			if (this.students[i].getStuCode() == code) {
				idx = i;
			}
		}
		return idx;

	}

	public void removeStudent() {
		int delIdx = studentIndex();

		if (delIdx != -1) {
			Student22 temp[] = this.students;
			this.students = new Student22[this.getCnt() - 1];

			int idx = 0;
			for (int i = 0; i < this.getCnt(); i++) {
				if (i != delIdx) {
					this.students[idx] = temp[i];
					idx++;
				}
			}
			System.out.println("탈퇴완료");
			this.cnt--;
		}

	}

	public void alignStudents() {
		for (int i = 0; i < this.cnt; i++) {
			String first = this.students[i].getName();
			int idx = i;

			for (int j = i; j < this.getCnt(); j++) {
				if (first.compareTo(this.students[j].getName()) > 0) {
					first = this.students[j].getName();
					idx = j;
				}
			}
			Student22 temp = this.students[i];
			this.students[i] = this.students[idx];
			this.students[idx] = temp;

		}

	}

	public void addSubject() {
		int stuIdx = studentIndex();

		if (stuIdx != -1) {
			int cnt = this.students[stuIdx].getSubCnt();
			sc.nextLine();
			System.out.print("과목명");
			String title = sc.nextLine();

			int check = 1;
			for (int i = 0; i < this.getCnt(); i++) {
				if (title.equals(this.students[stuIdx].getSubjects(i).getTitle())) {
					check = -1;
				}
//				
			}
			if (check == 1) {
				Subject22 temp = new Subject22();

//				
			}

		}
	}

	public void addScore() {

	}

	public int ranCode() {
		int rCode = rn.nextInt(8999) + 1000;
		while (true) {
			int check = 1;
			for (int i = 0; i < this.getCnt(); i++) {
				if (this.getStudents(i).getStuCode() == rCode) {
					check = -1;
				}
			}
			if (check == 1)
				break;
		}
		return rCode;
	}

	void printStudents() {
		for (int i = 0; i < this.getCnt(); i++) {
			this.students[i].printInfo();
		}
	}

	public void run() {
		while (true) {
			printStudents();
			printMenu();
		}

	}

}

public class Ex10_학생관리_Review {

	public static void main(String[] args) {
		Manager22 mg = new Manager22();
		mg.run();

	}

}
