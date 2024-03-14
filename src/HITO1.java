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



        JPanel radioPanel = new JPanel();
        radioPanel.setPreferredSize(new Dimension(250, getHeight()));
        radioPanel.setBackground(Color.LIGHT_GRAY);
        JRadioButton rb1 = new JRadioButton("OPT 1");
        JRadioButton rb2 = new JRadioButton("OPT 2");
        JRadioButton rb3 = new JRadioButton("OPT 3");
        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        rb1.setSelected(true);
        JRadioButton[] radioButtons = {rb1, rb2, rb3};
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        for (JRadioButton radioButton : radioButtons) {
            panel2.add(radioButton);
        }
        getContentPane().add(panel2, BorderLayout.EAST);


        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new HITO1();
    }
}
