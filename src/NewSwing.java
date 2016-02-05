import javax.swing.*;
import java.awt.*;

public class NewSwing {
    public static void main (String [] args) {
        JFrame frame = new JFrame("New Swinger");
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setUndecorated(false);
        frame.setLayout(new GridBagLayout());

        JButton button = new JButton();
        button.setBackground(Color.cyan);
        button.setForeground(Color.red);
        button.setSize(500, 300);
        button.setText("Yep");
        button.setCursor(Cursor.getDefaultCursor());

        frame.setVisible(true);
        button.setVisible(true);
        frame.add(button);

//        JFrame newFrame = new JFrame("Something");
//        newFrame.setSize(500, 300);
//        newFrame.setLocationRelativeTo(frame);
//        newFrame.setVisible(true);
    }
}
