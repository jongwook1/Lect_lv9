package lv4;

import java.util.Scanner;

public class Ex10_re {

	public static void main(String[] args) {
		/*
		 * # 배열 컨트롤러[2단계] : 벡터(Vector)
		 * 1. 추가
		 * . 값을 입력받아 순차적으로 추가
		 * 2. 삭제(인덱스)
		 * . 인덱스를 입력받아 해당 위치의 값 삭제
		 * 3. 삭제(값)
		 * . 값을 입력받아 삭제
		 * . 없는 값 입력 시 예외처리
		 * 4. 삽입
		 * . 인덱스와 값을 입력받아 삽입
		 */
		Scanner sc=new Scanner(System.in);
        int[] datas = null;
		int cnt = 0;
		
		
		while(true) {
			if(datas!=null)
				for(int i=0;i<datas.length;i++) {
					System.out.print(datas[i]+" ");
				}
			
			
			System.out.println("\n1.추가");
			System.out.println("2.삽입");
			System.out.println("3.삭제(인덱스)");
			System.out.println("4.삭제(값)");
			
			
				
			System.out.println("메뉴를 선택해주세요");
			int sel=sc.nextInt();
		
			
			
			
			if(sel==1) {
				System.out.println("삽입값입력 ㄱ");
				int inputN=sc.nextInt();		
				
				if(cnt>0) {
					int temp[]=datas;
					datas=new int [cnt+1];
					
					for(int i=0;i<temp.length;i++) {
						datas[i]=temp[i];
					}					
					
				}else {
					datas=new int[1];
					
				}
				
				datas[cnt]=inputN;
				cnt++;
				
		
				
			}
			else if(sel==2) {
				System.out.println("삽입할 위치입력 ㄱ");
				int idx=sc.nextInt();				
				
				if(datas!=null&&idx>=0&&idx<cnt-1) {					/////////////////////예외처리 cnt-1인거 한번 생각해보기
					
					System.out.println("삽입값 ㄱㄱ");
					int inputN=sc.nextInt();
					
					int temp[]=datas;
					datas=new int [cnt+1];
					
					for(int i=0;i<temp.length;i++) {					///////temp.length!!!!!!!!!!!!!
						if(i<idx) {
							datas[i]=temp[i];
						}else {
							datas[i+1]=temp[i];
						}
					}
					datas[idx]=inputN;
					cnt++;
					
				}				
				
			}
			else if(sel==3) {
				System.out.println("삭제할 인덱스번호입력 ㄱ");
				int dIdx=sc.nextInt();
				
				if(datas!=null&&dIdx>=0&&dIdx<cnt) {//////!!!!!!!!!dIdx<cnt!!!!!!!!!!!!!!!				
									
					if(cnt==1) {
						datas=null;
					}else {
						int temp[]=datas;
						datas=new int [cnt-1];
						
						int idx=0;
						for(int i=0;i<temp.length;i++) {
							if(i!=dIdx) {
							datas[idx]=temp[i];
							idx++;
							}
						}					
						
					}
					cnt--;
				}						
				
				
				
			}
			else if(sel==4) {
				
				if (datas != null) {
					System.out.println("삭제할값입력 ㄱ");
					int d = sc.nextInt();

					int dcnt = 0;
					for (int i = 0; i < datas.length; i++) {
						if (d==datas[i]) {
							dcnt++;
						}
					}

					int temp[] = datas;
					datas = new int[cnt - dcnt];			/////!!!!! dcnt구해놓고 여기에 안쓰지 않기!!!!!!!!!!		////

					int ddIdx = 0;
					for (int i = 0; i < temp.length; i++) {
						if (temp[i] != d) { //// !!!!!!!temp[i]!=d!!!!!!!!!
							datas[ddIdx] = temp[i];
							ddIdx++;
						}

					}
					cnt -= dcnt; //////// !!!!!!!!

				} else {
					System.out.println("비어있습니다");
				}
				
				
			}
			
			
			
			
			
		}
		
		
		
		
		
	}

}
