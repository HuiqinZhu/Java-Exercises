import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class listm extends JFrame{

	private JList left;
	private JList right;
	private static String[] food = {"bean", "apple", "peach", "meat", "nut", "cake"};
	private JButton button;
	
	
	listm(){
		super("For multiple list");
		setLayout(new FlowLayout());
		
		left = new JList(food);
		left.setVisibleRowCount(3);
        left.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);	    //setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION)
        add(new JScrollPane(left));   //JScrollPane   //not finished until you add it
        
        button = new JButton("Move--->");
        button.addActionListener(
        		new ActionListener() {
        			
					public void actionPerformed(ActionEvent event) {  //need to make the void public
        				right.setListData(left.getSelectedValuesList().toArray());  //setListData   listName.getSelectedValuesList().toArray()
        			}   //CONVERT LISYT TO ARRAY
        		}		
        		); 
        
        add(button);
        
        right = new JList();  //make the list value empty by defaut
        right.setVisibleRowCount(3);   //must set fixed cell height and width of empty list, or it will not be displayed on the screen
        right.setFixedCellHeight(20);
        right.setFixedCellWidth(100);
        add(new JScrollPane(right));
        
        
        
        
        
        
	}
	
}
