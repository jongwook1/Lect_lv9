package grimpandevelop;

import java.awt.Color;

public class Triangle {

	private int x,y,p;
	private Color c;
	
	public Triangle(int x, int y, int p) {
		this.x = x;
		this.y = y;
		this.p = p;		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}
	
}
