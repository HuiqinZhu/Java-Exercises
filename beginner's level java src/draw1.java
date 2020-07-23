import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class drawm extends JPanel{

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.GREEN);
		g.drawLine(25, 10, 125, 20);  //the coordinates of the start and the last coordinates of the end of the line
		
		g.setColor(Color.BLUE);
		g.drawRect(25, 65, 100, 30);   //draw means empty, fill means filled with color
		
		g.setColor(Color.ORANGE);
		g.fillOval(25, 120, 100, 30);
		
		g.setColor(Color.YELLOW);
		g.fill3DRect(25, 160, 100, 30, true);  //true or false means with 3D effect or not
		
		
	}
}
