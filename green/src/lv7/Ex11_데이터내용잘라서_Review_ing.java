package lv7;
class Student9999{
	String name;
	int score;
	void print() {
		System.out.println(name + " : " + score);
	}

}
public class Ex11_�����ͳ����߶�_Review_ing {

	public static void main(String[] args) {
		String data = "3\n"; 
		data +="�迵��/30\n";
		data += "�̸���/40\n";
		data += "��ö��/60";
		
		
		System.out.println(data);

		Student9999[] studentList;
		
		String temp[]=data.split("\n");
		
		studentList=new Student9999[Integer.parseInt(temp[0])];
		
		for(int i=0;i<Integer.parseInt(temp[0]);i++) {
			String info[]=temp[i+1].split("/");
			studentList[i]=new Student9999();
			studentList[i].name=info[0];
			studentList[i].score=Integer.parseInt(info[1]);
			studentList[i].print();
		}
		
		//����1)data�� �ִ� ������ �߶� studentList�� ������ ��� 
	
		//����2)�õ� ������ �ٽ� data�� ����	


	}

}
