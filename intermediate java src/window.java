import java.awt.FlowLayout;  //awt: abstract window toolkits
import java.awt.event.ActionEvent;  //ActionEvent  ActionListener
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane; //so that we can interact with users


public class window extends JFrame{

	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField password;
	
	
	window(){
		super("the title");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);  //add nothing or text or number of text or both inside the text parenthesis
		add(item1);
		
		item2 = new JTextField("Enter the text here");
		add(item2);   //must add it to finish it
		
		item3 = new JTextField("uneditable things", 20);   //"uneditable" means it will show the word uneditable, 20 means the length of the area will be 20-character long
		item3.setEditable(false);  //setEditable(false) makes it not editable
		add(item3); 
		
		password = new JPasswordField("mypass");
		add(password);
		
		thehandler handler = new thehandler();
		item1.addActionListener(handler);   //objectName.addActionListener(objectNameOfActionClass);
		item2.addActionListener(handler);   //need parameter of addActionListener()
		item3.addActionListener(handler);
		password.addActionListener(handler);
		
		
		
	}
	private class thehandler implements ActionListener{  //class can be created inside a class  
		public void actionPerformed(ActionEvent event) {  //class implements ActionListener must include the void actionPerformed(ActionEvent event)
			                           //execute automatically whenever users give events, such as press enter
		 String a = "";  //build an empty String to store values
		 
		 if(event.getSource() == item1)   //event is the parameter here  //where user get access to:event.getSource()  //what the user input or give command: event.getActionCommand
			 a = String.format("field 1 = %s", event.getActionCommand());  // == is always more useful
		 else if(event.getSource() == item2)
			 a = String.format("field 2 = %s", event.getActionCommand());
		 else if(event.getSource() == item3)
			 a = String.format("field 3 = %s", event.getActionCommand());
		 else if(event.getSource() == password)
			 a = String.format("password = %s", event.getActionCommand());  //event.getActionCommand()
			 
			 
		JOptionPane.showMessageDialog(null, a);  //to output sth  //null means the default setting of putting the message in the middle of the box 
			
		}
		
		
	}
	
	
	
}
