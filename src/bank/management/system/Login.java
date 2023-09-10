package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField2;
    JButton button1,button2,button3;
    Login(){
        super("Banking Management System");

        //Adding Title Icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,20,70,70);
        add(image);

        //Adding Bottom Card Icon
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,420,100,100);
        add(iimage);

        //Login Page Title
        label1 = new JLabel("Welcome To ATM");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Poppin",Font.BOLD,36));
        label1.setBounds(230,125,450,40);
        add(label1);

        //Card Number
        label2 = new JLabel("Card No : ");
        label2.setFont(new Font("Poppin",Font.BOLD,28));
        label2.setForeground(Color.white);
        label2.setBounds(150,190,375,30);
        add(label2);
        //Card Number Text Field
        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Poppin",Font.BOLD,16));
        add(textField2);



        //Pin Number
        label3 = new JLabel("PIN : ");
        label3.setFont(new Font("Poppin",Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);
        //Pin Number Password Field
        passwordField2 = new JPasswordField(15);
        passwordField2.setBounds(325,250,230,30);
        passwordField2.setFont(new Font("Poppin",Font.BOLD,16));
        add(passwordField2);


        //Buttons ----- 1
        button1 = new JButton("SIGN IN");
        button1.setBounds(150,300,205,50);
        button1.setFont(new Font("Poppins",Font.BOLD,18));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.addActionListener(this);
        add(button1);

        //Buttons ----- 2
        button2 = new JButton("CLEAR");
        button2.setBounds(380,300,205,50);
        button2.setFont(new Font("Poppins",Font.BOLD,18));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.addActionListener(this);
        add(button2);

        //Buttons ----- 3
        button3 = new JButton("SIGN UP");
        button3.setBounds(150,360,440,50);
        button3.setFont(new Font("Poppins",Font.BOLD,18));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.addActionListener(this);
        add(button3);

        //Adding Background Image
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,550,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,550);
        add(iiimage);



        setLayout(null);
        setSize(850,550);
        setVisible(true);
        setLocation(450,250);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == button1){

            } else if (e.getSource()==button2) {
                textField2.setText("");
                passwordField2.setText("");
            }
            else if(e.getSource()==button3) {

            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
