package drawingBoard;

import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JButton;


public class DrawPanel extends MyUtil {
	private Rect rect = new Rect(100,100,100,100);
	private int gapX;
	private int gapY;
	private int x;
	private int y;
	private int xx;
	private int yy;
	private int x2;
	private int y2;
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
		close.setBounds(600, 600, 100, 100);
		close.setText("COLSE");
		this.close.addActionListener(this);
		add(this.close);	
		
	}
	

	
	@Override
	public void mousePressed(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
//		gapX = e.getX() - rect.getX();
//		gapY = e.getY() - rect.getY();
		super.mousePressed(e);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println(e.getX() + " : " + e.getY());
		x = e.getX();
		y = e.getY();
//		xx = e.getX() - gapX;
//		yy = e.getY() - gapY;
//		rect.setX(xx);
//		rect.setY(yy);
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);		
		g.setColor(Color.blue);
		g.drawRect(x2, y2,x-x2 ,y-y2 );	
		
		
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
