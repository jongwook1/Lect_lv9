package lv7;
import java.util.Random;

class Card99{
	String shape;
	int number;
	void printCard() {
		System.out.println(shape + " : " + number);
	}
}
class CardPlayer99{
	Card99 card1;
	Card99 card2;
	int money = 1000;
	
//	Card99 card[] =new Card99[1];
//	void inputN() {
//		for(int i=0;i<10;i++) {
//			card[i].number=i+1;
//			System.out.print(card[i].number+" ");
//		}
//	}
//	
//	
//	void run() {
//		
//	for(int i=0;i<card.length;i++) {
//		card[i]=new Card99();
//		card[i].number=i+1;
//		System.out.print(card[i].number+" ");
//	}
//	inputN();
//	}
	
	
}
public class Ex07_test {

	public static void main(String[] args) {
		// 카드게임 
		// 1) 카드모양 : 다이아 , 하트 , 스페이드 , 클로버
		// 2) 숫자      :  1~10
		// 3) 총 40장이 있다. 
		// 4) 2장씩 나눠갖은 다음 , 각 카드의 숫자의 합이 큰쪽이 이긴다. (직접만들기)

//		CardPlayer99 cardPlayer =new CardPlayer99();
//		cardPlayer.run();
		
		Random ran = new Random();
		CardPlayer99 aaa = new CardPlayer99();
		CardPlayer99 bbb = new CardPlayer99();
		String shapeList[] = {"다이아", "하트", "스페이드", "클로버"};
		int size = 40;
		Card99 deck[] = new Card99[size];
		for(int i=0;i<size;i++) {
			deck[i] = new Card99();
			deck[i].shape = shapeList[i % 4];
			deck[i].number = i / 4 +1;
		}
		//셔플
		for(int i =0;i<1000;i++) {
			int r = ran.nextInt(size);
			
			Card99 temp = deck[0];
			deck[0] = deck[r];
			deck[r] = temp;
		}
		
//		for(int i=0;i<size;i++) {
//			System.out.println(deck[i].shape+":"+deck[i].number);
//		}
		
		while(true) {
			aaa.card1 = deck[0];
			aaa.card2 = deck[1];
			bbb.card1 = deck[2];
			bbb.card2 = deck[3];
			System.out.println("aaa 카드");
			aaa.card1.printCard();
			aaa.card2.printCard();
			System.out.println("bbb 카드");
			bbb.card1.printCard();
			bbb.card2.printCard();
			int num1 = aaa.card1.number + aaa.card2.number;
			int num2 = bbb.card1.number + bbb.card2.number;
			
			if(num1 > num2) {
				System.out.println("aaa가 이겼다.");
				break;
			}
			else if(num1 < num2) {
				System.out.println("bbb가 이겼다.");
				break;
			}
			else {
				System.out.println("비겼다.");
				break;
			}
		}

		

		
	}

}
