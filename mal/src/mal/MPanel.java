package mal;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MPanel extends Util{
	private JLabel label = new JLabel();
	private JLabel image = new JLabel();
	
	public MPanel() {
		setLayout(null);
		setBounds(0, 0, 800, 800);
		
		label.setBounds(0, 0, 500, 500);		
		add(label);
		
		image.setBounds(0,0,100,100);
		image.setIcon(new ImageIcon("images/horse1.png"));
		image.setVisible(true);
		add(image,0);
		
	}
}
