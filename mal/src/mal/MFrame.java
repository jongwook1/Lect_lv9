package mal;

import javax.swing.JFrame;

public class MFrame extends JFrame {

	
	public MFrame() {
		super("MAL GAME");
		setLayout(null);
		setBounds(100, 100, 800, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		add(new MPanel());
		add(new MPanel2());
		setVisible(true);
		revalidate();
	}
}
