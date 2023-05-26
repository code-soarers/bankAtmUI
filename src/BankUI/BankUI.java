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
            public void actionPerformed(ActionEvent e) {

                saveButtonLink();}
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                currentFrame();}
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
        saveDepositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDepositFrame();
            }
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
                    String depositString = s_withdrawField.getText();
                    int depositAmount2 = Integer.parseInt(depositString);
                    handleWithdraw(depositAmount2);
                }
            });

        }
        public void handleWithdraw(int depositAmount2){
            SavingsAccount account_s = new SavingsAccount();
            boolean withdrawn = account_s.saving_withdrawal(depositAmount);
            if (withdrawn) {
                int updateWithdraw = account_s.checkBalance();
                withdrawframe(updateWithdraw, depositAmount2);
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

            withdrawYes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame2.dispose();
                    mainUI2();


                }
            });

            withdrawNO.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    withdrawnFrame.dispose();
                    frame.dispose();
                    frame2.dispose();
                    s_withdrawFrame.dispose();
                    saveOptionFrame.dispose();

                    JOptionPane.showMessageDialog(null, "thank you for using our Bank");

                }
            });




        }

    JFrame currentFrame = new JFrame("Current account");
    JLabel currentLabel = new JLabel("Total Amount in bank= " + account.accountBalance);
    JLabel currentLabel2 = new JLabel("Enter Amount to Deposit");
    JTextField currentText = new JTextField("");
    JButton currentButton = new JButton("Deposit");

    public void currentFrame() {
        currentFrame.setSize(450, 450);
        currentFrame.getContentPane().setBackground(new Color(0, 162, 255));
        currentFrame.setLocationRelativeTo(null);
        currentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        currentFrame.setLayout(new GridBagLayout());

        currentLabel.setFont(new Font("Gill sans", Font.BOLD, 24));
        currentLabel.setForeground(Color.white);

        currentLabel2.setFont(new Font("Gill sans", Font.BOLD, 24));
        currentLabel2.setForeground(new Color(94, 94, 94));

        // Create a panel for the labels and set a BoxLayout with top alignment
        JPanel currentLabelPanel = new JPanel();
        currentLabelPanel.setBackground(new Color(0,162,255));
        currentLabelPanel.setLayout(new BoxLayout(currentLabelPanel, BoxLayout.Y_AXIS));
        currentLabelPanel.add(Box.createVerticalGlue());
        currentLabelPanel.add(currentLabel);
        currentLabelPanel.add(currentLabel2);

        // Add the label panel and button panel to the frame using GridBagLayout
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        currentFrame.add(currentLabelPanel, gridBagConstraints);

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        gridBagConstraints2.ipadx = 270;
        gridBagConstraints2.ipady = 30;
        gridBagConstraints2.anchor = GridBagConstraints.CENTER;
        gridBagConstraints2.insets = new Insets(10, 0, 10, 0);
        currentFrame.add(currentText, gridBagConstraints2);


        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new Insets(10, 5, 15, 0);
        currentFrame.add(currentButton, gridBagConstraints);

        s_withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String withdrawnString = s_withdrawField.getText();
                int withdrawnAmount = Integer.parseInt(withdrawnString);
                handleWithdraw(withdrawnAmount);
            }
        });
        currentFrame.setVisible(true);
    }
    public void handleWithdraw(int depositAmount){
        Account account_c = new Account();
        boolean withdrawn = account_c.withdrawal(depositAmount);
        if (withdrawn) {
            int updateWithdraw = account_c.checkBalance();
            depositframe(updateWithdraw, depositAmount);
        }
    }




    JFrame depositFrame = new JFrame("Widthrawn");

    JLabel depositText = new JLabel("New Account Balance:");
    JLabel amountEntered2 = new JLabel(""+ account.accountBalance);
    JPanel amountPane2 = new JPanel();

    JLabel withdrawOptionTxt2 = new JLabel("Would you like to do Something else ?");
    JButton withdrawYes = new JButton("Yes");
    JButton withdrawNO = new JButton("NO");


    public void depositframe(int updateWithdraw, int depositAmount) {
        depositFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        depositFrame.setLayout(new GridBagLayout());
        depositFrame.setSize(1000, 500);
        depositFrame.setLocationRelativeTo(null);
        depositFrame.getContentPane().setBackground(new Color(0, 162, 255));

        JLabel deposit_Amount = new JLabel("Widthrawn Amount = $ " + depositAmount);

        amountPane.add(amountEntered);

        amountPane.setBackground(new Color(0, 0, 0, 0));

        deposit_Amount.setFont(new Font("Gill sans", Font.BOLD, 24));
        deposit_Amount.setForeground(new Color(94, 94, 94, 94));

        depositText.setFont(new Font("Gill sans", Font.BOLD, 24));
        depositText.setForeground(new Color(94, 94, 94, 94));

        withdrawOptionTxt2.setFont(new Font("Gill sans", Font.BOLD, 24));
        withdrawOptionTxt2.setForeground(new Color(94, 94, 94, 94));


        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        gridBagConstraints.gridwidth = 3;
        withdrawnFrame.add(deposit_Amount, gridBagConstraints);


        GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 1;
        gridBagConstraints1.anchor = GridBagConstraints.CENTER;
        gridBagConstraints1.insets = new Insets(10, 0, 10, 0);
        gridBagConstraints1.gridwidth = 3;
        withdrawnFrame.add(depositText, gridBagConstraints1);

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 2;
        gridBagConstraints2.ipadx = 270;
        gridBagConstraints2.ipady = 60;
        gridBagConstraints2.anchor = GridBagConstraints.CENTER;
        gridBagConstraints2.insets = new Insets(10, 0, 10, 0);
        gridBagConstraints2.gridwidth = 3;
        withdrawnFrame.add(amountPane2, gridBagConstraints2);

        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 0;
        gridBagConstraints3.gridy = 3;
        gridBagConstraints3.ipadx = 270;
        gridBagConstraints3.ipady = 60;
        gridBagConstraints3.anchor = GridBagConstraints.CENTER;
        gridBagConstraints3.insets = new Insets(10, 40, 10, 0);
        gridBagConstraints3.gridwidth = 3;
        withdrawnFrame.add(withdrawOptionTxt2, gridBagConstraints3);

        withdrawnFrame.setVisible(true);


    }



        JFrame depositFrame2 = new JFrame("Deposit");
    JLabel depositLabel = new JLabel("Enter the amount to deposit:");
    JTextField depositField = new JTextField();
    JButton depositButton = new JButton("Deposit");


    public void showDepositFrame() {
        // Deposit Frame UI
        depositFrame2.setSize(350, 450);
        depositFrame2.getContentPane().setBackground(new Color(0, 162, 255));
        depositFrame2.setLocationRelativeTo(null);
        depositFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        depositFrame2.setLayout(new GridBagLayout());

        depositLabel.setFont(new Font("Gill sans", Font.BOLD, 24));
        depositLabel.setForeground(new Color(94, 94, 94));

        depositButton.setFont(new Font("Gill sans", Font.BOLD, 24));
        depositButton.setForeground(new Color(94, 94, 94));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.insets = new Insets(0, 10, 5, 10);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.ipadx = 230;
        gbc.ipady = 30;


        depositFrame2.add(depositLabel, gbc);

        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 20, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        depositFrame2.add(depositField, gbc);


        gbc.gridy = 2;
        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.ipadx = 60;
        gbc.ipady = 25;
        gbc.anchor = GridBagConstraints.CENTER;
        depositFrame2.add(depositButton, gbc);

//        depositButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String withdrawnString = depositField.getText();
//                int depositAmount3 = Integer.parseInt(withdrawnString);
//                handleWithdraw(depositAmount3);
//            }
//        });
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String depositAmountString = depositField.getText();
                int depositAmount = Integer.parseInt(depositAmountString);
                handleDeposit(depositAmount);
            }
        });

        depositFrame2.setVisible(true);
    }
    public void handleDeposit(int depositAmount) {
        Account account = new Account();
        boolean deposited = account.deposit(depositAmount);

        if (deposited) {

            int updatedBalance = account.checkBalance();
            showAccountFrame(updatedBalance,depositAmount);
        }
    }

    public void showAccountFrame(int balance,int depositAmount) {
        JPanel panel = new JPanel();
        JFrame accountFrame = new JFrame(  "Account Balance");
        JLabel withdrawlabel = new JLabel("$"+ depositAmount+" deposited");
        JLabel balance2 = new JLabel("$"+ balance);
        JLabel balanceLabel = new JLabel("New Account Balance:");
        JLabel text = new JLabel("Would you like perform an action ");
        accountFrame.setSize(300, 400);
        accountFrame.getContentPane().setBackground(new Color(0, 162, 255));
        accountFrame.setLocationRelativeTo(null);
        accountFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        accountFrame.setLayout(new GridBagLayout());

        balanceLabel.setFont(new Font("Gill sans", Font.BOLD, 24));
        balanceLabel.setForeground(new Color(94, 94, 94));

        text.setFont(new Font("Gill sans", Font.BOLD, 16));        withdrawlabel.setFont(new Font("Gill sans", Font.BOLD, 18));
        withdrawlabel.setForeground(Color.GREEN);


        balance2.setFont(new Font("Gill sans", Font.BOLD, 20));
        balance2.setForeground(new Color(94, 94, 94));

        panel.add(balance2) ;
        GridBagConstraints gbc5 = new GridBagConstraints();
        gbc5.gridx = 0;
        gbc5.gridy = 3;
        gbc5.insets = new Insets(10, 0, 10, 0);
        gbc5.anchor = GridBagConstraints.CENTER;

        accountFrame.add(text, gbc5);        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        accountFrame.add(withdrawlabel, gbc);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));
        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");
        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);

        buttonPanel.setBackground(new Color(0, 162, 255));
        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.gridx = 0;
        gbc3.gridy = 1;
        gbc3.insets = new Insets(10, 0, 10, 0);
        gbc3.anchor = GridBagConstraints.CENTER;

        accountFrame.add(balanceLabel, gbc3);

        GridBagConstraints gbc2 = new GridBagConstraints();

        gbc2.gridx = 0;
        gbc2.gridy = 2;
        gbc2.ipadx = 50;
        gbc2.ipady = 10;
        gbc2.insets = new Insets(10, 0, 10, 0);
        gbc2.anchor = GridBagConstraints.CENTER;

        accountFrame.add(panel, gbc2);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));


        buttonPanel.setBackground(new Color(0, 162, 255));



        GridBagConstraints gbc4 = new GridBagConstraints();
        gbc4.gridx = 0;
        gbc4.gridy = 4;
        gbc4.insets = new Insets(10, 0, 10, 0);
        gbc4.anchor = GridBagConstraints.CENTER;

        accountFrame.add(buttonPanel, gbc4);


        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accountFrame.dispose();  // Close the account frame
                mainUI2();  // Open the BANK HOMEPAGE frame
            }
        });

        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accountFrame.dispose();  // Close the account frame
                showExitFrame();  // Open the "Thank you" frame
            }
        });
        accountFrame.setVisible(true);
    }

    public void showExitFrame() {
        JFrame exitFrame = new JFrame("Thank You");
        JLabel exitLabel = new JLabel("Thank you for using our platform.");

        exitFrame.setSize(400, 200);
        exitFrame.getContentPane().setBackground(new Color(0, 162, 255));
        exitFrame.setLocationRelativeTo(null);
        exitFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        exitFrame.setLayout(new GridBagLayout());

        exitLabel.setFont(new Font("Gill sans", Font.BOLD, 24));
        exitLabel.setForeground(new Color(94, 94, 94));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 20, 10, 20);
        gbc.anchor = GridBagConstraints.CENTER;

        exitFrame.add(exitLabel, gbc);

        exitFrame.setVisible(true);
    }
    JFrame depositFrame = new JFrame("Widthrawn");

    JLabel depositText = new JLabel("New Account Balance:");
    JLabel amountEntered = new JLabel(""+ account.accountBalance);
    JPanel amountPane = new JPanel();
    JLabel withdrawOptionTxt2 = new JLabel("Would you like to do Something else ?");




    public void depositframe(int updateWithdraw, int withdrawnAmount){
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
        withdrawnFrame.add(withdrawOptionTxt2, gridBagConstraints3);


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

        withdrawYes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
                mainUI2();


            }
        });

        withdrawNO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                withdrawnFrame.dispose();
                frame.dispose();
                frame2.dispose();
                s_withdrawFrame.dispose();
                saveOptionFrame.dispose();

                JOptionPane.showMessageDialog(null, "thank you for using our Bank");

            }
        });
        withdrawnFrame.setVisible(true);






    }



}}