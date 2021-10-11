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
public class Ex11_데이터내용잘라서_정답 {

	public static void main(String[] args) {
		String data = "3\n"; 
		data +="김영희/30\n";
		data += "이만수/40\n";
		data += "이철민/60";
		
		
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

		//문제1)data에 있는 내용을 잘라서 st에 저장후 출력 
	
		//문제2)꼴등 삭제후 다시 data에 저장	
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
