package drawing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DrawFrm extends JFrame {

	private JPanel contentPane;
	private PnlDrawing pnlDrawing = new PnlDrawing();
	

	static Color outline = Color.BLACK;
	static Color area = Color.WHITE;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrawFrm frame = new DrawFrm();
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
	public DrawFrm() {
		
		setTitle(" II57-2019 Mujic Kristina ");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		pnlDrawing.setBackground(Color.WHITE);
		pnlDrawing.setBorder(null);
		contentPane.add(pnlDrawing,BorderLayout.CENTER);
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		
		JButton btnPoint = new JButton("Point");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PnlDrawing.obj= 1;
				for (Shape shape : PnlDrawing.shapesArrList) {
					shape.setSelected(false);
				}
			}
		});
		
		JButton btnLine = new JButton("Line");
		btnLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PnlDrawing.obj= 2;	
				for (Shape shape : PnlDrawing.shapesArrList) {
					shape.setSelected(false);
				}
			}
		});
		
		JButton btnRectangle = new JButton("Rectangle");
		btnRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PnlDrawing.obj= 3;	
				for (Shape shape : PnlDrawing.shapesArrList) {
					shape.setSelected(false);
				}
				DlgRectangle dlgRectangle = new DlgRectangle();
			}
		});
		
		JButton btnCircle = new JButton("Circle");
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PnlDrawing.obj= 4;
				for (Shape shape : PnlDrawing.shapesArrList) {
					shape.setSelected(false);
				}
			}
		});
		
		JButton btnDonut = new JButton("Donut");
		btnDonut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PnlDrawing.obj= 5;
				for (Shape shape : PnlDrawing.shapesArrList) {
					shape.setSelected(false);
				}
			}
		});
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(PnlDrawing.shapesArrList.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nothing to select!", "Information", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				PnlDrawing.obj= 6;
				for (Shape shape : PnlDrawing.shapesArrList) {
		            shape.setSelected(false);
				}
			}
		});
		
		JButton btnModify = new JButton("Modify");
		
		JButton btnDelete = new JButton("Delete");
		
		JButton btnOutlineColor = new JButton("Outline Color");
		btnOutlineColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outline = JColorChooser.showDialog(null, "Choose a color", Color.BLACK);
				if(outline == null) {
				    outline = Color.BLACK;
				}
			}
		});
		
		JButton btnAreaColor = new JButton("Area Color");
		btnAreaColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area = JColorChooser.showDialog(null, "Choose a color", Color.WHITE);
				if(area == null) {
				    area = Color.WHITE;
				}
			}
		});
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnAreaColor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnPoint, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(btnLine, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(btnRectangle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(btnCircle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(btnDonut, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(btnSelect, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(btnModify, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(btnDelete, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(btnOutlineColor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnPoint)
					.addGap(12)
					.addComponent(btnLine)
					.addGap(18)
					.addComponent(btnRectangle)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCircle)
					.addGap(18)
					.addComponent(btnDonut)
					.addGap(18)
					.addComponent(btnSelect)
					.addGap(18)
					.addComponent(btnModify)
					.addGap(18)
					.addComponent(btnDelete)
					.addGap(18)
					.addComponent(btnOutlineColor)
					.addGap(18)
					.addComponent(btnAreaColor)
					.addContainerGap(51, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}

	

}
