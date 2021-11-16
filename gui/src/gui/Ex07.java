package gui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Expanel888 extends MyUtil {

	private JLabel label = new JLabel();		//new JLabel("test");
	
	
	private Image im = new ImageIcon("images/horse1.png").getImage().getScaledInstance(80,80, Image.SCALE_SMOOTH);
	private JLabel image = new JLabel(new ImageIcon(im));
//	private JLabel image = new JLabel();		//new JLabel(new ImageIcon("images/999.jpg"));
	
//	private ImageIcon icon = new ImageIcon("images/horse1.png");
	private int x = 100;
	
	
	
	public Expanel888() {
		setLayout(null);
		setBounds(0, 0, 500, 500);
		
		label.setBounds(0,0,500,500);
		label.setText("test");
		add(label);		//컨테이너 위에 add()메소드를 통해 -> 컴포넌트 추가 : 인덱스가 붙음(추가하는 순서대로)
		
		image.setBounds(0, 0, 500, 500);
//		image.setIcon(new ImageIcon("images/999.jpg"));
		image.setVisible(true);
		add(image,0); // <- 우선순위 변경
//		
//		//컴포넌트 지우기		//또는 setVisilbe로
//		remove(image);
//		this.revalidate();
//		this.repaint();	
		
	}
	@Override
	protected void paintComponent(Graphics g) {		
		super.paintComponent(g);
		
//		g.drawImage(icon.getImage(),x,100,null);
//		
//		try {
//			Thread.sleep(50);
//			x++;
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		repaint();
	}
}

class ExFrame88 extends JFrame{
	
	public ExFrame88() {
		super("drag");
		setLayout(null);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new Expanel888());
		
		setVisible(true);
		revalidate();
	}
	
}
public class Ex07 {

	public static void main(String[] args) {
		ExFrame88 f = new ExFrame88();

	}

}
