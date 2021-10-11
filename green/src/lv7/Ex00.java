package lv7;
//클래스 : 사용자 정의 자료형()
//ㄴ 1)멤버변수
//ㄴ 2)메서드

//클래스정의
//class 클래스명{}

class Bbang {
	String name;
	int price;
	
	// 메서드 : '기능'단위의 코드들을 '재활용(재사용)' 할 수 있게 만든 것
	// 메서드 정의
	// 리턴할자료형 메서드명 (파라미터){실행문;return;}
	
	void printInfo() {
		System.out.printf("%s : %d원\n",this.name,this.price);
//		return;
	}
	
	void setInfo(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	int  setPrice(int price) {
		this.price=price;
		return this.price;
	}
	
}

public class Ex00 {

	public static void main(String[] args) {
		// 클래스 초기화(객체의 생성)
		// 클래스명 변수명 =new 클래스명();			//클래스명 뒤에붙는 ()는 생성자임
		
		
		//메서드 사용(호출)
		Bbang sick=new Bbang();		//식빵하나가 객체가됌
		sick.setInfo("식빵",3000);
		sick.printInfo();
		System.out.println(sick.setPrice(3500));
		sick.printInfo();

		//클래스 배열  (클래스를여러개담을수있는 배열)
		// 클래스명 배열명[] =new 클래스명[개수];
		
		Bbang bongi[] =new Bbang[10];	//{null,null,null,null,null,null,null,null,null,null}
		bongi[0]=new Bbang();
		
		for(int i=0;i<bongi.length;i++) {
			System.out.println(bongi[i]);
		}
		
		
	}

}
