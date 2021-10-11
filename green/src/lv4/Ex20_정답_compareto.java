package lv4;

import java.util.Scanner;

public class Ex20_정답_compareto {

	public static void main(String[] args) {
		
		String a = "가";
		String b = "나";
		String c = "가";
		
		System.out.println(a.compareTo(b));		//음수  -> a가 b보다 앞
		System.out.println(b.compareTo(c));		//양수  -> b가 c보다 뒤
		System.out.println(a.compareTo(c));		//0
		
		
		
		
		
//		// 문제 ) 사전 순으로 이름 정렬
		String[] names = { "홍길동", "김유신", "마동석", "자바킹", "서동요" };

		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<names.length;i++) {
			String first =names[i];				//이번순번차에 들어오는 인덱스를 기준으로
			int idx=i;		
			for(int j=i;j<names.length;j++) {
				if(first.compareTo( names[j])>0) {//i번째 값의 순서가 더뒤로 가야하는경우
					first=names[j];
					idx=j;
				}
			}
			String temp= names[i];
			names[i]=names[idx];
			names[idx]=temp;
			
			
		}
		//출력
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		
		
		
		
		
		
	}

}
