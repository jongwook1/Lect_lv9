package lv6;

import java.util.Scanner;

class Ex1{	
	String name = "green";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}
public class Ex04_answer {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/*
		 * System.out.println("=== " + green.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
		 */
		
		Ex1 green= new Ex1();
		
		int top=0;
		int topIdx=0;
		//top
		for(int i=0; i<green.arScore.length;i++) {
			if(top<green.arScore[i]) {
				top=green.arScore[i];
				topIdx=i;
			}
		}
		int bottom=top;
		int bottomIdx=0;
		//bottom
		for(int i=0; i<green.arScore.length;i++) {
			if(bottom>green.arScore[i]) {
				bottom=green.arScore[i];
				bottomIdx=i;
			}
		}
		while(true) {
			    System.out.println("=== " + green.name + "===");
				System.out.println("1.������ ����Ȯ��");
				System.out.println("2.1���л� ����Ȯ��");
				System.out.println("3.�õ��л� ����Ȯ��");
				System.out.println("4.����Ȯ���ϱ�");
				System.out.println("5.�����ϱ�");
				System.out.println("�޴�: ");
				int sel=sc.nextInt();
				if(sel==1) {
					for(int i=0;i<green.arScore.length;i++) {
						System.out.printf("%d�� : %d��\n",green.arHakbun[i],green.arScore[i]);
					}
				}
				else if(sel==2) {				
					System.out.printf("1�� : %d��, %d��\n",green.arHakbun[topIdx],top);
				}
				else if(sel==3) {
					System.out.printf("1�� : %d��, %d��\n",green.arHakbun[bottomIdx],bottom);
				}
				else if(sel==4) {
					System.out.println("��ȸ�� ������ �й�: ");
					int code=sc.nextInt();
					int idx=-1;
					for(int i=0;i<green.arHakbun.length;i++) {
						if(code==green.arHakbun[i]) idx=i;
						
					}
					if(idx!=-1) {
						System.out.println(green.arScore[idx]+"��");
					}else {
						System.out.println("�������� �ʴ� �й��Դϴ�.");
					}
				}
				else if(sel==5) {
					break;
				}
		}

	}

}
