package lv4_review;

import java.util.Scanner;

public class Z_03 {

	public static void main(String[] args) {
		//시작 13:35
		//종료 13:45
		//소요 00:10
		
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
				
				int check=1;
				for(int i=0;i<itemCount;i++) {					
						if(items[i][0]==cate) {				
						check=-1;
					}
				}
				if(check==1) {
				items[itemCount][0]=cate;
				itemCount++;
				}else {
					
				}
			}
			else if(sel == 2) {
				for(int i=0;i<itemCount;i++) {
					System.out.printf("%d)  %s\n",i+1,items[i][0]);
				}
				System.out.println("관리할 카테고리선택");
				sel=sc.nextInt()-1;
				
				if(itemCount>0&&sel<itemCount) {
					System.out.println("아이템명입력");
					String item=sc.next();
					items[sel][1]+=item;
					items[sel][1]+="/ ";
					
				}
			}
			else if(sel == 3) {
				for(int i=0;i<itemCount; i++) {
					System.out.printf("%s: %s\n", items[i][0], items[i][1]);
				}
			}
		}
	}

}
