import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame;
        jFrame = new JFrame();
        jFrame .setSize(400,300);
        jFrame.setVisible(true);
        JOptionPane.showMessageDialog(jFrame, "How \nare you?");
        //JOptionPane.showMessageDialog(null, "Good Bye");
        JOptionPane.showInputDialog(null, "Enter Text:");
        String input;

        //input = JOptionPane.showInputDialog(null, "Enter Text");

        //To input an integer value
        String str = JOptionPane.showInputDialog(null, "Enter Age");
        int age = Integer.parseInt(str);


    }
}