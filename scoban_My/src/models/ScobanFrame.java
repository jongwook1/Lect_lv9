package models;

import javax.swing.JFrame;

import controller.Game;

public class ScobanFrame extends JFrame{
		
	Game game = new Game();
	
	public ScobanFrame() {
		super("소코반 게임");
		setLayout(null);
		setBounds(0, 0, 800, 800);
		
		add(game);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		revalidate();
	}
}
