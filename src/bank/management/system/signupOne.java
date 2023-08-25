package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class signupOne extends JFrame implements ActionListener{
    long random;
    
    JTextField nameTextField,fnameTextField,emailidTextField,addressTextField,cityTextField,stateTextField,countryTextField,pincodeTextField;
    JButton nextButton;
    JRadioButton male_genderradioButton,female_genderradioButton,married_statusRadioButton,divorce_statusRadioButton,single_statusRadioButton,widow_statusRadioButton;
    JDateChooser dobDateChooser;
    
    public signupOne() {
        
        setLayout(null);
        // Label
         Random ran = new Random();
         random = Math.abs((ran.nextLong() % 9000L) + 1000L);
         
         JLabel formNo = new JLabel("APPLICATION FORM NO. " + Math.abs((ran.nextLong() % 9000L) + 1000L));
         formNo.setFont(new Font("Raleway", Font.BOLD , 38));
         formNo.setBounds(140,20,600,40);
         add(formNo);
         
         JLabel personalDetails = new JLabel("Page 1: Personal Details");
         personalDetails.setFont(new Font("Raleway", Font.BOLD , 22));
         personalDetails.setBounds(290,80,400,30);
         add(personalDetails);
         
         JLabel name = new JLabel("Name: ");
         name.setFont(new Font("Raleway",Font.BOLD,20));
         name.setBounds(100, 140,200,30);
         add(name);
         
         nameTextField = new JTextField();
         nameTextField.setFont(new Font("Raleway",Font.BOLD,15));
         nameTextField.setBounds(300,140,400,30);
         add(nameTextField);
         
         JLabel fname = new JLabel("Father's Name: ");
         fname.setFont(new Font("Raleway",Font.BOLD,20));
         fname.setBounds(100, 190,200,30);
         add(fname);
         
         fnameTextField = new JTextField();
         fnameTextField.setFont(new Font("Raleway",Font.BOLD,15));
         fnameTextField.setBounds(300,190,400,30);
         add(fnameTextField);
         
         JLabel dob = new JLabel("D.O.B: ");
         dob.setFont(new Font("Raleway",Font.BOLD,22));
         dob.setBounds(100, 240,200,30);
         add(dob);
         
         dobDateChooser = new JDateChooser();
         dobDateChooser.setFont(new Font("Raleway",Font.BOLD,15));
         dobDateChooser.setBounds(300,240,400,30);
         add(dobDateChooser);
         
         JLabel Gender = new JLabel("Gender: ");
         Gender.setFont(new Font("Raleway",Font.BOLD,22));
         Gender.setBounds(100, 290,200,30);
         add(Gender);
         
         male_genderradioButton = new JRadioButton("Male ");
         male_genderradioButton.setFont(new Font("Raleway",Font.BOLD,15));
         male_genderradioButton.setBackground(Color.WHITE);
         male_genderradioButton.setBounds(300,290,100,30);
         add(male_genderradioButton);
         
         female_genderradioButton = new JRadioButton("Female ");
         female_genderradioButton.setFont(new Font("Raleway",Font.BOLD,15));
         female_genderradioButton.setBackground(Color.WHITE);
         female_genderradioButton.setBounds(450,290,100,30);
         add(female_genderradioButton);
         
         ButtonGroup genderGroup = new ButtonGroup();
         genderGroup.add(male_genderradioButton);
         genderGroup.add(female_genderradioButton);
         
         JLabel emailid = new JLabel("Email Address: ");
         emailid.setFont(new Font("Raleway",Font.BOLD,22));
         emailid.setBounds(100, 340,200,30);
         add(emailid);
         
         emailidTextField = new JTextField();
         emailidTextField.setFont(new Font("Raleway",Font.BOLD,15));
         emailidTextField.setBounds(300,340,400,30);
         add(emailidTextField);
         
         JLabel status = new JLabel("Martial Status: ");
         status.setFont(new Font("Raleway",Font.BOLD,22));
         status.setBounds(100, 390,200,30);
         add(status);
         
         married_statusRadioButton = new JRadioButton("Married ");
         married_statusRadioButton.setFont(new Font("Raleway",Font.BOLD,15));
         married_statusRadioButton.setBackground(Color.WHITE);
         married_statusRadioButton.setBounds(300,390,100,30);
         add(married_statusRadioButton);
         
         divorce_statusRadioButton = new JRadioButton("Divorce ");
         divorce_statusRadioButton.setFont(new Font("Raleway",Font.BOLD,15));
         divorce_statusRadioButton.setBackground(Color.WHITE);
         divorce_statusRadioButton.setBounds(400,390,120,30);
         add(divorce_statusRadioButton);
         
         single_statusRadioButton = new JRadioButton("Single ");
         single_statusRadioButton.setFont(new Font("Raleway",Font.BOLD,15));
         single_statusRadioButton.setBackground(Color.WHITE);
         single_statusRadioButton.setBounds(520,390,100,30);
         add(single_statusRadioButton);
         
         widow_statusRadioButton = new JRadioButton("Widow ");
         widow_statusRadioButton.setFont(new Font("Raleway",Font.BOLD,15));
         widow_statusRadioButton.setBackground(Color.WHITE);
         widow_statusRadioButton.setBounds(620,390,100,30);
         add(widow_statusRadioButton);
         
         ButtonGroup statusButtonGroup = new ButtonGroup();
         add(married_statusRadioButton);
         add(divorce_statusRadioButton);
         add(single_statusRadioButton);
         add(widow_statusRadioButton);
         
         JLabel address = new JLabel("Adrress: ");
         address.setFont(new Font("Raleway",Font.BOLD,22));
         address.setBounds(100, 440,200,30);
         add(address);
         
         addressTextField = new JTextField();
         addressTextField.setFont(new Font("Raleway",Font.BOLD,15));
         addressTextField.setBounds(300,440,400,30);
         add(addressTextField);
         
          JLabel city = new JLabel("City: ");
         city.setFont(new Font("Raleway",Font.BOLD,22));
         city.setBounds(100, 490,200,30);
         add(city);
         
         cityTextField = new JTextField();
         cityTextField.setFont(new Font("Raleway",Font.BOLD,15));
         cityTextField.setBounds(300,490,400,30);
         add(cityTextField);
         
         JLabel state = new JLabel("State: ");
         state.setFont(new Font("Raleway",Font.BOLD,22));
         state.setBounds(100, 540,200,30);
         add(state);
         
         stateTextField = new JTextField();
         stateTextField.setFont(new Font("Raleway",Font.BOLD,15));
         stateTextField.setBounds(300,540,400,30);
         add(stateTextField);
         
         JLabel country = new JLabel("Country: ");
         country.setFont(new Font("Raleway",Font.BOLD,22));
         country.setBounds(100, 590,200,30);
         add(country);
         
         countryTextField = new JTextField();
         countryTextField.setFont(new Font("Raleway",Font.BOLD,15));
         countryTextField.setBounds(300,590,400,30);
         add(countryTextField);
         
         JLabel pincode = new JLabel("Pin Code: ");
         pincode.setFont(new Font("Raleway",Font.BOLD,22));
         pincode.setBounds(100, 640,200,30);
         add(pincode);
         
         pincodeTextField = new JTextField();
         pincodeTextField.setFont(new Font("Raleway",Font.BOLD,15));
         pincodeTextField.setBounds(300,640,400,30);
         add(pincodeTextField);
         
         nextButton = new JButton("NEXT...");
         nextButton.setBackground(Color.BLACK);
         nextButton.setForeground(Color.WHITE);
         nextButton.setFont(new Font("Raleway",Font.BOLD,15));
         nextButton.setBounds(400,700,100,30);
         nextButton.addActionListener(this);
         add(nextButton);
         
         
        // background color of our frame
        
        getContentPane().setBackground(Color.WHITE);
        
        //get size of our frame
        
        setSize(850, 800);
        setLocation(350,30);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob =  ((JTextField) dobDateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        
        if(male_genderradioButton.isSelected()){
            gender = "Male";
        } else if(female_genderradioButton.isSelected()){
            gender = "Female";
        }
        
        String emailid = emailidTextField.getText();
        String maritalStatus = null;
        
        if(married_statusRadioButton.isSelected()){
            maritalStatus = "Married";
        } else if(divorce_statusRadioButton.isSelected()){
            maritalStatus = "Divorce";
        } else if(single_statusRadioButton.isSelected()){
            maritalStatus = "Single";
        } else if(widow_statusRadioButton.isSelected()){
            maritalStatus = "Widow";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String country = countryTextField.getText();
        String pin = pincodeTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else if(fname.equals("")){
                JOptionPane.showMessageDialog(null, "Father name is Required");
            }  else if(dob.equals("")){
                JOptionPane.showMessageDialog(null, "DOB is Required");
            }  else if(gender.equals("")){
                JOptionPane.showMessageDialog(null, "Gender is Required");
            }  else if(emailid.equals("")){
                JOptionPane.showMessageDialog(null, "Email ID is Required");
            }  else if(maritalStatus.equals("")){
                JOptionPane.showMessageDialog(null, "Marital Status is Required");
            } else if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is Required");
            }  else if(city.equals("")){
                JOptionPane.showMessageDialog(null, "City is Required");
            }  else if(state.equals("")){
                JOptionPane.showMessageDialog(null, "State is Required");
            }  else if(country.equals("")){
                JOptionPane.showMessageDialog(null, "Country  is Required");
            }  else if(pin.equals("")){
                JOptionPane.showMessageDialog(null, "Pin is Required");
            } else {
                Conn c = new Conn();
                String query = "insert into signupOne values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+emailid+"', '"+maritalStatus+"', '"+address+"', '"+city+"', '"+state+"',  '"+country+"',  '"+pin+"')"; 
                c.s.executeUpdate(query);
                
                setVisible(false);
                new signupTwo(formno).setVisible(true);
            }
        } catch(Exception e){
            System.out.println(e);
        }
        
    }
}
