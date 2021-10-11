package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex10_t_arr_contor2 {

	public static void main(String[] args) {
		/*
		 * # 배열 컨트롤러[2단계] : 벡터(Vector)   
		 * 1. 추가										추가되는값있을때 스코어 배열재초기화후 (기존의 값 불러오기하는법 임시변수tmep에)cnt+1만큼 추가
		 * . 값을 입력받아 순차적으로 추가
		 * 2. 삭제(인덱스)
		 * . 인덱스를 입력받아 해당 위치의 값 삭제
		 * 3. 삭제(값)
		 * . 값을 입력받아 삭제
		 * . 없는 값 입력 시 예외처리
		 * 4. 삽입
		 * . 인덱스와 값을 입력받아 삽입
		 */
		
		Scanner sc= new Scanner(System.in);
		Random rn=new Random();
		 int datas[] = null;
		int cnt = 0;			//cnt=1이면 한번돌린거
			
			
			while(true) {
				if (datas != null) {
					for (int i = 0; i < datas.length; i++) {
						System.out.print(datas[i] + " ");
					}
					System.out.println();
				}	
				System.out.println("1.추가");				
				System.out.println("2.삭제(인덱스)");
				System.out.println("3.삭제(값)");
				System.out.println("4.삽입");
						
				System.out.println("메뉴");
				int sel=sc.nextInt();
				if(sel==1) {
					System.out.print("추가할 값을 입력하세요");
					
					int data =sc.nextInt();
					if(cnt>0) {//보존할 값이 존재하는 경우
						int temp[]=datas;					//datas의 주소값 복사		//예를들어 {1,2,3}				
						datas =new int [cnt+1];				//cnt+1 크기의 새로운 주소 할당받음  //		{0,0,0,0}			
						for(int i=0; i<temp.length;i++) {
							datas[i] =temp[i];				
						}
					}
					
					else {//처음 값 등록
						datas=new int[1];					//datas 배열의 초기화 (1개짜리 배열의 주소 할당)
					}
					datas[cnt]=data;		//마지막 인덱스에 값 저장
					cnt++;
					
				}
				else if(sel==4) {
					System.out.print("삽입할 위치:");
					int idx=sc.nextInt();
					
					if(datas !=null&& idx>= 0 && idx <cnt) {

						System.out.print("삽입할 값:");
						int data=sc.nextInt();
						
						int temp[]=datas;
						datas= new int[cnt+1];
						
						for(int i=0;i<temp.length;i++) {		
							if(i<idx) {													// 예를들어 datas에{{0}{1}{2}{3}{4}{5}}이렇게 입력했고 삽입위치를 3으로하고 값입력을 99로하면 {2}까지가 if의 조건에 해당하는범위
								datas[i]=temp[i];
							}else {//한칸씩 뒤로 밀려나는애들									//	datas에{{0}{1}{2}{3}{4}{5}}이렇게 입력했고 삽입위치를 3으로하고 값입력을99로 하면 {4}부터가 else의 해당하는범위
								datas[i+1]=temp[i];					//temp 랭스가 dats보다 짧으므로 오류안남
							}
						}
						datas[idx]=data;												// 최종 datas에는 {{0}{1}{2}{3}!{99}!{4}{5}}
						cnt++;
					}
					
					
					
					
				}
				else if(sel==2) {
					System.out.print("삭제할 인덱스");
					int delIdx=sc.nextInt();
					if (datas != null && delIdx >= 0 && delIdx < cnt) {
						if(cnt==1) {
							datas=null;
						}
						else {
							int temp[]=datas;
							datas= new int[cnt-1];
							int idx=0;					//datas의 인덱스 삭제할값을 따라가지 못하므로 idx새로만들어줌			//?
							for(int i=0;i<temp.length;i++) {
								if(i!=delIdx) {						//삭제할 인덱스를 아예 배제해서 datas와 temp를 덮어씌움									//?
									datas[idx]=temp[i];
									idx++;
								}
							}
						}
						cnt--;
					}
					
					
				}
				else if(sel==3) {
					if(datas!=null) {
					
					System.out.print("삭제할 값");
					int delData=sc.nextInt();
					
					int delCnt=0;
					for(int i=0; i<datas.length;i++) {
						if(delData ==datas[i]) {
							delCnt++;
						}
					}
					int temp[]=datas;
					datas =new int[cnt-delCnt];
					
					int idx=0;
					for(int i=0;i<temp.length;i++) {
						if(temp[i]!=delData) {
							datas[idx]=temp[i];
							idx++;
						}
					}
					cnt-=delCnt;
//					temp = null;	//temp의 메모리 해제	-> 생략가능 (G.C 존재하기 때문)
					}else {
						System.out.println("비어있습니다");
					}
				}
				
				
				
				
				
				
			}
			
			
			
			
			
			

	}

}
