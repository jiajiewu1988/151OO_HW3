package mvc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.*;

/**
 * JFrame with JButton, JTextArea, and JTextField
 * @author Jiajie Wu
 *
 */
@SuppressWarnings("serial")
public class MVCFrame extends JFrame implements ChangeListener{
	
	private Model model;
	private ArrayList<String> strList = new ArrayList<String>();
	JTextArea txtArea;
	
	/**
	 * Constructs the Frame
	 * @param m the model
	 */
	public MVCFrame(Model m) {
		model = m;
		strList = model.getList();
		txtArea = new JTextArea(20, 40);
		
		setLayout(new BorderLayout());
		setTitle("MVC Practice - Jiajie Wu");
		
		JButton btn = new JButton("add");
		final JTextField txtField = new JTextField();
		JScrollPane txtAreaScroller = new JScrollPane(txtArea);
		txtAreaScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		txtArea.setEditable(false);
		
		//anonymous class to create a ActionListener to the add Button, it's a controller
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.add(txtField.getText());
				txtField.setText("");
			}
		});
		
		
		add(txtAreaScroller, BorderLayout.NORTH);
		add(txtField, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	/**
	 * Append the new String from the JTextField to the JTextArea, this is a controller
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		int size = strList.size();
		if (size >1)
			txtArea.append("\n");
		txtArea.append(strList.get(size - 1));
	}
}
