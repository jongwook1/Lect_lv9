package basic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class p1 extends JPanel {
	JButton[] map = new JButton[9];
	final int SIZE = 65;
	
	public p1() {
		int x = 110;
		int y = 110;
		for(int i=0; i<this.map.length; i++) {	
			map[i]=new JButton();			
			
			this.map[i].setBounds(x,y,SIZE, SIZE);
			
//			this.map[i].addActionListener(this);	//addActionListener가 센서역할
			add(this.map[i]);
			
			x += SIZE+1;
			if(i % 3 == 2) {
				y += SIZE+1;
				x = 0;
			}
		}
	}
}

class MyPanel extends JPanel {
	JPanel p1 = new JPanel();
	
	public MyPanel() {
		setLayout(null);
		setBounds(100,100,200,200);
		setBackground(Color.orange);
		
		p1.setLayout(null);
		p1.setBounds(100, 100,800 , 600);
		p1.setBackground(Color.green);
//		setBounds(800/2-100,600/2-100,200,200);
		add(p1);

	}
	
}


class MyFrame extends JFrame{
	private Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
	private int width = dm.width;
	private int height = dm.height;
	private final int W = 1200;
	private final int H = 800;
	
	public MyFrame(String title) {
		super(title);
		setLayout(null);
		
		setBounds(width/2-W/2,this.height/2-H/2, W, H);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
}
public class TicTaeToe {

	public static void main(String[] args) {
		MyFrame tictaetoe = new MyFrame("TicTaeToe");
		tictaetoe.setContentPane(new MyPanel());
	}

}
