package lv3;
import java.util.Scanner;
public class Ex30_t {

	public static void main(String[] args) {
		/*
		 * # �Ҽ�ã��[2�ܰ�]
		 * ���� �� ���� �Է¹޾�, 2���� �ش� ���ڱ����� ��� �Ҽ� ���
		 * ��)
		 * �Է� : 20
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�: ");
		int num= sc.nextInt();		//2~num
		
		int count =0;
		for(int i=2; i<=num;i++) {		//�˻��Ҵ���� i
			int cnt =0;					//cnt��ġ �߿� ���� for�������� ���� cnt
			for(int j=1; j<=i;j++) {
				if(i % j ==0) {
					cnt++;
				}				
			}
			if(cnt ==2 ) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count + "�� ");
		
	}

}
