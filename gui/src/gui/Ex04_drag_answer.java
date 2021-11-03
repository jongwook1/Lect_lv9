package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

class Rect99 {
	
	public Rect99(int x, int y, int width, int height) {
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

class ExPanel99 extends MyUtil{
	
	private Rect99 rect = new Rect99(100,100,100,100);
	private int gapX, gapY;
	
	@Override
	public void mousePressed(MouseEvent e) {			
		System.out.println("press");
		this.gapX = e.getX() - this.rect.getX();
		this.gapY = e.getY() - this.rect.getY();
	}
	
	
	public ExPanel99() {
		setBounds(100, 100, 500, 500);
		setBackground(Color.orange);
		
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println(e.getX() + " : "+ e.getY());
		
		int x = e.getX();
		int y = e.getY();
		
		int xx = e.getX() - gapX;
		int yy = e.getY() - gapY;
		
		if(x >= this.rect.getX() && x < this.rect.getX()+this.rect.getWidth() 
			&& y >= this.rect.getY() && y < this.rect.getY() + this.rect.getHeight() ) {
//			this.rect.setX(e.getX());
//			this.rect.setY(e.getY());
			this.rect.setX(xx);
			this.rect.setY(yy);
		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {		
		super.paintComponent(g);
		
		g.drawRect(this.rect.getX(), this.rect.getY(), this.rect.getWidth(), this.rect.getHeight());
		
		repaint();
	}
	
}

class ExFrame99 extends JFrame{
	
	public ExFrame99() {
		super("drag");
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new ExPanel99());
		
		setVisible(true);
		revalidate();
	}
}

public class Ex04_drag_answer {

	public static void main(String[] args) {
		ExFrame99 frame = new ExFrame99();

	}

}
