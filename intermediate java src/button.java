import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;  //caps! ImageIcon  Icon
import javax.swing.JOptionPane;


public class button extends JFrame {
   private JButton reg;
   private JButton custom;
   
   button(){
	   super("The title");
	   setLayout(new FlowLayout());
	   
	   reg = new JButton("regular button");
	   add(reg);
	                                   
	   Icon a = new ImageIcon(getClass().getResource("a.png"));  //Icon x = new ImageIcon(getClass().getResource("address of the picture"));
	   Icon b = new ImageIcon(getClass().getResource("a2.jpg"));
	   custom = new JButton("custom button", a);  // new JButton("character on it", iconName);     //we can give icon to button
	   custom.setRolloverIcon(b);  //objectName.setRolloverIcon(x);   
	   add(custom);
	   
	   handling handler = new handling();
	   reg.addActionListener(handler);
	   custom.addActionListener(handler);
	   
   }
   public class handling implements ActionListener{
	   public void actionPerformed(ActionEvent event) {  //actionPerformed(ActionEvent event){}
		   JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));  //event.getActionCommand()
	   }
	   
   }
     //after add the pictures, do refresh the src!!!!
}
