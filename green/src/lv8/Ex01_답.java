package lv8;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList를 활용한 컨트롤러 구현
public class Ex01_답 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> arr	= new ArrayList<Integer>();
		
		while(true){
			System.out.println("size: "+ arr.size());
			for(Integer i : arr) {
				System.out.print(i+" ");
			}		
			
			System.out.println("\n1.추가 2.삽입  3. 삭제(인덱스)  4. 삭제(값) 5. 수정 0. 가져오기");
			System.out.println("메뉴선택: ");
			int sel=sc.nextInt();
			
			if(sel==1) {
				System.out.println("추가할 값: ");
				Integer data =(Integer) sc.nextInt();
				
				if(arr.add(data)) {
					System.out.println("추가완료");
				}else {
					System.out.println("살패");
				}
			}
			else if(sel==2) {
				System.out.println("삽입할 인덱스: ");
				int idx=sc.nextInt();
				System.out.println("삽입할 값 : ");
				Integer data =(Integer) sc.nextInt();
				arr.add(idx, data);				
			}
			else if(sel==3) {
				System.out.println("삭제할 인덱스: ");
				int delIdx=sc.nextInt();
				arr.remove(delIdx);
			}
			else if(sel==4) {
				System.out.print("삭제할 값: ");
				Integer delData=(Integer)sc.nextInt();
				if(arr.remove(delData)) {
					System.out.println("삭제완료");
				}else {
					System.out.println("삭제할 값을 다시 확인하세요");
				}				
			}
			else if(sel==5) {
				System.out.print("수정할 인덱스 입력: ");
				int setIdx=sc.nextInt();
				
				System.out.print("변경할 값: ");
				Integer data=(Integer)sc.nextInt();
				arr.set(setIdx, data);
			}
			else if(sel==0) {
				int getIdx=sc.nextInt();				
				System.out.println(arr.get(getIdx));
				
			}
			
			
		}

	}

}
