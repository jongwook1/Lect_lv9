package lv1;
import java.util.Random;
public class t1_1 {

	public static void main(String[] args) {
		/*
		 * # Ȧ¦ ����
		 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
		 * 2. ����� ���� ���ڸ� �����ְ�,
		 * 3. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
		 */
		Random ran = new Random();
		
		int rNum = ran.nextInt(100)+1;		//0~99  +1  ->1~100
		if(rNum % 2 == 0) {
		System.out.println(+rNum + "¦���̴�");
		}
		else if(rNum % 2 != 0) {
		System.out.println(+rNum + "Ȧ���̴�");
		}
	}

}
