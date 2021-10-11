package lv4;

public class Ex29_other {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		Random ran = new Random();
		final int SIZE = 7;
		final int PLAYER = 2;
		final int BALL = 3;
		final int GOAL = 7;
		final int WALL = 9;
		int[][] map = new int[SIZE][SIZE];
		int wallCount = 0;
		int pY = 0;
		int pX = 0;
		int ballY = 0;
		int ballX = 0;
		int goalY = 0;
		int goalX = 0;
		
		
		for(int i=0; i<SIZE;i++) {
			for(int j=0; j<SIZE; j++) {
				if(map[i][j]==PLAYER) {			//¸ÊÁÂÇ¥¿¡ ÇÃ·¹ÀÌ¾î°¡ ÀÖÀ¸¸é
					System.out.println("¿Ê");
				}
			}
		}

	}

}
