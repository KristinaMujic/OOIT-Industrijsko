package sort;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import drawing.Point;
import drawing.Rectangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

import stack.StackDlg;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SortFrm extends JFrame {

	public boolean isOk;
	private JPanel contentPane;

    DefaultListModel<String> dlm = new DefaultListModel<String>();
    ArrayList<Rectangle> arrayRect = new ArrayList<>();
    Stack<Rectangle> stack= new Stack<Rectangle>();
	
	//Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortFrm frame = new SortFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 //Create the frame.
	
	public SortFrm() {

        setTitle(" II57-2019 Mujic Kristina ");
        
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlC = new JPanel();
		contentPane.add(pnlC, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_pnlC = new GroupLayout(pnlC);
		gl_pnlC.setHorizontalGroup(
			gl_pnlC.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlC.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_pnlC.setVerticalGroup(
			gl_pnlC.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlC.createSequentialGroup()
					.addGap(11)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(69, Short.MAX_VALUE))
		);
		
		 JList list = new JList();
	        scrollPane.setViewportView(list);
	        pnlC.setLayout(gl_pnlC);
	        list.setModel(dlm);


	    
	        JPanel pnlDown = new JPanel();
	        contentPane.add(pnlDown, BorderLayout.SOUTH);

	        
	        
	        JButton btnAdd = new JButton("Add");
	        btnAdd.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                SortDlg sortdlg = new SortDlg();
	                sortdlg.setVisible(true);
	                if(sortdlg.isOk==true) {
	                    Rectangle rec= new Rectangle (new Point (Integer.parseInt(sortdlg.getTxtXCoord().getText()),
	                            (Integer.parseInt(sortdlg.getTxtYCoord().getText()))),
	                            (Integer.parseInt(sortdlg.getTxtWidth().getText())),
	                            (Integer.parseInt(sortdlg.getTxtHeight().getText())));
	                    arrayRect.add(rec);
	                    Collections.sort(arrayRect);
	                    dlm.add(arrayRect.indexOf(rec), "X: " + rec.getUpperLeftPoint().getX() + " , Y : " + rec.getUpperLeftPoint().getY() + 
	                            " , Width : " + rec.getWidth() + ", Height : " +  rec.getHeight());
	                   
	                    list.validate();
	                    System.out.println(stack);
	                }
	                setDelete(true);
	            }
	            private void setDelete(boolean b) {
	            }
	        });

	        
	        
	        JButton btnRemove = new JButton("Remove");
	        btnRemove.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                if (dlm.isEmpty()) {
	                    JOptionPane.showMessageDialog(null, "Nothing to remove", "Error", JOptionPane.ERROR_MESSAGE);
	                    getToolkit().beep();
	                    return;
	                }
	                Rectangle rec = stack.peek();
	                SortDlg sortdlgdelete = new SortDlg();

	                sortdlgdelete.getTxtXCoord().setText(String.valueOf(rec.getUpperLeftPoint().getX()));
	                sortdlgdelete.getTxtYCoord().setText(String.valueOf(rec.getUpperLeftPoint().getY()));
	                sortdlgdelete.getTxtWidth().setText(String.valueOf(rec.getWidth()));
	                sortdlgdelete.getTxtHeight().setText(String.valueOf(rec.getHeight()));

	 
	                sortdlgdelete.getTxtXCoord().setEditable(false);
	                sortdlgdelete.getTxtYCoord().setEditable(false);
	                sortdlgdelete.getTxtWidth().setEditable(false);
	                sortdlgdelete.getTxtHeight().setEditable(false);
	                sortdlgdelete.setVisible(true);


	                if (sortdlgdelete.isDelete()==true) {
	                    arrayRect.remove(0);
	                    dlm.removeElementAt(0);
	                    deleteRectangle();
	                }
	            }
	            private void deleteRectangle() {
	            }
	        });
	        
	        
	        
	        
	        GroupLayout gl_pnlDown = new GroupLayout(pnlDown);
	        gl_pnlDown.setHorizontalGroup(
	        	gl_pnlDown.createParallelGroup(Alignment.TRAILING)
	        		.addGroup(Alignment.LEADING, gl_pnlDown.createSequentialGroup()
	        			.addGap(82)
	        			.addComponent(btnAdd)
	        			.addGap(38)
	        			.addComponent(btnRemove)
	        			.addContainerGap(73, Short.MAX_VALUE))
	        );
	        gl_pnlDown.setVerticalGroup(
	        	gl_pnlDown.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_pnlDown.createSequentialGroup()
	        			.addGroup(gl_pnlDown.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(btnAdd)
	        				.addComponent(btnRemove))
	        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        pnlDown.setLayout(gl_pnlDown);

	    }
	}
