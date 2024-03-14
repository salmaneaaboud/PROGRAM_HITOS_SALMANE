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



        ImageIcon imagen = new ImageIcon("photo.jpg");
        JLabel label1 = new JLabel(imagen);
        JLabel label2 = new JLabel(imagen);
        JLabel label3 = new JLabel(imagen);
        JLabel label4 = new JLabel(imagen);
        JPanel imagePanel = new JPanel(new GridLayout(2, 2));
        imagePanel.add(label1);
        imagePanel.add(label2);
        imagePanel.add(label3);
        imagePanel.add(label4);
        getContentPane().add(imagePanel, BorderLayout.CENTER);



        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
        JButton boton1 = new JButton("But1");
        JButton boton2 = new JButton("But2");
        panel3.add(boton1);
        panel3.add(boton2);
        getContentPane().add(panel3,BorderLayout.SOUTH);


        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new HITO1();
    }
}
