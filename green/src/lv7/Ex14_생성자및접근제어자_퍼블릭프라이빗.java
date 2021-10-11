package lv7;

//클래스 :  사용자 정의 자료형(객체가 어떻게 생겼는지를 미리 정의해둔 설계, 청사진)

// 요소
// 1)멤버변수(속성을 변수로 표현)
// 2)메서드 (기능)

//클래스 정의
// class 클래스명{};


// 접근제어자
// public		//프로젝트범위안에서 부름
// protected
// default		//패키지범위안에서 부름
// private		//클래스 내부에서만 부름
class Person9999{
	
	
	private String name;			//private 붙음으로서 Person9999클래스 안에서만 사용가능
	private int age;
	private int gender;
	
	
	// 생성자 정의
	// 클래스명(){}
	Person9999(){			//기본생성자
		System.out.println("응애!");
	}
	Person9999(String name){
		this.name=name;
		System.out.printf("%s가 응애!\n",this.name);
	}
	Person9999(String name, int age, int gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	// 메소드 정의
	// 리턴할자료형 메서드명(){return;}
	
	//Getter 메서드	//클래스내 private한 멤버변수를 읽어오기위한 용도
	String getName() {
		return this.name;		
	}
	int getAge() {
		return this.age;		
	}
	int getGender() {
		return this.gender;
	}
	
	//Setter  		//클래스내 private한 멤버변수를 수정을 하기위한 용도
	void setName(String name) {
		this.name=name;
	}
	void setAge(int age) {
		this.age=age;
	}
	void setGender(int gender) {
		this.gender=gender;
	}
	
}

public class Ex14_생성자및접근제어자_퍼블릭프라이빗 {

	public static void main(String[] args) {
		//클래스 초기화(객체의 생성)
		//클래스명 변수명 = new 클래스명();  <--  클래스명 뒤에붙은    소괄호   이게 생성자
		Person9999 gildong= new Person9999("홍길동");
		Person9999 dooly=new Person9999("둘리",10,1);
//		System.out.println(dooly.name);		//Person9999클래스에 멤버변수에 private처리후라 읽어올떄는 Getter 메서드, 수정할때는 Setter 메서드 처리전까지는 사용가능불가 
		System.out.println(dooly.getName());
//		System.out.println(dooly.age);
		System.out.println(dooly.getAge());
//		System.out.println(dooly.gender);
		System.out.println(dooly.getGender());
		
		int age=dooly.getAge();
		age=11;
		System.out.println(dooly.getAge());
		dooly.setName("홍둘리");
		System.out.println(dooly.getName());
	}

}
