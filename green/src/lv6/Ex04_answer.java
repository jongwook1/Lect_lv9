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
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
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
				System.out.println("1.전교생 성적확인");
				System.out.println("2.1등학생 성적확인");
				System.out.println("3.꼴등학생 성적확인");
				System.out.println("4.성적확인하기");
				System.out.println("5.종료하기");
				System.out.println("메뉴: ");
				int sel=sc.nextInt();
				if(sel==1) {
					for(int i=0;i<green.arScore.length;i++) {
						System.out.printf("%d번 : %d점\n",green.arHakbun[i],green.arScore[i]);
					}
				}
				else if(sel==2) {				
					System.out.printf("1등 : %d번, %d점\n",green.arHakbun[topIdx],top);
				}
				else if(sel==3) {
					System.out.printf("1등 : %d번, %d점\n",green.arHakbun[bottomIdx],bottom);
				}
				else if(sel==4) {
					System.out.println("조회할 성적의 학번: ");
					int code=sc.nextInt();
					int idx=-1;
					for(int i=0;i<green.arHakbun.length;i++) {
						if(code==green.arHakbun[i]) idx=i;
						
					}
					if(idx!=-1) {
						System.out.println(green.arScore[idx]+"점");
					}else {
						System.out.println("존재하지 않는 학번입니다.");
					}
				}
				else if(sel==5) {
					break;
				}
		}

	}

}
