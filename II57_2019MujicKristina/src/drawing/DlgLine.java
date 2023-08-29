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

public class DlgLine extends JDialog {

	private final JPanel pnlCenter = new JPanel();
	private JTextField txtXStart;
	private JTextField txtYStart;
	private JTextField txtXEnd;
	private JTextField txtYEnd;
	public boolean isOk;
	
	//GET I SET
	public JTextField getTxtXStart() {
		return txtXStart;
	}

	public void setTxtXStart(JTextField txtXStart) {
		this.txtXStart = txtXStart;
	}

	public JTextField getTxtYStart() {
		return txtYStart;
	}

	public void setTxtYStart(JTextField txtYStart) {
		this.txtYStart = txtYStart;
	}

	public JTextField getTxtXEnd() {
		return txtXEnd;
	}

	public void setTxtXEnd(JTextField txtXEnd) {
		this.txtXEnd = txtXEnd;
	}

	public JTextField getTxtYEnd() {
		return txtYEnd;
	}

	public void setTxtYEnd(JTextField txtYEnd) {
		this.txtYEnd = txtYEnd;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgLine dialog = new DlgLine();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgLine() {
		
		setModal(true);
		
		
		setBounds(100, 100, 321, 300);
		getContentPane().setLayout(new BorderLayout());
		pnlCenter.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(pnlCenter, BorderLayout.CENTER);
		
		
		JLabel lblXStart = new JLabel("X start:");
		JLabel lblYStart = new JLabel("Y start:");
		JLabel lblXEnd = new JLabel("X end:");
		JLabel lblYEnd = new JLabel("Y end:");
		
		txtXStart = new JTextField();
		txtXStart.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
            	}
			}
		});
		txtXStart.setColumns(10);
		
		txtYStart = new JTextField();
		txtYStart.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
            	}
			}
		});
		txtYStart.setColumns(10);
		
		txtXEnd = new JTextField();
		txtXEnd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
            	}
			}
		});
		txtXEnd.setColumns(10);
		
		txtYEnd = new JTextField();
		txtYEnd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(((c>='0')&&(c<='9'))|| (c==KeyEvent.VK_BACK_SPACE))) {
					e.consume();
					getToolkit().beep();
            	}
			}
		});
		txtYEnd.setColumns(10);
		
		
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(lblXStart)
						.addComponent(lblYStart)
						.addComponent(lblXEnd)
						.addComponent(lblYEnd))
					.addGap(47)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(txtYEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtXEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtYStart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtXStart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(221, Short.MAX_VALUE))
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblXStart)
						.addComponent(txtXStart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblYStart)
						.addComponent(txtYStart, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblXEnd)
						.addComponent(txtXEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblYEnd)
						.addComponent(txtYEnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(76, Short.MAX_VALUE))
		);
		pnlCenter.setLayout(gl_pnlCenter);
		{
			JPanel pnlButton = new JPanel();
			pnlButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(pnlButton, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				
				okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	
                        if(txtXStart.getText().trim().isEmpty() ||
                                txtYStart.getText().trim().isEmpty() ||
                                txtXEnd.getText().trim().isEmpty() ||
                                txtYEnd.getText().trim().isEmpty()) {
                        	
                        	JOptionPane.showMessageDialog(null, "Enter in all the values!", "Error", JOptionPane.INFORMATION_MESSAGE);
                        	dispose();
                        	
                        	
                        }else {
                            for (Shape shape : PnlDrawing.shapesArrList) {
                            	if(shape.isSelected()) {
                            		((Line)shape).setStart(new Point
                            				(Integer.parseInt(txtXStart.getText()),
                            				Integer.parseInt(txtYStart.getText())));
                            		
                            		((Line)shape).setEnd(new Point
                            				(Integer.parseInt(txtXEnd.getText()),
                            				Integer.parseInt(txtYEnd.getText())));
                            	}
                            }
                        }
                        dispose();
                        return;
                    }
                });
				
				
				okButton.setActionCommand("OK");
				pnlButton.add(okButton);
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
				pnlButton.add(cancelButton);
			}
		}
	}

}
