import java.awt.*;
import javax.swing.*;

public class applet extends JApplet {

	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("This still works?", 25, 25);
	}
	
}
