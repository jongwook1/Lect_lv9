package lv8;

import java.util.ArrayList;
import java.util.Scanner;

//Java �÷���
// List > ArrayList	(��ü �迭)

class Person{
	private String name;
	private int age;
	private int gender;
	
	public Person(String name, int age, int gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void printInfo() {
		System.out.printf("%s %d %d\n", this.name,this.age,this.gender);
	}
	
}

public class Ex00 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person group[]=new Person[10];	// Ŭ���� �迭(������ �ڱ�)
		
		//���� ����Ŭ����	: �⺻�ڷ��� -> ��üȭ �Ѱ�
		ArrayList<Integer> arr = new ArrayList<>();
		Integer num=(Integer)sc.nextInt();
//		Integer num=new(Integer)sc.nextInt();
		arr.add(num);
//		arr.add(20);
		
		
		
		ArrayList<Person> group2 =new ArrayList<Person>();
		System.out.println(group2); //���빰(����Ʈ��) ��ü ���

		//1. �߰�
		Person jiyeon= new Person("������", 2, 100);
		group2.add(jiyeon);
		System.out.println(group2.size());
//		System.out.println(group2);
		
		Person gildong=new Person("ȫ�浿", 1, 30);
		Person dooly =new Person("�Ѹ�", 1, 10);
		
		group2.add(gildong);
		group2.add(dooly);
		
		System.out.println(group2);
		System.out.println(group2.size());
		
		//2. ����
		group2.add(0, jiyeon);
		System.out.println(">>");
		for(int i=0;i<group2.size();i++) {
			group2.get(i).printInfo();
		}
		
		//3-1. ����(�ε���)
		group2.remove(0);
		group2.add(0, jiyeon);
		System.out.println(">>");
		for(int i=0;i<group2.size();i++) {
			group2.get(i).printInfo();
		}
		
		//3-2 ���� (��)
		arr.remove(num);
		
		
		group2.remove(dooly);
		group2.add(0, jiyeon);
		System.out.println(">>");
		for(int i=0;i<group2.size();i++) {
			group2.get(i).printInfo();
		}
		
		//4. ����
		group2.set(0, dooly);
		
		
		//5.�� �������� get()
		System.out.println(">>");
		for(int i=0;i<group2.size();i++) {
			group2.get(i).printInfo();
		}
		
		System.out.println("---------------");
		for(Person e: group2) {
			e.printInfo();
		}
		
//		System.out.println(group2.size());
		
	}

}
