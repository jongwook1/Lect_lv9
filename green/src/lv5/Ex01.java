package lv5;

public class Ex01 {

	public static void main(String[] args) {
		//문자열 : 문자의 나열(배열)
		// ㄴ String 클래스 - char 배열을 처리해줌
		
		//형변환
		// 문자->숫자
		char a= 'a';
		int num =(int)a;
		System.out.println(num);	// 97 ascii
		
//		char h='h';
//		int num1 = h;
//		System.out.println(num1);
		
		//숫자 ->문자
		char b=(char)(num+1);
		System.out.println(b);
		
		//문자열 ->숫자
		String str="123";		//숫자값으로만 이루어져야함
		num=Integer.parseInt(str);		//Integer.parseInt()암기
		System.out.println(num+1);
		
		//숫자 -> 문자열
		//1.
		str =String.valueOf(num);		//String.valueOf()암기
		System.out.println(str+1);
		// 2.
		str=num+"";
		System.out.println(str+1);
//		String str1=num1+"";
//		System.out.println(str1+1);
		
		
		//문자열 메서드
		str ="Do not go gentle into that good night";
		
		//substring()		: 부분 문자열 추출
		//문자열.substring(index) -> index~마지막 문자까지 추출		
		System.out.println(str.substring(0));		//0인덱스부터 마지막문자까지추출
		//문자열.substring(a,b) -> a~(b-1) 문자까지 
		System.out.println(str.substring(10,16));		
		
		//split()			: 문자열 잘라냄
		//문자열.split("구분자")
		//-> String 배열로 반환
		String result[]=str.split(" ");
		for(int i=0; i<result.length;i++) {
			System.out.println(result[i]);
		}
//		System.out.println(result.length);
		//charAt()			: 문자 한개만 추출
		// 문자열.charAt(index)
		//->char 반환
		
		char c= str.charAt(0);
		System.out.println(c);
		
	
		
		
	}

}
