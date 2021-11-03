package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

class Rect_99 {
	
	public Rect_99(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	private int x,y,width,height;
	

}

class ExPanel_99 extends MyUtil{
	
	private Rect_99 rect = new Rect_99(100,100,100,100);
//	private int[] Xy = new int[2]; 
	private int xx;
	private int yy;
	
	public ExPanel_99() {
		setBounds(100, 100, 500, 500);
		setBackground(Color.orange);
		
		addMouseMotionListener(this);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
//		System.out.println(e.getX() + " : "+ e.getY());
//		xx = this.rect.getX();
//		yy = this.rect.getY();
		if(e.getX() >= xx && e.getX() <= xx + 100 && e.getY() >=yy && e.getY() <= yy +100 ) {
		xx = e.getX();
		yy = e.getY();
		}
		rect.setX(xx);
		rect.setY(yy);
//		Xy[0] = e.getX();
//		Xy[1] = e.getY();
//		
		
//		System.out.println(Xy[0]+ ": " + Xy[1]);
		System.out.println(xx+": "+yy);
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
	
	//박스를 클릭했을때
	@Override
	protected void paintComponent(Graphics g) {		
		super.paintComponent(g);
		
//		rect.setX(xx); 
//		rect.setY(yy);
		g.drawRect(this.rect.getX(), this.rect.getY(), this.rect.getWidth(), this.rect.getHeight());
		
//		g.drawRect(xx, yy, this.rect.getWidth(), this.rect.getHeight());
	
//		g.drawRect(Xy[0], Xy[1], this.rect.getWidth(), this.rect.getHeight());
		repaint();
	}
	
}

class ExFrame_99 extends JFrame{
	
	public ExFrame_99() {
		super("drag");
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new ExPanel_99());
		
		setVisible(true);
		revalidate();
	}
}

public class Ex04_ {

	public static void main(String[] args) {
		ExFrame_99 frame = new ExFrame_99();

	}

}
