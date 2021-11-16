package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//배열처리는 벡터로
public class ExText02 extends JFrame implements KeyListener,ActionListener{

	JLabel dataField = new JLabel(String.format("<html>%s<br><br>%s<br><br>%s</html>", "ID:", "PW:", "Name:"));
	JLabel result ;

	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JTextField text3 = new JTextField();
	JTextField text4 = new JTextField();

	JButton btn1 = new JButton("Process");

	Vector<String> data = new Vector<>();

	public ExText02() {
		super("회원가입");
		setLayout(null);
		setBounds(100, 100, 700, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		text1.setBounds(200, 30, 300, 50);
		add(text1);
		text2.setBounds(200, 105, 300, 50);
		add(text2);
		text3.setBounds(200, 185, 300, 50);
		add(text3);
//		text4.setBounds(10, 240, 650, 300);
//		add(text4);

		btn1.setBounds(550, 105, 120, 50);
		btn1.addActionListener(this);
		add(btn1);

		text1.addKeyListener(this);
		add(text1);
		text2.addKeyListener(this);
		add(text2);
		text3.addKeyListener(this);
		add(text3);

		dataField.setLayout(null);
		dataField.setHorizontalAlignment(JLabel.CENTER);
		dataField.setVerticalAlignment(JLabel.CENTER);
		
		dataField.setAlignmentX(0);
		dataField.setAlignmentY(0);
		dataField.setBounds(0, 30, 100, 200);
		dataField.setFont(new Font("", Font.BOLD, 30));

		add(dataField);

		result.setBounds(10, 240, 650, 300);
		add(result);
		
		setVisible(true);
		revalidate();
	}
	
//	public void setResult() {
//		result = new JLabel()
//				
//				
//	}

	public static void main(String[] args) {

		new ExText02();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
//		if (e.getKeyCode() == e.VK_ENTER) {
//			data.add(this.text1.getText());
//			data.add(this.text2.getText());
//			data.add(this.text3.getText());
//
//			for (int i = 0; i < data.size(); i++) {
//				System.out.println(data.get(i));
//			}
//			System.out.println();
//
//		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			data.add(this.text1.getText());
			data.add(this.text2.getText());
			data.add(this.text3.getText());
			
			for (int i = 0; i < data.size(); i++) {
				System.out.println(data.get(i));
				result = new JLabel(String.format("<html>%s<br>%s<br>%s</html>",data.get(i),data.get(i),data.get(i)));
			}
			System.out.println();
			
			
		}
		
	}

}
