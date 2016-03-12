/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneseatingviewer;
// NOTE: necessary packages imported
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author danielcoughlin
 * NOTE: this class a subclass of JFrame
 */
public class AirplaneSeatingFrame extends JFrame {
    
    // NOTE: our instance variables to store components
    private JButton button;
    private JLabel label;
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 100;
    
    public AirplaneSeatingFrame() {
        // NOTE: helper method to create components
        createComponents();
        // NOTE: setting our frame size in the constructor
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    private void createComponents() {
        // TODO create a buton "Find Seats"
        
        // TODO create a label "Airplane Seating"
        
        // TODO create a panel to act as container 
        // to hold button, and label components
        
        // TODO add button to panel
        
        // TODO add label to panel
        
        // TODO add panel to frame
    }
}
