package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pinChange extends JFrame implements ActionListener
 {
    JButton change, back;
    JPasswordField pin, rePin;
    String pinNumber;
    
    
    public pinChange(String pinNumber){
        this.pinNumber = pinNumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Change your PIN");
        text.setBounds(260,300,500,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,20));
        image.add(text);
        
        JLabel PINtext = new JLabel("New PIN:  ");
        PINtext.setBounds(165,350,180,25);
        PINtext.setForeground(Color.WHITE);
        PINtext.setFont(new Font("System",Font.BOLD,16));
        image.add(PINtext);
        
        pin = new JPasswordField();
        pin.setFont(new Font("System",Font.BOLD,16));
        pin.setBounds(330,350,180,25);
        image.add(pin);
        
        JLabel rePintext = new JLabel("Re-Enter PIN:  ");
        rePintext.setBounds(165,380,180,25);
        rePintext.setForeground(Color.WHITE);
        rePintext.setFont(new Font("System",Font.BOLD,16));
        image.add(rePintext);
        
        rePin = new JPasswordField();
        rePin.setBounds(330,380,180,25);
        rePin.setFont(new Font("System",Font.BOLD,16));
        image.add(rePin);
        
        change = new JButton("Change");
        change.setBackground(Color.WHITE);
        change.setFont(new Font("System",Font.BOLD,16));
        change.setBounds(355,480,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setFont(new Font("System",Font.BOLD,16));
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == change){
        
        try {
            String newPin = pin.getText();
            String reEnterPin = rePin.getText();
            
            if(!newPin.equals(reEnterPin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
            }
            
            if(newPin.equals("")){
                JOptionPane.showMessageDialog(null, "please Enter PIN");
                return;
            } if(rePin.equals("")){
                JOptionPane.showMessageDialog(null, "please RE-Enter new PIN");
                return;
            }
            
            Conn c = new Conn();
            String query1 = "update bank set pin = '"+reEnterPin+"' where pin='"+pinNumber+"'";
            String query2 = "update login set pinNumber = '"+reEnterPin+"' where pinNumber='"+pinNumber+"'";
            String query3 = "update signupThree set pin = '"+reEnterPin+"' where pin='"+pinNumber+"'";
            
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            c.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null, "PIN changed Successfully");
            
            setVisible(false);
            new Transaction(reEnterPin).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    } else if(ae.getSource() == back){
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);
        }
 }
}
