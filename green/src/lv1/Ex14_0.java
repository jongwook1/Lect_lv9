package lv1;
import java.util.Random;
import java.util.Scanner;
public class Ex14_0 {

	public static void main(String[] args) {
		/*
		 * # ATM[1�ܰ�] : ��ü�ϱ�
		 * 1. ��ü�� ���¹�ȣ�� �Է¹޴´�.
		 * 2. ���¹�ȣ�� ��ġ�ϸ�,
		 * 3. ��ü�� �ݾ��� �Է¹޴´�.
		 * 4. ��ü�� �ݾ� <= myMoney	: ��ü����
		 * 			myMoney   - ��ü�� �ݾ�
		 * 			yourMoney + ��ü�� �ݾ�
		 *    ��ü�� �ݾ�  > myMoney 	: ��ü�Ұ�
		 */
		
		Random ran = new Random();
		int rNum = ran.nextInt();	
		//1. �α��� 2. ����
		// �α��� -> 1. �Ա� 2. ��� 3.��ȸ
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		int yourAcc = 4321;
		int yourMoney = 12000;
	
		
		//�Է¹ޱ�
		System.out.println("��ü�� ���¹�ȣ�� �Է��ϼ���");
		int inputAcc = sc.nextInt();
		
		//����Ȯ��
		if(inputAcc == yourAcc) {
			int inputMoney = sc.nextInt();
			//��ȿ���˻�
			if(inputMoney> myMoney) {
				System.out.println("�ܾ��� �����մ�");
			}else {
				//System.out.println("��ü�Ϸ�, ���� �ܾ�: "(���̸Ӵ�-��Ǳ�Ӵ�); Ʋ����
				myMoney -= inputMoney;
				yourMoney += inputMoney;
			}
			
		}else {
			System.out.println("�������� �ʴ� �����Դϴ�");
		}
		System.out.println("myMoney = " + myMoney + "��");
		System.out.println("yourMoney = " + yourMoney + "��");
		
		/*myAcc = sc.nextInt();
		if(myAcc == 1234) {
			myAcc = sc.nextInt();
			System.out.println("myMoney = " + myMoney + "��" + "��ü����");
			myMoney = sc.nextInt();
			if(myMoney == 8700) {				
				System.out.println("yourMoney = " + yourMoney + "��");			
			}
			else {
				System.out.println("��ü�Ұ�");
			}
		}	*/		

	}

}


