package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JoinFrame01 extends JFrame{
	
	JLabel idLabel = new JLabel();
	JTextField idField= new JTextField();	
	
	
	public JoinFrame01() {
		setLayout(null);
		setBounds(200, 200, 200, 200);
		
		idLabel.setBounds(10, 20, 30, 20);
		idLabel.setText("id : ");
		add(idLabel);
		
		idField.setBounds(50, 20, 100, 20);
		idField.setText("id");
		add(idField);
		
		setVisible(true);
		revalidate();
	}
}

public class ExText01 extends JFrame implements KeyListener,ActionListener,MouseListener{
	
	JLabel dataField = new JLabel(String.format("<html>%s<br>%d</html>","test",123));

	
	JTextField text = new JTextField();
	JTextArea text2 = new JTextArea();
	
	JButton login = new JButton("login");
	JButton join = new JButton("join");
	
	JoinFrame01 joinFrame = null;
	
	public ExText01() {
	setLayout(null);
	setBounds(100, 100, 500, 500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	
	//텍스트 박스의 처리
	//JTextField		//줄바꿈불가능 한줄짜리 간단한거입력받을시 사용 일반적으로 사용
//	text.setBounds(20, 40, 300, 50);
//	text.addKeyListener(this);	
//	add(text);
	
	// JTextArea		//줄바꿈가능 게시판의 긴글들 입력받을때
//	text2.setBounds(20, 100, 300, 50);
//	add(text2);
	
	setButton();
	
//	dataField.setBounds(30, 150, 100, 100);
//	add(dataField);
	
	
	setFocusable(true);
	addKeyListener(this);
	
	setVisible(true);
	revalidate();
	
}
	private void setButton() {
		this.join.setBounds(0, 0, 100, 50);
		join.addActionListener(this);
		add(this.join, 0);
		
	}
	public static void main(String[] args) {
		new ExText01();

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == e.VK_ENTER) {
			System.out.println(this.text.getText());			
		}
		
		if(e.getSource() == this.joinFrame.idField && e.getKeyCode() == e.VK_ENTER) {
			
			this.joinFrame.dispose();	// 창종료
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.join) {
//			new JoinFrame();
			this.joinFrame = new JoinFrame01();
			this.joinFrame.idField.addKeyListener(this);
			this.joinFrame.idField.addMouseListener(this);
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == this.joinFrame.idField) {
			this.joinFrame.idField.setText("");		//텍스트필드 클릭후 공백으로만듬
		}
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
