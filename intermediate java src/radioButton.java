import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class radioButton extends JFrame {

	private JTextField a; 
	private JRadioButton pr;        //radioButton is similar to checkBox, but different from checkBox, only one of the radioButton can be selected
	private JRadioButton br;
	private JRadioButton ir;
	private JRadioButton bir;
	private Font p;
	private Font b;
	private Font i;
	private Font bi;
	private ButtonGroup g;  //ButtonGroup
	
	public radioButton(){
		super("For radioButton");
		setLayout(new FlowLayout());
		
		a = new JTextField("baby you are brilliant", 20);
		add(a);
		
		pr = new JRadioButton("plain", true);  //new JRadioButton("text on it", true/false)  true means selected, false means not selected
		add(pr);
		br = new JRadioButton("bold", false);  //add true or false to make it on or close by default
		add(br);
		ir = new JRadioButton("italic", false);
		add(ir);
		bir = new JRadioButton("bold and italic", false);
		add(bir);
		
		g = new ButtonGroup();  //ButtonGroup is not a button, but a button group, and should add button to make each other know which is on 
		g.add(pr);  //add one by one
		g.add(br);
		g.add(ir);
		g.add(bir);
		
		
		
		p = new Font("Serif", Font.PLAIN, 20);   //FONT IS NOT A ITEM, THUS, NO NEED TO ADD THE FONT
		b = new Font("Serif", Font.BOLD, 20);       //new Font("", Font.XXXX, sizeNumber);
		i = new Font("Serif", Font.ITALIC, 20);
		bi = new Font("Serif", Font.BOLD + Font.ITALIC, 20);
		
		pr.addItemListener(new handling(p));
		br.addItemListener(new handling(b));      //set the variable as parameter directlt
		ir.addItemListener(new handling(i));     //new className(variable) means we need variable and constructor for that class
		bir.addItemListener(new handling(bi));
		
		
	}
	public class handling implements ItemListener{   //make new class inside the outer curly bracket so that it can see and use variables and methods of each other
		private Font font;
		
		public handling(Font font) {
			this.font = font;
		}
		
		public void itemStateChanged(ItemEvent event) {   //itemStateChanged(ItemEvent event)
			a.setFont(font);
			
		}
		
		
	}
	
	
	
	
}
