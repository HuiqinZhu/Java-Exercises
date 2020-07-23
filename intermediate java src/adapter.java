import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class adapter extends JFrame{

	private String detail;
	private JLabel a;
	
	adapter(){
		super("For the mouse event adapter");
		
		a = new JLabel("default message");
		add(a, BorderLayout.SOUTH);
		addMouseListener(new handling());   //!!!  addMouseListener();  no need to write the object??
		
	}
	private class handling extends MouseAdapter{           //addMouseListener but extends!!!  MouseAdapter  //in this way we on need to override the method we need
		public void mouseClicked(MouseEvent event) {
			detail = String.format("Mouse clicked %d times", event.getClickCount());   //event.getClickCount()
			if(SwingUtilities.isRightMouseButton(event))        //SwingUtilities.isRight/Left/MiddleMouseButton(event)
				detail += "with the right mouse button";       //StringName += "  "
			else if(SwingUtilities.isMiddleMouseButton(event))
				detail += "with the middle mouse button";      //event,isMetaDown()   event.isAltDown()
			else
				detail += "with the left mouse button";
			
			a.setText(detail);;   //JLabelName.setText();
		}
	}
	
}
