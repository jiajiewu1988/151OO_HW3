package mvc;

import java.util.*;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Model to store the String to be shown in the TextArea
 * @author Jiajie Wu
 *
 */
public class Model {
	private  ArrayList<String> strList;
	ArrayList<ChangeListener> listeners;
	
	/**
	 * Constructs the model
	 * @param list the initial ArrayList
	 */
	public Model(ArrayList<String> list) {
		strList = list;
		listeners = new ArrayList<ChangeListener>();
	}
	
	/**
	 * Add a String to the list
	 * @param str String to be added
	 */
	public void add(String str) {
		strList.add(str);
		for (ChangeListener l : listeners) {
			l.stateChanged(new ChangeEvent(this));
		}
	}
	
	/**
	 * Get the Data
	 * @return the ArrayList store all the message
	 */
	public ArrayList<String> getList() {
		return strList;
	}
	
	/**
	 * Register a ChangeListener to the Model
	 * @param l ChangeListener to be added into the ChangeListener list
	 */
	public void attach(ChangeListener l) {
		listeners.add(l);
	}
	
}
