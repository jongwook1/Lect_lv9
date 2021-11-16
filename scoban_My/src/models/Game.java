package controller;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

import models.Util;
import models.Wall;

public class Game extends Util{		
	Random random = new Random();	
	
	private int wallCnt = random.nextInt(10)+20;
	Wall[][] wall = new Wall[10][10];
//	private int map[][] = new int[10][10];
	
	public Game() {
		setLayout(null);
		setBounds(0, 0, 800, 800);
		
//		setBackground(Color.black);
		
		setWall();
	}

	private void setWall() {
		
		int x = 0;
		int y = 0;
		
		////// Wall(int x, int y, int w, int h, String fileName)
		for (int i = 0; i < wall.length; i++) {
			for (int j = 0; j < wall[i].length; j++) {
				this.wall[i][j] = new Wall(x, y, 80, 80, "images/tile2.png");
				if(i==0)
				x += 80 ;					
				
			}
			x = 0;
			y += 80 ;	
		
		}
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {		
		super.paintComponent(g);
		for (int i = 0; i < wall.length; i++) {
			for (int j = 0; j < wall[i].length; j++) {
				g.drawImage(wall[i][j].getImage().getImage(), wall[i][j].getX(), wall[i][j].getY(), null);
			}
		}
//		g.drawImage(h.getImage().getImage(), h.getX(), h.getY(), null);
		
		repaint();
	}
}
