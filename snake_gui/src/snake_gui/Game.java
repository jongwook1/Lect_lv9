package snake_gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class SnakePanel extends MyUtil{
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		super.keyPressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		super.keyReleased(e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mousePressed(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseReleased(e);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		super.actionPerformed(e);
	}

	private Rect[][] map =  new Rect[10][10];
	
	private int size;	
	private Rect[] snake =  new Rect[4];
	private JButton[] btn = new JButton[4];
	private JButton reset = new JButton();
	private int xx;
	private int yy;
	
	
	public SnakePanel() {		
		setLayout(null);
		setBounds(0, 0, 700, 700);
//		setBackground(Color.BLACK);
		
		
		
		setHeader();
		setButton();
		setResetButton();
		setMap();
	}	

	
	private void setHeader() {
		JLabel head = new JLabel("SNAKE GAME");
		head.setBounds(20,20,150,15);
		head.setFont(new Font("",Font.BOLD,20));
//		head.setHorizontalAlignment(JLabel.CENTER);
//		head.setVerticalAlignment(JLabel.BOTTOM);
		add(head);
	}
	
	public void setResetButton() {
		this.reset.setBounds(700 -180, 700-90, 150, 40);
		this.reset.setText("RESET");
		add(this.reset);
	}
	
	
	public void setButton() {
		
		String[] text = {"◀","▼","▶","▲"};
		
		int size = 50;
		int x = 700 -180;
		int y = 700 -150;
		
		for(int i =0;i<this.btn.length;i++) {
			this.btn[i] = new JButton();
			this.btn[i].setBounds(x, y, size, size);
			this.btn[i].setText(text[i]);
			this.btn[i].addMouseListener(this);
			add(this.btn[i]);
			
			x += size;
			// 마지막버튼하나 위로올림
			if(i == this.btn.length -1 -1) {
				x = 700 -180 +size;
				y -= size;
			}
		}
	}
	
	
	public void setMap() {
		
//		int x = 700-670;	30
		int x = 700-670;
//		int y = 700-650;	50
		int y = 700-650;	
		
		
		for(int i = 0; i < this.map.length; i++) {
			for(int j = 0; j < this.map[i].length; j++) {
				map[i][j] =  new Rect(x,y,50,50);
				x += 50;
			}
			x = 700- 670;
			y += 50;
			
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Random rn = new Random();
	
		super.paintComponent(g);
		for (int i = 0; i < this.map.length; i++) {
			for (int j = 0; j < this.map[i].length; j++) {
				Rect nemo = this.map[i][j];
				g.drawRect(nemo.getX(), nemo.getY(), 50, 50);			
			}
		}
		
		
		
		for(int i = 0; i < this.snake.length; i++) {
//			int a = 1;
//			this.xx = 6;
//			this.yy = xx+a--;

		
//			if(i == 3) {
//				this.snake[i] = this.map[xx][yy];
//				g.setColor(Color.pink);
//				g.drawRect(snake[i].getX(),snake[i].getY() , 50, 50);
//			}
//			else{
//				this.snake[i] = this.map[xx][yy];
//				g.setColor(Color.green);
//				g.drawRect(snake[i].getX(),snake[i].getY() , 50, 50);
//				}
//			System.out.println(snake[i]);			
		}
		
		
		
		
	}	
}


public class Game extends JFrame{
	
	private SnakePanel panel = new SnakePanel();
	
	
	public Game() {
		super("Snake Game");
		setLayout(null);
		setBounds(50, 50, 700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		revalidate();
		add(panel);
	}

}


