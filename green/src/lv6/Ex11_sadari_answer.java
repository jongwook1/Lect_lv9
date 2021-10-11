package lv6;

import java.util.Random;
import java.util.Scanner;

class Sadari1{
	int size;
	int steps=10;
	int ladder[][];
	String items[];
	
	String front[]= {"�ſ�","ġ��ġ��","��ŷ��","��������","ŭŭ��","���õ�"};
	String back[]= {"���","������","����","�Ľ�Ÿ","�ܹ���","��â","�߹�","ġŲ"};
}

public class Ex11_sadari_answer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		
		Sadari1 game=new Sadari1();
		
		System.out.print("������ �ο���:");
		game.size=sc.nextInt();
		
		//setting
		game.ladder =new int[game.steps][game.size];
		for(int y=0;y<game.ladder.length;y++) {
			for(int i=0;i<3;i++) {				
				int r= rn.nextInt(game.size-1);//�ѽ��̶� �ǳ�����
				if(game.ladder[y][r]==0&&game.ladder[y][r+1]==0) {
					game.ladder[y][r]=1;
					game.ladder[y][r+1]=2;
				}
			}
		}
		
		
		game.items = new String[game.size];
		for(int i=0;i<game.size;i++) {
			int r1=rn.nextInt(game.front.length);
			int r2=rn.nextInt(game.back.length);
			game.items[i]=game.front[r1]+game.back[r2];
		}
		
		while(true) {
			for(int y=0;y<game.ladder.length;y++) {
				for(int x=0;x<game.ladder[y].length;x++) {
					if(game.ladder[y][x]==1) {
						System.out.print(" ����");
					}else if(game.ladder[y][x]==2) {
						System.out.print("���� ");
					}else {
						System.out.print(" �� ");
					}					
				}
				System.out.println();
				
			}
			for(int i=0;i<game.items.length;i++) {
				System.out.printf("%c) %s\n",(char)'a'+i,game.items[i]);
			}
			break;
		}
		
	}

}
