package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton fiveHundred, Thousand, twoThousand, threeThousand, fiveThousand, tenThousand, backButton;
    String pinNumber;
    
    
    public FastCash(String pinNumber) {
        this.pinNumber = pinNumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text = new JLabel("Select Withdrawal Amount");
        text.setBounds(220,300,720,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        fiveHundred = new JButton("Rs 500");
        fiveHundred.setBounds(170,415,150,30);
        fiveHundred.setBackground(Color.WHITE);
        fiveHundred.setFont(new Font("Raleway",Font.BOLD,12));
        fiveHundred.addActionListener(this);
        image.add(fiveHundred);
        
        Thousand = new JButton("Rs 1000");
        Thousand.setBounds(355,415,150,30);
        Thousand.setBackground(Color.WHITE);
        Thousand.setFont(new Font("Raleway",Font.BOLD,12));
        Thousand.addActionListener(this);
        image.add(Thousand);
        
        twoThousand = new JButton("Rs 2000");
        twoThousand.setBounds(170,450,150,30);
        twoThousand.setBackground(Color.WHITE);
        twoThousand.setFont(new Font("Raleway",Font.BOLD,12));
        twoThousand.addActionListener(this);
        image.add(twoThousand);
        
        threeThousand = new JButton("3000");
        threeThousand.setBounds(355,450,150,30);
        threeThousand.setBackground(Color.WHITE);
        threeThousand.setFont(new Font("Raleway",Font.BOLD,12));
        threeThousand.addActionListener(this);
        image.add(threeThousand);
        
        fiveThousand = new JButton("5000");
        fiveThousand.setBounds(170,485,150,30);
        fiveThousand.setBackground(Color.WHITE);
        fiveThousand.setFont(new Font("Raleway",Font.BOLD,12));
        fiveThousand.addActionListener(this);
        image.add(fiveThousand);
        
        tenThousand = new JButton("10000");
        tenThousand.setBounds(355,485,150,30);
        tenThousand.setBackground(Color.WHITE);
        tenThousand.setFont(new Font("Raleway",Font.BOLD,12));
        tenThousand.addActionListener(this);
        image.add(tenThousand);
        
        backButton = new JButton("Back");
        backButton.setBackground(Color.WHITE);
        backButton.setFont(new Font("Raleway",Font.BOLD,16));
        backButton.setBounds(355,520,150,30);
        backButton.addActionListener(this);
        image.add(backButton);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == backButton){
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);
        } else {
           String amount = ((JButton)ae.getSource()).getText().substring(3);
           Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
                int balance = 0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource() != backButton && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values('"+pinNumber+"','"+date+"','Withdraw', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs " + amount + " Debited Successfully");
                
                setVisible(false);
                new Transaction(pinNumber).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
                }  
            } 
        }
}