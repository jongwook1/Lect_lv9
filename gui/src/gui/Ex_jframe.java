package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;		// 스윙이 가진 모든 클래스 사용
import javax.swing.JFrame;

// GUI : Graphic User Interface
// ㄴ awt   무겁다
// ㄴ swing 가볍다

// JFrame : 최상위 컨테이너 <-  
// JPanel : 컨테이너 <- 컴포넌트라고 부르는 기타요소들을 add()붙여나가면서 완성함
// JButton,JTextField, JLabel, JCheckBox,,,

class MyPanel extends JPanel implements ActionListener{	

	// 버튼 만들기 
	// JButton
//	JButton bt = new JButton();	
	
	// 버튼 연습
	// 정방형으로 3*3 버튼의 나열
	final int SIZE = 65;
	JButton[] map = new JButton[9];
	
	
	
	
	public MyPanel() {
		setLayout(null);
		
		setBounds(0, 0, 200, 200);		
		setBackground(Color.orange);
		
//		this.bt.setBounds(50, 50, 50, 50);
//		this.bt.setVisible(true);
		// map의 각 버튼 셋팅
		// 모두 -> panel 에 add
		int x = 0;
		int y = 0;
		for(int i=0; i<this.map.length; i++) {	
			map[i]=new JButton();			
			
			this.map[i].setBounds(x,y,SIZE, SIZE);
			
			this.map[i].addActionListener(this);	//addActionListener가 센서역할
			add(this.map[i]);
			
			x += SIZE+1;
			if(i % 3 == 2) {
				y += SIZE+1;
				x = 0;
			}
		}
				

//		this.bt.setBounds(0, 0, 65, 65);
//		this.bt.setVisible(true);
//		add(this.bt);		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		JButton temp =(JButton) e.getSource();	//이벤트가 발생한 객체를 가져옴(클릭된 버튼)
		for(int i=0; i<this.map.length; i++) {
			if(this.map[i] == temp) {
				System.out.println(i);		//버튼클릭시(콘솔에 액션이) 발생한 인덱스를 출력
				temp.setBackground(Color.blue);				//버튼 클릭시(콘솔에 액션이 발생) -> 버튼의 색이 변경되도록 처리
//				temp.setText("O");
//				if(temp.getText().equals("O")) {
//					
//				}
			}
		}
		

	}
	
}

class MyFrame extends JFrame{
	
	private Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
	private int width = dm.width;
	private int height = dm.height;
	private final int W = 800;
	private final int H = 600;
	
	public MyFrame(String title) {
		// 부모 생성자를 활용한 프레임의 제목 설정
		super(title);
		setLayout(null);	//디폴트 레이아웃 구성을 삭제함
		
		// 프레임의 크기 설정
		//setBounds(x,y,width,height);
		// Dimension을 활용한 스크린 중앙에 좌표잡기
		setBounds(this.width/2-W/2,this.height/2-H/2, W, H);//setBounds(100,100,800,600);
		// 프레임의 종료 연산(명령)을 결정 (생략시, 프레임은 사라지지만 스레드가 종료X)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임을 눈에 보이게 설정
		setVisible(true);
		
//		add(new MyPanel());
//		this.setContentPane(new MyPanel());
		
	}
	
}

public class Ex_jframe {

	public static void main(String[] args) {
		MyFrame frame = new MyFrame("Green IT");
		frame.setContentPane(new MyPanel());
	}

}
