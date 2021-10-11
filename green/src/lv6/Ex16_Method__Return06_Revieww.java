package lv6;

class Student12345 {
	int hakbun;
	int score;

	void print() {
		System.out.println(hakbun + " " + score);
	}
}

class StudentManager {
	// 1) 리턴사용하지않고 학생저장
	Student12345 student;

	void setStudentValue1(int x, int y) {
		student = new Student12345();
		student.hakbun = x;
		student.score = y;
	}

	// 2) 리턴사용해서 학생저장 (별차이없다)
	Student12345 setStudentValue2(int x, int y) {
		Student12345 st = new Student12345();
		st.hakbun = x;
		st.score = y;
		return st;
	}
}

public class Ex16_Method__Return06_Revieww {

	public static void main(String[] args) {
		StudentManager mng = new StudentManager();
		mng.setStudentValue1(10001, 30);
		mng.student.print();
		System.out.println("------------------------");
		Student12345 st = mng.setStudentValue2(10001, 30);

		st.print();

	}

}
