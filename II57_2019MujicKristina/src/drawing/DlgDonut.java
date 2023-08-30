package drawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DlgDonut extends JDialog {

	private final JPanel pnlCenter = new JPanel();
	
	public boolean isOk;
	private JTextField txtXCoord;
	private JTextField txtYCoord;
	private JTextField txtRadius;
	private JTextField txtInnerRadius;
	
	private Color outline = Color.black;
	private Color fill = Color.white;
	private boolean outlineBool;
	private boolean fillBool;
	

	
	
	//GET I SET
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

	public boolean isOutlineBool() {
		return outlineBool;
	}

	public void setOutlineBool(boolean outlineBool) {
		this.outlineBool = outlineBool;
	}

	public boolean isFillBool() {
		return fillBool;
	}

	public void setFillBool(boolean fillBool) {
		this.fillBool = fillBool;
	}
	
	public JTextField getTxtXCoord() {
		return txtXCoord;
	}

	public void setTxtXCoord(JTextField txtXCoord) {
		this.txtXCoord = txtXCoord;
	}

	public JTextField getTxtYCoord() {
		return txtYCoord;
	}

	public void setTxtYCoord(JTextField txtYCoord) {
		this.txtYCoord = txtYCoord;
	}

	public JTextField getTxtRadius() {
		return txtRadius;
	}

	public void setTxtRadius(JTextField txtRadius) {
		this.txtRadius = txtRadius;
	}

	public JTextField getTxtInnerRadius() {
		return txtInnerRadius;
	}

	public void setTxtInnerRadius(JTextField txtInnerRadius) {
		this.txtInnerRadius = txtInnerRadius;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgDonut dialog = new DlgDonut();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgDonut() {
		
		setModal(true);
		
		
		
		setBounds(100, 100, 305, 339);
		getContentPane().setLayout(new BorderLayout());
		pnlCenter.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(pnlCenter, BorderLayout.CENTER);
		
		
		
		JLabel lblXCoord = new JLabel("X coordinate:");
		JLabel lbYCoord = new JLabel("Y coordinate:");
		JLabel lblRadius = new JLabel("Radius:");
		JLabel lblInnerRadius = new JLabel("Inner radius:");
		
		txtXCoord = new JTextField();
		txtXCoord.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
            	}
			}
		});
		txtXCoord.setColumns(10);
		
		txtYCoord = new JTextField();
		txtYCoord.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
            	}
			}
		});
		txtYCoord.setColumns(10);
		
		txtRadius = new JTextField();
		txtRadius.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
            	}
			}
		});
		txtRadius.setColumns(10);
		
		txtInnerRadius = new JTextField();
		txtInnerRadius.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
            	}
			}
		});
		txtInnerRadius.setColumns(10);
		
		JButton btnOutlineColor = new JButton("Outline color");
		btnOutlineColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outline = JColorChooser.showDialog(null, "Chose a color", Color.BLACK);
				outlineBool = true;
			}
		});
		
		JButton btnFillColor = new JButton("Fill color");
		btnFillColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fill = JColorChooser.showDialog(null, "Chose a color", Color.WHITE);
				fillBool = true;
			}
		});
		
		
		
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblXCoord)
								.addComponent(lbYCoord)
								.addComponent(lblRadius)
								.addComponent(lblInnerRadius))
							.addGap(35)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(txtInnerRadius, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRadius, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtYCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtXCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnFillColor, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnOutlineColor, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(66, Short.MAX_VALUE))
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblXCoord)
						.addComponent(txtXCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbYCoord)
						.addComponent(txtYCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRadius)
						.addComponent(txtRadius, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblInnerRadius)
						.addComponent(txtInnerRadius, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnOutlineColor)
					.addGap(18)
					.addComponent(btnFillColor)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnlCenter.setLayout(gl_pnlCenter);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				
				okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	
                        if(getTxtXCoord().getText().trim().isEmpty() ||
                        		getTxtYCoord().getText().trim().isEmpty() || 
                        		getTxtRadius().getText().trim().isEmpty() ||
                                getTxtInnerRadius().getText().trim().isEmpty()) {

                                    isOk=false;
                                    JOptionPane.showMessageDialog(null, "Enter in all the values!", "Error", JOptionPane.ERROR_MESSAGE);
                                    getToolkit().beep();
                        }else {
                        	if(Integer.parseInt(txtRadius.getText()) >
                        		Integer.parseInt(txtInnerRadius.getText())) {
                        		for (Shape shape : PnlDrawing.shapesArrList) {
                        			if(shape.isSelected()) {
                        				shape.move(Integer.parseInt(txtXCoord.getText()), 
                        						Integer.parseInt(txtYCoord.getText()));
                        				
                        				((Donut)shape).setRadius(Integer.parseInt(txtRadius.getText()));
                        				((Donut)shape).setInnerRadius(Integer.parseInt(txtInnerRadius.getText()));
                        			}
                        			
                        			if(isOutlineBool()) {
                                    	shape.setOutline(outline);
                                    	setOutlineBool(false);
                                    }
                        			
                                    if(isFillBool()) {
                                    	shape.setFill(fill);
                                    	setFillBool(false);	
                                    }
                                    
                        		}
                        			isOk=true;
                        			dispose();
                        		}else {
                        			isOk = false;
                        			JOptionPane.showMessageDialog(null, "The inner radius must be smaller than the outer radius!",
                        					"Error", JOptionPane.ERROR_MESSAGE);
                        		}
                        }
                    }
                });
				
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                    }
                });
				
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	

}
