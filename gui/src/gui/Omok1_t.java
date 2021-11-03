package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


class Nemo1{		//
	int x,y,width,height;
	
	public Nemo1(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}
}

class Board1 extends JPanel{
	
	private Nemo1[][] map = new Nemo1[10][10];

	
	public Board1() {
		setLayout(null);
		setBounds(0, 0, 700, 700);
//		setBackground(Color.black);		
		
		setMap();
	}
	

	
	
	private void setMap() {
		// 그릴 사각형에 대한 정보만 Nemo배열을 활용해서 셋팅
		int x = 700/2-50*10/2;			//10개짜리므로 10
		int y = 700/2-50*10/2;
		for(int i = 0; i <this.map.length; i++) {
			for(int j =0; j<this.map[i].length; j++) {
				this.map[i][j] = new Nemo1(x,y,50,50);
				x +=50 + 3;				
			}
			x = 700/2-50*10/2;
			y += 50 + 3;
		}
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		//네모 그리기
		// paintComponent() 메소드가 가진 인자 Graphics 을 활용
		// drawRect(x,y,width,height) 메소드를 사용
//		g.drawRect(100, 100, 100, 100);
		
		// map 그리기
		for(int i =0;i<this.map.length; i++) {
			for(int j=0; j<this.map[i].length;j++) {
				Nemo1 nemo = this.map[i][j];
				
				g.setColor(Color.pink);				
				g.drawRect(nemo.x, nemo.y, nemo.width, nemo.height);

//				g.fillRect(nemo.x, nemo.y, nemo.width, nemo.height);
				
				g.setColor(Color.black);	
				
				g.drawRoundRect(nemo.x, nemo.y, nemo.width, nemo.height, nemo.width, nemo.height);
			
				
				
			}
		}
//		for(int i=0;i<this.map2.length;i++) {
//			for(int j=0;j<this.map2[i].length;j++) {
//				Nemo1 nemo = this.map2[i][j];
//				g.drawRoundRect(nemo.x, nemo.y, nemo.width, nemo.height, nemo.width, nemo.height);
//			}
//		}
	}
	
}

class OmokGame1 extends JFrame{
	
	private Board1 board = new Board1();
	
	public OmokGame1() {
		super("Omok Game");
		setLayout(null);
		setBounds(50, 50, 700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(board);
		setVisible(true);
		revalidate();
	}
}

public class Omok1_t {

	public static void main(String[] args) {
		
		OmokGame1 og = new OmokGame1();

	}

}
