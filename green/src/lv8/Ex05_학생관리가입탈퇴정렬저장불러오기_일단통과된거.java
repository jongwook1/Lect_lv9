package lv8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

;

class Student95 {
	String id = "";
	String pw = "";

	Student95(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	void printData() {
		System.out.println("이름: " + this.id + "비번: " + this.pw);
	}
}

class Manager95 {
	Scanner sc = new Scanner(System.in);
	ArrayList<Student95> group = new ArrayList<Student95>();
	
	FileWriter fw = null;
	FileReader fr = null;
	BufferedReader br = null;
	String fileName = "newCms.txt";
	File file = new File(fileName);

	int cnt = 0;

	void setDefalut() {
		this.cnt = 0;
		this.group = null;
	}

	void joinStrudent() {
		System.out.println("가입할 아디입력하세요");
		String id = sc.next();
		System.out.println("가입할 비번입력하세요");
		String pw = sc.next();
		Student95 newSd = new Student95(id, pw);
		group.add(newSd);
		cnt++;
	}

	void removeStudent() {
		System.out.println("탈퇴할 아이디와 비번의 위치(0번부터시작)를 입력하세요");
		int dIdx = sc.nextInt();
		group.remove(dIdx);
		cnt--;
	}

	void alignStudents() {
		for (int i = 0; i < this.cnt; i++) {
			String first = this.group.get(i).id;
			int idx = i;
			for (int j = i; j < this.cnt; j++) {
				if (first.compareTo(this.group.get(j).id) > 0) {
					first = this.group.get(j).id;
					idx = j;
				}
			}
			Student95 temp = this.group.get(i);
			this.group.set(i, this.group.get(idx));
			this.group.set(idx, temp);
		}
	}

	void print() {
		for (int i = 0; i < cnt; i++) {
//			System.out.printf("아이디: %d  비번: %d\n",group.get(i).id,group.get(i).pw);
			System.out.println("아디: " + group.get(i).id + " 비번: " + group.get(i).pw);
		}
	}

	void save() {
		String data = "";

		for (int i = 0; i < this.cnt; i++) {
			String info = "";
			info += this.group.get(i).id + "/";
			info += this.group.get(i).pw;
			data += info;
			if (i != this.cnt - 1)
				data += "\n";
		}
		try {
			fw = new FileWriter(file);
			fw.write(data);
			fw.close();
			System.out.println("저장완료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("저장실패");
		}
	}
	
	void load() {
		setDefalut();
		String data = "";
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String info = br.readLine();
			while (info != null) {
				data += info + "\n";
				this.cnt++;
				info = br.readLine();
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String temp[] = data.split("\n");
		this.group = new ArrayList<Student95>();

		for (int i = 0; i < temp.length; i++) {
			String info[] = temp[i].split("/");

			Student95 loadSd = new Student95(info[0], info[1]);
			this.group.add(loadSd);
		}
	}

}

public class Ex05_학생관리가입탈퇴정렬저장불러오기_일단통과된거 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Student95 sd=new Student95(String id,String pw);

		Manager95 manager = new Manager95();

		boolean run = true;
		while (run) {
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 0.종료");
			int sel = sc.nextInt();
			if (sel == 1) {
				manager.joinStrudent();

			} else if (sel == 2) {
				manager.removeStudent();

			} else if (sel == 3) {
				manager.alignStudents();
			} else if (sel == 4) {
				manager.print();
			} else if (sel == 5) {
				manager.save();
			} else if (sel == 6) {
				manager.load();
			} else if(sel==0) {
				break;
			}
		}

	}

}
