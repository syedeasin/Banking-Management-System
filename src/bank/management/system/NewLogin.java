package bank.management.system;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.Dimension;

public class NewLogin extends JFrame {
    JLabel title,subTitle;
    JLabel cardNumber,pinNumber;
    JTextField cardNumberTextField;
    JPasswordField pinNumberPasswordField;

    NewLogin(){
        super("Digital Bank Management System");

        //Background Color
        Color color = Color.decode("#061440");
        Color textColor = Color.decode("#9BA1B3");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1,2));

        //1st Grid
        JPanel grid1 = new JPanel();
        grid1.setLayout(new BoxLayout(grid1,BoxLayout.Y_AXIS));
        grid1.setBorder(BorderFactory.createEmptyBorder(90,90,90,80));
        grid1.setBackground(color);
            //Add The For Functionalities
                //Add Title
                title = new JLabel("Sign In to Your Bank Account");
                title.setForeground(Color.WHITE);
                title.setBounds(0,0,640,52);
                title.setFont(new Font("Roboto",Font.BOLD,32));
                grid1.add(title);

                //Add SubTitle
                subTitle = new JLabel("<html><br>Effortlessly access your accounts and manage finances with our<br>secure sign-in process. <b>Experience hassle-free banking today</b>!</html>");
                subTitle.setForeground(textColor);
                subTitle.setBounds(0,0,640,52);
                subTitle.setFont(new Font("Montserrat",Font.PLAIN,14));
                grid1.add(subTitle);

                //Add Fields and Levels
                cardNumber = new JLabel("<html><br><br><br>Enter Your Card Number:</html>");
                cardNumber.setForeground(textColor);
                cardNumber.setFont(new Font("Montserrat",Font.PLAIN,14));
                grid1.add(cardNumber);
                    //Card Number Text Fields
                    cardNumberTextField = new JTextField(15);
                    cardNumberTextField.setBounds(0,0,220,18);
                    grid1.add(cardNumberTextField);

                pinNumber = new JLabel("<html><br><br>Enter Your Pin Number: </html>");
                pinNumber.setForeground(textColor);
                pinNumber.setFont(new Font("Montserrat",Font.PLAIN,14));
                grid1.add(pinNumber);
                //Card Number Text Fields
                    pinNumberPasswordField = new JPasswordField(15);
                    pinNumberPasswordField.setBounds(0,0,220,18);
                    grid1.add(cardNumberTextField);

                //Add Buttons


        //2nd Grid(Add Image)
        JPanel grid2 = new JPanel();
        grid2.setLayout(new GridLayout());
        grid2.setBackground(color);

            //Add Image on 2nd Grid
            ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("image/BankingCards.png"));
            Image image1 = image.getImage().getScaledInstance(602,525,Image.SCALE_DEFAULT);
            ImageIcon image2 = new ImageIcon(image1);
            JLabel imageLabel = new JLabel(image2);
            imageLabel.setSize(602,525);
            grid2.add(imageLabel);

        //Add Grids to Panel and Panel to Frame
        mainPanel.add(grid1);
        mainPanel.add(grid2);
        add(mainPanel);


        //Frame Properties
        setLayout(new GridLayout(1,2));
        //Set The App Location Middle of the Screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth())/3;
        int y = (screenSize.height - getHeight())/3;
        setBounds(350,120,1280,720);
        setVisible(true);


        getContentPane().setBackground(color);
    }


    public static void main(String[] args) {
        new NewLogin();
    }
}
