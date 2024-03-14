import javax.swing.*;
import java.awt.*;

public class HITO1 extends JFrame {

    public HITO1(){
        setPreferredSize(new Dimension(600,300));
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JPanel checkboxPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JCheckBox c1 = new JCheckBox("Katniss");
        checkboxPanel.add(c1);
        JCheckBox c2 = new JCheckBox("Peeta");
        checkboxPanel.add(c2);
        getContentPane().add(checkboxPanel,BorderLayout.NORTH);


        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new HITO1();
    }
}
