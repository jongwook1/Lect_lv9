package drawingBoard;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;

public class Content extends Util {

	public JButton close = new JButton("close");
	public ArrayList<Nemo> nemos = new ArrayList<>();		//mouseRealesde 될때, 픽스된 네모를 담아주기  <-paintComponent() 메소드에서 그리기 처리
	//그려지는 객체
	private Nemo nemo = null;	//드래그하는 동안 갱신되는 객체로 임시활용
	private int x,y;
	private int startX;
	private int startY;
	
	public Content() {
		setLayout(null);
		setBounds(0, 0, 900, 700);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
		setFocusable(true);
		addKeyListener(this);
		
		setButton();
	}
	
	private void setButton() {
		this.close.setBounds(750,600,100,50);
		add(this.close);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {		
		super.paintComponent(g);
		
		//삼각형 그리기
		//drawPolygon(int[],int[],int)
		// (x좌표의 배열, y좌표의 배열, 꼭지점 개수)
		int[] xxx = {100,50, 150};
		int[] yyy = {100,200,200};
		g.setColor(Color.red);
		g.drawPolygon(xxx,yyy,3);
		
		//네모 그리기 (스레드)
//		if(this.nemo != null) {
//		g.setColor(this.nemo.getC());
//		g.drawRect(this.nemo.getX(),this.nemo.getY(),this.nemo.getWidth(),this.nemo.getHeight());
//		}		
		
		for(int i =0; i<nemos.size(); i++) {
			g.setColor(this.nemos.get(i).getC());
			g.drawRect(this.nemo.getX(),this.nemo.getY(),this.nemo.getWidth(),this.nemo.getHeight());
			g.drawRect(nemos.get(i).getX(), nemos.get(i).getY(),nemos.get(i).getWidth(),nemos.get(i).getHeight());
		}
		
		requestFocusInWindow();		//keyListener 에 대한 포커스 다시 잡음
		repaint();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		this.x = e.getX();
		this.y = e.getY();
		
		this.startX = x;		//프레스 시점의 좌표를 고정으로 기억하기 위
		this.startY = y;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		int xx = e.getX();
		int yy = e.getY();
		
		//네모 설정
		int width = Math.abs(xx-x);
		int height = Math.abs(yy-y);
		
		if(this.x > xx && width > 1)
			x = startX - width;	// 시작점 -width
		if(this.y > yy && height > 1)
			y = startY - height;
		
		this.nemo = new Nemo(x,y,width,height, Color.blue);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("~~~릭");
		nemos.add(this.nemo);

	}

}
