package drawing;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Comparable, Moveable {

	//obelezje
	private boolean selected;
	
	private Color outline = Color.black;
	private Color fill = Color.white;
	public abstract void AreaPinter(Graphics g);
	
	public abstract boolean contains(int x, int y);
	public abstract void draw(Graphics g);
	public abstract void DialogEdit();

	
	
	
	
	//get i set metode
	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public Color getOutline() {
		return outline;
	}

	public void setOutline(Color outline) {
		this.outline = outline;
	}

	public Color getFill() {
		return fill;
	}

	public void setFill(Color fill) {
		this.fill = fill;
	}

	
	
	
	//konstruktori
	public Shape() {
	}
	
	public Shape(boolean selected) {
		super();
		this.selected = selected;
	}

	
	

	
	
	
}
