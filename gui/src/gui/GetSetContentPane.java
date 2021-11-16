package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class AA98 extends JPanel{
	
	public AA98() {
		setLayout(null);
		setBounds(0, 0, 500, 400);
		setBackground(Color.blue);
	}
}

class BB98 extends JPanel{
	
	public BB98() {
		setLayout(null);
		setBounds(0, 0, 500, 400);
		setBackground(Color.red);
	}
	
}

class CC98 extends JPanel{
	
	public CC98() {
		setLayout(null);
		setBounds(0, 0, 500, 400);
		setBackground(Color.yellow);
	}
}

// setContentPane()을 활용한 화면의 전환
public class GetSetContentPane extends JFrame implements ActionListener{

	AA98 a = new AA98();
	BB98 b = new BB98();
	CC98 c = new CC98();
	
	JButton bt = new JButton("change");
	
	int state = 1;
	
	public GetSetContentPane() {
		setLayout(null);
		setBounds(100, 100, 500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		add(a);
//		this.getContentPane().add(a);
		setContentPane(a);	// -> setter 를 활용해서 pane 을 교체
		setButton();		
		
		setVisible(true);
		revalidate();
		
	}
	
	private void setButton() {
		this.bt.setBounds(100, 100, 100, 100);
		this.bt.addActionListener(this);
		add(this.bt);
		
	}

	public static void main(String[] args) {
		new GetSetContentPane();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.bt) {
		if(state == 1) {
			this.setContentPane(b);		
		}		
		else if(state == 2) {
			this.setContentPane(c);		
		}
		else if(state == 3) {
			this.setContentPane(a);
			this.state = 0;
		}
		setButton();
		this.state ++;
	}
	}
}
