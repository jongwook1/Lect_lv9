package lv6;

import java.util.Random;

//Ŭ���� : ����� ���� �ڷ���
//�� ���
//  1) �������
//	2) �޼���


//
class Intro{
	String name;
	
	// �޼���(�Լ�) : ��ɴ����� �ڵ���� ������ �� �ְ� ����� (Ŭ�����ȿ��־����)
	// �޼��� ����
	// �ڷ���Ű���� �޼����(){ ���๮ }
	// void - ��ȯ�� Ÿ���� �������� ���� ��쿡 ���
	
	// 4���� ������ �޼��� ���ǹ��
	
	//!!!!!!return�� ������ �޼���� ȣ���Ѱ����� �������  ����� �������!!!!!!!
	
	// Type1
	// ��ȯX, �Ķ����X
	void sayHello() {
		//���๮
		System.out.printf("%s�� �ȳ�!\n", name);		
	}
	//����) 1~5������ ���� ����ϴ� �޼���
	// �����Ѱ�
//	int total=0;
//	void sum() {
//		for(int i=1;i<=5;i++) {
//			total+=i;
//		}
//		System.out.println(total);		
//	}
	
	//answer
	void oneToFive() {
		int sum=0;
		for(int i=1;i<=5;i++) sum +=i;
		System.out.println(sum);
	}
	
	
	
	// Type2
	// ��ȯX, �Ķ����O
	void add(int num1,int num2) {	//parameter �Ű�����
		int sum=num1+num2;
		System.out.println(sum);		
	}
	
	// Type3   void�� �ƴѰ�- retrun�� �׻�����
	// ��ȯO, �ĸ�����X
	int ranNum() {
		Random rn= new Random();
		int rNum=rn.nextInt(10)+1;
		return rNum;		
				
	}
	
	// Type4
	// ��ȯO, �Ķ����O
	String makeStr(String key) {
		return key + "�� �ȳ�!";
	}
	
	//�޼��� �����ε�
	
	
}

//class Calculator{
//	// 0. guide message(���)
//	void message() {
//		System.out.println("0. guide message");
//	}
//	// 1. ����
//	int plus(int num1,int num2) {
//		int sum=0;
//		return sum=num1+num2;
//	}
//	// 2. ����
//	int minus() {
//		int min=0;
//		retrun min
//	}
//	// 3. ����
//	// 4. ������
//	// 5. %
//}




public class Ex16_Method {

	public static void main(String[] args) {
		
		String str = "abcd";
//		str.
		
		// �޼����� ���(ȣ��)
		// .(��)�� ���-> Ŭ������ ������ �ִ� �޼��带 ����
		
		Intro intro = new Intro();
		intro.name ="������";
		intro.sayHello();
		
//		intro.sum();
		intro.oneToFive();
		
		intro.add(10, 20);	//arguments ����(��)

		int a=12;
		int b=33;
		 intro.add(a, b);
		 
		
		 
		 int num = intro.ranNum();
		System.out.println(num);
		
		
		
		String result = intro.makeStr("�Ѹ�");
		System.out.println(result);
		
		
	}

}
