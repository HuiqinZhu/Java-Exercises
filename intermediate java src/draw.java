import java.awt.*;
import java.awt.ActiveEvent.*;
import javax.swing.*;


public class draw extends JPanel{   //extends JPanel

	public void paintComponent(Graphics g) {  //public void paintComponent(Graphics x){}
		super.paintComponent(g);              //super.paintComponent(x);  this.setBackground(Color.XXX);
		this.setBackground(Color.WHITE);   //set color of background for the panel
		
		g.setColor(Color.BLUE);      //Graphics object is a tool which draws   GraphicsObject.setColor()
		g.fillRect(25, 25, 100, 30);     
		
		g.setColor(new Color(200, 100, 250)); //RGB   red green blue  new Color( , , ,)  <=255
		g.fillRect(25, 65, 100, 30);   //.fillRect( whereX, whereY, width, height)
		
		g.setColor(Color.RED);
		g.drawString("This is my first draw in Java", 25, 120);  //.drawString("", , )
		
		
		
	}
	
	
}
