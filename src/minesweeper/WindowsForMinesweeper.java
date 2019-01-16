package minesweeper;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowsForMinesweeper extends JFrame {
    private JTextField inputM = new JTextField("mine", 4);
    private JTextField inputSroki = new JTextField("stroki", 4);
    private JTextField inputStoby = new JTextField("stolby", 4);
    private JButton[][] poleButton = new JButton[Integer.parseInt(inputSroki.getText())][Integer.parseInt(inputStoby.getText())];

    public void buttons(JButton[][] poleButton) {
        for (int i = 0; i < poleButton.length; i++) {
            for (int j = 0; j < poleButton[0].length; j++) {
                poleButton[i][j] = new JButton(" o ");
            }
        }
    }

    public WindowsForMinesweeper() {
        super("saper");
        this.setBounds(100, 100, 600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        for (int i = 0; i < poleButton.length; i++) {
            for (int j = 0; j < poleButton[0].length; j++) {
                //poleButton[i][j].addActionListener(new ButtonEvent);
                container.add(poleButton[i][j]);

            }
        }
        container.add(inputSroki);
        container.add(inputStoby);
    }
}

//public class ButtonEvent implements ActionListener{
//  public void action (ActionEvent e){
//
//}

//implements}

//}
