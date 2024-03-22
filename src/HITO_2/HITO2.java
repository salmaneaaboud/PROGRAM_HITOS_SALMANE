package HITO_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HITO2 extends JFrame implements ActionListener {

    private JTextArea jt;

    public HITO2(){
        super("Test Events: Files");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setPreferredSize(new Dimension(900,450));

        JComboBox<String> combo1=new JComboBox<String>();
        combo1.setBounds(60,10,300,25);
        combo1.addItem("Selecciona un fichero: ");
        combo1.addItem("python.txt");
        combo1.addItem("c.txt");
        combo1.addItem("java.txt");
        combo1.addActionListener(this);
        getContentPane().add(combo1);

        JButton button1=new JButton("Clear");
        button1.setActionCommand("Clear");
        button1.addActionListener(this);
        button1.setBounds(370,10,70,25);
        getContentPane().add(button1);

        jt = new JTextArea(25,25);
        jt.setEditable(false);
        jt.setLineWrap(true);

        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(jt);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setPreferredSize(new Dimension (200, 200));
        jScrollPane.setBounds(500,10,350,350);
        getContentPane().add(jScrollPane);

        JButton cerrar = new JButton("Close");
        cerrar.setBounds(500,375,70,25);
        cerrar.addActionListener(this);
        getContentPane().add(cerrar);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new HITO2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Close")) {
            dispose();
        } else if (e.getActionCommand().equals("Clear")) {
            jt.setText("");
        } else {
            JComboBox<String> combo = (JComboBox<String>) e.getSource();
            String selectedFile = (String) combo.getSelectedItem();
            if (selectedFile != null) {
                String content = readFile(selectedFile);
                jt.setText(content);
            }
        }
    }


    private String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            jt.setText("");
        }
        return content.toString();
    }
}