package lv7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Student88 {
	String id = "";
	String pw = "";
	Subject88 subjects[];

}

class Subject88 {
	String title;
	int score;
}

class Manager88 {
	Scanner sc = new Scanner(System.in);
	// "1.가입 2.탈퇴 3.정렬(이름순) 4.출력 5.저장 6.로드" //(번외로 5.과목추가 6.성적입력)
	int cnt = 0;
	String fileName = "ZZZZZ.txt";

	Student88 student[] = new Student88[cnt];

	boolean sel() {
		System.out.println("1.가입 2.탈퇴 3.정렬(이름순) 4.출력 5.과목추가 6. 성적입력 7.저장 8.로드 9.종료");
		int sel = sc.nextInt();
		if (sel == 1) {
			addStudent();
		} else if (sel == 2) {
			delStudent();
		} else if (sel == 3) {
			sort();
		} else if (sel == 4) {
			print();
		} else if (sel == 5) {
			addSubject();
		} else if (sel == 6) {
			addScore();
		} else if (sel == 7) {
			save();
		} else if (sel == 8) {
			load();
		} else if (sel == 9) {
			return false;
		}
		return true;
	}

	void addStudent() {
		System.out.println("아이디입력하세요");
		String inId = sc.next();
		System.out.println("비번입력하세요");
		String inPw = sc.next();
		if (cnt == 0) {
			student = new Student88[1];
			student[0] = new Student88();
		} else {

			Student88 temp[] = student;
			student = new Student88[cnt + 1];

			for (int i = 0; i < temp.length; i++) {
				student[i] = temp[i];
			}
			student[temp.length] = new Student88();
		}
		student[cnt].id = inId;
		student[cnt].pw = inPw;
		cnt++;
	}

	void delStudent() {
		if (cnt == 0) {
			System.out.println("삭제할 아이디없습니다");
		} else {
			if (cnt == 1) {
				student = null;
			} else {
				System.out.println("삭제할 아이디입력하세요");
				String inId = sc.next();
				System.out.println("삭제할 비번입력하세요");
				String inPw = sc.next();
				int delIdx = -1;
				for (int i = 0; i < cnt; i++) {
					if (student[i].id.equals(inId) && student[i].pw.equals(inPw)) {
						delIdx = i;
					}
				}
				Student88 temp[] = student;
				student = new Student88[cnt - 1];

				int idx = 0;
				for (int i = 0; i < temp.length; i++) {
					if (delIdx != i) {
						student[idx] = temp[i];
						idx++;
					}
				}
			}
			cnt--;
		}
	}

	void sort() {
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if (student[i].id.compareTo(student[j].id) < 0) {
					Student88 temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
			}
		}
	}

	void addSubject() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(i + 1 + "번 " + student[i].id + "학생");
		}
		System.out.println("학생번호 선택: ");
		int sel = sc.nextInt() - 1;
		System.out.println("과목선택:");
		String subject = sc.next();

		if (student[sel].subjects == null) {
			student[sel].subjects = new Subject88[1];

			student[sel].subjects[0] = new Subject88();
			student[sel].subjects[0].title = subject;
		} else {
			int size = student[sel].subjects.length;
			Subject88 temp[] = student[sel].subjects;
			student[sel].subjects = new Subject88[size + 1];

			for (int i = 0; i < size; i++) {
				student[sel].subjects[i] = temp[i];
			}
			student[sel].subjects[size] = new Subject88();
			student[sel].subjects[size].title = subject;
		}
		System.out.println("과목추가완료");
	}

	void addScore() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(i + 1 + "번 " + student[i].id + "학생");
		}
		System.out.println("학생번호 선택: ");
		int sel = sc.nextInt() - 1;

		if (student[sel].subjects != null) {
			for (int i = 0; i < student[sel].subjects.length; i++) {
				System.out.printf("%d과목 %s ", i + 1, student[sel].subjects[i].title);
			}
		} else {
			System.out.println("학생의 과목이 없습니다");
		}
		System.out.println("과목선택");
		int num = sc.nextInt() - 1;

		System.out.println("성적입력");
		int score = sc.nextInt();
		student[sel].subjects[num].score = score;
	}

	void save() {
		FileWriter fw = null;
		String data = "";
		for (int i = 0; i < cnt; i++) {
			data += student[i].id;
			data += "/";
			data += student[i].pw;
//			for(int j=0;j<student[i].subjects.length;j++) {
//				data+=student[i].subjects[j].title;
//				data+="/";
//				data+=student[i].subjects[j].score;
//			}
			data += "\n";
		}
		data = data.substring(0, data.length() - 1);
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
			System.out.println("저장완료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("저장실패");
		}
	}

	void load() {
//		String data="";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				cnt++;
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

//			data=data.substring(0,data.length()-1);
		String temp[] = new String[cnt];

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			for (int i = 0; i < cnt; i++) {
				temp[i] = br.readLine();
			}

			if (cnt != 0) {
				student = new Student88[temp.length];

				for (int i = 0; i < temp.length; i++) {
					student[i] = new Student88();
				}
//					student[cnt]=new Student88();
//					student[temp.length]=new Student88();
				for (int i = 0; i < cnt; i++) {
					String info[] = temp[i].split("/");
					student[i].id = info[0];
					student[i].pw = info[1];
				}
				System.out.println("불러오기완료");
				fr.close();
				br.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void print() {
		if (cnt > 0) {
			for (int i = 0; i < cnt; i++) {
				System.out.printf("이름: %s  비번: %s\n", student[i].id, student[i].pw);
				if (student[i].subjects != null) {
					for (int j = 0; j < student[i].subjects.length; j++) {
						System.out.printf("%s과목 %s점  ", student[i].subjects[j].title, student[i].subjects[j].score);
					}
					System.out.println();
				}
			}
		}
	}

	void run() {
		while (true) {
			if (sel()) {

			} else {
				print();
				break;
			}
		}
	}

}

public class Ex10_학생관리 {

	public static void main(String[] args) {
		Manager88 manager = new Manager88();
		manager.run();

	}

}
