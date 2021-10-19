package stage;

import java.util.Random;
import java.util.Vector;

import controller.GameManager;
import controller.UnitManager;
import models.Player;
import models.Unit;

public class StageBattle extends Stage{
	public UnitManager unitManager = new UnitManager();
	private Vector<Player> playerList = null;
	private Vector<Unit> monList = null;
	Random rn = new Random();
	private int monDead = 0;
	private int playerDead = 0;

	
	
	
	
	@Override
	public boolean update() {
		boolean run = true;
		int p_index = 0;
		int m_index = 0;
		boolean turn = true;
		
		while (run) {
			if (turn) {
				this.print_character();
				if (p_index < playerList.size()) {
					player_attack(p_index);
					// 용사중 한사람이 공격끝났으므로 다음사람으로 바꺼줌
					p_index += 1;
				} else { // 용사들이 한번씩 다공격해서 공격할 용사 없을때
					turn = !turn;
					p_index = 0;
				}
			} else if (!turn) {
				if(m_index < monList.size()) {
				monster_attack(m_index);
				// 몬스터중 한놈 공격끝났으므로 다음놈으로 바꺼줌
				p_index += 1;
				}
				else {
					turn = !turn;
					m_index = 0;
				}
			}
			check_live();
			if(monDead <= 0 || playerDead <= 0) break;
		}
		GameManager.nextStage = "LOBBY";
		return false;
	}

	private void check_live() {
		int num = 0;
		for(int i=0; i < playerList.size(); i++) {
			if(playerList.get(i).getCurhp() <= 0) {
				num +=1;
			}
		}
		playerDead = playerList.size() - num;
		num = 0;
		for(int i = 0; i < monList.size(); i++) {
			if(monList.get(i).getCurhp() <= 0) {
				num += 1;
			}
		}	
		monDead = monList.size() - num;
	}

	private void monster_attack(int index) {
		Unit m = monList.get(index);
		if(m.getCurhp() <= 0) return;
		while(true) {
			int idx = rn.nextInt(playerList.size());
			if(playerList.get(idx).getCurhp() > 0) {
				m.attack(playerList.get(idx));
				break;
			}
		}
		
	}

	private void player_attack(int p_index) {
		Player p = playerList.get(p_index);
		if(p.getCurhp() <= 0) return;
		System.out.println("=========[메뉴 선택]=========");
		System.out.println("[" + p.getName() + "] [1.어택] [2.스킬]" );
		int sel = GameManager.sc.nextInt();
		if(sel == 1) {
			while(true) {
				int idx = rn.nextInt(monList.size());
				
				if(monList.get(idx).getCurhp() > 0) {
					p.attack(monList.get(idx));
					break;
				}
			}
		}else if(sel ==2) {}
				
		
	}

	@Override
	public void init() {
		unitManager.mon_list.clear();
		unitManager.monster_rand_set(4);
		playerList = null;
		playerList = unitManager.player_list;
		monList = null;
		monList = unitManager.mon_list;
		monDead = monList.size();
		playerDead = playerList.size();
	}
	
	public void print_character() {
		System.out.println("========[BATTLE]========");
		System.out.println("========[PLAYER]========");
		for(int i=0; i<playerList.size(); i++) {
			playerList.get(i).printData();
		}
		System.out.println("======[MONSTER]======");
		for(int i = 0; i < monList.size(); i++) {
			monList.get(i).printData();
		}
	}
	

}
