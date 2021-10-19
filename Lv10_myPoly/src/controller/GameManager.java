package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import stage.Stage;
import stage.StageBattle;
import stage.StageLobby;
import stage.StageTitle;

public class GameManager {
	public static Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	public static String nextStage="";
	String curStage = "";
	Map<String, Stage> stageList = new HashMap<>();
	
	public GameManager() {
		stageList.put("TITLE", new StageTitle());
		stageList.put("BATTLE", new StageBattle());
		stageList.put("LOBBY", new StageLobby());
		
		nextStage = "TITLE";
			
	}
	
	public boolean changeStage() {
		if(curStage.equals(nextStage)) {
			return true;
		}
		
		curStage = nextStage;
		Stage stage = stageList.get(curStage);
		stage.init();
		
		boolean run = true;
		
		while(true) {
			run = stage.update();
			if (run == false) {
				break;
			}
		}
		if(nextStage.equals(""))
			return false;
		else 
			return true;
	}
}
