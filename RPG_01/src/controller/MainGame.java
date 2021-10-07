package controller;

import java.util.Random;
import java.util.Scanner;

import models.Player;
import models.Shop;

public class MainGame {
	public static Scanner sc=new Scanner(System.in);
	public static Random rn=new Random();	
	
	private Player player=new Player();
	private Shop shop=new Shop();
	private FileData fileData=new FileData();

	public void MainGame() {
		
		
		while(true) {
			System.out.println("=============== [메인메뉴] ================");
			System.out.println("[1.길드관리] [2.상점] [3.인벤토리]");
			System.out.println("[4.저장] [5.로드] [0.종료]");
			
			int sel=sc.nextInt();
			if(sel==1) {
				player.guildMenu();
			}
			else if(sel==2) {}
			else if(sel==3) {}
			else if(sel==4) {}
			else if(sel==5) {}
			else {
				System.out.println("종료");
				break;
				}
			
			
			
			
			
			
		}
		// TODO Auto-generated method stub
		
	}
}
