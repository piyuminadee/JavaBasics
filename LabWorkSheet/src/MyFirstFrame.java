import javax.swing.*;

public class MyFirstFrame {
    public static void main(String[] args) {
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(300, 200);
        myWindow.setTitle("My Window");
        myWindow.setVisible(true);
        myWindow.setLocation(50,50);
    }
}
