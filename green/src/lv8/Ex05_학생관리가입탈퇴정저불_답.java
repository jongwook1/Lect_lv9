package lv8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;





class Student77{
	int number;
	String name;
	int age;
	
	public Student77(String name, int age) {		
		this.name=name;
		this.age=age;
	}
	
	public Student77(int number,String name, int age) {
		this.number=number;
		this.name=name;
		this.age=age;
	}
	
	public String infoString() {
		return this.number+" "+ this.name+" "+this.age+"\n";
		
	}
	
	
}
class Manager77{
	FileWriter fw=null;
	FileReader fr=null;
	BufferedReader br=null;
	private String fileName="newCms����.txt";
	private File file=new File(fileName);
	
	Random rn=new Random();
	private ArrayList<Student77> group = new ArrayList<Student77>();
//	int size=this.group.size();
	
	
	//1.���� 2.Ż�� 3.���� 4.��� 5.���� 6.�ε�
	
	public Student77 getStudent(int number) {
		Student77 student =null;
		
		for(int i=0;i<this.group.size();i++) {
			if(number==this.group.get(i).number) {
				student=this.group.get(i);
			}
		}
		return student;
		
	}
	
	public void addStudent(Student77 student) {		//�Ʒ��� while������ name, age ������ �ְ�, ���� �й��� ������ ���� ��ü�� �Ѿ��
		//�й� ���� �ο��� ->group�� �߰�
		student.number=randomNumber();
		group.add(student);
	}
	
	private int randomNumber() {
		int key=-1;
		while(true) {
			//1000~9999
			key=rn.nextInt(8999)+1000;

			int check=-1;
			for(int i=0;i<this.group.size();i++) {
				if(this.group.get(i).number==key) {
					check=i;
					}
			}
			if(check==-1) {
				break;
			}
		}
		return key;
	}
	
	public void removeStudent(Student77 student) {
//		int idx=-1;
//		for(int i=0;i<this.group.size();i++) {
//			if(this.group.get(i).number==student.number)
//				idx=i;
//		}
//		if(idx != -1) {
//			this.group.remove(idx);
//		}
		this.group.remove(student);
	}
	
	
//	public void removeStudent(Student77 student) {}
	
	public void sort() {
		for(int i=0;i<this.group.size();i++) {
			String first=this.group.get(i).name;
			int idx=i;
			for(int j=i;j<this.group.size();j++) {
				if(first.compareTo(this.group.get(j).name)>0){
					first=this.group.get(j).name;
					idx=j;
				}
			}
			
			//[i]�� ����ϴ� �Ϲ� �迭�� �ƴϱ⶧����      get./set.  ���
			Student77 temp=this.group.get(i);
			this.group.set(i, group.get(idx));
			this.group.set(idx, temp);
			
		}
	}
	public String toString() {
		String str="";
		for(int i=0;i<this.group.size();i++) {
			str+=this.group.get(i).infoString();
		}
		return str;
	}
	
	public void save() {
		String data="";

		for(int i=0;i<this.group.size();i++) {
			String info="";
			info+=this.group.get(i).name+"/";
			info+=this.group.get(i).number+"/";
			info+=this.group.get(i).age;
			data+=info;
			if(i!=this.group.size()-1) {
				data+="\n";
			}
		}
		try {
			fw=new FileWriter(file);
			fw.write(data);
			fw.close();
			System.out.println("����Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�������");
		}		
	}
	
	public void load() {
		save();
		this.group=new ArrayList<>();
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			String data=br.readLine();
			while(data!=null) {
				String info[]=data.split("/");
				int number=Integer.parseInt(info[0]);
				String name=info[1];
				int age=Integer.parseInt(info[2]);
				
				Student77 student =new Student77(number,name,age);
				this.group.add(student);
				
				data=br.readLine();
			}
					
			System.out.println("�ҷ����� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ҷ����� ����");
		}
//		String data="";		
//		try {
//			fr=new FileReader(file);
//			br=new BufferedReader(fr);
//			
//			String info=br.readLine();
//			while(info!=null) {
//				data+=info+"\n";
//				this.size++;
//				info=br.readLine();
//			}
//			fr.close();
//			br.close();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		String temp[]=data.split("\n");
//		this.group=new ArrayList<Student77>();
//		
//		for(int i=0;i<temp.length;i++) {
//			String info[]=temp[i]
//		}
//		
		
		
		
	}
	
	
	
}
public class Ex05_�л���������Ż��������_�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager77 manager = new Manager77();
		boolean run  = true;
		while(run) {
			System.out.println(manager.toString());
			System.out.println("1.���� 2.Ż�� 3.���� 4.��� 5.���� 6.�ε�");
			System.out.print("����: ");
			int sel=sc.nextInt();
			if(sel==1) {
				System.out.print("�̸�: ");
				String name=sc.next();
				System.out.println("����: ");
				int age=sc.nextInt();
				manager.addStudent(new Student77(name,age));
			}
			else if(sel==2) {
				System.out.println("Ż���� �й� �Է�: ");
				int number = sc.nextInt();
				
				manager.removeStudent(manager.getStudent(number));			//(������ ����)
			}
			else if(sel==3) {
				manager.sort();
			}
			else if(sel==4) {
				System.out.println(manager.toString());
			}
			else if(sel==5) {
				manager.save();
			}
			else if(sel==6) {
				manager.load();
			}
		}

	}

}
