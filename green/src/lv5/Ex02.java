package lv5;

public class Ex02 {

	public static void main(String[] args) {
		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 30세
		String age = jumin.substring(0, 2);
		int n = Integer.parseInt(age);
		n = 119 - n; // 119->현재 2019년이라고 가정
		System.out.println(n + " 세");

		// 문제 2) 성별 출력
		// 정답 2) 여성
		//ver.1
		char gender = jumin.charAt(7);
		if (gender == 1) {
			System.out.println("남성입니다");
		} else {
			System.out.println("여성입니다");
		}

		//ver.2
		String gender1 = jumin.substring(7,8);
//		System.out.println(gender1);
		if (gender1.equals(2+"")) {			//("2") 가능
			System.out.println("여성입니다");
		} else {
			System.out.println("남성입니다");
		}		
	}

}
