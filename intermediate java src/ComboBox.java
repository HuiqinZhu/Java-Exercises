import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ComboBox extends JFrame{

	private JComboBox box;
	private JLabel a;
	
	                                                                      //new ImageButton(getClass().getResource())
	private static String[] files = {"a.png", "b.png"};   //this is an array of string, which show up as choice of the comboBox list   //create array to use in comboBox
	private Icon[] pics = {new ImageIcon(getClass().getResource(files[0])), new ImageIcon(getClass().getResource(files[1]))};  //we need to give array a name
	                                                   //we can build Icon array   Icon in java means picture or sign   set Icon arrays to give icon to label
	ComboBox(){
		super("For comboBox");
	    setLayout(new FlowLayout());
		
		box =new JComboBox(files);
		
		box.addItemListener(                 //this is an inner anonymous ItemListener class
				new ItemListener() {
				public void itemStateChanged(ItemEvent event) {      
					if(event.getStateChange() == ItemEvent.SELECTED)  //event.getStateChange() == ItemEvent.SELECTED  
					a.setIcon(pics[box.getSelectedIndex()]);         //comboBoxName.getSelectedIndex()     comboBox can getSelectedIndex 
					                                               //JLabel can set icon
				}	
					
					
				}
				
				);
	
		add(box);
		
		a = new JLabel(pics[0]);
		add(a);  //not finished until we add it
		
	}
}
