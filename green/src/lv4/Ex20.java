package lv4;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 문제 ) 사전 순으로 이름 정렬
		String[] names = { "홍길동", "김유신", "마동석", "자바킹", "서동요" };
		
			
	
	
		for(int i = 0; i < names.length; i++) {
			String minNum = names[i];
			int minIdx = i;
			for(int j = i; j < names.length; j++) {
				if(names[j].compareTo(minNum) < 0) {
					minNum = names[j];
					minIdx = j;
				}
			}
			
			String temp = names[i];
			names[i] = names[minIdx];
			names[minIdx] = temp;
		}
		
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}




	}

}
