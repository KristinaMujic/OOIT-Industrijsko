	package drawing;

import java.awt.Color;
import java.awt.Graphics;

public class Donut extends Circle {

	//obelezja
	private int innerRadius;
	
	
	//get i set metoda
	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	
	//konstruktor
	public Donut() {
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		super(center, radius);
		this.innerRadius = innerRadius;
	}

	public Donut(Point center, int radius,int innerRadius, boolean selected) {
		this(center,radius,innerRadius);
		setSelected(selected);
	}
	
	
	//tekst na konzoli
	public String toString() {
		return "Donut [ InnerRadius= " + innerRadius + " , [Outer " + super.toString() + "]]" ;
	}
	
	public void draw(Graphics g) {
		g.setColor(getOutline());
		g.setColor(Color.black);
		super.draw(g);
		g.drawOval(this.getCenter().getX() - this.getInnerRadius(),
				this.getCenter().getY() - this.getInnerRadius(), 
				this.getInnerRadius()*2, 
				this.getInnerRadius()*2);
	}
	
	
	public boolean contains(int x, int y) {
		return super.contains(x, y) &&
				this.getCenter().distance(x, y) >= this.getInnerRadius();
	}
	
	@Override
	public void DialogEdit() {
		DlgDonut dlgDonut = new DlgDonut();
		for (Shape shape : PnlDrawing.shapesArrList) {
			if (shape.isSelected()) {
				String[] split = shape.toString().split(" ");
				dlgDonut.getTxtXCoord().setText(split[4]);
				dlgDonut.getTxtYCoord().setText(split[7]);
				dlgDonut.getTxtRadius().setText(split[13]);
			}
		}

		dlgDonut.setVisible(true);
	}
	
	@Override
	public void AreaPinter(Graphics g) {
		super.AreaPinter(g);
		g.setColor(getFill());
		g.fillRect(this.getCenter().getX() - this.getInnerRadius(), 
				this.getCenter().getY() - this.getInnerRadius(), 
				this.getRadius()*2, 
				this.getRadius()*2);
		g.setColor(Color.WHITE);
		g.fillOval(this.getCenter().getX() - this.getInnerRadius(), 
				this.getCenter().getY() - this.getInnerRadius(), 
				this.getRadius()*2, 
				this.getRadius()*2);
		
	}
	
	
}
