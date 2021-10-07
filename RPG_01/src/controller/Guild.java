package controller;

import java.util.ArrayList;
import java.util.Random;

import models.Player;
import models.Unit;

public class Guild {
	private final int PARTY_SIZE=4;
	ArrayList<Unit> guildList=new ArrayList<>();
//	Unit[] partyList;
	public void setGuild() {
		Unit temp=new Unit("호랑이", 1, 100, 10, 5, 0);
		this.guildList.add(temp);
		temp = new Unit("강아지", 1, 80, 7, 3, 0);
		this.guildList.add(temp);
		temp = new Unit("사슴", 1, 50, 3, 1, 0);
		this.guildList.add(temp);
		temp = new Unit("두더지", 1, 70, 5, 2, 0);
		this.guildList.add(temp);
		temp = new Unit("돼지", 1, 200, 4, 8, 0);
		this.guildList.add(temp);
		temp = new Unit("사자", 1, 120, 11, 7, 0);
		this.guildList.add(temp);
		for (int i = 0; i < 4; i++) {
			guildList.get(i).setParty(true); 
		}
	}
	
	
	public void guildMenu() {
		while(true) {
		System.out.println("=============== [길드관리] ================");
		System.out.println("[1.길드목록] [2.길드원추가] [3.길드원삭제]");
		System.out.println("[4.파티원교체] [5.정렬]  [0.뒤로가기]");
		int sel=MainGame.sc.nextInt();
		if(sel==1) {
			printAllUnitStaus();
		}
		else if(sel==2) {
			addUnit();
		}
		else if(sel==3) {}
		else if(sel==4) {}
		else if(sel==5) {}
		else if(sel==0) {
			break;
		}
	}
		
	}



	private void addUnit() {
		System.out.println("=====================");
		System.out.print("[이름 : "+ranName());
		System.out.print("[레벨 : "+1+"]");
		int rN=MainGame.rn.nextInt(8)+2;
		int hp=rN*11;
		int att=rN+1;
		int def=rN/2+1;
		
	}


	private String ranName() {
		String name="";
		String[] n1 = { "박", "이", "김", "최", "유", "지", "오"};
		int r=MainGame.rn.nextInt(n1.length);
		name=n1[r];
		String[] n2 = { "명", "기", "종", "민", "재", "석", "광"};
		r=MainGame.rn.nextInt(n2.length);
		name+=n2[r];
		String[] n3 = { "수", "자", "민", "수", "석", "민", "철"};
		r=MainGame.rn.nextInt(n3.length);
		name+=n3[r];
		return name;
	}


	private void printAllUnitStaus() {
		System.out.println("===========================");
		System.out.println("[골드 : "+Player.money+"]");
		System.out.println("========================");
		System.out.println("=============[길드원]==========");
		for(int i=0;i<this.guildList.size();i++) {
			System.out.print("["+i+1+"번]");
			System.out.print("[이름: "+ this.guildList.get(i).getName()+"]");
			System.out.print("[레벨: "+ this.guildList.get(i).getLevel()+"]");
			System.out.print("[체력: "+ this.guildList.get(i).getHp());
			System.out.println(" / "+ this.guildList.get(i).getMaxHp()+"]");
			System.out.print("[공격력: "+ this.guildList.get(i).getAtt()+"]");
			System.out.print("[방어력: "+ this.guildList.get(i).getDef()+"]");
			System.out.println("[파티중: "+ this.guildList.get(i).isParty()+"]");
			System.out.println("");
		}
	}
	
}
