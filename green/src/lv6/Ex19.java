package lv6;
//메뉴판 출력, 메뉴 선택받는거,계산

import java.util.Scanner;

class POS1 {
	Scanner sc = new Scanner(System.in);
	int total = 0;	
//	int myMoney= 10000;
	int eMoney=0;
	String name = "";
	int arPrice[] = { 2500, 3800, 1500 };
	String arMenu[] = { "치킨버거", "불고기버거", "치즈버거" };
	int arCnt[];

	// 메뉴판출력
	void printMenu() {
		System.out.println("-------메뉴-----");
		for (int i = 0; i < 3; i++) {
			System.out.printf("-------%d) %s----", i + 1, this.arMenu[i]);
		}
		System.out.println("0) 돌아가기");
	}

	// 메뉴선택받기
	void selectMenu() {
		arCnt=new int[arMenu.length];
		while (true) {
			System.out.println("메뉴선택해주세요");
			int sel = sc.nextInt()-1;
			if (sel >=0&&sel<this.arMenu.length) {
				arCnt[sel]++;
			}if(sel==-1) {
				break;
			}
		}
	}

	// 계산
	int[] calculate() {
		int result[]=new int[2];
		int sum=0;
		
		for (int i = 0; i < this.arPrice.length; i++) {
			sum += this.arCnt[i] * this.arPrice[i];
		}
		System.out.println("지불할 금액을 입력하세요");
		int outM=sc.nextInt();
		if(outM<sum) {
			System.out.println("가지고있는 현금이 부족합니다");
		}else {
			result[0]=sum;
			result[1]=outM-sum;
			
		}
		return result;
		
	}

	// 영수증 출력
	void printRecipe(int[] result) {
		System.out.println("------" + name + "영수증----");
		for (int i = 0; i < this.arPrice.length; i++) {
			System.out.printf("%s +%d개  ", this.arMenu[i], this.arCnt[i]);
		}
		System.out.println("총 금액: " + result[0] + "원 입니다");
		System.out.println("받으실 잔돈은 : "+result[1]+"입니다");
//		System.out.println(this.myMoney);
	}

	public void run() {
		while (true) {
			System.out.println("1.메뉴선택 2.계산 및 영수증출력 3.종료");
			int choice = sc.nextInt();
			if (choice == 1) {
				printMenu();
				selectMenu();
			}else if(choice==2) {
				
				printRecipe(calculate());
			}			
//			else if (choice == 3) {
//				this.calculate();
				
//			} 
		else if (choice == 3) {
				break;
			}
		}
	}
}

public class Ex19 {

	public static void main(String[] args) {
		/*
		 * # 영수증 출력하기 : 클래스[변수]
		 * 1. 햄버거 주문을 받아 영수증을 출력한다.
		 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
		 */
		POS1 pos =new POS1();
		pos.run();
		
	}

}
