package BankUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankUI {
    JFrame frame = new JFrame("LOGIN PAGE");
    JLabel image = new JLabel(new ImageIcon("src/BankUI/physics.png"));
    JLabel text1 = new JLabel("Welcome to");
    JLabel text2 = new JLabel("Code-Soarers Bank");
    JLabel text3 = new JLabel("Enter Pin To Continue:");
    JPasswordField textField1 = new JPasswordField();


    JButton button1 = new JButton("Continue");

    public void mainUI() {
        frame.setSize(350, 450);
        frame.getContentPane().setBackground(new Color(0, 162, 255));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());


        image.setPreferredSize(new Dimension(100, 70));

        text1.setFont(new Font("Gill sans", Font.BOLD, 24));
        text1.setForeground(new Color(94, 94, 94));

        text2.setFont(new Font("Gill sans", Font.BOLD, 24));
        text2.setForeground(new Color(94, 94, 94));

        text3.setFont(new Font("Gill sans", Font.BOLD, 24));
        text3.setForeground(new Color(94, 94, 94));

        button1.setFont(new Font("Gill sans", Font.PLAIN, 18));
        button1.setForeground(new Color(94, 94, 94));


        textField1.setHorizontalAlignment(JPasswordField.CENTER);


        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.anchor = GridBagConstraints.CENTER;
        gridBagConstraints2.insets = new Insets(5, 0, 5, 0);

        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 2;
        gridBagConstraints3.anchor = GridBagConstraints.CENTER;
        gridBagConstraints3.insets = new Insets(5, 0, 10, 0);

        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 0;
        gridBagConstraints4.gridy = 3;
        gridBagConstraints4.anchor = GridBagConstraints.CENTER;
        gridBagConstraints4.insets = new Insets(20, 0, 5, 0);

        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 0;
        gridBagConstraints5.gridy = 4;
        gridBagConstraints5.gridwidth = 3;
        gridBagConstraints5.gridheight = 1;
        gridBagConstraints5.ipadx = 270;
        gridBagConstraints5.ipady = 20;
        gridBagConstraints5.anchor = GridBagConstraints.CENTER;
        gridBagConstraints5.insets = new Insets(10, 0, 10, 0);

        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.gridy = 5;
        gridBagConstraints6.gridwidth = 3;
        gridBagConstraints6.ipadx = 60;
        gridBagConstraints6.ipady = 25;
        gridBagConstraints6.anchor = GridBagConstraints.SOUTHEAST;
        gridBagConstraints6.insets = new Insets(20, 0, 10, 0);

        frame.add(image, gridBagConstraints);
        frame.add(text1, gridBagConstraints2);
        frame.add(text2, gridBagConstraints3);
        frame.add(text3, gridBagConstraints4);
        frame.add(textField1, gridBagConstraints5);
        frame.add(button1, gridBagConstraints6);

        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginHandling();
            }
        });
    }

    public void loginHandling() {
        char[] password = textField1.getPassword();
        if (password == null | password.length == 0) {
            textField1.setBorder(BorderFactory.createLineBorder(Color.red));
            text3.setText("Enter Valid Pin: ");
        } else {
            String convertedPassword = new String(password);
            try {
                int result = Integer.parseInt(convertedPassword);
                if (result == 5555) {
                    mainUI2();
                } else {

                    textField1.setBorder(BorderFactory.createLineBorder(Color.red));
                    text3.setText(" Enter the Right Pin: ");
                }
            } catch (NumberFormatException numberFormatException) {
                textField1.setBorder(BorderFactory.createLineBorder(Color.red));
                text3.setText("Invalid Pin: ");
            }


        }
    }

    JFrame frame2 = new JFrame("BANK HOMEPAGE");
    JLabel text4 = new JLabel("     WELCOME USER!!");
    JLabel text5 = new JLabel("Choose an Account Type");
    JButton button2 = new JButton("Savings\nAccount");
    JButton button3 = new JButton("Current\nAccount");


    public void mainUI2() {
        frame2.setSize(750, 450);
        frame2.getContentPane().setBackground(new Color(0, 162, 255));
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(new GridBagLayout());

        text4.setFont(new Font("Gill sans", Font.BOLD, 24));
        text4.setForeground(Color.white);

        text5.setFont(new Font("Gill sans", Font.BOLD, 24));
        text5.setForeground(new Color(94, 94, 94));

        // Create a panel for the buttons and set a FlowLayout with top alignment
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(0, 162, 255));
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        // Create a panel for the labels and set a BoxLayout with top alignment
        JPanel labelPanel = new JPanel();
        labelPanel.setBackground(new Color(0, 162, 255));
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
        labelPanel.add(Box.createVerticalGlue());
        labelPanel.add(text4);
        labelPanel.add(text5);

        // Set preferred size for buttons
        button2.setPreferredSize(new Dimension(300, 100));
        button3.setPreferredSize(new Dimension(300, 100));


        // Add the label panel and button panel to the frame using GridBagLayout
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        frame2.add(labelPanel, gridBagConstraints);

        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(10, 0, 15, 0);
        frame2.add(buttonPanel, gridBagConstraints);



        frame2.setVisible(true);



        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {saveButtonLink();}
        });
    }

    public void saveButtonLink() {
        saveAccountButton();
    }





    JFrame saveOptionFrame = new JFrame("SAVING ACCOUNT HOME");
    //JLabel saveLabel = new JLabel("SAVING ACCOUNT");
    JLabel saveText = new JLabel("Click the Action to be performed:");
    JButton saveWithdrawButtton = new JButton("Withdraw");
    JButton saveDepositButton = new JButton("Deposit");
    JButton saveBackButton = new JButton("<<- Back");

    public void saveAccountButton(){
        saveOptionFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        saveOptionFrame.setBackground(Color.BLUE);
        saveOptionFrame.setLayout( new GridBagLayout());
        saveOptionFrame.setSize(600, 500);
        saveOptionFrame.setLocationRelativeTo(null);
        saveOptionFrame.getContentPane().setBackground(new Color(0, 162, 255));



        saveText.setFont(new Font("Gill sans", Font.BOLD, 24));
        saveText.setForeground(new Color(94,94,94,94));

        //saveDepositButton.setBackground(new Color(0, 0, 139, 0));





        GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy =1;
        gridBagConstraints1.anchor = GridBagConstraints.CENTER;
        gridBagConstraints1.insets = new Insets(10, 0,10,0);
        gridBagConstraints1.gridwidth =3;
        saveOptionFrame.add(saveText, gridBagConstraints1);

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy =2;
        gridBagConstraints2.ipadx = 270;
        gridBagConstraints2.ipady = 60;
        gridBagConstraints2.anchor = GridBagConstraints.CENTER;
        gridBagConstraints2.insets = new Insets(10, 0,10,0);
        gridBagConstraints2.gridwidth =3;
        saveOptionFrame.add(saveWithdrawButtton, gridBagConstraints2);

        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy =3;
        gridBagConstraints3.ipadx = 270;
        gridBagConstraints3.ipady = 60;
        gridBagConstraints3.anchor = GridBagConstraints.CENTER;
        gridBagConstraints3.insets = new Insets(10, 0,10,0);
        gridBagConstraints3.gridwidth =3;
        saveOptionFrame.add(saveDepositButton, gridBagConstraints3);

        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 0;
        gridBagConstraints4.gridy =4;
        gridBagConstraints4.ipadx = 60;
        gridBagConstraints4.ipady = 25;
        gridBagConstraints4.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints4.insets = new Insets(10, 15,10,0);
        gridBagConstraints4.gridwidth =3;
        saveOptionFrame.add(saveBackButton, gridBagConstraints4);
        
        saveOptionFrame.setVisible(true);


        saveBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {destroy_saveOptionFrame();}
        });


        saveWithdrawButtton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {saveWithdraw();}
        });
    }
    public void destroy_saveOptionFrame(){
        saveOptionFrame.dispose();
    }


    JFrame s_withdrawFrame = new JFrame("SAVING ACCOUNT WITHDRAWAL");
    Account account=new Account();
    JLabel s_withdrawLabel = new JLabel("Total Amount in Balance =$ "+account.accountBalance);
    JLabel s_withdrawText = new JLabel("Enter Amount To Withdraw: ");
    JTextField s_withdrawField = new JTextField();
    JButton s_withdrawButton = new JButton("Withdraw");


        public void saveWithdraw() {
            s_withdrawFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            s_withdrawFrame.setBackground(Color.BLUE);
            s_withdrawFrame.setLayout( new GridBagLayout());
            s_withdrawFrame.setSize(600, 500);
            s_withdrawFrame.setLocationRelativeTo(null);
            s_withdrawFrame.getContentPane().setBackground(new Color(0, 162, 255));



            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy =0;
            gridBagConstraints.anchor = GridBagConstraints.CENTER;
            gridBagConstraints.insets = new Insets(10, 0,10,0);
            gridBagConstraints.gridwidth =3;
            s_withdrawFrame.add(s_withdrawLabel, gridBagConstraints);


            GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
            gridBagConstraints1.gridx = 0;
            gridBagConstraints1.gridy =1;
            gridBagConstraints1.anchor = GridBagConstraints.CENTER;
            gridBagConstraints1.insets = new Insets(10, 0,10,0);
            gridBagConstraints1.gridwidth =3;
            s_withdrawFrame.add(s_withdrawText, gridBagConstraints1);

            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.gridx = 0;
            gridBagConstraints2.gridy =2;
            gridBagConstraints2.ipadx = 270;
            gridBagConstraints2.ipady = 60;
            gridBagConstraints2.anchor = GridBagConstraints.CENTER;
            gridBagConstraints2.insets = new Insets(10, 0,10,0);
            gridBagConstraints2.gridwidth =3;
            s_withdrawFrame.add(s_withdrawField, gridBagConstraints2);

            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.gridx = 0;
            gridBagConstraints3.gridy =3;
            gridBagConstraints3.ipadx = 270;
            gridBagConstraints3.ipady = 60;
            gridBagConstraints3.anchor = GridBagConstraints.NORTHEAST;
            gridBagConstraints3.insets = new Insets(10, 0,10,0);
            gridBagConstraints3.gridwidth =3;
            s_withdrawFrame.add(s_withdrawButton, gridBagConstraints3);

            s_withdrawFrame.setVisible(true);
            s_withdrawButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String withdrawnString = s_withdrawField.getText();
                    int withdrawnAmount = Integer.parseInt(withdrawnString);
                    handleWithdraw(withdrawnAmount);
                }
            });

        }
        public void handleWithdraw(int withdrawnAmount){
            SavingsAccount account_s = new SavingsAccount();
            boolean withdrawn = account_s.saving_withdrawal(withdrawnAmount);
            if (withdrawn) {
                int updateWithdraw = account_s.checkBalance();
                withdrawframe(updateWithdraw, withdrawnAmount);
            }
        }




        JFrame withdrawnFrame = new JFrame("Widthrawn");

        JLabel withdrawnText = new JLabel("New Account Balance:");
        JLabel amountEntered = new JLabel(""+ account.accountBalance);
        JPanel amountPane = new JPanel();

        JLabel withdrawOptionTxt = new JLabel("Would you like to do Something else ?");
        JButton withdrawYes = new JButton("Yes");
        JButton withdrawNO = new JButton("NO");



        public void withdrawframe(int updateWithdraw, int withdrawnAmount){
            withdrawnFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            withdrawnFrame.setLayout( new GridBagLayout());
            withdrawnFrame.setSize(1000, 500);
            withdrawnFrame.setLocationRelativeTo(null);
            withdrawnFrame.getContentPane().setBackground(new Color(0, 162, 255));

            JLabel withdrawn_Amount = new JLabel("Widthrawn Amount = $ " + withdrawnAmount);

            amountPane.add(amountEntered);

            amountPane.setBackground(new Color(0, 0, 0, 0));

            withdrawn_Amount.setFont(new Font("Gill sans", Font.BOLD, 24));
            withdrawn_Amount.setForeground(new Color(94,94,94,94));

            withdrawnText.setFont(new Font("Gill sans", Font.BOLD, 24));
            withdrawnText.setForeground(new Color(94,94,94,94));

            withdrawOptionTxt.setFont(new Font("Gill sans", Font.BOLD, 24));
            withdrawOptionTxt.setForeground(new Color(94,94,94,94));



            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy =0;
            gridBagConstraints.anchor = GridBagConstraints.CENTER;
            gridBagConstraints.insets = new Insets(10, 0,10,0);
            gridBagConstraints.gridwidth =3;
            withdrawnFrame.add(withdrawn_Amount, gridBagConstraints);


            GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
            gridBagConstraints1.gridx = 0;
            gridBagConstraints1.gridy =1;
            gridBagConstraints1.anchor = GridBagConstraints.CENTER;
            gridBagConstraints1.insets = new Insets(10, 0,10,0);
            gridBagConstraints1.gridwidth =3;
            withdrawnFrame.add(withdrawnText, gridBagConstraints1);

            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.gridx = 0;
            gridBagConstraints2.gridy =2;
            gridBagConstraints2.ipadx = 270;
            gridBagConstraints2.ipady = 60;
            gridBagConstraints2.anchor = GridBagConstraints.CENTER;
            gridBagConstraints2.insets = new Insets(10, 0,10,0);
            gridBagConstraints2.gridwidth =3;
            withdrawnFrame.add(amountPane, gridBagConstraints2);

            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.gridx = 0;
            gridBagConstraints3.gridy =3;
            gridBagConstraints3.ipadx = 270;
            gridBagConstraints3.ipady = 60;
            gridBagConstraints3.anchor = GridBagConstraints.CENTER;
            gridBagConstraints3.insets = new Insets(10, 40,10,0);
            gridBagConstraints3.gridwidth =3;
            withdrawnFrame.add(withdrawOptionTxt, gridBagConstraints3);

            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.gridx = 0;
            gridBagConstraints4.gridy =4;
            gridBagConstraints4.ipadx = 170;
            gridBagConstraints4.ipady = 60;
            gridBagConstraints4.anchor = GridBagConstraints.NORTHWEST;
            gridBagConstraints4.insets = new Insets(10, 10,10,10);
            gridBagConstraints4.gridwidth =3;
            withdrawnFrame.add(withdrawYes, gridBagConstraints4);

            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.gridx = 1;
            gridBagConstraints5.gridy =4;
            gridBagConstraints5.ipadx = 170;
            gridBagConstraints5.ipady = 60;
            gridBagConstraints5.anchor = GridBagConstraints.NORTHEAST;
            gridBagConstraints5.insets = new Insets(10, 10,10,10);
            gridBagConstraints5.gridwidth =3;
            withdrawnFrame.add(withdrawNO, gridBagConstraints5);

            withdrawnFrame.setVisible(true);

        }







}