import controller.GameManager;

public class Main {

	public static void main(String[] args) {
		GameManager gamemanager = new GameManager();
		boolean run = true;
		while(true) {
			run=gamemanager.changeStage();
			if(run==false) {
				break;
			}
		}
	}

}
