package lv7;

//�޸� ����
//	stack
//	heap
//	static

class Monster{
//	int level;				
	static int level;		//static ������ ���� Ȯ���ϱ�
	String name;
	boolean death;
	
	Monster(String name){
		this.name=name;
		System.out.println("������ ź�� >>");
	}
	
	void printInfo() {
		System.out.printf("%s�� Level %d / death: %b\n",this.name,this.level,this.death);
	}
	
}

public class Ex15_static {

	public static void main(String[] args) {
		
		Monster m1=new Monster("��ũ");
		m1.level++;
		m1.level++;
		m1.level++;
		
		Monster m2=new Monster("����");
		m2.level++;
		m2.death=true;
		
		Monster m3=new Monster("����");
		m3.level++;
		m3.level++;
		
		m1.printInfo();
		m2.printInfo();
		m3.printInfo();
	}

}
