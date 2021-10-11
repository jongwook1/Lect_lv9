package lv7;

//���� 18:00
//���� 20:00
//�ҿ� 02:00
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

class Subject55 {
	String title;
	 int score;

	String getInfo() {
		return this.title;
	}

	int getScore() {
		return this.score;
	}

	void setInfo(String title) {
		this.title = title;
	}

	void setScore(int score) {
		this.score = score;
	}

	void printInfo() {
		System.out.printf("����� : %s / ���� : %d\n", this.getInfo(), this.getScore());
	}

}

class Student55 {
	int stuCode; // ��������ó������
	 String name;

	int subCnt;
	Subject55 subjects[];

	int getStuCode() {
		return this.stuCode;
	}

	String getName() {
		return this.name;
	}

	int getSubCnt() {
		return this.subCnt;
	}

	void setInfo(String name, int stuCode) {
		this.name = name;
		this.stuCode = stuCode;
	}

	void setSubCnt(int subCnt) {
		this.subCnt = subCnt + 1;
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

class Manager55 {

	FileWriter fw = null; // �ϴ� ����ó������ ����������
	FileReader fr = null;
	BufferedReader br = null;
	String fileName = "cms.txt";
	File file = new File(fileName);

	Random rn = new Random();
	Scanner sc = new Scanner(System.in);

	int cnt;
	Student55 students[];

	void setDefault() {
		this.cnt = 0;
		this.students = null;
	}

	void printMenu() {
		System.out.println("1.���� 2.Ż�� 3.����(�̸���) 4.��� 5.�����߰� 6.�����Է� 7.���� 8.�ε�");
		System.out.println("�޴�: ");
		int sel = sc.nextInt();
		if (sel > 0 && sel <= 8) {
			runtMenu(sel);
		}
	}

	void runtMenu(int select) {
		if (select == 1) {
			joinStudent();
		} else if (select == 2) {
			removeStudent();
		} else if (select == 3) {
			alignStudents();
		} else if (select == 4) {
			printStudents();
		} else if (select == 5) {
			addSubject();
		} else if (select == 6) {
			addScore();
		} else if (select == 7) {
			save();
		} else if (select == 8) {
			load();
		}
	}

	void alignStudents() {
		for (int i = 0; i < this.cnt; i++) {
			String first = this.students[i].getName();
			int idx = i;

			for (int j = i; j < this.cnt; j++) {
				if (first.compareTo(this.students[j].getName()) > 0) {
					first = this.students[j].getName();
					idx = j;
				}
			}
			Student55 temp = this.students[i];
			this.students[i] = this.students[idx];
			this.students[idx] = temp;
		}
	}

	void joinStudent() {
		System.out.print("�л���: ");
		String name = sc.next();

		Student55 temp[] = this.students;
		this.students = new Student55[this.cnt + 1];
		
		if (this.cnt > 0) {
			for (int i = 0; i < this.cnt; i++) {
				this.students[i] = temp[i];
			}
		}
		this.students[this.cnt] = new Student55(); // ��ü���ͻ���
		this.students[this.cnt].setInfo(name, ranCode());
		this.cnt++;
	}

	int studentIndex() {
		int idx = -1;
		System.out.print("�л���: ");
		String name = sc.next();

		for (int i = 0; i < this.cnt; i++) {
			if (name.equals(this.students[i].getName())) {
				System.out.println(this.students[i].getStuCode());
			}
		}
		System.out.println("�й��Է�: ");
		int code = sc.nextInt();

		for (int i = 0; i < this.cnt; i++) {
			if (this.students[i].stuCode == code) {
				idx = i;
			}
		}
		return idx;
	}

	void removeStudent() {
		int delIdx = studentIndex();

		if (delIdx != -1) {
			Student55 temp[] = this.students;
			this.students = new Student55[this.cnt - 1];

			int idx = 0;
			for (int i = 0; i < this.cnt; i++) {
				if (i != delIdx) {
					this.students[idx] = temp[i];
					idx++;
				}
			}
			System.out.println("Ż��Ϸ�");
			this.cnt--;
		}
	}

	void addScore() {
		int stuIdx = studentIndex();
		if (stuIdx != -1) {
			for (int i = 0; i < this.students[stuIdx].getSubCnt(); i++) {
				System.out.println(i + 1 + ") ");
				this.students[stuIdx].subjects[i].printInfo();
			}
//			System.out.println("�����Է��� �����: ");
//			sc.nextLine();
//			String title=sc.nextLine();
			System.out.print("����: ");
			int num = sc.nextInt() - 1;

			System.out.print("����: ");
			int score = sc.nextInt();
//			this.students[stuIdx].subjects[num].score=score;			//  X
			this.students[stuIdx].subjects[num].setScore(score); // O
		}

	}

	void addSubject() {
		int stuIdx = studentIndex();

		if (stuIdx != -1) {
			int cnt = this.students[stuIdx].getSubCnt(); // �������� ���� this.students[stuIdx].subCnt���� cnt����

			sc.nextLine(); // �������� �����ִ� "\n" ���ִ� ��ȸ���� �̰ɾ��ϸ� �Ʒ� �ؽ�Ʈ���ο��� ��������
			System.out.print("�����: ");
			String title = sc.nextLine();
			// next() - " " �������� �����
			// nextLine() - "\n" �������� �����

			int check = 1;
			for (int i = 0; i < cnt; i++) {
				if (title.equals(this.students[stuIdx].subjects[i].title)) {
					check = -1;
				}
			}
			if (check == 1) {
				Subject55 temp[] = this.students[stuIdx].subjects;
				this.students[stuIdx].subjects = new Subject55[cnt + 1];
				if (this.students[stuIdx].getSubCnt() > 0) {
					for (int i = 0; i < cnt; i++) {
						this.students[stuIdx].subjects[i] = temp[i];
					}
				}
				this.students[stuIdx].subjects[cnt] = new Subject55();
				this.students[stuIdx].subjects[cnt].setInfo(title);
				this.students[stuIdx].setSubCnt(cnt); // �̶� ������������ cnt���� ����ȉ�
			}

		}
	}

	int ranCode() { // 1000~9999
		int rCode = rn.nextInt(8999) + 1000;
		while (true) {
			int check = 1;
			for (int i = 0; i < this.cnt; i++) {
				if (this.students[i].stuCode == rCode) {
					check = -1;
				}

			}
			if (check == 1)
				break;
		}
		return rCode;
	}

	void save() {
//		1111/ȫ�浿/2/title1/score1/title2/score2
//		1112/ȫ�浿/2/title1/score1

		String data = "";

		for (int i = 0; i < this.cnt; i++) {
			String info = "";
			info += this.students[i].getStuCode() + "/";
			info += this.students[i].getName() + "/";
			info += this.students[i].getSubCnt() + "/";
			for (int j = 0; j < this.students[i].getSubCnt(); j++) {
				info += this.students[i].subjects[j].getInfo() + "/";
				info += this.students[i].subjects[j].getScore();
				if (j != this.students[i].getSubCnt() - 1)
					info += "/";
			}
			data += info;
			if (i != this.cnt - 1)
				data += "\n";
		}
		try {
			fw = new FileWriter(file);
			fw.write(data);
			fw.close();
			System.out.println("����Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�������");
		}
	}

	void load() {
		setDefault();
		String data = "";
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String info = br.readLine();
			while (info != null) { // ���پ� �ҷ����°� �������� ���ϱ�����
				data += info + "\n";
				this.cnt++;
				info = br.readLine(); // ���پ� �ҷ����Ƿ�
			}

			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// �о�� ������(���ڿ�)�� ->�Ľ��ؼ� ->�迭�� �־��ֱ�

//		1111/ȫ�浿/2/title1/score1/title2/score2
//		1112/ȫ�浿/2/title1/score1

		String temp[] = data.split("\n");
		this.students = new Student55[this.cnt];

		for (int i = 0; i < temp.length; i++) {
			this.students[i] = new Student55();

			String[] info = temp[i].split("/");
			this.students[i].setInfo(info[1], Integer.parseInt(info[0]));
			this.students[i].setSubCnt(Integer.parseInt(info[2]));
			this.students[i].subjects = new Subject55[this.students[i].getSubCnt()];

			int k = 0;
			for (int j = 0; j < this.students[i].getSubCnt(); j++) { // j : 0 1
				this.students[i].subjects[j] = new Subject55();

				this.students[i].subjects[j].setInfo(info[3 + j * k]); // 0 : 3,4 / 1 : 5,6
				this.students[i].subjects[j].setScore(Integer.parseInt(info[3 + j * k + 1]));
				k += 2;
			}
		}

	}

	void printStudents() {
		for (int i = 0; i < this.cnt; i++) {
			this.students[i].printInfo();
		}
	}

	void run() {
		while (true) {
			printStudents();
			printMenu();
		}
	}

}

// "1.���� 2.Ż�� 3.����(�̸���) 4.��� 5.�����߰� 6.�����Է� 7.���� 8.�ε�"
public class Lv7_test7_��������_�л���Ʈ�ѷ�2 {

	public static void main(String[] args) {
		Manager55 cms = new Manager55();
		cms.run();

	}

}
