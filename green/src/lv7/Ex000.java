package lv7;
//클래스 배열


// 클래스 요소
//	1. 멤버변수
//	2. 메서드
//객체와 클래스의 차이는 실존하면 객체 null상태면 클래스
class Product{
	String name;
	int price;
	
	void setData(String name, int price) {
		this.name=name;					//앞의 네임과 뒤의네임은 다름
		this.price=price;
	}
	void printData() {
		System.out.printf("%s : %d원\n",this.name, this.price);
	}
	
}

public class Ex000 {

	public static void main(String[] args) {
		
		
		// 문자열 배열 : 클래스 배열
		String users[]=new String[100];		//{null,null,null,null...}
		
		for(int i=0;i<10;i++) {
			System.out.println(users[i]);
		}
		
		//클래스 배열의 선언과 초기화
		// 클래스명 배열명[] =new 클래스명[개수];
		
		Product cart[]=new Product[100];	//{null,null,null,null...}
		for(int i=0;i<10;i++) {
			cart[i]=new Product();				//new!!!!
//			cart[i].name						//바로윗줄의 new로 해야 . 명령어 나옴
			cart[i].setData("product"+(i+1), (i+1)*1000);
//			System.out.println(cart[i]);
			cart[i].printData();
			
		}
		
	}

}
