package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener{
    
    JButton depositButton, withdrawButton, fastCash, miniStatement, pinChange, balanceEnquiry, exit;
    String pinNumber;
    public Transaction(String pinNumber) {
        this.pinNumber = pinNumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text = new JLabel("Please Select  your Transactions");
        text.setBounds(220,300,720,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        depositButton = new JButton("Deposit");
        depositButton.setBounds(170,415,150,30);
        depositButton.setBackground(Color.WHITE);
        depositButton.setFont(new Font("Raleway",Font.BOLD,12));
        depositButton.addActionListener(this);
        image.add(depositButton);
        
        withdrawButton = new JButton("Cash Withdrawal");
        withdrawButton.setBounds(355,415,150,30);
        withdrawButton.setBackground(Color.WHITE);
        withdrawButton.setFont(new Font("Raleway",Font.BOLD,12));
        withdrawButton.addActionListener(this);
        image.add(withdrawButton);
        
        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(170,450,150,30);
        fastCash.setBackground(Color.WHITE);
        fastCash.setFont(new Font("Raleway",Font.BOLD,12));
        fastCash.addActionListener(this);
        image.add(fastCash);
        
        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(355,450,150,30);
        miniStatement.setBackground(Color.WHITE);
        miniStatement.setFont(new Font("Raleway",Font.BOLD,12));
        miniStatement.addActionListener(this);
        image.add(miniStatement);
        
        pinChange = new JButton("Pin Change");
        pinChange.setBounds(170,485,150,30);
        pinChange.setBackground(Color.WHITE);
        pinChange.setFont(new Font("Raleway",Font.BOLD,12));
        pinChange.addActionListener(this);
        image.add(pinChange);
        
        balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(355,485,150,30);
        balanceEnquiry.setBackground(Color.WHITE);
        balanceEnquiry.setFont(new Font("Raleway",Font.BOLD,12));
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(355,520,150,30);
        exit.setBackground(Color.WHITE);
        exit.setFont(new Font("Raleway",Font.BOLD,12));
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        } else if(ae.getSource() == depositButton){
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
        } else if(ae.getSource() == withdrawButton){
            setVisible(false);
            new Withdraw(pinNumber).setVisible(true);
        }else if(ae.getSource() == fastCash){
            setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        } else if(ae.getSource() == pinChange){
            setVisible(false);
            new pinChange(pinNumber).setVisible(true);
        }else if(ae.getSource() == balanceEnquiry){
            setVisible(false);
            new balanceEnquiry(pinNumber).setVisible(true);
        } else if(ae.getSource() == miniStatement){
            new miniStatement(pinNumber).setVisible(true);
        }
    }
    
}
