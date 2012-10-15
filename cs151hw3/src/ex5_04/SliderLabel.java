package ex5_04;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class SliderLabel extends JLabel implements ChangeListener{
	
	public SliderLabel(Icon image) {
		super(image);
	}
	
	@Override
	public void stateChanged(ChangeEvent arg0) {
		repaint();
	}

}
