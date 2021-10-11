package lv7;

import java.util.Scanner;

class Student222{
	
}

class Manager222{
	static Scanner sc = new Scanner(System.in);
	Student222[] st = new Student222[3];
	
	Student222[] list = new Student222[3];
	private int count = 0; // 학생 수

	
	public void run() {
		
	while (true) {
		System.out.println("[1]학생 추가하기"); // 이름 입력받아 추가
		System.out.println("[2]과목 추가하기"); // 이름과 과목 입력받아 추가
		System.out.println("[3]성적 추가하기"); // 이름과 과목 그리고 성적 입력받아 추가

		int choice = sc.nextInt();

		if (choice == 1) {
		} else if (choice == 2) {
		} else if (choice == 3) {
		}
	}
	}
	
}


// # 학생 추가 삭제 컨트롤러
//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
//   김철수 : 과목3개 수학 50 국어50 영어 60 
//   이만수 : 과목2개 수학 20 국어 30 
//   이영희 : 과목1개 수학 100
public class Ex10_기초_학생관리_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
