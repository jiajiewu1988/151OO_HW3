package mvc;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;

/**
 * Test the MVC pattern
 * @author Jiajie Wu
 *
 */
public class MVCTester {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Model model = new Model(list);
		MVCFrame mf = new MVCFrame(model);
		model.attach(mf);
	}
}
