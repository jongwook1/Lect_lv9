package lv8;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

//1 to 50

class Node1to50 {
	private int num;

	
	public Node1to50(int num){
		this.num=num;
	}
	
	public void printNode() {
		System.out.print(num + "\t");
	}
	
	public int getNum() {
		return this.num;
	}
	
	public void setNum(int num) {
		this.num=num;
	}
	
}

class Manager1to50 {	
	Random rn=new Random();
	Scanner sc=new Scanner(System.in);
	
//	Vector<Vector<Node1to50>> nodeList= new Vector<Vector<Node1to50>>();
	Vector<Vector<Node1to50>> nodeList=null;
	private int data[][];
	final int SIZE = 5;
	
	int gameNum=1;
	
	void setGame() {
		nodeList=new Vector<Vector<Node1to50>>();		//front ?? ??ü
		data =new int[this.SIZE][this.SIZE];			// back ????Ÿ
		
		int n=1;
		for(int i=0;i<this.SIZE;i++) {
			Vector<Node1to50> temp=new Vector<Node1to50>();
			for(int j=0;j<this.SIZE;j++) {
				temp.add(new Node1to50(n));
				data[i][j]=n+this.SIZE*this.SIZE;
				n++;
			}
			nodeList.add(temp);
		}	
		shuffle();
	}
	
	private void shuffle() {
		for(int i=0;i<3000;i++) {
			int r1=rn.nextInt(this.SIZE);
			int r2=rn.nextInt(this.SIZE);
			
			Node1to50 temp=this.nodeList.get(0).get(0);		
			this.nodeList.get(0).set(0, this.nodeList.get(r1).get(r2));
			this.nodeList.get(r1).set(r2, temp);
			
			r1=rn.nextInt(this.SIZE);
			r2=rn.nextInt(this.SIZE);
			
			int tempNum=this.data[0][0];
			this.data[0][0]=this.data[r1][r2];
			this.data[r1][r2]=tempNum;
			
		}
		
	}

//	void dataInit() {
//		data = new int[SIZE][SIZE];
//		int num = 26;
//		for(int i = 0;  i < SIZE; i++) {
//			for(int j = 0; j < SIZE; j++) {
//				data[i][j] = num;
//				//System.out.println(num);
//				num += 1;
//			}
//		}
//	}

	public void run() {
		setGame();
		while(!end()) {
			printMap();			
			select();
		}
		printResult();
		
	}

	private void printResult() {
		System.out.println("GAME CLEAR!!");
		
	}

	private boolean end() {
		if(this.gameNum>this.SIZE*this.SIZE*2)
			return true;
		return false;
	}

	private void select() {
		while (true) {
			System.out.println("Y: ");
			int y = sc.nextInt();
			System.out.println("X: ");
			int x = sc.nextInt();
			if (y < 0 || y >= this.SIZE || x < 0 || x >= this.SIZE)
				continue;

			if (this.gameNum == nodeList.get(y).get(x).getNum()) {
				flipNode(y, x);
			}
			break;
		}
	}
	
	private void flipNode(int y,int x) {
		int num=this.data[y][x];
		this.nodeList.get(y).get(x).setNum(num);			//?̺κ? ?ߺ???
		this.data[y][x]=0;
		this.gameNum++;
	}
	

	private void printMap() {
		System.out.println("front > >");
		for(int i=0;i<this.nodeList.size();i++) {
			for(int j=0;j<this.nodeList.get(i).size();j++) {
				this.nodeList.get(i).get(j).printNode();
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("back >>");
		for(int i=0;i<this.data.length;i++) {
			for(int j=0;j<this.data[i].length;j++) {
				System.out.print(this.data[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
public class Ex09_?? {

	public static void main(String[] args) {
		Manager1to50 game= new Manager1to50();
		game.run();

	}

}
