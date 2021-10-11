package lv7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;


class Subject{
	String title;
	int score;
	
	void setInfo(String title) {
		this.title=title;
	}
	
	void setScore(int score) {
		this.score=score;
	}
	
	void printInfo() {
		System.out.printf("과목명 : %s / 성적 : %d\n",this.title,this.score);
	}
	
	
}


class Student{
	int stuCode;				//동명이인처리위해
	String name;
	
	
	int subCnt;
	Subject subjects[];
	
	void setInfo(String name,int stuCode) {
		this.name=name;
		this.stuCode=stuCode;
	}
	
	void printInfo() {
		System.out.println(this.stuCode+" "+ this.name);
		if(this.subjects!=null) {
			for(int i=0;i<this.subjects.length;i++) {
				this.subjects[i].printInfo();
			}
		}
	}
	
}
class Manager{
	
	FileWriter fw=null;		//일단 예외처리위한 변수만마련
	FileReader fr=null;
	BufferedReader br=null;
	String fileName="cms.txt";
	File file =new File(fileName);
	
	Random rn = new Random();
	Scanner sc=new Scanner(System.in);
	
	int cnt;
	Student students[];
	
	void setDefault() {
		this.cnt = 0;
		this.students=null;
	}
		
	void printMenu() {
		System.out.println("1.가입 2.탈퇴 3.정렬(이름순) 4.출력 5.과목추가 6.성적입력 7.저장 8.로드");
		System.out.println("메뉴: ");
		int sel=sc.nextInt();
		if(sel>0&&sel<=8) {
			runtMenu(sel);
		}
	}
	
	void runtMenu(int select) {
		if(select==1) {
			joinStudent();
		}
		else if(select==2) {
			removeStudent();
		}
		else if(select==3) {
			alignStudents();
		}
		else if(select==4) {
			printStudents();
		}
		else if(select==5) {
			addSubject();
		}
		else if(select==6) {
			addScore();
		}
		else if(select==7) {
			save();
		}
		else if(select==8) {
			load();
		}
	}
	
	void alignStudents(){
		for(int i=0;i<this.cnt;i++) {
			String first=this.students[i].name;
			int idx=i;
			
			for(int j=i;j<this.cnt;j++) {
				if(first.compareTo(this.students[j].name)>0) {
					first =this.students[j].name;
					idx=j;
				}
			}
			Student temp =this.students[i];
			this.students[i]=this.students[idx];
			this.students[idx]=temp;
		}
	}
	
	
	void joinStudent() {
		System.out.print("학생명: ");
		String name=sc.next();
		
		Student temp[]=this.students;
		this.students=new Student[this.cnt+1];
		
		if(this.cnt>0) {
			for(int i=0;i<this.cnt;i++) {
				this.students[i]=temp[i];
			}
		}
		this.students[this.cnt]=new Student();		//객체부터생성
		this.students[this.cnt].setInfo(name, ranCode());	
		this.cnt++;		
	}
	
	int studentIndex() {
		int idx=-1;
		System.out.print("학생명: ");
		String name=sc.next();
		
		for(int i=0;i<this.cnt;i++) {
			if(name.equals(this.students[i].name)) {
				System.out.println(this.students[i].stuCode);
			}
		}
		System.out.println("학번입력: ");
		int code =sc.nextInt();
		
		
		for(int i=0;i<this.cnt;i++) {
			if(this.students[i].stuCode==code) {
				idx=i;
			}
		}
		return idx;
	}
	
	void removeStudent() {
		int delIdx=studentIndex();
		
		if(delIdx !=-1) {
		Student temp[]=this.students;
		this.students=new Student[this.cnt-1];
		
		int idx=0;
		for(int i=0;i<this.cnt;i++) {
			if(i!=delIdx) {
				this.students[idx]=temp[i];
				idx++;
			}
		}
		System.out.println("탈퇴완료");
		this.cnt --;		
		}		
	}
	
	void addScore(){
		int stuIdx=studentIndex();
		if(stuIdx !=-1) {
			for(int i=0;i<this.students[stuIdx].subCnt;i++) {
				System.out.println(i+1 +") ");
				this.students[stuIdx].subjects[i].printInfo();
			}			
//			System.out.println("성적입력할 과목명: ");
//			sc.nextLine();
//			String title=sc.nextLine();
			System.out.print("선택: ");
			int num=sc.nextInt()-1;
			
			System.out.print("성적: ");
			int score=sc.nextInt();
//			this.students[stuIdx].subjects[num].score=score;			//  X
			this.students[stuIdx].subjects[num].setScore(score);		//  O
		}
		
	}
	
