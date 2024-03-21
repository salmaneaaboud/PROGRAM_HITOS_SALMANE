package HITO_2;

import javax.swing.*;
import java.awt.*;

public class HITO2 extends JFrame {

    public HITO2(){
        super("Test Events: Files");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setPreferredSize(new Dimension(1000,450));

        JComboBox combo1=new JComboBox<String>();
        combo1.setBounds(60,10,300,25);
        combo1.addItem("python.txt");
        combo1.addItem("c.txt");
        combo1.addItem("java.txt");
        getContentPane().add(combo1);

        JButton button1=new JButton("Clear");
        button1.setBounds(370,10,70,25);
        getContentPane().add(button1);

        JTextArea jt = new JTextArea(25,25);
        jt.setEditable(false);

        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(jt);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setPreferredSize(new Dimension (200, 200));
        jScrollPane.setBounds(500,10,350,350);
        getContentPane().add(jScrollPane);

        pack();
        setVisible(true);
    }


    public static void main(String[] args) {
        new HITO2();
    }
}