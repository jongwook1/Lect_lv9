package lv7;

//Ŭ���� :  ����� ���� �ڷ���(��ü�� ��� ��������� �̸� �����ص� ����, û����)

// ���
// 1)�������(�Ӽ��� ������ ǥ��)
// 2)�޼��� (���)

//Ŭ���� ����
// class Ŭ������{};


// ����������
// public		//������Ʈ�����ȿ��� �θ�
// protected
// default		//��Ű�������ȿ��� �θ�
// private		//Ŭ���� ���ο����� �θ�
class Person9999{
	
	
	private String name;			//private �������μ� Person9999Ŭ���� �ȿ����� ��밡��
	private int age;
	private int gender;
	
	
	// ������ ����
	// Ŭ������(){}
	Person9999(){			//�⺻������
		System.out.println("����!");
	}
	Person9999(String name){
		this.name=name;
		System.out.printf("%s�� ����!\n",this.name);
	}
	Person9999(String name, int age, int gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	// �޼ҵ� ����
	// �������ڷ��� �޼����(){return;}
	
	//Getter �޼���	//Ŭ������ private�� ��������� �о�������� �뵵
	String getName() {
		return this.name;		
	}
	int getAge() {
		return this.age;		
	}
	int getGender() {
		return this.gender;
	}
	
	//Setter  		//Ŭ������ private�� ��������� ������ �ϱ����� �뵵
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

public class Ex14_�����ڹ�����������_�ۺ������̺� {

	public static void main(String[] args) {
		//Ŭ���� �ʱ�ȭ(��ü�� ����)
		//Ŭ������ ������ = new Ŭ������();  <--  Ŭ������ �ڿ�����    �Ұ�ȣ   �̰� ������
		Person9999 gildong= new Person9999("ȫ�浿");
		Person9999 dooly=new Person9999("�Ѹ�",10,1);
//		System.out.println(dooly.name);		//Person9999Ŭ������ ��������� privateó���Ķ� �о�Ë��� Getter �޼���, �����Ҷ��� Setter �޼��� ó���������� ��밡�ɺҰ� 
		System.out.println(dooly.getName());
//		System.out.println(dooly.age);
		System.out.println(dooly.getAge());
//		System.out.println(dooly.gender);
		System.out.println(dooly.getGender());
		
		int age=dooly.getAge();
		age=11;
		System.out.println(dooly.getAge());
		dooly.setName("ȫ�Ѹ�");
		System.out.println(dooly.getName());
	}

}
