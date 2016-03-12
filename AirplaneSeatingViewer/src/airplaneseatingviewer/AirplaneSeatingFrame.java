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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;

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
    
    // new vars
    private static final int DEFAULT_CLASS_PASSENGERS = 0;
    private static final int FIRST_CLASS_PASSENGERS = 2;
    private static final int ECONOMY_CLASS_PASSENGERS = 3;
    private JRadioButton firstClass;
    private JRadioButton economyClass;
    private JRadioButton windowSeat;
    private JRadioButton centerSeat;
    private JRadioButton aisleSeat;
    private JComboBox passengerCombo;
    
    public AirplaneSeatingFrame() {
        // NOTE: helper method to create components
        createComponents();
        // NOTE: setting our frame size in the constructor
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    // TODO finish the createClassChoice method that creates radio buttons for 
    // economy and first class and returns the panel with the button group for
    // these radio buttons attached
    public JPanel createClassChoice() {
        JPanel jp = new JPanel();
        return jp;
    }
    
    // TODO finish the createSeatingChoice() method that creates 3 radio buttons
    // for window, center, aisle and returns the panel with the button group for
    // these radio buttons attached
    public JPanel createSeatingChoice() {
        JPanel jp = new JPanel();
        return jp;
    }
    
    // TODO finish the createPassengerSelection(int numPass) method that takes
    // a numPass parameter to create a combo box to allow for 1 thru numPass 
    // passengers traveling together
    public JPanel createPassengerSelection(int numPass) {
        JPanel jp = new JPanel();
        return jp;
    }

    class FindSeatListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("searching for seats");
        }
    }
    
    private void createComponents() {
        button = new JButton("Find Seats");
        ActionListener listener = new FindSeatListener();
        button.addActionListener(listener);
        label = new JLabel("Airplane Seating");
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        add(panel);
    }
}
