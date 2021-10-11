package lv4;

import java.util.Scanner;

public class Ex21_my {

	public static void main(String[] args) {
		/*
		 * # 쇼핑몰 [관리자]
		 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
		 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
		 * 3. 아이템은 각 행의 두번째 열에 저장한다.
		 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
		 * 예)
		 * {
		 * 		{"과일", "사과/포도/"},
		 * 		{"과자", "홈런볼/쪼리퐁/"},
		 * 		{"음료", "콜라/"},
		 * 		{"육류", "소고기/"}
		 * 		...
		 * } 
		 */
		Scanner sc = new Scanner(System.in);
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		int itemCount = 0;
		while(true) {
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			System.out.print(": ");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.println("카테고리명을 입력하세요");
				String cate=sc.next();
				
				int check=-1;
				for(int i=0;i<itemCount;i++) {
					if(items[i][0].equals(cate)){
						check=1;
					}
				}
				
				if(check==-1) {
			//	for(int i=0;i<items.length;i++) {	for문 필요없음
				items[itemCount][0]=cate;		//이부분 itemCount로 하는거놓침
				itemCount++;
			//	}
				}else {
					System.out.println("이미 존재하는 카테고리입니다");
				}
				
				
			}
			else if(sel == 2) {
				for(int i=0;i<itemCount;i++) {
					System.out.printf("%d) %s\n",i+1, items[i][0]);
				}
				
				System.out.println("카테고리 번호를 선택하세요");
				int choice=sc.nextInt();
				System.out.println("아이템명을 입력하세요");
				String item=sc.next();
				//for(int i=0;i<itemCount;i++) {		//for문 필요없음
					items[choice][1]+=item;
					items[choice][1]+="/";
			//	}
				
			}
			else if(sel == 3) {
				for(int i=0;i<itemCount;i++) {
					System.out.printf("%s: %s\n",items[i][0], items[i][1]);
				}
			}
		}



	}

}
