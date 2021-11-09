package mal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MPanel2 extends Util {
//	private int[] total = new int [5];
	ArrayList<Horse> horse = new ArrayList<>();
//	Horse h = new Horse();
	
//	ArrayList<Horse> h = new ArrayList<>();
	
	private Image im1, im2, im3, im4, im5;
//	private ImageIcon icon =new ImageIcon("images/horse1.png");
//	private JLabel image;
//	private ArrayList<JLabel> image = new ArrayList<>();
	
	private JLabel[] rank = new JLabel[5];
	private JButton[] btn = new JButton[2];
	
	private final int SIZE = 600;
	private int x = 100;
	private int n = 1;
	private int rankN;
	private boolean check =false;
	
	public MPanel2() {
		setLayout(null);
		setBounds(0, 0, 800, 800);
//		setBackground(Color.black);
		setMal();
		setImageSize();
		setButton();
//		setImage();
//		setRankLabel();
//		int k = 0;
//		for(int i=0; i<image.size();i++) {
//		image.get(i).setBounds(0, k, 100, 100);	
//		image.get(i).setVisible(true);
//		add(image.get(i),i);		
//		k +=100;
//		}		
		
//		move();
	}
	
	public void setButton() {
		
		String[] text = {"START","RESET"};
		
		int x = 400;
		int y = 600;
		
		for(int i=0; i<this.btn.length; i++) {
			JButton bt = new JButton();
			bt.setBounds(x, y, 100, 80);
			bt.setText(text[i]);
			bt.addActionListener(this);
			
			add(bt);
			this.btn[i] = bt;
			
			x += 100+50;
		}		
		
	}
	
//	public void setRankLabel() {
//		setLayout(null);
//		
//		int k = 100;
//		for(int i=0; i<horse.size();i++) {
//			rank[i]=new JLabel();
//			rank[i].setBounds(700, k, 80, 80);			
//			k += 100;
//		if(horse.get(i).getState()==1)
//			rankN = horse.get(i).getRank();
//			
//			rank[i].setText(String.valueOf(rankN));
//		add(this.rank[i]);
//		}
//	}
	
	public void setImageSize() {
		
		horse.get(0).setIm(new ImageIcon("images/horse1.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH));  
		horse.get(1).setIm(new ImageIcon("images/horse2.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH));  
		horse.get(2).setIm(new ImageIcon("images/horse3.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH));  
		horse.get(3).setIm(new ImageIcon("images/horse4.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH));  
		horse.get(4).setIm(new ImageIcon("images/horse5.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH));  
		

		horse.get(0).setImage(new ImageIcon(horse.get(0).getIm()));
		horse.get(1).setImage(new ImageIcon(horse.get(0).getIm()));
		horse.get(2).setImage(new ImageIcon(horse.get(0).getIm()));
		horse.get(3).setImage(new ImageIcon(horse.get(0).getIm()));
		horse.get(4).setImage(new ImageIcon(horse.get(0).getIm()));
	}
	
//	public void setImage() {
//		
//		for(int i=0; i < horse.size(); i++) {
//			this.image.add(new JLabel(new ImageIcon(horse.get(i).getIm())));
//		}
//		
//
//	}
	
	public void move() {
		Random rn = new Random();
		while(true) {
			for(int i=0; i<horse.size(); i++) {
				if(horse.get(i).getX() < this.SIZE) {
				int jump = rn.nextInt(50)+1;
				int xx = horse.get(i).getX()+jump;
				
				if(xx < this.SIZE) {
					
					horse.get(i).setX(xx);
				}
				else {
					if(horse.get(i).getState() == 0) {
						i --;
						break;
					}
					else {
						horse.get(i).setX(this.SIZE-1);
						horse.get(i).setState(1);
					}
				}
			}
				}
		}
	}
	
	//Horse(int num, int x, int y, int w, int h, int state)		
	public void setMal() {
		
//		h.add(new Horse(1,0,50,100,100,0,"horse1",icon));
		horse.add(new Horse(1, 0, 50, 100, 100, 0));
		horse.add(new Horse(2, 0, 150, 100, 100, 0));
		horse.add(new Horse(3, 0, 250, 100, 100, 0));
		horse.add(new Horse(4, 0, 350, 100, 100, 0));
		horse.add(new Horse(5, 0, 450, 100, 100, 0));

		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Random rn = new Random();

		if(this.check == true) {
		
		int k = 0;
//		g.drawImage(horse.get(0).getIm(),x,0,null);
		for (int i = 0; i < horse.size(); i++) {
			
			if(horse.get(i).getState()==0) {
			if (horse.get(i).getX() < this.SIZE) {
				int jump = rn.nextInt(50) + 1;
				int xx = horse.get(i).getX() + jump;
				g.drawImage(horse.get(i).getIm(), horse.get(i).getX(), horse.get(i).getY(), null);
//				g.drawImage(horse.get(i).getImage().getImage(), horse.get(i).getX(), horse.get(i).getY(), null);

				
				horse.get(i).setX(xx);
			}
			else {
				if(horse.get(i).getState()==1) {
					i--;
					break;
				}
				else {
					if(horse.get(i).getState()==0) {
					horse.get(i).setRank(n);					
					
					}
					horse.get(i).setState(1);
					n++;
					System.out.println(">>>"+i+"번말  "+horse.get(i).getRank()+"등");
					horse.get(i).setX(600);
					g.drawImage(horse.get(i).getIm(), horse.get(i).getX(), horse.get(i).getY(), null);					
				}
			}
		}
			else {
				g.drawImage(horse.get(i).getIm(), horse.get(i).getX(), horse.get(i).getY(), null);
				
			}
			}
		}
//		for(int i=0;i<horse.size();i++) {
//			g.drawImage(horse.get(i).getIm(), horse.get(i).getX(), horse.get(i).getY(), null);
//		}
		g.drawLine(700, 0, 700, 600);
		try {
			Thread.sleep(50);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		repaint();
	}
	
	@Override
		public void actionPerformed(ActionEvent e) {
			JButton target = (JButton) e.getSource();
			
			if(target == this.btn[0])
				this.check = true;
			else {			
				
				
			}
		}
	
//	public void move() {
//		
//		while(true) {
//			for(int i=0; i<)
//		}
//		
//	}
}
