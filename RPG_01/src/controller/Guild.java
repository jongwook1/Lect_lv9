package controller;

import java.util.ArrayList;
import java.util.Random;

import models.Item;
import models.Player;
import models.Shop;
import models.Unit;

public class Guild {
	private final int PARTY_SIZE=4;
	private ArrayList<Unit> guildList=new ArrayList<>();
	private Unit[] partyList;								//메뉴 main-1-4선택시 (파티원교체할때)파티원인 유닛들만 쓸때 쓰임
//	private Item i = Item.Instance;
	private Shop shop=Shop.instance;
	
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
		this.partyList=new Unit[this.PARTY_SIZE];
		int n=0;
		for(int i=0;i<this.guildList.size();i++) {
			if(this.guildList.get(i).isParty()==true) {
				this.partyList[n]=this.guildList.get(i);
				n++;
			}
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
		else if(sel==3) {
			removeUnit();
		}
		else if(sel==4) {
			partyChange();
		}
		else if(sel==5) {
			sort();			//오랜만이라 헷갈렸었음 숙지하기
		}
		else if(sel==0) {
			break;
		}
	}
		
	}


	//오랜만이라 헷갈렸었음 숙지하기
	private void sort() {
		for(int i=0;i<this.guildList.size();i++) {
			String first=this.guildList.get(i).getName();
			int idx=i;
			for(int j=i;j<this.guildList.size();j++) {
				if(first.compareTo(this.guildList.get(j).getName())>0) {
					first=this.guildList.get(j).getName();
					idx=j;
				}
			}
			Unit temp=this.guildList.get(i);
			this.guildList.set(i, this.guildList.get(idx));
			this.guildList.set(idx, temp);
			
		}
		
	}


	private void partyChange() {
		printParty();
		System.out.println("교체할 번호 입력하세요");
		int partyOutN=MainGame.sc.nextInt()-1;		//인덱스로 사용하기위해 -1함
		printNotParty();
		System.out.println("참가할 번호 입력하세요");		//인덱스로 사용하기위해 -1함
		int partyInN=MainGame.sc.nextInt()-1;
		
		this.partyList[partyOutN].setParty(false);
		this.guildList.get(partyInN).setParty(true);
		
		//파티리스트를 교체된인원에 맞춰 새로 만들어줌
		int n=0;
		for(int i=0;i<this.guildList.size();i++) {
			if(this.guildList.get(i).isParty()) {
				this.partyList[n]=this.guildList.get(i);
				n++;
			}
		}
	}
	
	
	
	private void printNotParty() {
		System.out.println("===================[파티원아닌 유닛들]============");
		for(int i=0;i<this.guildList.size();i++) {
			if(!this.guildList.get(i).isParty()) {
			System.out.print("[" + (i + 1) + "번]");			
			System.out.print(" [이름 : " + this.guildList.get(i).getName() + "]");
			System.out.print(" [레벨 : " + this.guildList.get(i).getLevel() + "]");
			System.out.print(" [체력 : " + this.guildList.get(i).getHp());
			System.out.println(" / " + this.guildList.get(i).getMaxHp() + "]");
			System.out.print("[공격력 : " + this.guildList.get(i).getAtt()+ "]");
			System.out.print(" [방어력 : " + this.guildList.get(i).getDef() + "]");
			System.out.println(" [파티중 : " + this.guildList.get(i).isParty() + "]");
			System.out.println("");	
		}
			}
	}

	private void printParty() {
		System.out.println("================ [파티원] ===============");
		for(int i=0;i<this.PARTY_SIZE;i++) {						
			///파티원들만 담아둔 partList에서 !!!!!!!
			System.out.print("[" + (i + 1) + "번]");
			System.out.print(" [이름 : " + partyList[i].getName() + "]");
			System.out.print(" [레벨 : " + partyList[i].getLevel() + "]");
			System.out.print(" [체력 : " + partyList[i].getHp());
			System.out.println(" / " + partyList[i].getMaxHp() + "]");
			System.out.print("[공격력 : " + partyList[i].getAtt()+ "]");
			System.out.print(" [방어력 : " + partyList[i].getDef() + "]");
			System.out.println(" [파티중 : " + guildList.get(i).isParty() + "]");
			System.out.println("");	
		}
		System.out.println("=====================================");
	}


	private void removeUnit() {
		printAllUnitStaus();
		System.out.println("삭제할 길드원 번호선택하세요");
		int sel=MainGame.sc.nextInt()-1;				//1번부터 시작하므로 인덱스로 쓰이기위해 -1해줌
		
		if(this.guildList.get(sel).isParty()) {
			System.out.println("파티중인 멤버는 삭제할수없습니다");
		}else {
			System.out.println("========================");
			System.out.print("[이름: "+this.guildList.get(sel).getName()+"]");
			System.out.println("길드원을 삭제합니다");
			this.guildList.remove(sel);
		}		
	}


	private void addUnit() {
		int rN=MainGame.rn.nextInt(8)+2;
		String name=ranName();
		int hp=rN*11;
		int att=rN+1;
		int def=rN/2+1;
		Unit addUnit=new Unit(name,1,hp,att,def,0);
		this.guildList.add(addUnit);
		Player.money -= 5000;
		System.out.println("=====================");
		System.out.print("[이름 : "+name+"]");
		System.out.print("[레벨 : "+1+"]");
		System.out.print("[체력: "+hp);
		System.out.println(" / "+hp+"]");
		System.out.print("[공격력 : "+att+"]");
		System.out.print("[방어력 : "+def+"]");	
		System.out.println("길드원을 추가합니다");
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


	public void printAllUnitStaus() {
		System.out.println("===========================");
		System.out.println("[골드 : "+Player.money+"]");
		System.out.println("========================");
		System.out.println("=============[길드원]==========");
		for(int i=0;i<this.guildList.size();i++) {
			System.out.print("["+(i+1)+"번]");
			System.out.print("[이름: "+ this.guildList.get(i).getName()+"]");
			System.out.print("[레벨: "+ this.guildList.get(i).getLevel()+"]");
//			if (this.guildList.get(i).getRing() != null) {
//				if (Player.inven.itemList.get(i).getName().equals(shop.itemList.get(i).getName())) {
//					int upStaus = shop.itemList.get(i).getPower();
//					System.out.print("[체력: " + (this.guildList.get(i).getHp() + upStaus));
//				}
//			} else {
//				System.out.print("[체력: " + this.guildList.get(i).getHp());
//			}
			if (this.guildList.get(i).getRing() != null) {
				int upStaus=this.guildList.get(i).getRing().getPower();
				System.out.print("[체력: " + (this.guildList.get(i).getHp()+upStaus));			
				System.out.println(" / "+ (this.guildList.get(i).getMaxHp()+upStaus)+"]");
			} else {
				System.out.print("[체력: " + this.guildList.get(i).getHp());
				System.out.println(" / "+ this.guildList.get(i).getMaxHp()+"]");
			}
			if (this.guildList.get(i).getWeapon() != null) {
				int upStaus=this.guildList.get(i).getWeapon().getPower();
				System.out.print("[공격력: " + (this.guildList.get(i).getAtt()+upStaus)+"]");			
			} else {
				System.out.print("[공격력: " + this.guildList.get(i).getAtt()+"]");
			}
			
//			System.out.print("[공격력: "+ this.guildList.get(i).getAtt()+"]");
			if (this.guildList.get(i).getArmor() != null) {
				int upStaus=this.guildList.get(i).getArmor().getPower();
				System.out.print("[방어력: " + (this.guildList.get(i).getDef()+upStaus)+"]");			
			} else {
				System.out.print("[방어력: " + this.guildList.get(i).getDef()+"]");
			}
//			System.out.print("[방어력: "+ this.guildList.get(i).getDef()+"]");
			System.out.println("[파티중: "+ this.guildList.get(i).isParty()+"]");
			System.out.println("");
		}
	}


	public void printUnitStaus(int sel) {
		this.guildList.get(sel).printStatus();		
	}	

	public void printUnitItem(int sel) {
		this.guildList.get(sel).printEquItem();		
	}


	public Unit getGuildUnit(int num) {
		return guildList.get(num);
	}
	
}
