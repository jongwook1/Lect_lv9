package lv5;

public class Test_lv5_4 {

	public static void main(String[] args) {
		
		String [][] student = {
				{"aaa","신촌","1001"}, 
				{"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} ,
				{"ddd" , "강동","1004"}};
		String[][] score = {
				{"번호" ,"과목" , "점수"},
				{"1001" ,"국어","20"},
				{"1002" ,"국어","50"},
				{"1003" ,"국어","60"},
				{"1004" ,"국어","17"},
				{"1001" ,"수학","65"},
				{"1002" ,"수학","15"},
				{"1003" ,"수학","80"},
				{"1004" ,"수학","70"},
				{"1001" ,"영어","43"},
				{"1002" ,"영어","90"},
				{"1003" ,"영어","30"},
				{"1004" ,"영어","70"}
		};
		
		// 학생 정보와 성적이 담긴 데이터 이다
		// student ==> 1.id 2.주소 3.번호
		// score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다
		// 문제1) 전체 성적이 1등인 학생 이름 출력

		int tot[][] = new int[student.length][2];
//		System.out.println(score.length);
		for (int i = 0; i < tot.length; i++) {
			tot[i][0] = Integer.parseInt(student[i][2]);
//					System.out.println(tot[i][0]);
		}
		int maxNum = 0;
		int maxIdx = 0;

		for (int i = 1; i < score.length; i++) {
			int idx = -1;
			for (int j = 0; j < tot.length; j++) {
				if (Integer.parseInt(score[i][0]) == tot[j][0]) {
					idx = j;
				}
			}
			tot[idx][1] += Integer.parseInt(score[i][2]);

		}

		for (int i = 0; i < tot.length; i++) {
//			System.out.println(tot[i][1]);

		}

		for (int i = 0; i < tot.length; i++) {
			if (maxNum < tot[i][1]) {
				maxIdx = tot[i][0];
				maxNum = tot[i][1];
			}
		}
		System.out.println("1등학생의 번호: " + maxIdx + "  1등학생의 점수: " + maxNum);

		String name = "";

		for (int i = 0; i < student.length; i++) {
			if (Integer.parseInt(student[i][2]) == maxIdx) {
				name = student[i][0];
			}
		}
		System.out.println("전체성적이 1등인 학생이름: " + name);

	}

}
