package drawing;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Drawing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Drawing frame = new Drawing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Drawing() {
		
		setTitle(" II57-2019 Mujic Kristina ");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setBounds(100, 100, 1000, 600);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}
	
	
	public void paint(Graphics g) {
		
		Point p1 = new Point(50, 50, false);
		p1.draw(g);
		Point p2 = new Point(200, 50, true);
		p2.draw(g);
		
		Line l1 = new Line(new Point(50,100), new Point(150,100), false);
		l1.draw(g);
		Line l2 = new Line(new Point(200,100), new Point(300,100), true);
		l2.draw(g);
		
		Rectangle r1 = new Rectangle(new Point(50,150), 100, 50, false);
		r1.draw(g);
		Rectangle r2 = new Rectangle(new Point(200,150), 100,50, true);
		r2.draw(g);
		
		Circle c1 = new Circle(new Point(100,300), 50, false);
		c1.draw(g); 
		Circle c2 = new Circle(new Point(250,300), 50, true);
		c2.draw(g);
		
		Donut d1= new Donut(new Point(100,450), 30, 50, false);
		d1.draw(g);
		Donut d2 = new Donut(new Point(250,450), 30, 50, true);
		d2.draw(g);
	}

}
