package stack;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


 

public class StackDlg extends JDialog {

 

    private final JPanel pnlCenter = new JPanel();
    private JButton okButton;
    private JButton cancelButton;
    private JTextField txtXCoord;
    private JTextField txtYCoord;
    private JTextField txtWidth;
    private JTextField txtHeight;
    public boolean isOk;

    
    
    //GET I SET METODE
    protected void deleteRectangle() {
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
	
	public boolean isDelete() {
        return false;
    }
    
    
     //Launch the application.
    
    public static void main(String[] args) {
        try {
            StackDlg dialog = new StackDlg();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 

    
    //Create the dialog.
     
    public StackDlg() {

    	
        setModal(true);
        
        
        setBounds(100, 100, 311, 300);
        getContentPane().setLayout(new BorderLayout());
        pnlCenter.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(pnlCenter, BorderLayout.CENTER);

        
        JLabel lblXCoord = new JLabel("X coordinate:");
        JLabel lblTCoord = new JLabel("Y coordinate:");
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
        			.addGap(31)
        			.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_pnlCenter.createSequentialGroup()
        					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblTCoord, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(lblXCoord, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblWidth, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
        					.addGap(34))
        				.addGroup(gl_pnlCenter.createSequentialGroup()
        					.addComponent(lblHeight, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
        				.addComponent(txtWidth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtYCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtXCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(53, Short.MAX_VALUE))
        );
        gl_pnlCenter.setVerticalGroup(
        	gl_pnlCenter.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnlCenter.createSequentialGroup()
        			.addGap(23)
        			.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtXCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblXCoord))
        			.addGap(27)
        			.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtYCoord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblTCoord))
        			.addGap(28)
        			.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtWidth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblWidth))
        			.addGap(33)
        			.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtHeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblHeight))
        			.addContainerGap(26, Short.MAX_VALUE))
        );
        
        
        
        pnlCenter.setLayout(gl_pnlCenter);
        {
            JPanel pnlBtn = new JPanel();
            getContentPane().add(pnlBtn, BorderLayout.SOUTH);
            
            
                    okButton = new JButton("OK");
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
                    getRootPane().setDefaultButton(okButton);
            
                
                
              {
                cancelButton = new JButton("Cancel");
                cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                        setDelete(false);
                    }
                    private void setDelete(boolean b) {
                    }
                });
              }
                
                cancelButton.setActionCommand("Cancel");
            
            GroupLayout gl_pnlBtn = new GroupLayout(pnlBtn);
            gl_pnlBtn.setHorizontalGroup(
            	gl_pnlBtn.createParallelGroup(Alignment.LEADING)
            		.addGroup(gl_pnlBtn.createSequentialGroup()
            			.addGap(145)
            			.addComponent(okButton)
            			.addPreferredGap(ComponentPlacement.UNRELATED)
            			.addComponent(cancelButton)
            			.addGap(28))
            );
            gl_pnlBtn.setVerticalGroup(
            	gl_pnlBtn.createParallelGroup(Alignment.LEADING)
            		.addGroup(gl_pnlBtn.createSequentialGroup()
            			.addGroup(gl_pnlBtn.createParallelGroup(Alignment.BASELINE)
            				.addComponent(okButton)
            				.addComponent(cancelButton))
            			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            pnlBtn.setLayout(gl_pnlBtn);
            
            
        }
    }
}