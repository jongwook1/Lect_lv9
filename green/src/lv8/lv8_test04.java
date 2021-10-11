package lv8;
import java.util.ArrayList;
//시작:	13:00
//종료:	13:35
//소요: 	00:35
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
//시작: 14:10
//종료: 14:50
//소요: 00:40
class Node99{
	private int number;
	private boolean fliped;	
	
	public Node99(int number) {
		this.number=number;		
	}	
	
	public int getNumber() {
		return this.number;
	}
	
	public boolean getFliped() {
		return this.fliped=fliped;
	}
	
	public void setFlipde() {		//불리언타입이라 호출되면 무조건 트루로뒤집히게
		this.fliped=true;
	}
	
	
}

class MemoryGame99{
	Random rn=new Random();
	Scanner sc=new Scanner(System.in);
	
	private int score;
	private final int  SIZE = 10;
	
	Vector<Node99> nodeList = new Vector<Node99>();
	
	void setCards() {
		this.score=100;
		int n=1;
		for(int i=0;i<this.SIZE;i++) {
			//ver.1
//			Node99 temp = new Node99(front, back);
//			this.nodeList.add(temp);
			//ver.2
//			this.nodeList.add(new Node99(front,back));
//			}else if(i>=5) {
//				int front=i-4;
//				int back=i-4;
				//ver.1
//				Node9 temp = new Node9(front, back);
//				this.nodeList.add(temp);
				//ver.2
//				this.nodeList.add(new Node9(front,back));
//			}
			this.nodeList.add(new Node99(n));
			if(i%2==1)
				n++;	
		
		}
		shuffleCards();
		
	}
	
	private void shuffleCards() {
		for(int i=0;i<3000;i++) {
			int r=rn.nextInt(this.SIZE);
			
			Node99 temp=this.nodeList.get(0);
			this.nodeList.set(0, this.nodeList.get(r));
			this.nodeList.set(r, temp);
		}
		
	}

	public void run() {
		setCards();
		while(!end()) {
			printCards();
			select();
		}
		printResult();
	}
	
	private void printResult() {
		System.out.printf("GAME CLEAR!! score : %d점",this.score);
		
	}

	private void select() {
		while(true) {
		System.out.print("idx1: ");
		int idx1=sc.nextInt();
		System.out.print("idx2: ");
		int idx2=sc.nextInt();
		
		if(idx1==idx2||this.nodeList.get(idx1).getFliped()) {		//fliped 트루일때
			System.out.println("카드선택을 다시 해주세요");
			continue;		
		}
		
		if(this.nodeList.get(idx1).getNumber() != this.nodeList.get(idx2).getNumber()) {
			System.out.println("땡");
			if(this.score>0)
				this.score-=5;
			continue;
		}
		flipCards(idx1,idx2);
		break;
		}
	}

	private void flipCards(int idx1, int idx2) {
		this.nodeList.get(idx1).setFlipde();
		this.nodeList.get(idx2).setFlipde();
		
	}

	private void printCards() {
		for(int i=0;i<nodeList.size();i++) {
			if(this.nodeList.get(i).getFliped()) {
				System.out.print(this.nodeList.get(i).getNumber()+" ");
			}
			else {
				System.out.print("■ ");
			}
		}
		System.out.println();
		
	}
 
	private boolean end() {
		int check=0;
		for(int i=0;i<nodeList.size();i++) {
			if(!nodeList.get(i).getFliped()) {
				check++;
			}
		}
		if(check==0)
			return true;
		return false;
	}
	
	
	
}

public class lv8_test04 {

	public static void main(String[] args) {
		MemoryGame99 game=new MemoryGame99();
		game.run();

	}

}
