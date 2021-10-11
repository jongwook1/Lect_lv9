package lv2;

public class Ex06 {

	public static void main(String[] args) {
		// 제어문
		// 조건문 if, switch문 삼항연산자 
		// 반복문 while, for
		// 보조제어문 break, continue
		
		// switch-case
		// switch(조건 변수)
		//{
		// case 변수값 : 실행할문;
		// case 변수값 : 실행할문;
		// case 변수값 : 실행할문;
		// case 변수값 : 실행할문;
		//}
		
		int grade = 2; // 1 vip, 2 골드, 3 실버
			//if-else  : 선두의 조건식이 우선된다(우선순위 발생)
		if(grade == 1) {
			System.out.println("vip");
		}
		else if(grade ==2) {
			System.out.println("실버");
		}
		else if (grade ==3) {
			System.out.println("골드");
		}

		//switch-case : 연쇄처리
		switch(grade) {
		case 1 :
			System.out.println("vip 혜택부여");
		case 2 :
			System.out.println("골드 혜택부여");
			break;		//
		case 3 :
			System.out.println("실버 혜택부여");		
		}
		
		//삼항연산자
		// 조건식 ? true일때 반환할문장 : false일때 반환할 문장

		int coin = 1; 		//1: 앞  2: 뒤

		if(coin == 1) {
			System.out.println("앞");
		}
		else {
			System.out.println("뒤");
		}
		
		
		
		String msg = coin == 1 ? "앞면" : "뒷면";
			System.out.println(msg);
			
		
		
		
		
	}

}
