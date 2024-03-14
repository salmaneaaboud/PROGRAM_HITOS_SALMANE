import javax.swing.*;
import java.awt.*;

public class HITO1 extends JFrame {

    public HITO1(){
        setPreferredSize(new Dimension(600,300));
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new HITO1();
    }
}
