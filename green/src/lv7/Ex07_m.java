package lv7;

import java.util.Random;

class Card98 {
	String shape;
	int number;

	void printCard() {
		System.out.println(shape + " : " + number);
	}
}

class CardPlayer98 {
	Card98 card1;
	Card98 card2;
	int money = 1000; // �̺��� �����ص���

}

class CardGame98 {
	Random ran = new Random();
	Card98 cards[] = new Card98[40];
	String shapeList[] = { "���̾�", "��Ʈ", "�����̵�", "Ŭ�ι�" };
	int cnt=40;
	int winA=0;
	int winB=0;
	
	void input() {
		for (int i = 0; i < 40; i++) {
			cards[i] = new Card98();
			cards[i].shape = shapeList[i % 4];
			cards[i].number = i / 4 + 1;
		}
	}

	void suffle() {
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(40);
			Card98 temp = cards[0];
			cards[0] = cards[r];
			cards[r] = temp;
		}
	}

	void setGame() {
//		int cnt=0;
//		while(true) {
		CardPlayer98 a = new CardPlayer98();
		CardPlayer98 b = new CardPlayer98();
//		for(int i=0;i<40;i++) {
//			boolean check=true;
//			int rN=ran.nextInt(40);
//			for(int j=0;j<40;j++) {
//				if(cards[i]==rN) {
//					check=false;
//				}
//			}
//		if(check==true) {
//			cards[i]=rN;
//		}
//		}
		a.card1 = cards[0];
		a.card2 = cards[1];
		b.card1 = cards[2];
		b.card2 = cards[3];
		System.out.println("aī��");
		a.card1.printCard();
		a.card2.printCard();
		System.out.println("bī��");
		b.card1.printCard();
		b.card2.printCard();
		int num1 = a.card1.number + a.card2.number;
		int num2 = b.card1.number + b.card2.number;
		if (num1 > num2) {
			System.out.println("a��");
			winA++;
		} else if (num1 < num2) {
			System.out.println("b��");
			winB++;
		} else {
			System.out.println("����");
		}
//		cnt+=4;
//		if(cnt==40) {
//			break;
//		}
//		}
	}

	void winP() {
		if(this.winA>this.winB) {
			System.out.println("a�����¸�");
		}else if(this.winA<this.winB) {
			System.out.println("b�����¸�");
		}else {
			System.out.println("���� ���");
		}
	}
	
	
	void run() {		
		while(true) {
			input();
			suffle();
		setGame();
		this.cnt-=4;
		if(this.cnt==0) {
			winP();
			break;
		}
		}
	}

}

public class Ex07_m {

	public static void main(String[] args) {
		// ī�����
		// 1) ī���� : ���̾� , ��Ʈ , �����̵� , Ŭ�ι�
		// 2) ���� : 1~10
		// 3) �� 40���� �ִ�.
		// 4) 2�徿 �������� ���� , �� ī���� ������ ���� ū���� �̱��. (���������)

		CardGame98 cardgame98 = new CardGame98();
		cardgame98.run();
	
		
	}

}
