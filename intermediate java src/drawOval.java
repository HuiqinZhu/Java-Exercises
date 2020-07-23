import java.awt.*;
import javax.swing.*;



public class drawOval extends JPanel {

	public int d;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(10, 10, d, d);
		
	}
	
	public void setD(int newD) {
		d = (newD > 0? newD : 10 );
		repaint();  //repaint();
	}
	
	public Dimension getPreferedSize() {
		return new Dimension(200, 200);   //public void Dimension xxx(){ return new Dimension( , )}
	}
	
	public Dimension getMinimalSize() {
		return getPreferedSize();     
	}
}
