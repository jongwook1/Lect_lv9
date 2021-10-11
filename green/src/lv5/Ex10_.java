package lv5;

import java.util.Scanner;

public class Ex10_ {

	public static void main(String[] args) {
		/*
		 * # 단어 검색
		 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
		 * 2. 단어가 존재하면 true
		 *    단어가 없으면 false를 출력한다.
		 */

		Scanner sc = new Scanner(System.in);
		String text = "Life is, too short!";
		System.out.println(text);
		for(int i=0;i<text.length();i++) {
			System.out.print(i);
		}
		System.out.println(text.length());
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = sc.next();


	char temp[]=new char[text.length()];
		for(int i=0;i<temp.length;i++) {
			temp[i]=text.charAt(i);
			
//			System.out.print(temp[i]);
		}
//		System.out.println("temp길이"+temp.length);
		int size=word.length();
		
		int check=-1;		
		
		for(int i=0;i<temp.length-size+1;i++) {
			int cnt=0;
			for(int j=0;j<size;j++) {
				if(temp[i+j]==word.charAt(j)) {
					cnt++;
				}				
			}
			if(cnt==word.length()) {
				check=1;
			}
		}
		if(check==1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
