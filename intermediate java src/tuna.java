import java.awt.FlowLayout;   //import java.awt.FlowLayout(layout) javax.swing.JFrame(frame) javax.swing.JLabel(content)
import javax.swing.JFrame;
import javax.swing.JLabel;



public class tuna extends JFrame{  //class extends JFrame

	private JLabel item1;   //create the variable:private JLabel name;
	
	public tuna() {
		super("This is the title");  //build the constructor and set title: super(" ");  
		setLayout(new FlowLayout()); //set layout:  setLayout(new FlowLayout());
		
		item1 = new JLabel("This is the content");   //set content/label: objectName = new JLabel(" ");
		item1.setToolTipText("This is the message poping out when the mouse hover over it");  //objectName.setToolTipText(" ");
		add(item1);   //not finished until: add(objectName);      //setText();   setToolTipText();
	}


		
	}
