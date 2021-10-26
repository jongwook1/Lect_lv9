package test;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


class Content extends JPanel implements ActionListener{		//액션리스너 임폴트안될때-setMap메소드의 this.map[i].addActionListener(this);먼저해주기
	private JButton[] map;
	private int[] mark;	
	
	private int turn = 1;
	private int win;
	private boolean printWinner;
	
	private int cnt = 1;
	
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
		
		
		if(!this.printWinner && this.win != 0) {
			
			JOptionPane.showMessageDialog(null, "승");
			
			this.printWinner = true;
			this.cnt++;
			
		}
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

		for (int i = 0; i < this.map.length; i++) {
			if (target == this.map[i]) {
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



class Tictaetoe extends JFrame{
	private Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
	public final int W = dm.width;
	public final int H = dm.height;
	
	
	
	public Tictaetoe() {
		super("TIC TAC TOE");
		
		setLayout(null);
		setBounds(this.W/2-800/2,this.H/2-800/2,800,800);	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new Content());
		setVisible(true);
		revalidate();
	}
	
	
}


public class Ex {

	public static void main(String[] args) {
		Tictaetoe ttt = new Tictaetoe();
		
	}

}
