package lv1;
import java.util.Random;
public class t1 {

	public static void main(String[] args) {
		/*
		 * # 코인 게임
		 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
		 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
		 * 3. 동전의 앞뒷면을 맞추는 게임이다.
		 */
	
			Random ran = new Random();
			int coin = ran.nextInt(2);	//0~1
			
			if(coin == 0) {
			System.out.println(coin+1);
			}
			else {
				System.out.println(coin);
			}
	}
}
