package gui;
//package gui;
//
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//
//class PNemo {
//	int x,y,width,height;
//	
//	public PNemo(int x, int y, int width, int height) {
//		this.x = x;
//		this.y = y;
//		this.width = width;
//		this.height = height;
//	}
//}
//
//class PushPanel99 extends JPanel implements MouseListener,ActionListener {
//	
//	private JButton[][] con = new JButton[2][3];
//	private final int BUTTON = 50;
//	private static final int WIDTH = 650;
//	private static final int HEIGHT = 650;
//	
//	private PNemo[][] conNemo = new PNemo[2][3];
//	
//	
//	private static int nemo1x = 300;
//	private static int nemo1y = 50;
//	private static int nemo2x = 400;
//	private static int nemo2y = 50;
//	boolean check = false;
//	
//	
//	public PushPanel99() {
//		setLayout(null);
//		setBounds(0, 0, this.WIDTH, this.HEIGHT);
//		
////		setVisible(true);
////		setBackground(Color.BLUE);
////		setPushNemo();
//		addMouseListener(this);		//패널에 마우스리스너를 달음
//		setConButton();
//		setConhNemo();
//	}
//	
//	private void setConhNemo() {
//		int x = PushPanel.WIDTH-300;
//		int y = PushPanel.HEIGHT-150;
//		for(int i = 0; i< this.conNemo.length; i++) {
//			for(int j = 0; j<this.conNemo[i].length; j++) {
//				this.conNemo[i][j] = new PNemo(x,y,50,50);
//				x += 50;
//			}
//			x = PushPanel.WIDTH-300;
//			y += 50;
//		}
//		
//		
//
//		
//	}
//	private void setConButton() {
//		int x = PushPanel.WIDTH-150;
//		int y = PushPanel.HEIGHT-150;
//		
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<3;j++) {
//				
//				
////				if(i==0 && j==1) {
////				this.con[i][j]= new JButton();
////				}else if(i==1) {
////					this.con[i][j] =new JButton();
////				}
//				this.con[i][j] = new JButton();
//				this.con[i][j].setBounds(x, y, BUTTON, BUTTON);
//				if(i == 0 && j ==1) {
//				add(this.con[i][j]);
//				this.con[i][j].addActionListener(this);
//				}
//				else if(i==1){
//					add(this.con[i][j]);
//					this.con[i][j].addActionListener(this);
//				}
//				x += BUTTON;
//			}
//			x =  PushPanel.WIDTH-150;
//			y += BUTTON;
//		}
//		con[0][1].setText("▲");
//		con[1][0].setText("◀");
//		con[1][1].setText("▼");
//		con[1][2].setText("▶");
//		
//	
//		
////		this.con.setBounds(550, 550, , HEIGHT);
//	}
//	
//	
//	@Override
//	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);		
//			
//		for(int i=0;i<this.conNemo.length;i++) {
//			for(int j=0;j<this.conNemo[i].length;j++) {
//				PNemo connemo = this.conNemo[i][j];
//				if(i == 0 && j ==1) {
//					
//					g.drawRect(connemo.x,connemo.y, BUTTON, BUTTON);
//					g.drawString("▲", connemo.x+20, connemo.y+30);
//				}
//				else if(i ==1) {
//					g.drawRect(connemo.x, connemo.y, BUTTON, BUTTON);
//						if(j == 0)	g.drawString("◀",connemo.x+20 , connemo.y+30);
//						else if(j == 1)	g.drawString("▼",connemo.x+20 , connemo.y+30);
//						else if(j == 2)	g.drawString("▶",connemo.x+20 , connemo.y+30);			
//					
//				}
//			}
//			}
//		
//		
////		int x = 300;
////		int y = 50;
////		int x1 = 400;
////		int y1 = 50;
//		PNemo nemo =new PNemo(this.nemo1x,this.nemo1y,100,100);
//		PNemo nemo2 = new PNemo(this.nemo2x,this.nemo2y,100,100);
//		g.setColor(Color.pink);
//		
//		g.drawRect(nemo.x, nemo.y, nemo.width,nemo.height);
//		g.drawRect(nemo2.x, nemo2.y, nemo2.width, nemo2.height);
//		repaint();
//	}
//
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		int xx1 = this.nemo1x;
//		int yy1 = this.nemo1y;
//		int x = e.getX();
//		int y = e.getY();
//		for(int i=0;i<this.conNemo.length;i++) {
//			for(int j=0;j<this.conNemo[i].length;j++) {
//				PNemo connemo1 = this.conNemo[i][j];
//				if(i == 0 && j == 1) {				
//				if((x < connemo1.x+50 && x >= connemo1.x) && (y <connemo1.y+50 && y >= connemo1.y)) {
//					this.nemo1y = yy1 - 10;
//					System.out.println("위-");
//				}
//				}
//				else if(i == 1 && j == 0) {
//					if((x < connemo1.x+50 && x >= connemo1.x) && (y <connemo1.y+50 && y >= connemo1.y)) {
//						this.nemo1x = xx1 - 10;
//						System.out.println("왼-");
//					}
//				}
//				else if(i == 1 && j == 1) {
//					if((x < connemo1.x+50 && x >= connemo1.x) && (y <connemo1.y+50 && y >= connemo1.y)) {
//						this.nemo1y = yy1 + 10;
//						System.out.println("아래-");
//						}
//				}
//				else if(i == 1 && j == 2) {
//					if((x < connemo1.x+50 && x >= connemo1.x) && (y <connemo1.y+50 && y >= connemo1.y)) {
//						this.nemo1x = xx1 +10;
//						System.out.println("오-");
//						}
//				}
//			}
//			}
//			
////			this.nemo1y = yy1 - 10;
//		
//		System.out.println("아야!!!!!");
//		
//	}
//
//	@Override
//	public void mousePressed(java.awt.event.MouseEvent e) {		//클- (누르고)
//		// TODO Auto-generated method stub		
////		int xx1 = this.nemo1x;
////		int yy1 = this.nemo1y;
////		int x = e.getX();
////		int y = e.getY();
////		for(int i=0;i<this.conNemo.length;i++) {
////			for(int j=0;j<this.conNemo[i].length;j++) {
////				PNemo connemo1 = this.conNemo[i][j];
////				if(i == 0 && j == 1) {				
////				if((x < connemo1.x+50 && x >= connemo1.x) && (y <connemo1.y+50 && y >= connemo1.y)) {
////					this.nemo1y = yy1 - 10;
////					System.out.println("위-");
////				}
////				}
////				else if(i == 1 && j == 0) {
////					if((x < connemo1.x+50 && x >= connemo1.x) && (y <connemo1.y+50 && y >= connemo1.y)) {
////						this.nemo1x = xx1 - 10;
////						System.out.println("왼-");
////					}
////				}
////				else if(i == 1 && j == 1) {
////					if((x < connemo1.x+50 && x >= connemo1.x) && (y <connemo1.y+50 && y >= connemo1.y)) {
////						this.nemo1y = yy1 + 10;
////						System.out.println("아래-");
////						}
////				}
////				else if(i == 1 && j == 2) {
////					if((x < connemo1.x+50 && x >= connemo1.x) && (y <connemo1.y+50 && y >= connemo1.y)) {
////						this.nemo1x = xx1 +10;
////						System.out.println("오-");
////						}
////				}
////			}
////			}
////	
//		
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		System.out.println("릭-");
//		
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
////	nemo1x = 50;
////	nemo1y = 50;
////	nemo2x = 400;
////	 nemo2y = 50;
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		int xx1 = this.nemo1x;
//		int yy1 = this.nemo1y;
//		int xx2 = this.nemo2x;
//		int yy2 = this.nemo2y;
//		
////		if(xx1 + 100 >= xx2 && yy1 + 100 >= yy2) {
////			check =true;
////		}
//
//		if(this.check == true ) {
//			if(e.getSource() == this.con[1][0]) {		
//				this.nemo1x = xx1 - 10;
//				this.nemo2x = xx2 - 10;
//				
//			System.out.println("왼");
//			}
//			else if(e.getSource() == this.con[1][2]) {
//				this.nemo1x = xx1 + 10;
//				this.nemo2x = xx2 + 10;
//				System.out.println("오");
//			}
//			else if(e.getSource() == this.con[0][1]) {
//				this.nemo1y = yy1 - 10;
//				this.nemo2y = yy2 - 10;
//				System.out.println("위");
//			}
//			else if(e.getSource() == this.con[1][1]) {
//				this.nemo1y = yy1 + 10;
//				this.nemo2y = yy2 + 10;
//				System.out.println("아래");
//			}
//			this.check = false;
//		}else {
//		if(e.getSource() == this.con[1][0]) {		
//			this.nemo1x = xx1 - 10;		
//			
//		System.out.println("왼");
//		}
//		else if(e.getSource() == this.con[1][2]) {
//			this.nemo1x = xx1 + 10;
//			System.out.println("오");
//		}
//		else if(e.getSource() == this.con[0][1]) {
//			this.nemo1y = yy1 - 10;
//			System.out.println("위");
//		}
//		else if(e.getSource() == this.con[1][1]) {
//			this.nemo1y = yy1 + 10;
//			System.out.println("아래");
//		}
//		}
//
//	}
//	
//	
//	
//}
//
//
//class Push99 extends JFrame{
//	
//	PushPanel pushp = new PushPanel();
//	
//	public Push99() {
//		super("PUSH PUSH");
//		setLayout(null);
//		setBounds(100, 100, 700, 700);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		
//		add(pushp);
//		setVisible(true);
//		revalidate();
//		
//		
//	}
//	
//	
//}
//
//
//public class Ex3 {
//
//	public static void main(String[] args) {
//		PushPush_answer p = new PushPush_answer();
//		
//
//	}
//
//}
