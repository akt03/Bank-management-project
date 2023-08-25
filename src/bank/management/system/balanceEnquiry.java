package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class balanceEnquiry extends JFrame implements ActionListener{
    String pinNumber;
    JButton back;
    
    public balanceEnquiry(String pinNumber){
        this.pinNumber = pinNumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.setFont(new Font("Raleway",Font.BOLD,16));
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);
        
        Conn c = new Conn();
        int balance = 0;
           try {
               ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
               while(rs.next()){
                   if(rs.getString("type").equals("Deposit")){
                       balance += Integer.parseInt(rs.getString("amount"));
                   }else {
                       balance -= Integer.parseInt(rs.getString("amount"));
                   }
               }
           } catch(Exception e){
            System.out.println(e);
        }
        
        JLabel textJLabel = new JLabel("Your Account balance is Rs " + balance);
        textJLabel.setForeground(Color.WHITE);
        textJLabel.setBounds(170,300,400,30);
        textJLabel.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(textJLabel);
           
           
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transaction(pinNumber).setVisible(true);
    }
    
}
