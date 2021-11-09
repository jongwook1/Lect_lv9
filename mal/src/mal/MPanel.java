package mal;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MPanel extends Util{
	private ArrayList<ImageIcon> temp = new ArrayList<>();
//	private ArrayList<Image> temp2 = new ArrayList<Image>();
	int total[] = new int[5];
	final int SIZE = 600;
	
	private Image im = new ImageIcon("images/horse1.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
	private Image im2 = new ImageIcon("images/horse2.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
	private Image im3 = new ImageIcon("images/horse3.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
	private Image im4 = new ImageIcon("images/horse4.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
	private Image im5 = new ImageIcon("images/horse5.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
//	private JLabel image = new JLabel(new ImageIcon(im));
//	private ImageIcon icon = new ImageIcon(im);
//	private JLabel image = new JLabel();
//	private ImageIcon icon = new ImageIcon("images/horse1.png");
	private int x = 0;
	
	public MPanel() {
		setLayout(null);
		setBounds(0, 0, 800, 800);
		
//		temp2.add(im);
//		temp2.add(im2);
//		temp2.add(im3);
//		temp2.add(im4);
		
		temp.add(new ImageIcon(im));
		temp.add(new ImageIcon(im2));
		temp.add(new ImageIcon(im3));
		temp.add(new ImageIcon(im4));
		temp.add(new ImageIcon(im5));
		
		
//		image.setBounds(0,0,500,500);
//		image.setIcon(new ImageIcon("images/horse1.png"));
//		image.setVisible(true);
//		add(image,0);

		
		
	}	

	
	
	@Override
	protected void paintComponent(Graphics g) {		
		super.paintComponent(g);
		Random rn = new Random();
		
		
		int k = 0;
		for(int i = 0; i < temp.size(); i++) {
			if(total[i] < SIZE) {
				
			int jump = rn.nextInt(50)+1;
			int xx = total[i] + jump;
			

			g.drawImage(temp.get(i).getImage(), total[i], k,null);
			g.drawLine(700, 0, 700, 700);
			
			k+=100;
			total[i]= xx;
			
			}
		}	
		
		try {
			Thread.sleep(500);

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		repaint();
		
		
	}
	
}
