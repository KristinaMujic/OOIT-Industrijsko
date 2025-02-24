package drawing;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	//obelezja
	private Point upperLeftPoint;
	private int width;
	private int height;

	public int area() {
		return width*height;
	}

	//get i set metode
	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}
	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}



	//konstruktori
	public Rectangle() {
	}

	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
		this(upperLeftPoint, width, height);
		setSelected(selected);
	}

	//tekst na konzoli
	public String toString() {
        return "Rectangle [ulp= " + upperLeftPoint + " , width= " + width + " , height= " + height + " , selected= " + isSelected() + "]";
    }

	@Override
	public int compareTo(Object o) {
		if(o instanceof Rectangle) {
			return (int)(this.area()-((Rectangle)o).area());
		}
		return 0;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(getOutline());
		g.setColor(Color.black);
		g.drawRect(this.getUpperLeftPoint().getX(), this.getUpperLeftPoint().getY(), this.getWidth(), this.getHeight());
		if(isSelected() == true) {
			//gore levo
			g.drawRect(this.getUpperLeftPoint().getX()-3, this.getUpperLeftPoint().getY()-3, 6, 6); 
			//gore desno
			g.drawRect(this.getUpperLeftPoint().getX() + this.getWidth()-3, this.getUpperLeftPoint().getY()-3, 6, 6); 
			//dole levo
			g.drawRect(this.getUpperLeftPoint().getX()-3, this.getUpperLeftPoint().getY() + this.getHeight()-3, 6, 6); 
			//dole desno
			g.drawRect(this.getUpperLeftPoint().getX() + this.getWidth()-3, this.getUpperLeftPoint().getY() + this.getHeight()-3, 6, 6); 
		}

	}




	@Override
	public boolean contains(int x, int y) {
		return (this.upperLeftPoint.getX() <= x &&
				x <= this.upperLeftPoint.getX() + width &&
				this.upperLeftPoint.getY() <= y &&
				y <= this.upperLeftPoint.getY() + height);
	}

	@Override
	public void move(int newX, int newY) {
		upperLeftPoint.move(newX, newY);

	}

	@Override
	public void DialogEdit() {
		DlgRectangle dlgRectangle = new DlgRectangle();
		for (Shape shape : PnlDrawing.shapesArrList) {
			if (shape.isSelected()) {
				String[] split = shape.toString().split(" ");
				dlgRectangle.getTxtXCoord().setText(split[4]);
				dlgRectangle.getTxtYCoord().setText(split[7]);
				dlgRectangle.getTxtWidth().setText(split[13]);
				dlgRectangle.getTxtHeight().setText(split[16]);
			}
		}

		dlgRectangle.setVisible(true);
	}

	@Override
	public void AreaPainter(Graphics g) {
		g.setColor(getFill());
		g.fillRect(this.getUpperLeftPoint().getX(), this.getUpperLeftPoint().getY(), this.getWidth(), this.getHeight());

	}




}