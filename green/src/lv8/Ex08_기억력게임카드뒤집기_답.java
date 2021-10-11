package lv8;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

//���� ���� (ī�� ������)

class Node{
	private int number;
	private boolean fliped;	
	
	public Node(int number) {
		this.number=number;		
	}	
	
	public int getNumber() {
		return this.number;
	}
	
	public boolean getFliped() {
		return this.fliped=fliped;
	}
	
	public void setFlipde() {		//�Ҹ���Ÿ���̶� ȣ��Ǹ� ������ Ʈ��ε�������
		this.fliped=true;
	}
	
	
}

class MemoryGame{
	Random rn=new Random();
	Scanner sc=new Scanner(System.in);
	
	private int score;
	Vector<Node> nodeList = new Vector<Node>();
	
	final private int  SIZE = 10;
	
	void setCards() {
		this.score=100;
		int n=1;
		for(int i=0;i<this.SIZE;i++) {
			//ver.1
//			Node9 temp = new Node9(front, back);
//			this.nodeList.add(temp);
			//ver.2
//			this.nodeList.add(new Node9(front,back));
//			}else if(i>=5) {
//				int front=i-4;
//				int back=i-4;
				//ver.1
//				Node9 temp = new Node9(front, back);
//				this.nodeList.add(temp);
				//ver.2
//				this.nodeList.add(new Node9(front,back));
//			}
			this.nodeList.add(new Node(n));
			if(i%2==1)
				n++;	
		
		}
		shuffleCards();
		
	}
	
	private void shuffleCards() {
		for(int i=0;i<3000;i++) {
			int r=rn.nextInt(this.SIZE);
			
			Node temp=this.nodeList.get(0);
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
		System.out.printf("GAME CLEAR!! score : %d��",this.score);
		
	}

	private void select() {
		while(true) {
		System.out.print("idx1: ");
		int idx1=sc.nextInt();
		System.out.print("idx2: ");
		int idx2=sc.nextInt();
		
		if(idx1==idx2||this.nodeList.get(idx1).getFliped()) {		//fliped Ʈ���϶�
			System.out.println("ī�弱���� �ٽ� ���ּ���");
			continue;		
		}
		
		if(this.nodeList.get(idx1).getNumber() != this.nodeList.get(idx2).getNumber()) {
			System.out.println("��");
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
				System.out.print("�� ");
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

public class Ex08_���°���ī�������_�� {

	public static void main(String[] args) {
		MemoryGame game=new MemoryGame();
		game.run();

	}

}
