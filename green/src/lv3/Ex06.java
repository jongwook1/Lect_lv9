package lv3;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		// ����) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		// ��)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		
		Scanner sc= new Scanner(System.in);
		
	while(true) {
		System.out.println("�й��Է�:");
		int num =sc.nextInt();
			
			boolean check = false;
			int index =-1;
			//�˻� ( hakbuns �迭�� �����ϴ°�)
			for(int i=0; i<5; i++) {
				if(hakbuns[i] == num) {
					//?     i���
					check =true;
					index= i;					
				}
			}
			if(check == true) {// out bound ���� ��µ� // �ߴ�����
			//check ���� Ȱ�� -> ����� ����
			System.out.println(scores[index]+"��");
			break;
			}
			else {
				System.out.println("������ �й� �Է��ϼ���!!");
			}
			
		}
	// ����) 1���л��� �й��� ���� ���
	// ����) 1004��(98��)
	
	int max =0;
	int idx1 = -1;
	
	for(int i=0; i<5; i++) {
		if(scores[i] > max) {
			max = scores[i];	//max �� ����
			idx1 = i;
		}
	}
	System.out.println("1�� �л��� " + hakbuns[idx1]+"�� ");
	System.out.println("max : "+ max);
	
	
	

	}

}
