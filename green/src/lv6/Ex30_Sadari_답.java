package lv6;

import java.util.Random;
import java.util.Scanner;

//사다리 게임
class Sadari2{
	Scanner sc=new Scanner(System.in);
	Random ran=new Random();
	
	int size;
	int steps=10;
	int ladder[][];
	String items[];
	
	String front[]= {"달달","베스트","쇼킹","지옥의","푸짐한","잊을수없는"};
	String back[]= {"해장국","떡볶이","피자","파스타","햄버거","국밥","샌드위치","치킨"};
	
	//인원수 정하기
	void Join() {
		System.out.println("참여한 인원수");
		this.size=sc.nextInt();
	}
	
	
	//사다리 만들기
	void MakeS() {
		this.ladder=new int[this.steps][this.size];
		for(int y=0;y<this.ladder.length;y++) {
			for(int i=0;i<3;i++) {
				int r=ran.nextInt(this.size-1);
				if(this.ladder[y][r]==0&&this.ladder[y][r+1]==0) {
					this.ladder[y][r]=1;
					this.ladder[y][r+1]=2;
				}
			}
		}
		
	}
	//메뉴넣기
	void MakeMenu() {
		this.items=new String[this.size];
		for(int i=0;i<this.size;i++) {
			int r1=ran.nextInt(this.front.length);
			int r2=ran.nextInt(this.back.length);
			this.items[i]=this.front[r1]+this.back[r2];
		}
	}
	//사다리 출력
	void printSadari() {
		for(int y=0;y<this.ladder.length;y++) {
			for(int x=0;x<this.ladder[y].length;x++) {
				if(this.ladder[y][x]==1) {
					System.out.print(" ├─");
				}else if(this.ladder[y][x]==2) {
					System.out.print("─┤ ");
				}else {
					System.out.print(" │ ");
				}					
			}
			System.out.println();			
		}
	}
	//메뉴 출력
	boolean printMenu() {
		for(int i=0;i<this.items.length;i++) {
			System.out.printf("%c) %s\n",(char)'a'+i,this.items[i]);
		}
		return true;
	}
	
	
	void run() {
		boolean isRun=true;
		while(true) {
			
			if(printMenu()) break;
		}
	}
	
}

public class Ex30_Sadari_답 {

	public static void main(String[] args) {
		Sadari2 sa=new Sadari2();
		sa.run();

	}

}
