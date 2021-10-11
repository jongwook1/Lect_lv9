package lv7;

//메모리 영역
//	stack
//	heap
//	static

class Monster{
//	int level;				
	static int level;		//static 유무의 차이 확인하기
	String name;
	boolean death;
	
	Monster(String name){
		this.name=name;
		System.out.println("몬스터의 탄생 >>");
	}
	
	void printInfo() {
		System.out.printf("%s의 Level %d / death: %b\n",this.name,this.level,this.death);
	}
	
}

public class Ex15_static {

	public static void main(String[] args) {
		
		Monster m1=new Monster("오크");
		m1.level++;
		m1.level++;
		m1.level++;
		
		Monster m2=new Monster("나비");
		m2.level++;
		m2.death=true;
		
		Monster m3=new Monster("릴라");
		m3.level++;
		m3.level++;
		
		m1.printInfo();
		m2.printInfo();
		m3.printInfo();
	}

}
