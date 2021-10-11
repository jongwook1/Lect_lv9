package lv7;
class Student9999{
	String name;
	int score;
	void print() {
		System.out.println(name + " : " + score);
	}

}
public class Ex11_데이터내용잘라서_Review_ing {

	public static void main(String[] args) {
		String data = "3\n"; 
		data +="김영희/30\n";
		data += "이만수/40\n";
		data += "이철민/60";
		
		
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
		
		//문제1)data에 있는 내용을 잘라서 studentList에 저장후 출력 
	
		//문제2)꼴등 삭제후 다시 data에 저장	


	}

}
