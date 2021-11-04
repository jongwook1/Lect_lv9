package drawingBoard;

import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JButton;


public class DrawPanel extends MyUtil {
	private Rect rect = null;	
	private int x;
	private int y;
	private int xx;
	private int yy;	
	private int startX;
	private int startY;
	
	private JButton close = new JButton();
	public boolean check = false;
	
	public DrawPanel() {
		setLayout(null);
		setBounds(0, 0, 900, 700);
//		setBackground(Color.black);
		
		
		setButton();
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	public void setButton() {
		close.setBounds(600, 500, 100, 100);
		close.setText("COLSE");
		this.close.addActionListener(this);
		add(this.close);	
		
	}
	

	
	@Override
	public void mousePressed(MouseEvent e) {
		
		x = e.getX();
		y = e.getY();
		
		startX = x;
		startY = y;
		
		
//		gapX = e.getX() - rect.getX();
//		gapY = e.getY() - rect.getY();
		super.mousePressed(e);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println(e.getX() + " : " + e.getY());
		xx = e.getX();
		yy = e.getY();
		
		int width = Math.abs(xx-x);
		int height = Math.abs(yy-y);
		
		if(x > xx) {
			x = startX - width;			
		}		
		if(y > yy) {
			y = startY - height;
		}
//		if(x > xx && y > yy) {
//			x = startX - width;
//			y = startY - height;
//		}
		rect = new Rect(x,y,width,height);
		
		
//		xx = e.getX() - gapX;
//		yy = e.getY() - gapY;
//		rect.setX(xx);
//		rect.setY(yy);
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		//프레스 x,y  드레그 xx, yy
		
//		int StartX = x;
//		int StartY = y;
			g.setColor(Color.blue);				
			if(this.rect != null) {
			g.drawRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
			}
//			if(x > xx) {
//				g.drawRect(xx-x, y, xx-x, yy-y);			
//			}
		
		//		\x-, y-		g.drawRect(x2, y2, 0-77, 0-59)		
		//		/ x+ , y-	g.drawRect(x2, y2, 86-59, 110-137)
		//		x- y+
		
		repaint();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == this.close)	{
			
			System.out.println("1111111111");
			this.check = true;
			
			}
				
	}
	
}

