package lv6;

import java.util.Random;

// Random,Scanner,File, FileWriter, FileReader, BufferedReader, Integer, 
// String 

//Ŭ���� Class
//�� ����� ���� �ڷ���

// ��ü : ���� 
// �ڵ���, ��� (User), å...

// Ŭ���� ����
// class Ŭ������(�빮�ڽ���){} 

class Person{	//�̶��� ���� ��ü�� �ƴ� �Ʒ��� new�� ���� ��ü����
	// Ŭ���� ���(�Ӽ���)
	Long code;
	int gender; //1m 2f
	String name;
	int age;
	int height;
	int weight;
	String address;
}

public class Ex01 {

	public static void main(String[] args) {
		
		Random rn= new Random();	
		//Ŭ���� �ʱ�ȭ (��ü�� ����)	
		//Ŭ������ ������ = new Ŭ������();
		
		Person jongwook=new Person();
		
		System.out.println(jongwook); //@41a4555e
		
		// Ŭ���� ���� �̸��� ���� .
		jongwook.code = 1234L;
		jongwook.gender= 1;
		jongwook.address="";
		jongwook.age=0;
		jongwook.height=0;
		jongwook.weight=0;

		//������ ���ü�����
		Person hgd = new Person();
		Person kjy= new Person();
		Person aaa= new Person();
		Person bbb= new Person();
		

	}

}
