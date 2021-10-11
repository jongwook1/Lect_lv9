package lv8;
//기억력 게입 (카드 뒤집기)

import java.util.Random;
import java.util.Vector;

class Node9 {
	int front;
	int back;
	
	
	public Node9(int front, int back) {
		this.front=front;
		this.back=back;
	}
	
}

class MemoryGame9 {
	Random rn =new Random();
	Vector<Node9> nodeList = new Vector<Node9>();
	int data[];
	final int SIZE = 10;



	void setGame() {

		for(int i=0;i<this.SIZE;i++) {
			//ver.1
//		Node9 temp = new Node9(front, back);
//		this.nodeList.add(temp);
			
//			ver.2
			if(i<5) {
		int front=i+1;
		int back=i+1;
		
		//ver.1
//		Node9 temp = new Node9(front, back);
//		this.nodeList.add(temp);
		//ver.2
		this.nodeList.add(new Node9(front,back));
		}else if(i>=5) {
			int front=i-4;
			int back=i-4;
			//ver.1
//			Node9 temp = new Node9(front, back);
//			this.nodeList.add(temp);
			//ver.2
			this.nodeList.add(new Node9(front,back));
		}
			//셔플
			int k=0;
			while(i<1000) {
				int r=rn.nextInt(10);
				Node9 temp=this.nodeList.get(0);
				this.nodeList.set(0, this.nodeList.get(r));
				this.nodeList.set(r, temp);
		
			}
		}

	}



	void run() {
		setGame();
	}

}

public class Ex08 {

	public static void main(String[] args) {
		MemoryGame9 memorygame = new MemoryGame9();
		memorygame.run();

	}

}
