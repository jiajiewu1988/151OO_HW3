package ex5_04;

import java.awt.*;

import javax.swing.*;

public class SliderTester {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(2, 1));
		
		DataModel model = new DataModel(50);
		
		CarShape shape = new CarShape(0, 0, 100, model);
		ShapeIcon icon = new ShapeIcon(shape, 400, 100);
		SliderLabel label = new SliderLabel(icon);
		
		Slider slider = new Slider(model);
		model.attach(shape);
		model.attach(label);
		
		frame.add(label);
		frame.add(slider);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setVisible(true);
	}
}
