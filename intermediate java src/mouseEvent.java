import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class mouseEvent extends JFrame{

	private JPanel a;
	private JLabel b;
	
	public mouseEvent(){
		super("For mouse listener");
		
		a = new JPanel();
		a.setBackground(Color.WHITE);
		add(a, BorderLayout.CENTER);   //BorderLayout.CENTERS
		
		b = new JLabel("default");
		add(b, BorderLayout.SOUTH);  //when there is no seLayout, then always add BorderLayout.directionName
		
		handling handler = new handling();  //2 types of mouse listener:mouseListener   mouseMotionLsitener
		a.addMouseListener(handler);
		a.addMouseMotionListener(handler);
		
		
	}
	private class handling implements MouseListener, MouseMotionListener{     //7 methods: 5 methods for MouseListener and 2 methods for MouseMotionListener  watch out for the caps!!!
		public void mouseClicked(MouseEvent event) {
			b.setText(String.format("mouse clicked at (%d, %d)", event.getX(), event.getY()));   //event.getX()  event.getY()  event get coordinates automatically
		}
		public void mousePressed(MouseEvent event) {        //we should make the void public so that it can be used in other class
			b.setText("mouse pressed this");
		}
		public void mouseReleased(MouseEvent event) {
			b.setText("mouse released this");
		}
		public void mouseEntered(MouseEvent event) {
			b.setText("mouse entered this");
			a.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event) {
			b.setText("mouse left this");
	    	a.setBackground(Color.WHITE);	  //panelName.setBackground(Color.XXX)
		}
		
		
		public void mouseDragged(MouseEvent event) {
			b.setText("you are dragging the mouse");
		}
		public void mouseMoved(MouseEvent event) {
			b.setText("you moved the mouse");
		}
		
	}
	
	
	
	
}
