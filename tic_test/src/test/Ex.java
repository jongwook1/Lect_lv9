package test;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class AlerFrame extends JFrame{
	JLabel text = new JLabel();
	
	public AlerFrame(String text) {
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

class Content extends JPanel implements ActionListener{		//액션리스너 임폴트안될때-setMap메소드의 this.map[i].addActionListener(this);먼저해주기
	private JButton[] map;
	private int[] mark;	
	
	private int turn = 1;
	private int win;
	private boolean printWinner;
	
	private int cnt = 1;
	
	JButton reset = new JButton();
	
	
	private int min;
	private int sec;
	private int ms;
	private JLabel watch = new JLabel();
	
	private void setWatch() {
		this.watch.setBounds(0,0,200,100);
		this.watch.setText(String.format("%2d, %2d, %3d\n",this.min,this.sec,this.ms));
		add(this.watch);
	}
	
	public Content() {
		setLayout(null);
		setBounds(0,0,700,700);
//		setBackground(Color.green);
		setVisible(true);
		setMap();
		
		
	}
	
	
	

	
	private void setMap() {
		
		this.map = new JButton[9];
		this.mark = new int[9];
		
		int x = 800/2-300/2;
		int y = 800/2-300/2;
		
		for(int i =0; i<this.map.length; i++) {
			this.map[i] = new JButton();
			this.map[i].setBounds(x,y,100,100);
			this.map[i].setBackground(Color.lightGray);			
			this.map[i].addActionListener(this);
			
			add(this.map[i]);
			x += 100 + 1;
			if(i % 3 ==2) {
				x = 800/2-300/2;
				y +=100 +1;
			}
			
		}
		
	}
	
	private void checkWin() {
		this.win = this.win == 0 ? checkHori() : this.win;
		this.win = this.win == 0 ? checkVerti() : this.win;
		this.win = this.win == 0 ? checkDia() : this.win;
		this.win = this.win == 0 ? checkReverse() : this.win;
		
		
		if(!this.printWinner && this.win != 0) {
			new AlerFrame(String.format("%d번째 게임 p%d의 승!!", this.cnt,this.win));
//			JOptionPane.showMessageDialog(null, "승");
			
			this.printWinner = true;
			this.cnt++;
			
		}
	}



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
		for(int i = 0 ; i<3; i++) {
			int cnt = 0;
			for(int j = 0; j < 3; j++) {
				if(this.mark[i+j*3] == this.turn) {
					cnt++;
				}
				if(cnt == 3)
					return this.turn;
			}
		}
		return 0;
	}



	private int checkHori() {
		for(int i =0; i<this.mark.length; i+=3) {
			int cnt = 0;
			for(int j = 0; j < 3; j++) {
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

		if(target == this.reset) {
			resetMap();
		}
		else {
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



	private void resetMap() {
		for(int i = 0; i < this.map.length; i++) 
			this.map[i].setBackground(Color.lightGray);
		this.mark = new int[9];
		this.turn = 1;
		this.win = 0;
		this.reset.setText("START");
		
	}
}



class Tictaetoe extends JFrame{
	private Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
	public final int W = dm.width;
	public final int H = dm.height;
	
	private Content content = new Content();
	
	public Tictaetoe() {
		super("TIC TAC TOE");
		
		setLayout(null);
		setBounds(this.W/2-800/2,this.H/2-800/2,800,800);	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new Content());
		setVisible(true);
		revalidate();
	}



	public void setWatchTime(int n) {
		content.setWatchTime(n);
		
	}
	
	
}


public class Ex {

	public static void main(String[] args) {
		Tictaetoe ttt = new Tictaetoe();
		
		int n = 0;
		while(true) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			ttt.setWatchTime(n);
		}
	}

}
