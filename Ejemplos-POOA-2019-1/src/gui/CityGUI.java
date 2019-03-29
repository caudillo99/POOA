package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CityGUI extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonOne;
    private JButton buttonFour;
    private JButton buttonSeven;
    private JButton buttonTwo;
    private JButton buttonFive;
    private JButton buttonEigth;
    private JButton buttonThree;
    private JButton buttonSix;
    private JButton buttonNine;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private JButton buttonTest;

    public CityGUI() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        buttonEigth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonNine.isVisible() == false){
                    buttonNine.setText(buttonEigth.getText());
                    buttonEigth.setText("");
                    buttonNine.setVisible(true);
                    buttonEigth.setVisible(false);
                }
                if(isWinner()){
                    JOptionPane.showMessageDialog(contentPane,"Ganaste!");
                }
            }
        });
        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!buttonEigth.isVisible()){
                    buttonEigth.setText(buttonNine.getText());
                    buttonNine.setText("");
                    buttonEigth.setVisible(true);
                    buttonNine.setVisible(false);
                }

                if(isWinner()){
                    JOptionPane.showMessageDialog(null,"Ganaste!");
                }
            }
        });

    }

    private boolean isWinner(){
        if( buttonOne.getText().equalsIgnoreCase("1")
                && buttonTwo.getText().equalsIgnoreCase("2")
                && buttonThree.getText().equalsIgnoreCase("3")
                && buttonFour.getText().equalsIgnoreCase("4")
                && buttonFive.getText().equalsIgnoreCase("5")
                && buttonSix.getText().equalsIgnoreCase("6")
                && buttonSeven.getText().equalsIgnoreCase("7")
                && buttonEigth.getText().equalsIgnoreCase("8")
                && buttonNine.getText().equalsIgnoreCase(""))
        {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static void main(String[] args) {
        CityGUI dialog = new CityGUI();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
