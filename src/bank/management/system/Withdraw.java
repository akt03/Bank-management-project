package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;


public class Withdraw extends JFrame implements ActionListener{
    JTextField amount;
    JButton withdrawButton, backButton;
    String pinNumber;
    
    
    public Withdraw(String pinNumber){
        this.pinNumber = pinNumber;
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Enter the amouunt you want Withdraw");
        text.setFont(new Font("System",Font.BOLD,16));
        text.setForeground(Color.WHITE);
        text.setBounds(170,300,400,20);
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        image.add(amount);
        
        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBackground(Color.WHITE);
        withdrawButton.setFont(new Font("Raleway",Font.BOLD,16));
        withdrawButton.setBounds(355,485,150,30);
        withdrawButton.addActionListener(this);
        image.add(withdrawButton);
        
        backButton = new JButton("Back");
        backButton.setBackground(Color.WHITE);
        backButton.setFont(new Font("Raleway",Font.BOLD,16));
        backButton.setBounds(355,520,150,30);
        backButton.addActionListener(this);
        image.add(backButton);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == backButton){
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);
        } else if(ae.getSource() == withdrawButton){
            String number = amount.getText();
            Date date = new Date();
            
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the correct Withrawal Amount");
            } else{
                try {
                    Conn c = new Conn();
                    String query = "insert into bank values('"+pinNumber+"','"+date+"','Withdraw', '"+number+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs " +number+ " Withdraw Successfully");
                    setVisible(false);
                    new Transaction(pinNumber).setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
