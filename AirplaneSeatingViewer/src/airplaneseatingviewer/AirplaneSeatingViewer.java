/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneseatingviewer;
import javax.swing.JFrame;

/**
 *
 * @author danielcoughlin
 */
public class AirplaneSeatingViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new AirplaneSeatingFrame();
        frame.setTitle("Title for Airplane Seating");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
