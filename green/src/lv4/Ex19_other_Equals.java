package lv4;

import java.util.Scanner;

public class Ex19_other_Equals {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		String a="abc";
		String b="abc";
		String c= sc.next();		//abc
		
		
		//String ��ü�� �ּҸ� ����
		System.out.println(a==b);			//true
		System.out.println(b==c);			//false
		
		//String ��ü�� ���� ����
		System.out.println(a.equals(b));	//true
		System.out.println(b.equals(c));	//true
		
		//���ڿ��� Ȯ��
		
		
		String items="";
		
		items +="���";
		items +="/";
		items +="����";
		items +="/";
		items +="����";
		
		System.out.println(items);
	}

}
