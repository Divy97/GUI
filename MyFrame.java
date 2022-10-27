import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(400, 500);
        this.setTitle("JFRAME DEMO");

        ImageIcon image = new ImageIcon("./logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(125, 50, 250));
    }
}
