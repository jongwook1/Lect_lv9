package drawingBoard;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyBoard extends JFrame {

	
	DrawPanel p = new DrawPanel();
	
	public MyBoard() {
		super("그림판");
		setLayout(null);
		setBounds(100, 100, 900, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new DrawPanel());
		
		
		setVisible(true);
		revalidate();
		
		
	}
	
	public void dispose() {
		if(p.check==true) {
			this.dispose();
			}
	}
	

	
}
