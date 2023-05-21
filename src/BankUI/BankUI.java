package BankUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankUI {
    JFrame frame=new JFrame("LOGIN PAGE");
    JLabel image=new JLabel(new ImageIcon("src/BankUI/physics.png"));
    JLabel text1=new JLabel("Welcome to");
    JLabel text2=new JLabel("Code-Soarers Bank");
    JLabel text3=new JLabel("Enter Pin To Continue:");
   JPasswordField textField1=new JPasswordField();


    JButton button1=new JButton("Continue");

    public void mainUI(){
        frame.setSize(350,450);
        frame.getContentPane().setBackground(new Color(0,162,255));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());


        image.setPreferredSize(new Dimension(100,70));

        text1.setFont(new Font("Gill sans", Font.BOLD,24));
        text1.setForeground(new Color(94,94,94));

        text2.setFont(new Font("Gill sans", Font.BOLD,24));
        text2.setForeground(new Color(94,94,94));

        text3.setFont(new Font("Gill sans", Font.BOLD,24));
        text3.setForeground(new Color(94,94,94));

        button1.setFont(new Font("Gill sans", Font.PLAIN,18));
        button1.setForeground(new Color(94,94,94));


        textField1.setHorizontalAlignment(JPasswordField.CENTER);


        GridBagConstraints gridBagConstraints=new GridBagConstraints();
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
        gridBagConstraints.anchor=GridBagConstraints.CENTER;
        gridBagConstraints.insets=new Insets(10,0,10,0);

        GridBagConstraints gridBagConstraints2=new GridBagConstraints();
        gridBagConstraints2.gridx=0;
        gridBagConstraints2.gridy=1;
        gridBagConstraints2.anchor=GridBagConstraints.CENTER;
        gridBagConstraints2.insets=new Insets(5,0,5,0);

        GridBagConstraints gridBagConstraints3=new GridBagConstraints();
        gridBagConstraints3.gridx=0;
        gridBagConstraints3.gridy=2;
        gridBagConstraints3.anchor=GridBagConstraints.CENTER;
        gridBagConstraints3.insets=new Insets(5,0,10,0);

        GridBagConstraints gridBagConstraints4=new GridBagConstraints();
        gridBagConstraints4.gridx=0;
        gridBagConstraints4.gridy=3;
        gridBagConstraints4.anchor=GridBagConstraints.CENTER;
        gridBagConstraints4.insets=new Insets(20,0,5,0);

        GridBagConstraints gridBagConstraints5=new GridBagConstraints();
        gridBagConstraints5.gridx=0;
        gridBagConstraints5.gridy=4;
        gridBagConstraints5.gridwidth=3;
        gridBagConstraints5.gridheight=1;
        gridBagConstraints5.ipadx=270;
        gridBagConstraints5.ipady=20;
        gridBagConstraints5.anchor=GridBagConstraints.CENTER;
        gridBagConstraints5.insets=new Insets(10,0,10,0);

        GridBagConstraints gridBagConstraints6=new GridBagConstraints();
        gridBagConstraints6.gridx=0;
        gridBagConstraints6.gridy=5;
        gridBagConstraints6.gridwidth=3;
        gridBagConstraints6.ipadx=60;
        gridBagConstraints6.ipady=25;
        gridBagConstraints6.anchor=GridBagConstraints.SOUTHEAST;
        gridBagConstraints6.insets=new Insets(20,0,10,0);

        frame.add(image,gridBagConstraints);
        frame.add(text1,gridBagConstraints2);
        frame.add(text2,gridBagConstraints3);
        frame.add(text3,gridBagConstraints4);
        frame.add(textField1,gridBagConstraints5);
        frame.add(button1,gridBagConstraints6);

        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginHandling();
            }
        });
    }

    public void loginHandling(){
        char[] password=textField1.getPassword();
        if (password == null|password.length == 0) {
            textField1.setBorder(BorderFactory.createLineBorder(Color.red));
            text3.setText("Enter Valid Pin: ");
        }
        else{
            String convertedPassword=new String(password);
            try{
                int result=Integer.parseInt(convertedPassword);
                if(result==5555){
                    System.out.println("IT IS WORKING");
                }
                else{

                    textField1.setBorder(BorderFactory.createLineBorder(Color.red));
                    text3.setText(" Enter the Right Pin: ");
                }
            }catch (NumberFormatException numberFormatException){
                textField1.setBorder(BorderFactory.createLineBorder(Color.red));
                text3.setText("Invalid Pin: ");
            }



        }
    }





}
