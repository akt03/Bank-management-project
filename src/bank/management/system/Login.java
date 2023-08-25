package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JButton loginButton , clearButton , signupButton;
    JPasswordField pintextField;  
    JTextField cardtextField;
    public Login(){
      
         // Title of our Project
        setTitle("Automated Teller Machine");
        
        setLayout(null);
              
        // adding icon
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image img1 = img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(img1);
        
        JLabel label = new JLabel(img2);
        label.setBounds(150,10,100,100);
        add(label);
        
       // Content on our Frame
       JLabel text = new JLabel("Welcome to ATM");
       text.setFont(new Font("Osward" ,Font.BOLD,38));
       text.setBounds(250,40, 400, 40);
       add(text);
        
        // Card no.
        JLabel cardno = new JLabel("Card No. :  ");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(170,150, 400, 40);
        add(cardno);
        
        cardtextField = new JTextField();
        cardtextField.setBounds(350,155,250,35);
        cardtextField.setFont(new Font("Arial" , Font.BOLD , 14));
        add(cardtextField);
        
         // Pin
        JLabel pin = new JLabel("Pin : ");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(170,220, 400, 40);
        add(pin);
        
        pintextField = new JPasswordField();
        pintextField.setBounds(350,220,250,35);
        pintextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        add(pintextField);
        
        //Login  buttons
        loginButton = new JButton("SIGN IN");
        loginButton.setBounds(280 , 300 , 100 , 35 ); 
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(this);
        add(loginButton);
        
//        Clear
        clearButton = new JButton("CLEAR");
        clearButton.setBounds(400 , 300 , 100,35);
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.WHITE);
        clearButton.addActionListener(this);
        add(clearButton);
        
//        Signup
        signupButton = new JButton("SIGN UP");
        signupButton.setBounds(340,350,100,35);
        signupButton.setBackground(Color.BLACK);
        signupButton.setForeground(Color.WHITE);
        signupButton.addActionListener(this);
        add(signupButton);
      
        getContentPane().setBackground(Color.WHITE);
                    
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clearButton){
            cardtextField.setText("");
            pintextField.setText("");

        } else if(ae.getSource() == signupButton) {
            setVisible(false);
            new signupOne().setVisible(true);
            
        } else if(ae.getSource() == loginButton) {
            Conn c = new Conn();
            String cardnumber = cardtextField.getText();
            String pinnumber = pintextField.getText();
            String query = "select * from login where cardNumber = '"+cardnumber+"' and pinNumber = '"+pinnumber+"'";
            try {
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                } else{
                    JOptionPane.showMessageDialog(null, "Invalid! Card Number or Pin");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        
    }
    public static void main(String[] args) {
       new Login();
    }
}
