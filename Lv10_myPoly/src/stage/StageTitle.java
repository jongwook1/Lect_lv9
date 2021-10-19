package stage;

import java.util.Scanner;

import controller.GameManager;

public class StageTitle extends Stage{
	
	@Override
	public boolean update() {
		System.out.println("========TEXT RPG ===========");
		System.out.println("[시작] 을 입력하세요");
		String text = GameManager.sc.next();
		
		if(text.equals("시작")) {
			GameManager.nextStage = "LOBBY";
			return false;
		}else {
		return true;}
	}

	@Override
	public void init() {
		
		
	}

}
