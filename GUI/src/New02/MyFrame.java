package New02;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame  extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private final JButton cancelButton;
    private final JButton okButton;


    public MyFrame() {
        setTitle(("My First SubClass"));
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);

        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLACK);
        contentPane.setLayout(new FlowLayout());
        okButton = new JButton(("OK"));
        contentPane.add(okButton);
        cancelButton = new JButton("CANCEL");
        contentPane.add(cancelButton);
        cancelButton.addActionListener(this);
        okButton.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

       public void actionPerformed(ActionEvent event){
         JButton clickdButton = (JButton) event.getSource();
         String buttonText = clickdButton.getText();
         setTitle(buttonText);
         System.out.println(buttonText);
       }


    public static class Main {
        public static void main(String[] args) {
            MyFrame myFrame;
            myFrame = new MyFrame();
            myFrame.setVisible(true);
        }
    }
}