	void addSubject() {
		int stuIdx =studentIndex();
		
		if(stuIdx!=-1) {
			int cnt=this.students[stuIdx].subCnt;		//가독성을 위해 this.students[stuIdx].subCnt담을 cnt변수
			
			sc.nextLine();				//  그이전에 남아있던 "\n" 없애는 공회전용 이걸안하면 아래 넥스트라인에서 먹혀버림
			System.out.print("과목명: ");
			String title=sc.nextLine();
			//next()	- " " 기준으로 끊어옴
			//nextLine() - "\n" 기준으로 끊어옴
			
			int check=1;
			for(int i=0;i<cnt;i++) {
				if(title.equals(this.students[stuIdx].subjects[i].title)) {
					check=-1;
				}
			}
			if(check==1) {
				Subject temp[]=this.students[stuIdx].subjects;
				this.students[stuIdx].subjects=new Subject[cnt+1];
			if(this.students[stuIdx].subCnt>0) {
				for(int i=0;i<cnt;i++) {
					this.students[stuIdx].subjects[i]=temp[i];
					}
			}
			this.students[stuIdx].subjects[cnt]=new Subject();
			this.students[stuIdx].subjects[cnt].setInfo(title);
			this.students[stuIdx].subCnt ++;						//이땐 가독성을위한 cnt변수 쓰면안됌
			}
			
		}
	}
	
	
	int ranCode() { // 1000~9999
		int rCode = rn.nextInt(8999) + 1000;
		while (true) {
			int check = 1;
			for (int i = 0; i < this.cnt; i++) {
				if (this.students[i].stuCode == rCode) {
					check = -1;
				}

			}
			if (check == 1)
				break;
		}
		return rCode;
	}
	
	void save() {
//		1111/홍길동/2/title1/score1/title2/score2
//		1112/홍길동/2/title1/score1
		
		String data="";
		
		for(int i=0;i<this.cnt;i++) {
			String info="";
			info+=this.students[i].stuCode+ "/";
			info+=this.students[i].name+ "/";
			info+=this.students[i].subCnt+ "/";
			for(int j=0;j<this.students[i].subCnt;j++) {
				info+=this.students[i].subjects[j].title+"/";
				info+=this.students[i].subjects[j].score;
				if(j!=this.students[i].subCnt-1)
					info+="/";
			}
			data+=info;
			if(i!=this.cnt-1)
				data+="\n";
		}
		try {
			fw=new FileWriter(file);
			fw.write(data);
			fw.close();
			System.out.println("저장완료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("저장실패");
		}
	}
	
	void load() {
		setDefault();
		String data="";
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			String info=br.readLine();
			while(info!=null) {				//한줄씩 불러오는게 몇줄인지 구하기위해
				data+=info+"\n";
				this.cnt++;
				info=br.readLine();				//한줄씩 불러오므로 
			}			
			
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//읽어온 데이터(문자열)을 ->파싱해서 ->배열에 넣어주기
		
//		1111/홍길동/2/title1/score1/title2/score2
//		1112/홍길동/2/title1/score1
		
		String temp[]=data.split("\n");
		this.students=new Student[this.cnt];		
		
		for(int i=0;i<temp.length;i++) {
			this.students[i]=new Student();
			
			String[] info=temp[i].split("/");
			this.students[i].setInfo(info[1],Integer.parseInt(info[0]));
			this.students[i].subCnt=Integer.parseInt(info[2]);
			this.students[i].subjects=new Subject[this.students[i].subCnt];
			
			int k=0;
			for(int j=0;j<this.students[i].subCnt;j++) {		//j : 0 1
				this.students[i].subjects[j]=new Subject();
				
				this.students[i].subjects[j].setInfo(info[3+j*k]);		// 0 : 3,4 / 1 : 5,6
				this.students[i].subjects[j].setScore(Integer.parseInt(info[3+j*k+1]));
				k+=2;
			}
		}
		
	}
	
	
	void printStudents() {
		for(int i=0;i<this.cnt;i++) {
			this.students[i].printInfo();
		}
	}
	
	void run() {
		while(true) {
			printStudents();
			printMenu();
		}
	}
	
	
	
}

// "1.가입 2.탈퇴 3.정렬(이름순) 4.출력 5.과목추가 6.성적입력 7.저장 8.로드"
public class Ex10_학생관리_답 {

	public static void main(String[] args) {
		Manager cms=new Manager();
		cms.run();

	}

}
