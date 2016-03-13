/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneseatingviewer;
// NOTE: necessary packages imported
import java.awt.BorderLayout;
import java.awt.GridLayout;
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
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;

/**
 *
 * @author danielcoughlin
 * NOTE: this class a subclass of JFrame
 */
public class AirplaneSeatingFrame extends JFrame {
    
    // NOTE: our instance variables to store components
    private JPanel formPanel;
    private JButton button;
    private JLabel label;
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    // new vars
    private static final int DEFAULT_CLASS_PASSENGERS = 0;
    private static final int FIRST_CLASS_PASSENGERS = 2;
    private static final int ECONOMY_CLASS_PASSENGERS = 3;
    private JCheckBox firstClass;
    private JRadioButton windowSeat;
    private JRadioButton centerSeat;
    private JRadioButton aisleSeat;
    private JComboBox passengerCombo;
    private ButtonGroup buttonGroup;
    
    public AirplaneSeatingFrame() {
        // NOTE: helper method to create components
        createComponents();
        // NOTE: setting our frame size in the constructor
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    class FirstClassClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            passengerCombo.removeAllItems();
            int numPass;
            if (firstClass.isSelected()) {
                if(centerSeat.isSelected()) {
                    buttonGroup.clearSelection();
                }
                centerSeat.setEnabled(false);
                numPass = FIRST_CLASS_PASSENGERS;
            }
            else {
                centerSeat.setEnabled(true);
                numPass = ECONOMY_CLASS_PASSENGERS;
            }
            for(int i=1; i <= numPass; i++) {
                passengerCombo.addItem(i);
            }
        }
    }
    
    public JPanel createClassChoice() {
        JPanel jp = new JPanel();
        firstClass = new JCheckBox("First Class");
        ActionListener listener = new FirstClassClickListener();
        firstClass.addActionListener(listener);
        jp.add(firstClass);
        jp.setBorder(new TitledBorder(new EtchedBorder(), "Class"));
        return jp;
    }
    
    public JPanel createSeatingChoice() {
        windowSeat = new JRadioButton("Window");
        aisleSeat = new JRadioButton("Aisle");
        centerSeat = new JRadioButton("Center");
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(windowSeat);
        buttonGroup.add(aisleSeat);
        buttonGroup.add(centerSeat);
        
        JPanel jp = new JPanel();
        jp.add(windowSeat);
        jp.add(aisleSeat);
        jp.add(centerSeat);
        jp.setBorder(new TitledBorder(new EtchedBorder(), "Seating"));
        return jp;
    }
    
    public JPanel createPassengerSelection(int numPass) {
        passengerCombo = new JComboBox();
        for(int i=1; i <= numPass; i++) {
            passengerCombo.addItem(i);
        }
        passengerCombo.setEditable(false);
        JPanel jp = new JPanel();
        jp.add(passengerCombo);
        jp.setBorder(new TitledBorder(new EtchedBorder(), "Passengers Traveling"));
        return jp;
    }
    
    class FindSeatListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("searching for seats");
        }
    }
    
    private void createComponents() {
        label = new JLabel("Airplane Seating");
        button = new JButton("Find Seats");
        ActionListener listener = new FindSeatListener();
        button.addActionListener(listener);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.NORTH);
        
        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(3,1));
        formPanel.add(createClassChoice());
        formPanel.add(createSeatingChoice());
        formPanel.add(createPassengerSelection(ECONOMY_CLASS_PASSENGERS));
        panel.add(formPanel, BorderLayout.CENTER);
        
        panel.add(button, BorderLayout.SOUTH);
        add(panel);
    }
}
