package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.AttributeSet.ColorAttribute;

// 최상위 컨테이너 : JFrame
// 컨테이너 : JPanel
// 컴포넌트 : JButton, JLabel, JTextField...
// 리스너 : 컴포넌트에 리스너를 add하면, 이벤트 발생시 -> 캐치 -> 처리
// TicTacToe

class AlertFrame extends JFrame{
	JLabel text = new JLabel();
	
	public AlertFrame(String text) {
		setLayout(null);
		setBounds(200,200,300,200);
		setVisible(true);
		
		this.text.setBounds(0,0,300,200);
		this.text.setText(text);
		this.text.setHorizontalAlignment(JLabel.CENTER);
		this.text.setVisible(true);
		add(this.text);
	}
}

class Content extends JPanel implements ActionListener{
	
	private JButton[] map;
	private int[] mark;
	
	private int turn = 1;
	private int win;
	private boolean printWinner;
	
	private int cnt = 1;
	
	JButton reset = new JButton();
	
	public Content() {
		setLayout(null);
		setBounds(0,0,700,700);
//		setBackground(new Color(226, 106, 44));
//		setBackground(new Color(219, 208, 192));
		setHeader();
		setMap();
		addResetButton();
//		setBackground(color.black);
	}
	
	private void addResetButton() {
		reset.setBounds(800/2-300/2, 600, 300, 50);
		reset.setText("START");
		reset.addActionListener(this);
		add(reset);
	}
	
	private void setHeader() {
		JLabel head = new JLabel("TIC TAC TOE");
		head.setBounds(0,0,800,200);
		head.setFont(new Font("",Font.BOLD,40));
		head.setHorizontalAlignment(JLabel.CENTER);
		head.setVerticalAlignment(JLabel.BOTTOM);
		add(head);
	}
	
	
	private void setMap() {
		this.map = new JButton[9];
		this.mark = new int[9];
		
		int x = 800/2-300/2;
		int y = 800/2-300/2;
		for(int i=0; i<this.map.length; i++) {
			this.map[i] = new JButton();
			this.map[i].setBounds(x,y,100,100);
			this.map[i].setBackground(Color.lightGray);			
			this.map[i].addActionListener(this);
			
			add(this.map[i]);
			x +=100 + 1;
			if(i % 3 == 2) {
				x = 800/2-300/2;
				y += 100 + 1;
			}
		}		
	}
	
	private void resetMap() {
		for (int i = 0; i < this.map.length; i++)
			this.map[i].setBackground(Color.lightGray);
		this.mark = new int[9];		
		this.turn = 1;
		this.win = 0;
		this.reset.setText("START");
		this.printWinner = false;

	}
	
	private void checkWin() {
		this.win = this.win == 0 ? checkHori() : this.win;
		this.win = this.win == 0 ? checkVerti() : this.win;
		this.win = this.win == 0 ? checkDia() : this.win;
		this.win = this.win == 0 ? checkReverse() : this.win;
		if(!this.printWinner && this.win != 0) {
			System.out.printf("%d번째 게임 p%d의 승!!",this.cnt,this.win);
		
			new AlertFrame(String.format("%d번째 게임 : p%d의 승",this.cnt,this.win));
			//단순한 alert 메세지는 다음 JOptionpane 의
			// showMessageDialog() 메소드를 통해 처리할 수 있으나 ,
			// 내용의 구성을 바꿀 수 없다는 단점이 있으니 -> JFrame 을 따로 만들어서 쓰기를 권장
//			JOptionPane.showMessageDialog(null, String.format("%d번째 게임 : p%d의 승",this.cnt,this.win));
			this.printWinner = true;
			this.cnt ++;
		}
	}
/*
 * 0 1 2
 * 3 4 5
 * 6 7 8
 */
	
	
private int checkReverse() {
		int cnt = 0;
		for(int i=0; i<3; i++) {
			if(this.mark[(i+1)*2] == this.turn)
				cnt ++;
		}
		if(cnt == 3)
			return this.turn;
		return 0;
	}

private int checkDia() {
		int cnt = 0;
		for(int i=0; i<3; i++) {
			if(this.mark[i*4] == this.turn)
				cnt++;			
		}
		if(cnt == 3)
			return this.turn;
		return 0;
	}

private int checkVerti() {
		for(int i=0; i<3; i++) {
			int cnt = 0;
			for(int j=0; j<3; j++) {
				if(this.mark[i+j*3] == this.turn)
					cnt++;
			}
			if(cnt == 3)
				return this.turn;
		}
		return 0;
	}

private int checkHori() {
	for(int i=0; i<this.mark.length; i+=3) {
		int cnt = 0;
		for(int j=0; j<3; j++) {
			if(this.mark[i+j] == this.turn)
				cnt++;
		}
		if(cnt == 3)
			return this.turn;
	}
	return 0;
}

@Override
public void actionPerformed(ActionEvent e) {
	JButton target = (JButton) e.getSource();

	if (target == this.reset) {
		resetMap();
	} else {
		this.reset.setText("RESET");
		for (int i = 0; i < this.map.length; i++) {
			if (target == this.map[i] && this.mark[i] == 0) {
				if (this.turn == 1)
					target.setBackground(Color.black);
				else
					target.setBackground(Color.orange);
				this.mark[i] = this.turn;
				checkWin();

				this.turn = this.turn == 1 ? 2 : 1;
			}
		}

	}

}

}


class Tictactoe extends JFrame{
	
	private Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
	public final int W = dm.width;
	public final int H = dm.height;
	
	
	public Tictactoe() {
		super("TIC TAC TOE");
		
		setLayout(null);
		setBounds(W/2-800/2,H/2-800/2,800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setBackground(color.pink);
		
		add(new Content());
		
		setVisible(true);		
		revalidate();		//갱신
		
	}
}

public class Ex {

	public static void main(String[] args) {
		Tictactoe ttt =  new Tictactoe();

	}

}
