
package lv4;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// ����1) 1~�鸸 ������ ���ڸ� �Է¹ް� ��� ���� ���
		// (�� ! ¦���ڸ��� ���� ¦���ڸ���� ���)
		// ��) 123 ==> 2
		// ��) 1234 ==> ¦���� �ڸ��̴�
		// ��) 1 ==> 1
		// ��) 1234567 ==> 4
		// ��Ʈ �ڸ����� ���ϰ� �迭�� ������� �ϳ��� ����
		// ��) ==> 123 ==> 3 ==> arr[] = new int[3];

//		// lv2test�Ҷ� 6.12 �ڸ��� ȯ���ߴ��� �����ؼ�
//		double num = 6.12; // 612
//		// while...
//
//		int digit = 0;
//		while (num % 1 > 0) {
//			num *= 10;
//			digit++;
//		}
//		System.out.println(digit);
//		System.out.println(num);
//
//		// ���ڸ����� ����
//		while (digit > 0) {
//			num /= 10;
//			digit--;
//		}
//
//		System.out.println(num);
		

		Scanner sc=new Scanner(System.in);
		
		System.out.print("1~1�鸸 �����Է�: ");
		int num =sc.nextInt();
		
		if(num >=1 &&num<= 1000000) {
			int temp=num;			//num������ ������ ����ϹǷ� temp��������� �־���
			
			
			int digit=0;
			while(temp>0) {
				temp /=10;		//�� ������
				digit++;
				
			}
			System.out.println(digit);
			
			if(digit%2==0) {
				System.out.println("¦���ڸ� ��  �Դϴ�.");
			}else {
				int arr[]=new int [digit];		//{1,2,3,4,5}�־��ٰ� ������
				
				int idx=arr.length-1;
				while(digit>0) {		
				arr[idx]=num %10;				//�������� �����°�
				num /=10;
				idx--;
				digit--;
				}
//				for(int i=0;i<arr.length;i++) {
//					System.out.print(arr[i]+" ");
//				}
				
				System.out.println(arr[arr.length/2]);

				
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}
