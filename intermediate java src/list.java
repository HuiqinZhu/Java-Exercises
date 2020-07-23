import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;



public class list extends JFrame {

	private JList list;
	private static String[] colorName = {"black", "red", "blue", "yellow"};     //create String array for list 
	private Color[] colors = {Color.BLACK, Color.RED, Color.BLUE, Color.YELLOW};   //this is color for computer to see
	
	list(){
		super("For single list");
		setLayout(new FlowLayout());
		
		list = new JList(colorName);                  //list should set visileRowCount and set selectionModel
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //ListSelectionModel.SINGLE_SELECTION
		add(new JScrollPane(list));                                      //add(new JScrollPane(listName))
		
		list.addListSelectionListener(                                       //.addListSelectionListener(new ListSelectionListener(){ void valueChanged(ListSelctionEvent event){ }});
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent event) {      
						                                                                       //there are 3 layers of color:glass pane, content pane, background  we need to get content pane and then set background 
						getContentPane().setBackground(colors[list.getSelectedIndex()]);      //getContentPane().setBackground(colors[list.getSelectedIndex])
						//but panel can set background directly
						
						
						/*
						//ListSelectionListener  valueChanged  ListSelectionEvent event
						  list.getSelectedIndex()      getContentPane.setBackground(Color. )
						  
						//ActionListener  actionPerformed  ActionEvent event
						 FlowLayoutObject.setAlignment(FlowLayout.MIDDLE/LEFT/RIGHT)
						 FlowLayoutObject.layoutContainer()
						 event.getActionCommand();
						 
						 
						//implements MouseListener, MouseMotionListener/           addMouseListener extends  MouseAdapter
						  mouseClicked mousePressed mouseReleased mouseEntered mouseExited        mouseDragged mouseMoved   
						  event.getX()  event.getY()   event.getClickedCount()   SwingUtilities.isRight/Left/MiddleButton(event)
						  
						//ItemListener  itemStateChanged  ItemEvent event
						*/
					}
					
					
					
				}
				
				
				
				
				
				);
		
		
	}
	
	
	}
