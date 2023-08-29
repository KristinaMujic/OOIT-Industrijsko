package drawing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
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

public class DlgRectangle extends JDialog {

	private final JPanel pnlCenter = new JPanel();
	private JTextField txtXCoord;
	private JTextField txtYCoord;
	private JTextField txtWidth;
	private JTextField txtHeight;
	public boolean isOk;
	
	
	//GET I SET
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

	public JTextField getTxtWidth() {
		return txtWidth;
	}

	public void setTxtWidth(JTextField txtWidth) {
		this.txtWidth = txtWidth;
	}

	public JTextField getTxtHeight() {
		return txtHeight;
	}

	public void setTxtHeight(JTextField txtHeight) {
		this.txtHeight = txtHeight;
	}

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgRectangle dialog = new DlgRectangle();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgRectangle() {
		
		
		setModal(true);
		
		
		
		setBounds(100, 100, 315, 300);
		getContentPane().setLayout(new BorderLayout());
		pnlCenter.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(pnlCenter, BorderLayout.CENTER);
		
		
		
		JLabel lblXCoord = new JLabel("X coordinate:");
		JLabel lblYCoord = new JLabel("Y coordinate:");
		JLabel lblWidth = new JLabel("Width:");
		JLabel lblHeight = new JLabel("Height:");
		
		
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
		
		
		txtWidth = new JTextField();
		txtWidth.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
            	}
			}
		});
		txtWidth.setColumns(10);
		
		
		txtHeight = new JTextField();
		txtHeight.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
            	}
			}
		});
		
		
		txtHeight.setColumns(10);
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(lblXCoord)
						.addComponent(lblYCoord)
						.addComponent(lblWidth)
						.addComponent(lblHeight))
					.addGap(51)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtWidth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtYCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtXCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(55, Short.MAX_VALUE))
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblXCoord)
						.addComponent(txtXCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblYCoord)
						.addComponent(txtYCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWidth)
						.addComponent(txtWidth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHeight)
						.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(86, Short.MAX_VALUE))
		);
		pnlCenter.setLayout(gl_pnlCenter);
		{
			JPanel btnPanel = new JPanel();
			btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(btnPanel, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				
				okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	
                        if(txtXCoord.getText().trim().isEmpty() ||
                                txtYCoord.getText().trim().isEmpty() || 
                                txtWidth.getText().trim().isEmpty()||
                                txtHeight.getText().trim().isEmpty()) {

                                    isOk=false;
                                    getToolkit().beep();
                                    JOptionPane.showMessageDialog(null, "Enter in all the values!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        else {
                        	for (Shape shape : PnlDrawing.shapesArrList) {
                        		if(shape.isSelected()) {
                        			shape.move(Integer.parseInt(txtXCoord.getText()), 
                        					Integer.parseInt(txtYCoord.getText()));
                        			
                        			((Rectangle)shape).setWidth(Integer.parseInt(txtWidth.getText()));
                        			((Rectangle)shape).setHeight(Integer.parseInt(txtHeight.getText()));
                        		}
                        	}
                        	
                            isOk=true;
                            dispose();
                        }
                    }
                });
				
				okButton.setActionCommand("OK");
				btnPanel.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				
				cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                    }      
                });
              
				btnPanel.add(cancelButton);
			}
		}
	}

}
