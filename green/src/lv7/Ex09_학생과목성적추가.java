package lv7;

// # 학생 추가 삭제 컨트롤러
//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
//   김철수 : 과목3개 수학 50 국어50 영어 60 
//   이만수 : 과목2개 수학 20 국어 30 
//   이영희 : 과목1개 수학 100
import java.util.Scanner;

class Subject99 {
	String name;
	int score;
}

class Student99 {
	Subject99[] subjects;			//배열 선언만해둠
	String name;
}

class Manager99 {
	Scanner sc = new Scanner(System.in);
	int cnt = 0; // 학생 수
	Student99[] st = new Student99[3];
	Student99[] list = new Student99[3];
	
	
//	void set() {
//		
//		//  김철수 : 과목3개 수학 50 국어50 영어 60
//			st[0]=new Student99();
//			st[0].subjects=new Subject99[3];  
//			for(int i=0;i<3;i++) {
//				st[0].subjects[i]=new Subject99();
//			}
//		//   이만수 : 과목2개 수학 20 국어 30 
//			st[1]=new Student99();
//			st[1].subjects=new Subject99[2]; 
//			st[1].subjects[0]=new Subject99();
//			st[1].subjects[1]=new Subject99();
//		//   이영희 : 과목1개 수학 100
//			st[2]=new Student99();
//			st[2].subjects=new Subject99[1]; 
//			st[2].subjects[0]=new Subject99();
//	}
	
	void play() {

		while (true) {

			System.out.println("[1] 학생 추가하기"); // 이름 입력받아 추가
			System.out.println("[2] 과목 추가하기"); // 이름과 과목 입력받아 추가
			System.out.println("[3] 성적 추가하기"); // 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4] 종료");
			System.out.println("메뉴선택");
			int choice = sc.nextInt();

			if (choice == 1) {
				if (cnt == 3) {
					System.out.println("더이상 학생추가불가");
				} else {
					System.out.print("학생이름입력 : ");
					String name = sc.next();
					list[cnt] = new Student99();
					list[cnt].name = name;
					cnt++;
				}
			} else if (choice == 2) {
				for (int i = 0; i < cnt; i++) {
					System.out.println(i + 1 + "번\t" + list[i].name + "학생");
				}
				System.out.println("학생번호선택 : ");
				int sel = sc.nextInt() - 1;

				System.out.println("과목선택");
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
					System.out.println(i + 1 + "번\t" + list[i].name + "학생");
				}
				System.out.println("학생번호선택 : ");
				int sel = sc.nextInt() - 1;

				if (list[sel].subjects != null) {
					for (int i = 0; i < list[sel].subjects.length; i++) {
						System.out.printf("%d과목 %s ", i + 1, list[sel].subjects[i].name);
					}
				} else {
					System.out.println("학생의 과목이 없습니다");
				}
				System.out.println("과목 선택 : ");
				int num = sc.nextInt() - 1;

				System.out.print("성적 입력 : ");
				int score = sc.nextInt();

				list[sel].subjects[num].score = score;
			} else if (choice == 4) {
				break;
			}

		}

	}

	void print() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(i + 1 + "번\t" + list[i].name + "학생");
			if (list[i].subjects != null) {
				for (int j = 0; j < list[i].subjects.length; j++) {
//					System.out.print(j+1+"과목 "+list[i].subjects[j].name+);
					System.out.printf("%d과목 %s %d점 ", j + 1, list[i].subjects[j].name, list[i].subjects[j].score);
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

public class Ex09_학생과목성적추가 {

	public static void main(String[] args) {
		Manager99 manager = new Manager99();
		manager.run();

	}

}
