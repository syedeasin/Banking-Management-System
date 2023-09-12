package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {
    JTextField textName;
    Random random = new Random();
    Long first4 = (random.nextLong()%9000L)+1000L;
    String first = " "+Math.abs(first4);
    Signup(){
        super("Application Form");

        //Image Adding
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application Form No:" + first);
        label1.setBounds(160,10,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330,70,600,38);
        label2.setFont(new Font("Raleway",Font.BOLD,30));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,110,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name");
        labelName.setBounds(100,190,100,30);
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(220,190,200,30);
        add(textName);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Signup();
    }
}
