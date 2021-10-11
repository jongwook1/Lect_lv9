package lv1;
// 1. Random 클래스를 import
import java.util.Random;

public class Ex12 {

	public static void main(String[] args) {
		//랜덤의 사용
		//Random
		
		Random ran = new Random();
		
		//1~10까지의 정수 중에서 랜덤값을 추출 후, 출력
		
		int rNum = ran.nextInt();		//범위지정안해준상태
		System.out.println(rNum);

		rNum = ran.nextInt(10);			//0~9	프로그래밍에선 0부터시작하므로 9까지끝남 0부터9까지가 10개의수
		System.out.println(rNum);
		
		rNum = ran.nextInt(10) +1;			//1~10	
		System.out.println(rNum);
	}

}
