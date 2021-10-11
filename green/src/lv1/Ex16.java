package lv1;
import java.util.Scanner;

//"Random" +컨트롤 스페이스
import java.util.Random;
public class Ex16 {

	public static void main(String[] args) {
		/*
		 * # 가운데 숫자 맞추기 게임
		 * 1. 150~250 사이의 랜덤 숫자 저장 
		 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
		 * 예)
		 * 		249		: 4
		 */		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int quiz = rn.nextInt(101) +150;	//150~250 (101개)
		
		
		System.out.println(quiz);
		
		
	
		//정답
		
		//입력
		
		
		int answer = quiz / 10 % 10;	// 가운데 수
		System.out.println("가운데 숫자를 맞춰주세요");		
		int input = sc.nextInt();
		
		if(input == answer) {
			System.out.println("정답");
		}else {
			System.out.println("땡");
		}
	}
}
