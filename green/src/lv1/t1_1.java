package lv1;
import java.util.Random;
public class t1_1 {

	public static void main(String[] args) {
		/*
		 * # 홀짝 게임
		 * 1. 1~100사이의 랜덤 숫자를 저장한다.
		 * 2. 저장된 랜덤 숫자를 보여주고,
		 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
		 */
		Random ran = new Random();
		
		int rNum = ran.nextInt(100)+1;		//0~99  +1  ->1~100
		if(rNum % 2 == 0) {
		System.out.println(+rNum + "짝수이다");
		}
		else if(rNum % 2 != 0) {
		System.out.println(+rNum + "홀수이다");
		}
	}

}
