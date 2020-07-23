import java.awt.*;               //just import the type   import java.awt.*; import java.awt.event.*; import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

public class checkbox extends JFrame {
	private JTextField a;
	private JCheckBox bold;
	private JCheckBox italic;
	
	
	public checkbox() {
		super("The title");
		setLayout(new FlowLayout());
		
		
		a = new JTextField("hello baby");
		a.setFont(new Font("Serif", Font.PLAIN,20));   //x.setFont(new Font("fontStyle", Font.PLAIN/BOLD/+ITALIC, sizeNumber));
		add(a);
		
		
	   bold = new JCheckBox("bold");
	   italic = new JCheckBox("italic");
	   add(bold);
	   add(italic);
	   
	   handling handler = new handling();
	   bold.addItemListener(handler);     //checkBoxName.addItemListener(classObjectName)
	   italic.addItemListener(handler);
		
		
		
	}                                                          //implements means we should override every method of that class, luckily it usually has just one method
	public class handling implements ItemListener{            //implements ItemListener{}   void itemStateChanged(ItemEvent event){}
		public void itemStateChanged(ItemEvent event) {  
			
			Font font = null;     //create font object to store and change value
			
			if(bold.isSelected() && italic.isSelected())    //checkBoxName.isSelected()   (boolean)
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 20);
			else if(bold.isSelected())
				font = new Font("Serif", Font.BOLD, 20); 
			else if(italic.isSelected())
				font = new Font("Serif", Font.ITALIC, 20);
			else
				font = new Font("Serif", Font.PLAIN, 20);
			
			a.setFont(font);  //x.steFont(fontObject);   //JTextFieldName.setFont()
				
			
			
			
		}
		
	}

	
}
