package lv1;
// 1. Random Ŭ������ import
import java.util.Random;

public class Ex12 {

	public static void main(String[] args) {
		//������ ���
		//Random
		
		Random ran = new Random();
		
		//1~10������ ���� �߿��� �������� ���� ��, ���
		
		int rNum = ran.nextInt();		//�������������ػ���
		System.out.println(rNum);

		rNum = ran.nextInt(10);			//0~9	���α׷��ֿ��� 0���ͽ����ϹǷ� 9�������� 0����9������ 10���Ǽ�
		System.out.println(rNum);
		
		rNum = ran.nextInt(10) +1;			//1~10	
		System.out.println(rNum);
	}

}
