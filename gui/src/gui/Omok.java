package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class AlertFrame extends JFrame{
	JLabel text = new JLabel();
	
	public AlertFrame(String text) {
		setLayout(null);
		setBounds(200, 200, 300, 200);
		setVisible(true);
		
		this.text.setBounds(0, 0, 300, 200);
		this.text.setText(text);
		this.text.setHorizontalAlignment(JLabel.CENTER);
		this.text.setVisible(true);
		add(this.text);
		
	}
}


class Map1 extends JPanel implements ActionListener {
	
	private final int SIZE = 10;
	private JLabel title = new JLabel();
	private JLabel textTurn = new JLabel();
	private JButton[][] map = new JButton[SIZE][SIZE];
	private int[][] mark = new int[SIZE][SIZE];
	private final int BUTTON = 60;
	private int turn = 1;
	private int win;
	private boolean printWinner;
	
	JButton reset = new JButton();
	

	
	public Map1() {
		setLayout(null);
		setBounds(0, 0, Om.WIDTH-50, Om.HEIGHT-50);
		setVisible(true);
//		setBackground(Color.BLACK);
		
		this.title.setLayout(null);
		this.title.setBounds(0, 0, 200, 200);
//		String text ="재미있는 게임";
//		this.title.setText(text);
		this.title.setText("재미있는 게임");
		this.title.setFont(new Font("",Font.BOLD, 20));
	
		
//		this.title.setFont(new Font("Arial",Font.BOLD,15));
		this.title.setVerticalAlignment(JLabel.CENTER);
		this.title.setHorizontalAlignment(JLabel.CENTER);
		add(this.title);
		setTextTurn(this.turn);
		
		setMap();
		addResetButton();
		
		
	}
	
	private void setTextTurn(int turn) {
		this.textTurn.setLayout(null);
		this.textTurn.setBounds(80,120,100,100);
//		this.textTurn.setText("sfasfag");
		this.textTurn.setText(String.format("Player%d 차례",this.turn));
		this.textTurn.setFont(new Font("",Font.HANGING_BASELINE,15));
		add(this.textTurn);
	}
	
	private void addResetButton() {
		reset.setBounds(80,200,120,50);
		reset.setText("RESET");
		reset.addActionListener(this);
		add(reset);
	}
	
	
	private void checkWin() {
		this.win = this.win == 0 ? checkHori() : this.win;
		this.win = this.win == 0 ? checkVerti() : this.win;
		this.win = this.win == 0 ? checkDia() : this.win;
//		this.win = this.win == 0 ? checkReverse() : this.win;
		
		
		if(!this.printWinner && this.win != 0) {
			System.out.println("승");
			new AlertFrame(String.format("Player%d의 승!!",this.turn));
			this.printWinner = true;
		}
	}

	

	private int checkReverse() {
		for(int i = 0; i<SIZE-4;i++) {			
			for(int j=4;j<SIZE;j++) {
				int cnt = 0;
				if(mark[i][j]==this.turn) {
					for(int k=0;k<5;k++) {
						if(mark[i+k][j-k]==turn) cnt++;
					}
				}
				if(cnt == 5) {
//					win = turn;
//					return this.win;
					return turn;
							}					
			}
			
		}
		return 0;
	}

	private int checkDia() {
		for(int i = 0; i<SIZE-4;i++) {			
			for(int j=0;j<SIZE-4;j++) {
				int cnt = 0;
				if(mark[i][j]==this.turn) {
					for(int k=0;k<5;k++) {
						if(mark[i+k][j+k]==turn) cnt++;
					}
				}
				if(cnt == 5) {
//					win = turn;
//					return this.win;
					return turn;
							}					
			}
			
		}
		return 0;
	}

	private int checkVerti() {
		for(int i = 0; i<SIZE;i++) {			
			for(int j=0;j<SIZE-4;j++) {
				int cnt = 0;
				if(mark[j][i]==this.turn) {
					for(int k=0;k<5;k++) {
						if(mark[j+k][i]==turn) cnt++;
					}
				}
				if(cnt == 5) {
//					win = turn;
//					return this.win;
					return turn;
							}					
			}
			
		}
		return 0;
	}

	private int checkHori() {
		for(int i = 0; i<SIZE;i++) {			
			for(int j=0;j<SIZE-4;j++) {
				int cnt = 0;
				if(mark[i][j]==this.turn) {
					for(int k=0;k<5;k++) {
						if(mark[i][j+k]==turn) cnt++;
					}
				}
				if(cnt == 5) {
//					win = turn;
//					return this.win;
					return turn;
							}					
			}
			
		}
		return 0;
	}

	private void setMap() {
		
		int x = Om.WIDTH/2-BUTTON*SIZE/2+40;
		int y = Om.HEIGHT/2-BUTTON*SIZE/2;
		
		for(int i =0; i < this.SIZE; i++) {
			for(int j=0; j<this.SIZE; j++) {
				this.map[i][j] = new JButton();
				this.map[i][j].setBounds(x, y, BUTTON, BUTTON);
//				this.map[i][j].setText("O");
				this.map[i][j].addActionListener(this);
				add(this.map[i][j]);
				x += BUTTON+ 3;
			}
			x = Om.WIDTH/2-BUTTON*SIZE/2+40;
			y += BUTTON +3;
		}

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton target = (JButton) e.getSource();
		
		if(target == this.reset) {
			resetMap();
		}
		else {
		for (int i = 0; i < this.SIZE; i++) {
			for (int j = 0; j < this.SIZE; j++) {
				if (target == this.map[i][j] && this.mark[i][j] == 0) {
					if (this.turn == 1) {
						target.setText("O");
						target.setFont(new Font("Arial", Font.BOLD, 15));
					} else {
						target.setText("X");
						target.setFont(new Font("Arial", Font.BOLD, 15));
					}
					this.mark[i][j] = this.turn;
					checkWin();
					this.turn = this.turn == 1 ? 2 : 1;
					setTextTurn(this.turn);
				}
			}
		}
		
	}
	}

	private void resetMap() {		//미완성
		this.turn = 1;
		this.mark = new int[10][10];
		this.win = 0;
		
		setMap();
		
		this.printWinner = false;
		
		
	}
	
}


class Om extends JFrame {
	private static Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
	public static final int W = dm.width;
	public static final int H = dm.height;
	
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 800;
	
	private Map1 map = new Map1();
	
	public Om() {
		super("Omok Game");
		setLayout(null);		
		setBounds(this.W/2-this.WIDTH/2, this.H/2-this.HEIGHT/2, WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		revalidate();
		
		add(map);
	}
	
}

public class Omok {

	public static void main(String[] args) {
		Om o = new Om();

	}

}
