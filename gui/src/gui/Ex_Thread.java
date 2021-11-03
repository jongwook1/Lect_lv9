package gui;

class PlayGame extends Thread{
	boolean play = true;
	
	public void run() {
//		super.run();
		while(play) {
			System.out.println("신나게 게임중>>>>>>");
			try {
				sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class PlayMusic implements Runnable{
	
	boolean play = true;

	@Override
	public void run() {
		while(play) {
			System.out.println("음악이 흐리고...");
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}

public class Ex_Thread {

	public static void main(String[] args) {
		// 스레드 Thread
		// sleep()
		// ㄴ ms 단위로 실행에 딜레이를 줄수 있음
		
//		PlayGame game = new PlayGame();
//		game.start();
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.printf("<%d>\n",i);
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			if(i == 8) {
//				System.out.println("잠깐 멈춰!!!!!!!!!!!!!");
//				game.play = false;
////				game.stop();
//			}
//		}
		
//		PlayMusic music = new PlayMusic();
//		music.run();
		
		Runnable music = new PlayMusic();
		Thread t = new Thread(music);
		t.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("<%d>\n",i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			if(i == 8) {
				System.out.println("잠깐 멈춰!!!!!!!!!!!!!");
				PlayMusic temp =(PlayMusic) music;
				temp.play =false;
				
//				t.stop();
//				m.play = false;

			}
		}
		
	}

}
