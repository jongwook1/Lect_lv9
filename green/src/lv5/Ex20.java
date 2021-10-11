package lv5;

public class Ex20 {

	public static void main(String[] args) {
		//문자열심화1문제
		String [][] student = {
			//	 id     주소   번호
				{"aaa","신촌","1001"}, 
				{"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , 
				{"ddd" , "강동","1004"}};
		String[][] score = {
			//    번호     국어    수      영
				{"1001" ,"100" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
		};
		// 학생 정보와 성적이 담긴 데이터 이다
		// student ==> 1.id 2.주소 3.번호
		// score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다
		// 문제1) 전체 성적이 1등인 학생 이름 출력

		int maxN = 0;
		int idx = -1;

		int arr[] = new int[score.length];
		System.out.println(score.length);
		for (int i = 0; i < arr.length; i++) {
			arr[i] += Integer.parseInt(score[i][1]); // i=0->100 i=1->10...
			arr[i] += Integer.parseInt(score[i][2]); // 	 20       60 ...
			arr[i] += Integer.parseInt(score[i][3]); // 	 30       60...
//			System.out.println(arr[i]);
			if (maxN < arr[i]) {
				maxN = arr[i];
				idx = i;
			}
		}
		System.out.println("1등의 전체성적: " + maxN + "  이름: " + student[idx][0]);
	}

}
