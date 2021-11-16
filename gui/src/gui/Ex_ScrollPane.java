package gui;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class ExPanel999 extends JPanel{
	public ExPanel999() {
		// TODO Auto-generated constructor stub
	}
}

public class Ex_ScrollPane extends JFrame {

	JScrollPane js = null;
	
	JTable table = new JTable();
	JLabel label = new JLabel();
	JLabel image = new JLabel();
//	ExPanel999 panel = new ExPanel999();
	
	public Ex_ScrollPane() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setScrollPane();
		
		setVisible(true);
		revalidate();
	}
	
	private void setScrollPane() {
		// JScrollPane 은 스크롤 기능이 있는 레이어 라고 보면됨
		
		//스크롤페인에 얹을 컴포넌트를 준비  >>		
		ImageIcon image = new ImageIcon(new ImageIcon("images/999.jpg").getImage().getScaledInstance(800, 800, Image.SCALE_SMOOTH));
		this.image = new JLabel(image);
		this.image.setBounds(0,0,800,800);
		this.image.setVisible(true);
		
		//스크롤페인의 설정
		this.js = new JScrollPane(this.image);	//생성자에서 스크롤페인에 담을 컴포넌트를 인자로 넘김
		
//		this.js = new JScrollPane(table);
//		this.js = new JScrollPane(panel);
		
		this.js.setBounds(0, 0, 500, 500);
		js.setAutoscrolls(true);
		add(js);
		
	}

	public static void main(String[] args) {
		new Ex_ScrollPane();

	}

}
