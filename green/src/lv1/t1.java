package lv1;
import java.util.Random;
public class t1 {

	public static void main(String[] args) {
		/*
		 * # ���� ����
		 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
		 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
		 * 3. ������ �յ޸��� ���ߴ� �����̴�.
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
