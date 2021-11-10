package models;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Goal {

	private int x,y,w,h;	
	private String fileName;
	private ImageIcon image;
	
	public Goal(int x, int y, int w, int h, String fileName) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.fileName = fileName;
		this.image = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH));
	}
}
