package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.w3c.dom.events.MouseEvent;

class AlertWin99 extends JFrame{
	private JLabel text = new JLabel();
	
	public AlertWin99(String text) {
		super("Game Clear!");
		setLayout(null);
		setBounds(100, 100, 300, 200);
		setVisible(true);
		
		this.text.setBounds(0,0,300,200);
		this.text.setText(text);
		this.text.setHorizontalAlignment(JLabel.CENTER);		//수평
		this.text.setVerticalAlignment(JLabel.CENTER);			//수직
		add(this.text);
	}
}


class Nemo{		//
	boolean click;
	int id;
	int x,y,width,height;
	
	public Nemo(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}
}

class Board extends JPanel implements MouseListener,ActionListener,KeyListener{
	
	private Nemo[][] map = new Nemo[10][10];
	private int turn = 1;
	private int win;
	
	private boolean play;
	private JButton reset = new JButton();
	
	/*repaint;
//	int xx;
	*/
	
	public Board() {
		setLayout(null);
		setBounds(0, 0, 700, 700);
//		setBackground(Color.black);		
		
		addMouseListener(this);	//패널에 마우스리스너를 달았음
		setMap();
		setResetButton();
		
		setFocusable(true);		// 패널에 키 초점 on
		addKeyListener(this);
	}
	
	
	
	private void setResetButton() {
		this.reset.setBounds(10, 10, 100, 50);
		this.reset.setText("RESET");
		this.reset.addActionListener(this);
		add(this.reset);		
	}
	
	private void setMap() {
		// 그릴 사각형에 대한 정보만 Nemo배열을 활용해서 셋팅
		int x = 700/2-50*10/2;			//10개짜리므로 10
		int y = 700/2-50*10/2;
		for(int i = 0; i <this.map.length; i++) {
			for(int j =0; j<this.map[i].length; j++) {
				this.map[i][j] = new Nemo(x,y,50,50);
				x +=50 ;				
			}
			x = 700/2-50*10/2;
			y += 50 ;
		}
		
	}





	
	@Override
	protected void paintComponent(Graphics g) {		//쓰래드 (혼자돌고있는놈)
		super.paintComponent(g);		//전체 그려진 컴포넌트를 지우는 역할
		//네모 그리기
		// paintComponent() 메소드가 가진 인자 Graphics 을 활용
		// drawRect(x,y,width,height) 메소드를 사용
//		g.drawRect(100, 100, 100, 100);

		/*repaint;
//		g.setColor(Color.red);
//		g.drawRect(this.xx, 10, 100, 100);
//		this.xx++;
		*/
		
		// map line
		for(int i=0; i<this.map.length; i++) {
			for(int j =0;j<this.map.length;j++) {
				Nemo nemo = this.map[i][j];
				Nemo temp = new Nemo(nemo.x-nemo.width/2, nemo.y-nemo.height/2, nemo.width, nemo.height);
				g.setColor(Color.black);
				g.drawRect(temp.x, temp.y, temp.width, temp.height);
				
				//끝(열과 행) 추가
				//행추가
				if(i == this.map.length-1)
					g.drawRect(temp.x, temp.y+temp.height, temp.width, temp.height);
				//열추가
				if(j == this.map.length-1)
					g.drawRect(temp.x+temp.width, temp.y, temp.width, temp.height);
				//끝 칸추가
				if(i == this.map.length-1 && j== this.map.length-1)
					g.drawRect(temp.x+temp.width, temp.y+temp.height, temp.width, temp.height);
			}
		}
		
		if(this.play) {
			// stone
			for(int i =0;i<this.map.length; i++) {
				for(int j=0; j<this.map[i].length;j++) {
					// 가이드 라인
					Nemo nemo = this.map[i][j];
					g.setColor(Color.pink);				
					g.drawRect(nemo.x, nemo.y, nemo.width, nemo.height);
//				g.fillRect(nemo.x, nemo.y, nemo.width, nemo.height);
					
					// stone
					if(nemo.click) {
						if(nemo.id == 1) {
							g.setColor(Color.black);
						}
						else if(nemo.id ==2) {
							g.setColor(Color.blue);
						}						
						g.drawRoundRect(nemo.x+10, nemo.y+10, nemo.width-20, nemo.height-20, nemo.width-20, nemo.height-20);
						g.fillRoundRect(nemo.x+10, nemo.y+10, nemo.width-20, nemo.height-20, nemo.width-20, nemo.height-20);
					}
				}
			}			
			
		}
		
		repaint();
	}



	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {		//클릭발생 시 
		// TODO Auto-generated method stub
		System.out.println("아야!!!!!");
		
		//클릭이 발생한 지점의 좌표정보를 얻어옴
		int x = e.getX();
		int y = e.getY();
		
		//check
		for(int i =0; i<this.map.length;i++) {
			for(int j=0;j<this.map[i].length;j++) {
				Nemo stone = this.map[i][j];
				if(!stone.click && x >= stone.x && x < stone.x+stone.width	&& y >= stone.y && y < stone.y+stone.height) {
					
					stone.click = true;
					stone.id = this.turn;
					
					checkWin();		//클릭발생후 턴바뀌기전
					
					this.turn = this.turn == 1 ? 2 : 1;
					
					if(!this.play)
						this.play = true;
				}
			}
		}
		
	}



