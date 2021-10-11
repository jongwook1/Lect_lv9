package lv7;
class Student98{
	String name;
	int score;
	
	
	void setInfo(String name, int score) {
		this.name=name;
		this.score=score;
	}
	
	void print() {
		System.out.println(name + " : " + score);
	}

}
public class Ex11_�����ͳ����߶�_���� {

	public static void main(String[] args) {
		String data = "3\n"; 
		data +="�迵��/30\n";
		data += "�̸���/40\n";
		data += "��ö��/60";
		
		
		System.out.println(data);
		System.out.println("----------------");
		String temp[]=data.split("\n");
		int cnt=Integer.parseInt(temp[0]);
		
		Student98[] studentList=new Student98[cnt];
		int max=0;
		for(int i=0;i<cnt;i++) {
			String info[]=temp[i+1].split("/");
			studentList[i]=new Student98();
			studentList[i].setInfo(info[0],Integer.parseInt(info[1]));
			studentList[i].print();
			if(studentList[i].score>max) {
				max=studentList[i].score;
			}
		}
		System.out.println("----------------------------");

		//����1)data�� �ִ� ������ �߶� st�� ������ ��� 
	
		//����2)�õ� ������ �ٽ� data�� ����	
		int min=max;
		int idx=0;
		for(int i=0;i<cnt;i++) {
			if(studentList[i].score<min) {
				min=studentList[i].score;
				idx=i;
			}
		}
		Student98 tempList[]= studentList;
		studentList =new Student98[cnt-1];
		
		int n=0;
		for(int i=0;i<cnt;i++) {
			if(i!=idx) {
				studentList[n]=tempList[i];
				studentList[n].print();
				n++;
			}
		}
		
	}

}
