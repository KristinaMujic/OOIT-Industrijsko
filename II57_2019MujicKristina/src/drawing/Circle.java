package drawing;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	//obelezja
	private Point center;
	private int radius;
	
	
	//get i set metode
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	//konstruktori
	public Circle() {
	}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		setSelected(selected);
	}
	
	
	//tekst na konzoli
	public String toString() {
		return "Circle [center= " + center + " , radius= " + radius + " , selected= " + isSelected() + " ]";
	}
	
	@Override
	public int compareTo(Object o) {
		return 0;
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(getOutline());
		g.setColor(Color.black);
		g.drawOval(this.getCenter().getX() - this.getRadius(),
				this.getCenter().getY() - this.getRadius(), 
				this.getRadius()*2, 
				this.getRadius()*2);
		if(isSelected() == true) {
			//centar
			g.drawRect(this.getCenter().getX()-3, this.getCenter().getY()-3, 6, 6);
			//gore
			g.drawRect(this.getCenter().getX()-3, this.getCenter().getY()-this.getRadius()-3, 6, 6);
			//dole
			g.drawRect(this.getCenter().getX()-3, this.getCenter().getY()+this.getRadius()-3, 6, 6);
			//levo
			g.drawRect(this.getCenter().getX()-this.getRadius()-3, this.getCenter().getY()-3, 6, 6);
			//desno
			g.drawRect(this.getCenter().getX()+this.getRadius()-3, this.getCenter().getY()-3, 6, 6);
		}
		
	}
	@Override
	public boolean contains(int x, int y) {
		return this.getCenter().distance(x, y) <= this.getRadius();
	}
	
	
	@Override
	public void move(int newX, int newY) {
		center.move(newX,  newY);
	}
	
	
	@Override
	public void DialogEdit() {
		DlgCircle dlgLCircle = new DlgCircle();
		for (Shape shape : PnlDrawing.shapesArrList) {
			if (shape.isSelected()) {
				String[] split = shape.toString().split(" ");
				dlgLCircle.getTxtXCoord().setText(split[4]);
				dlgLCircle.getTxtYCoord().setText(split[7]);
				dlgLCircle.getTxtRadius().setText(split[13]);
			}
		}
		dlgLCircle.setVisible(true);
	}
	@Override
	public void AreaPinter(Graphics g) {
		g.setColor(getFill());
		g.fillOval(this.getCenter().getX() - this.getRadius(),
				this.getCenter().getY() - this.getRadius(), 
				this.getRadius() * 2, 
				this.getRadius() * 2);
	}
	
	
	
	
	
	
	
}
