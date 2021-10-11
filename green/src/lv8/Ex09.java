package lv8;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

//1 to 50

class Node1to50z {
	int num;

	public Node1to50z(int num) {
		this.num = num;
	}

	void printNode() {
		System.out.print(num + "\t");
	}
}

class Manager1to50z {
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
//	Node1to50z() node= new Node1to50z();

	int gameNum = 1;

	Vector<Vector<Node1to50z>> nodeList = new Vector<Vector<Node1to50z>>();
//	Vector<Node1to50z> back=new Vector<Node1to50z>();
	int data[][];
	final int SIZE = 5;

	void setGame() {
		nodeList = new Vector<Vector<Node1to50z>>();

		int num = 1;
		for (int i = 0; i < this.SIZE; i++) {
			Vector<Node1to50z> temp = new Vector<Node1to50z>();
			for (int j = 0; j < this.SIZE; j++) {
				temp.add(new Node1to50z(num));
				num++;
			}
			nodeList.add(temp);
		}
	}

//	void setGame2() {
//		back =new Vector<Node1to50z>();
//		
//		int num=26;
//		for(int i=0;i<this.SIZE;i++) {
//			Vector<Node1to50z> temp = new Vector<Node1to50z>();
//			for(int j=0;j<this.SIZE;j++) {
//				temp.add(new Node1to50z(num));
//				num++;
//			}
//			back.add(temp);
//		}
//	}

	void dataInit() {
		data = new int[SIZE][SIZE];
		int num = 26;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				data[i][j] = num;
				System.out.println(num);

				num += 1;

			}
		}
	}

	void dataShuffle() {
		for (int i = 0; i < 3000; i++) {
			int r1 = rn.nextInt(this.SIZE);
			int r2 = rn.nextInt(this.SIZE);
//			Vector<Node1to50z> temp = this.nodeList.get(0);
//			this.nodeList.set(0, this.nodeList.get(r));
//			this.nodeList.set(r, temp);

//			int temp2 = this.data[0][0];
//			this.data[0][0] = this.data[r][r];
//			this.data[r][r] = temp2;
			
			Node1to50z temp=this.nodeList.get(0).get(0);		
			this.nodeList.get(0).set(0, this.nodeList.get(r1).get(r2));
			this.nodeList.get(r1).set(r2, temp);
			
			r1=rn.nextInt(this.SIZE);
			r2=rn.nextInt(this.SIZE);
			
			int tempNum=this.data[0][0];
			this.data[0][0]=this.data[r1][r2];
			this.data[r1][r2]=tempNum;

		}
	}

	void play() {
		System.out.println("제일 작은번호의 인덱스y(1부터시작) 입력해주세요");
		int idx1 = sc.nextInt() - 1;
		System.out.println("제일 작은번호의 인덱스x(1부터시작) 입력해주세요");
		int idx2 = sc.nextInt() - 1;

		if (idx1 >= 0 && idx2 >= 0 && idx1 < this.SIZE && idx2 < this.SIZE) {
			if (this.nodeList.get(idx1).get(idx2).num == this.gameNum) {
//				this.nodeList.set(this.nodeList.get(idx1).get(idx2).num, data[idx1][idx2]);
//				this.data.set(back.get(idx1).get(idx2),);
				
			}
		}

	}

	void run() {
		setGame();
		dataInit();
		dataShuffle();
//		dataInit();
		System.out.println(nodeList.size());
	}
	// ...
}

public class Ex09 {

	public static void main(String[] args) {
		Manager1to50z manager = new Manager1to50z();
		manager.run();

	}

}
