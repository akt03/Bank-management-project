
package bank.management.system;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class signupThree extends JFrame implements ActionListener{
    
    JRadioButton savingAccount, currAccount, fdAccount, reccuringAccount;
    JCheckBox atmCard, internetBanking, mobileBanking, emailAlerts, chequeBook, eStatement, declareStatement;
    JButton submit, cancel;
    String formno;

   public signupThree(String formnno){
       this.formno = formno;
       
       JLabel label1 = new JLabel("Page 3: Account Details");
       label1.setFont(new Font("Raleway",Font.BOLD,22));
       label1.setBounds(280,40,400,40);
       add(label1);
       
       JLabel account = new JLabel("Account Type:- ");
       account.setFont(new Font("Raleway",Font.BOLD,22));
       account.setBounds(100,140,200,30);
       add(account);
       
       savingAccount = new JRadioButton("Saving Account");
       savingAccount.setFont(new Font("Raleway",Font.BOLD,16));
       savingAccount.setBackground(Color.WHITE);
       savingAccount.setBounds(100,180,250,20);
       add(savingAccount);
       
       fdAccount = new JRadioButton("Fixed Deposit Account");
       fdAccount.setFont(new Font("Raleway",Font.BOLD,16));
       fdAccount.setBackground(Color.WHITE);
       fdAccount.setBounds(350,180,250,20);
       add(fdAccount);
       
       currAccount = new JRadioButton("Current Account");
       currAccount.setFont(new Font("Raleway",Font.BOLD,16));
       currAccount.setBackground(Color.WHITE);
       currAccount.setBounds(100,220,250,20);
       add(currAccount);
       
       reccuringAccount = new JRadioButton("Reccuring Account");
       reccuringAccount.setFont(new Font("Raleway",Font.BOLD,16));
       reccuringAccount.setBackground(Color.WHITE);
       reccuringAccount.setBounds(350,220,250,20);
       add(reccuringAccount);
       
       ButtonGroup accountRadioButtonGroup = new ButtonGroup();
       accountRadioButtonGroup.add(savingAccount);
       accountRadioButtonGroup.add(fdAccount);
       accountRadioButtonGroup.add(currAccount);
       accountRadioButtonGroup.add(reccuringAccount);
       
       
       JLabel cardNo = new JLabel("Card Number:- ");
       cardNo.setFont(new Font("Raleway",Font.BOLD,22));
       cardNo.setBounds(100,300,200,30);
       add(cardNo);
       
       JLabel number = new JLabel("XXXX-XXXX-XXXX-2323");
       number.setFont(new Font("Raleway",Font.BOLD,22));
       number.setBounds(300,300,300,30);
       add(number);
       
       JLabel cardDetails = new JLabel("Your 16 Digit Card Number");
       cardDetails.setFont(new Font("Raleway",Font.BOLD,12));
       cardDetails.setBounds(100,330,300,20);
       add(cardDetails);
       
       JLabel pin = new JLabel("PIN:- ");
       pin.setFont(new Font("Raleway",Font.BOLD,22));
       pin.setBounds(100,370,200,30);
       add(pin);
       
       JLabel pinNumber = new JLabel("XXXX");
       pinNumber.setFont(new Font("Raleway",Font.BOLD,22));
       pinNumber.setBounds(330,370,300,30);
       add(pinNumber);
       
       JLabel pinDetails = new JLabel("Your 4 Digit Pin");
       pinDetails.setFont(new Font("Raleway",Font.BOLD,12));
       pinDetails.setBounds(100,400,300,20);
       add(pinDetails);
       
       JLabel servicesRequired = new JLabel("Services Required:- ");
       servicesRequired.setFont(new Font("Raleway",Font.BOLD,22));
       servicesRequired.setBounds(100,450,400,35);
       add(servicesRequired);
       
       atmCard = new JCheckBox("ATM Card");
       atmCard.setBackground(Color.WHITE);
       atmCard.setFont(new Font("Raleway",Font.BOLD,16));
       atmCard.setBounds(100,500,200,30);
       add(atmCard);
       
       internetBanking = new JCheckBox("Internet Banking");
       internetBanking.setBackground(Color.WHITE);
       internetBanking.setFont(new Font("Raleway",Font.BOLD,16));
       internetBanking.setBounds(350,500,200,30);
       add(internetBanking);
       
       mobileBanking = new JCheckBox("Mobile Banking");
       mobileBanking.setBackground(Color.WHITE);
       mobileBanking.setFont(new Font("Raleway",Font.BOLD,16));
       mobileBanking.setBounds(100,550,200,30);
       add(mobileBanking);
       
       emailAlerts = new JCheckBox("EMAIL & SMS Alerts");
       emailAlerts.setBackground(Color.WHITE);
       emailAlerts.setFont(new Font("Raleway",Font.BOLD,16));
       emailAlerts.setBounds(350,550,200,30);
       add(emailAlerts);
       
       chequeBook = new JCheckBox("Cheque Book");
       chequeBook.setBackground(Color.WHITE);
       chequeBook.setFont(new Font("Raleway",Font.BOLD,16));
       chequeBook.setBounds(100,600,200,30);
       add(chequeBook);
       
       eStatement = new JCheckBox("E-Statement");
       eStatement.setBackground(Color.WHITE);
       eStatement.setFont(new Font("Raleway",Font.BOLD,16));
       eStatement.setBounds(350,600,200,30);
       add(eStatement);
       
       declareStatement = new JCheckBox("I do hereby declare that all the above information given by me are true to the best of my knowledge and belief.");
       declareStatement.setBackground(Color.WHITE);
       declareStatement.setFont(new Font("Raleway",Font.BOLD,13));
       declareStatement.setBounds(40,680,750,30);
       add(declareStatement);
       
       
       cancel = new JButton("Cancel ");
       cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.WHITE);
       cancel.setFont(new Font("Raleway",Font.BOLD,16));
       cancel.setBounds(250,750,100,40);
       cancel.addActionListener(this);
       add(cancel);
       
       submit = new JButton("Submit ");
       submit.setBackground(Color.BLACK);
       submit.setForeground(Color.WHITE);
       submit.setFont(new Font("Raleway",Font.BOLD,16));
       submit.setBounds(500,750,100,40);
       submit.addActionListener(this);
       add(submit);
       
       
       getContentPane().setBackground(Color.WHITE);
       
       
       setLayout(null);
       setVisible(true);
       setSize(850, 850);
       setLocation(350,10);
   }
   
    @Override
    public void actionPerformed(ActionEvent ae) {

       if(ae.getSource() == submit){
           String accountType = null;
           if(savingAccount.isSelected()){
               accountType = "Saving Account";
           } else if (fdAccount.isSelected()) {
               accountType = "Fixed Deposit";
           } else if(currAccount.isSelected()){
               accountType = "Current Account";
           } else if(reccuringAccount.isSelected()){
               accountType = "Reccuring Deposit Account";
           }
           
           Random random = new Random();
           String cardNumber = "" +  Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
           
           String pinNumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
           
           String facility = "";
           if (atmCard.isSelected()) {
               facility += " ATM Card";
           } else if(mobileBanking.isSelected())
           {
               facility += " Mobile Banking";
           } else if(internetBanking.isSelected())
           {
               facility += " Internet Banking";
           } else if(emailAlerts.isSelected())
           {
               facility += " EMAIL & SMS Alerts";
           } else if(chequeBook.isSelected())
           {
               facility += " Cheque Book";
           } else if(eStatement.isSelected())
           {
               facility += " E-Statement";
           }     
           
           try {
               if(accountType.equals("")){
                   JOptionPane.showMessageDialog(null, "Account Type is Required");
               } else if(declareStatement.equals("")){
                   JOptionPane.showMessageDialog(null, "Please tick the Declare Statement");
               } else{
                   Conn c = new Conn();
                   String query1 = "insert into signupThree values('"+formno+"', '"+accountType+"', '"+cardNumber+"', '"+pinNumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formno+"', '"+cardNumber+"', '"+pinNumber+"')";
                   c.s.executeUpdate(query1);
                   c.s.executeUpdate(query2);
                   
                   JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\n Pin: " + pinNumber);
               }
               setVisible(false);
               new Deposit(pinNumber).setVisible(true);
               
           } catch (Exception e) {
               System.out.println(e);
           }
       } else if (ae.getSource() == cancel) {
           setVisible(false);
           new Login().setVisible(true);
       }
       
   }
   
}

