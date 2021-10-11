package lv7;

class Student999 {
	String name;
	int score;

	void print() {
		System.out.println(name + " : " + score);
	}
	
}

public class Ex11_데이터내용잘라서 {

	public static void main(String[] args) {
		String data = "3\n";
		data += "김영희/30\n";
		data += "이만수/40\n";
		data += "이철민/60";

//		System.out.println(data);
		int cnt = 0;
		Student999[] studentList;

		// 문제1)data에 있는 내용을 잘라서 st에 저장후 출력
		String temp[] = data.split("\n");

		int size = Integer.parseInt(temp[0]);

		studentList = new Student999[size];
		for (int i = 0; i < size; i++) {
			studentList[i] = new Student999();
		}

		for (int i = 0; i < size; i++) {
			String info[] = temp[i + 1].split("/");

			studentList[i].name = info[0];
			studentList[i].score = Integer.parseInt(info[1]);

			studentList[i].print();

		}

//		int idx=-1;
//		int size=0;
//		for(int i=0;i<temp.length;i++) {
//			if(i!=0) {
//				String temp2[]=temp[i].split("/");
//				size=temp2.length;
//				for(int j=0;j<temp2.length;j++) {
//					System.out.println(temp2[j]);
//					studentList=new Student999[temp2.length];
//					studentList[j] =new Student999();
//					studentList[j].name=temp2[0];
//					studentList[j].score=Integer.parseInt(temp2[1]);
//					studentList[j].print();
//				}
//			}
//		}
//		

//		for(int i=0;i<size;i++) {
//			
//			studentList[i].print();
//		}

		// 문제2)꼴등 삭제후 다시 data에 저장
		int min = 100;
		int minIdx = -1;

		for (int i = 0; i < size; i++) {
			if (min > studentList[i].score) {
				min = studentList[i].score;
				minIdx = i;
			}
		}

		Student999 scoreTemp[] = studentList;
		studentList = new Student999[size - 1];

		int idx = 0;
		for (int i = 0; i < size; i++) {
			if (i != minIdx) {
				studentList[idx] = scoreTemp[i];
				idx++;
			}
		}
		size--;

		for (int i = 0; i < size; i++) {
			studentList[i].print();
		}
		
	}

}
