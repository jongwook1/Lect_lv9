package lv5;

public class bb {

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
		
//		int[] arr = new int[score.length];
		int[][] tot = new int[student.length][2]; // {"학번", "누적점수"}
//		String[][] name = new String[student.length][1];
		
//		for(int i = 0; i < name.length; i++) {
//			name[i][0] = student[i][0];
//			System.out.println(name[i][0]);
//		}
		
		for(int i = 0; i < tot.length; i++) {
			tot[i][0] = Integer.parseInt(student[i][2]);
			System.out.println(tot[i][0]);
		}
//			for(int j = 1; j < score.length; j++) {
//				if(score[i][0].equals(tot[i][0])) {
//					arr[i] += Integer.parseInt(score[i][2]);
//				}
//			}
		
		int maxNum = 0;
		int maxIdx = 0;
		// 1. score 배열을 전체 검사하면서
		for(int i=1; i<score.length; i++) {
			//idx => 비교를 위해 idx를 뭐랑 비교를 할건가?? (학번)?
			int idx = -1;
			
			// score[i][0] 과 tot[j][0] 비교
			for(int j=0; j<tot.length; j++) {
				if(Integer.parseInt(score[i][0])==tot[j][0]) {
					idx = j;
				}
			}
			
			tot[idx][1] += Integer.parseInt(score[i][2]);
//			System.out.println(tot[idx][1]);
			
			if(maxNum < tot[idx][1]) {
				maxNum = tot[idx][1];
				maxIdx = tot[idx][0];
			}
			
		}
		System.out.println("최대값 학번 : " + maxIdx);
		System.out.println("최대값 : " + maxNum);
		
		// 2. 학번 기준으로 성적의 총 합을 구함 -> arr 배열에 
		// 3. arr 배열에서 최고값을 찾고 
		// 4. 최고 값의 학번을 기준으로 -> student 배열의 이름 검색
		String name = "";
		for(int i = 0; i < student.length; i++) {
			if(Integer.parseInt(student[i][2]) == maxIdx) {
				name = student[i][0];
			}
		}
		System.out.println("name = " + name);



	}

}
