package stage;

import java.util.ArrayList;

import controller.UnitManager;
import models.Player;
import models.Unit;

public class StageBattle extends Stage{
	public UnitManager unitManager = new UnitManager();
	private ArrayList<Player> playerList =new ArrayList<>();
	private ArrayList<Unit> monList = new ArrayList<>();
	@Override
	public boolean update() {
		System.out.println("========[BATTLE]========");
		System.out.println("========[PLAYER]========");
		return false;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

}
