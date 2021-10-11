package lv7;
import java.util.Random;
import java.util.Scanner;
class Card{
	String shape;
	int number;
	boolean fliped;	//false
	
//	String getShape() {
//		return this.shape;
//	}
//	
//	void setShape(String shape) {
//		this.shape=shape;
//	}
	
	void setCard(String shape,int number) {
		this.shape=shape;		
		this.number=number;
	}
	
	void printCard() {
		System.out.println(shape + " : " + number);
	}
}
class CardPlayer{
	Card card[]=new Card[2];	
	int money = 1000;			//�̺��� �����ص���		
}
// ī����� 
// 1) ī���� : ���̾� , ��Ʈ , �����̵� , Ŭ�ι�
// 2) ����      :  1~10
// 3) �� 40���� �ִ�. 
// 4) 2�徿 �������� ���� , �� ī���� ������ ���� ū���� �̱��. (���������)

class CardGame{
	Scanner sc=new Scanner(System.in);
	Random rn=new Random();
	
	Card cards[]=new Card[40];	//
//	int check[]=new int [40]	//{1,0}
	CardPlayer cardPlayers[];
	int players;
	int turn;
	int total[];
	int winCnt[];
	
	String shapeList[]= { "���̾�", "��Ʈ", "�����̵�", "Ŭ�ι�" };
	
	void setGame() {
		System.out.print("�����ο�: ");
		int num=sc.nextInt();
		
		if(num>1) {
			this.players=num;
			this.cardPlayers=new CardPlayer[this.players];		//{null,null,.....}
			for(int i=0;i<this.cardPlayers.length;i++) {
				this.cardPlayers[i]=new CardPlayer();		//�� Ŭ������ �ʱ�ȭ(�� ��ü����)
			}
			this.total=new int[this.players];
			this.winCnt=new int[this.players];
		}
		this.turn=1;			//1~this.player
	}
	
	
	void setCards() {
		int shape=0;		//0 1 2 3
		for(int i=0;i<this.cards.length;i++) {	//i:0~39
			this.cards[i]=new Card();
			this.cards[i].setCard(shapeList[shape], i%10+1);
			if(i%10 ==9)
				shape++;
		}
		shuffle();
	}
	
	void shuffle() {
		for(int i=0;i<1000;i++) {
			int r=rn.nextInt(this.cards.length);
			Card temp=this.cards[0];					//�ּұ�ȯ
			this.cards[0]=this.cards[r];
			this.cards[r]=temp;
		}
	}
	
	
	void printWholeCards() {
		for(int i=0;i<this.cards.length;i++) {
			System.out.printf("%s %d\n",this.cards[i].shape,this.cards[i].number);
		}
	}
	
	void flipCards() { // ���� ����
		// �������� �������� ���� ī�带 2�徿 �̱�
		
		this.cardPlayers[turn - 1].card = new Card[2];
		for(int i=0;i<2;i++) {
			this.cardPlayers[turn-1].card[i]=new Card();
		}
		this.total[turn-1]=0;
		
		int n = 0;
		while (n < 2) {
			int r = rn.nextInt(this.cards.length);
			if (this.cards[r].fliped)			//true �� ����ī���̹Ƿ� continue�ؼ� �ٽû̱�
				continue;
			this.cards[r].fliped = true;

			this.cardPlayers[turn - 1].card[n].setCard(this.cards[r].shape, this.cards[r].number);
			this.cardPlayers[turn - 1].card[n].printCard();
			this.total[turn-1]+= this.cards[r].number;
			
			n++;
		}
		System.out.println("-----------------");
		if(this.turn==this.players) {
			checkWin();
		}
		//turn �� players�� ������ 1 �ƴϸ� turn++;
		this.turn=this.turn==this.players ? 1 : ++this.turn;

	}
	
	boolean end() {
		// ���� ī��(fliped == false) < �����ο�*2(���徿�����Ƿ�)
		if (this.turn == 1) {
			int check = 0;
			for (int i = 0; i < this.cards.length; i++) {
				if (this.cards[i].fliped)
					check++;
			}

			if (check > this.players * 2) {
				return true;
			}
		}
		return false;

	}
	
	void checkWin() {
		int max=0;
	
		for(int i=0;i<this.total.length;i++) {
			if(max<this.total[i]) {
				max=this.total[i];
				
			}
		}
		for(int i=0;i<this.total.length;i++) {
			if(this.total[i]==max) {				
				System.out.printf("p%d win!\n",i+1);
				this.winCnt[i] ++;
			}
		}	
		System.out.println("-----------------");
	}
	void finalWin() {
		int max=0;
		for(int i=0;i<this.winCnt.length;i++) {
			if(max<this.winCnt[i]) max=this.winCnt[i];
		}
		
		for(int i=0;i<this.winCnt.length;i++) {
			if(max==this.winCnt[i] ) {
				System.out.printf("p%d ���̳� ��!!\n",i+1);
			}
		}		
		
	}
	
	void run() {
		setGame();
		setCards();
//		printWholeCards();
		//ī�� �ѹ�(40��)�� ��� ������ ������
		while(!end()) {		//1round�� ȸ��		//end()==false
			//turn ��° �÷��̾ ��������->ī��2�徿 ����
			flipCards();
			
			
		}
		// ���� ���
		finalWin();
	}
	
}


public class Ex07_answer {

	public static void main(String[] args) {

		
		CardGame game=new CardGame();
		game.run();
		
	}

}