	private void checkWin() {
		this.win = this.win == 0 ? checkHori() : this.win; 
		this.win = this.win == 0 ? checkVerti() : this.win; 
		this.win = this.win == 0 ? checkDia() : this.win; 
		this.win = this.win == 0 ? checkReverse() : this.win; 
		
		if(this.win != 0) {
			System.out.printf("p%d의 승\n", this.win);
			new AlertWin99(String.format("p%d의 승\n", this.win));
		}
	}


private int checkReverse() {
	for(int i=4; i<this.map.length;i++) {
		for(int j=0; j<this.map[i].length-4; j++) {
			if(this.map[i][j].id == this.turn) {
				int cnt =0;
				for(int k=0; k<5; k++) {
					if(this.map[i-k][j+k].id == this.turn)
						cnt++;
				}
				if(cnt == 5)
					return this.turn;
			}
		}
	}
		return 0;
	}



private int checkDia() {
	for(int i=0; i<this.map.length-4;i++) {
		for(int j=0; j<this.map[i].length-4; j++) {
			if(this.map[i][j].id == this.turn) {
				
				int cnt = 0;
				for(int k=0; k<5; k++) {
					if(this.map[i+k][j+k].id == this.turn)
						cnt ++;
				}
				if(cnt ==5)
					return this.turn;
			}
		}
	}
	return 0;
	}



private int checkVerti() {
		for(int i = 0; i<this.map.length; i++) {
			int cnt = 0;
			for(int j=0; j<this.map[i].length; j++) {
				if(this.map[j][i].id == this.turn)
					cnt++;
				else 
					cnt = 0;
				if(cnt == 5) 
					return this.turn;
			}
		}
		return 0;
	}



private int checkHori() {
	for(int i = 0; i<this.map.length; i++) {
		int cnt = 0;
		for(int j=0; j<this.map[i].length; j++) {
			if(this.map[i][j].id == this.turn)
				cnt++;
			else 			//같은돌 연속으로 5개 노일때만 cnt++하기위해
				cnt = 0;
			if(cnt == 5) 
				return this.turn;
		}
	}
	return 0;
	}




	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {		//클- (누르고)
		// TODO Auto-generated method stub
		System.out.println("클-");
		
	}



	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {	//릭~(빼고)
		// TODO Auto-generated method stub
		System.out.println("릭-");
	}



	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {		//listener 가 add된 범위 안으로 마우스
		// TODO Auto-generated method stub
		
		System.out.println("HELLO-");
	}



	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("BYE-");
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.reset) {
			this.play = false;
			this.turn = 1;
			this.win = 0;
			setMap();
		} 
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

class OmokGame extends JFrame {
	
	private Board board = new Board();
	
	public OmokGame() {
		super("Omok Game");
		setLayout(null);
		setBounds(50, 50, 700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(board);
		setVisible(true);
		revalidate();
	}
}

public class Omok_answer {

	public static void main(String[] args) {
		
		OmokGame og = new OmokGame();

	}

}
