package sort;

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
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SortDlg extends JDialog {

	
	
	private final JPanel contentPanel = new JPanel();
	private JTextField txtXCoord;
	private JTextField txtYCoord;
	private JTextField txtWidth;
	private JTextField txtHeight;
    public boolean isOk;

    
    public boolean isOk() {
        return isOk;
    }
    
    
  //GET I SET METODE
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

  	//
  	protected void deleteRectangle() {
      }
  	public boolean isDelete() {
          return false;
      }
    
    
    
    
	//Launch the application.
	 
	public static void main(String[] args) {
		try {
			SortDlg dialog = new SortDlg();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	//Create the dialog.
	public SortDlg() {
		
		
        setModal(true);
        
        
		setBounds(100, 100, 278, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblXCoord = new JLabel("X coordinate:");
		
		JLabel lblYCoord = new JLabel("Y coordinate:");
		
		JLabel lblWidth = new JLabel("Wight:");
		
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
		
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblYCoord)
						.addComponent(lblXCoord)
						.addComponent(lblWidth)
						.addComponent(lblHeight))
					.addGap(33)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtXCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtYCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtWidth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(58, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtXCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblXCoord))
					.addGap(28)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtYCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblYCoord))
					.addGap(29)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtWidth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblWidth))
					.addGap(32)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHeight))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
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
                                    JOptionPane.showMessageDialog(null, "Fill in all the blanks", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        else {
                            isOk=true;
                            dispose();
                            deleteRectangle();
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
                        setDelete(false);
                    }
                    private void setDelete(boolean b) {
                    }
                });
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
