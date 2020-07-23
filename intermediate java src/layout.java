import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class layout extends JFrame {

	private JButton left;
	private JButton center;
	private JButton right;
	private FlowLayout layout;   //FlowLayout and Container can also be a variable
	private Container container;
	
	layout(){
		super("For FlowLayout");
		layout = new FlowLayout();
		setLayout(layout);
		container = getContentPane();  //??   ContainerName = getContentPane(); ContainerObject = getContentPane();
		
		
		left = new JButton("left");
		add(left);
		left.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.LEFT);    //LayoutName.setAlignment(FlowLayout.LEFT/CENTER/RIGHT);
						layout.layoutContainer(container);   //LayoutObject.layoutContainer(ContainerObject);   
					}
				}
				
				);
		
		center = new JButton("center");
		add(center);
		center.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}
				}
				
				);
		
		right  = new JButton("right");
		add(right);                           //must add every item
		right.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}
				}
				
				);
		
		
		
		
		
		
	}
	
	
}
