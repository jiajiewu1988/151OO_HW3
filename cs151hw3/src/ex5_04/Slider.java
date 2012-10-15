package ex5_04;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class Slider extends JSlider implements ChangeListener{
	private DataModel dataModel;
	
	public Slider(DataModel d) {
		dataModel = d;
		addChangeListener(this);
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
//		System.out.println("The orientation is " + this.getValue());
		dataModel.update(this.getValue() * 2);
		System.out.println("The orientation is " + dataModel.getIconWidth());
	}

}
