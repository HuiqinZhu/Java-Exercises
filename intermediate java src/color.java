import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class color extends JFrame{

	private JPanel a;
	private JButton b;
	private Color c;   //Color can also be a variable
	
	
	color(){
		super("Title for choosing a color for panel");
		
		a = new JPanel();
		c = Color.WHITE;
		
		a.setBackground(c);
		
		b = new JButton("Choose a color for this panel");
		b.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event){
						c = JColorChooser.showDialog(null, "Choose a color", c);   // x = JColorChooser.showDialog(null, "", x) ?
						if(c == null)
							c = Color.WHITE;
						    
						 
					  a.setBackground(c);
					}
				}
				
				);
		
		add(a, BorderLayout.CENTER);   //BorderLayout is for single item, but FlowLayout is for the whole panel/frame
		add(b, BorderLayout.SOUTH);
		setSize(300, 150);
		setVisible(true);  //can also set inside this class
		
	}
}
