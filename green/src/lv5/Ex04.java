package lv5;

public class Ex04 {

	public static void main(String[] args) {
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		String str = "김철수/87,이만수/42,이영희/95";
		String[] name = new String[3];
		int[] score = new int[3];

		String n1[] = str.split(",");		
		
		for(int i=0;i<n1.length;i++) {
			String n2[]=n1[i].split("/");
//			System.out.println(n2[0]);
//			System.out.println(n2[1]);
			name[i]=n2[0];
			score[i]=Integer.parseInt(n2[1]);
			}
		
		for(int i=0;i<name.length;i++) {
		System.out.printf("%s 는 %d점 입니다\n",name[i],score[i]);
		}
		
	}
}
