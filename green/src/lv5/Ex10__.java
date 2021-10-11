package lv5;

import java.util.Scanner;

public class Ex10__ {

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
		System.out.print("\n검색할 단어를 입력하세요 : ");
		String word = sc.next();
		
		
		//text담을 temp배열
		char temp[]=new char[text.length()];
		
//		System.out.println(temp.length);			//temp배열의크기가 text.length와 같은지 확인
		
		//temp에 text문자 넣기
		for(int i=0;i<temp.length;i++) {
			temp[i]=text.charAt(i);
//			System.out.println(temp[i]);			//문자 잘들어갔나 확인
		}
		
		//검색할 단어인 word의 길이를 size변수에 담음
		int size=word.length();
		
		boolean check=false;
		for(int i=0;i<temp.length-size+1;i++) {		//temp.length-size+1인 이유 size를 빼지 않으면 i가 size를 안뺀만큼 더 돌아서 아웃바운스오류 //+1을 하지않으면 text의 끝을 포함하여 검색햇을시 +1을 안하면 찾지못함
			int cnt=0;
			for(int j=0;j<size;j++) {
				if(temp[i+j]==word.charAt(j)) {
					cnt++;
				}
			}
			if(cnt==word.length()) {
				check=true;
			}
		}
		if(check==true) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}		
	}
}
