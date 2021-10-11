package lv1;

public class Ex20 {

	public static void main(String[] args) {
		
		// 포매터의 사용
		// ㄴ 출력의 양식
		// ㄴ 문자열 안에 약속된 포매터키를 입력 -> 맵핑
		
		//print()
		//println()		//new line (줄바꿈포함)
		//printf()		//formatter
		
		
		///자로형
		//1. 정수 	integer		-> int		: "d" decimal
		//2. 실수		float		-> double	: "f"
		//3. 문자		character	->	char	: "c"	
		//4. 문자열	string		-> String	: "s"
		
		
		//** 학생의 성적은 **점 입니다.
		String stu = "이종욱";
		int score = 100;
		
		System.out.println(stu + " 학생의 성적은 " + score + "점 입니다.");
		System.out.printf("%s 학생의 성적은 %d점 입니다.", stu, score);
			
		
		
		
	}

}
