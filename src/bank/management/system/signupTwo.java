
package bank.management.system;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class signupTwo extends JFrame implements ActionListener{
    
    JLabel page2, religion, category, income, education, qualification, occupation, pan, aadhar, seniorCitizen, existingAccount;
    JComboBox religionComboBox, categoryComboBox, incomeComboBox, educationComboBox, occupationComboBox;
    JTextField panNoTextField, aadharNoTextField;
    JRadioButton sYesRadioButton, sNoRadioButton, eYesRadioButton, eNoRadioButton;
    JButton nextButton;
    String formno;
    
    
    public signupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        page2 = new JLabel("Page 2: Additional Details");
        page2.setFont(new Font("Raleway",Font.BOLD,25));
        page2.setBounds(290,60,400,40);
        add(page2);
        
        
        religion = new JLabel("Religion: ");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,130,200,30);
        add(religion);
        
        String valOfReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religionComboBox = new JComboBox(valOfReligion);
        religionComboBox.setFont(new Font("Raleway",Font.BOLD,15));
        religionComboBox.setBackground(Color.WHITE);
        religionComboBox.setBounds(300,130,400,30);
        add(religionComboBox);
        
        
        category = new JLabel("Category: ");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,180,200,30);
        add(category);
        
        String valOfCategory[] = {"General","OBC","SC","ST","Other"};
        categoryComboBox = new JComboBox(valOfCategory);
        categoryComboBox.setFont(new Font("Raleway",Font.BOLD,15));
        categoryComboBox.setBackground(Color.WHITE);
        categoryComboBox.setBounds(300,180,400,30);
        add(categoryComboBox);
        
        
        income = new JLabel("Income: ");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,230,200,30);
        add(income);
        
        String valOfIncome[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        incomeComboBox = new JComboBox(valOfIncome);
        incomeComboBox.setFont(new Font("Raleway",Font.BOLD,15));
        incomeComboBox.setBackground(Color.WHITE);
        incomeComboBox.setBounds(300,230,400,30);
        add(incomeComboBox);
        
        education = new JLabel("Educational ");
        education.setFont(new Font("Raleway",Font.BOLD,20));
        education.setBounds(100,280,200,30);
        add(education);
        qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,310,200,30);
        add(qualification);
        
        String valOfEducation[] = {"Secondary","Senior Secondary","Graduation","Post Graduation","Any Other"};
        educationComboBox = new JComboBox(valOfEducation);
        educationComboBox.setFont(new Font("Raleway",Font.BOLD,15));
        educationComboBox.setBackground(Color.WHITE);
        educationComboBox.setBounds(300,295,400,30);
        add(educationComboBox);
        
        
        occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,380,200,30);
        add(occupation);
        
        String valOfOccupation[] = {"Salaried","Self Employed","Bussiness","Student","Housewife","Retired","Other"};
        occupationComboBox = new JComboBox(valOfOccupation);
        occupationComboBox.setFont(new Font("Raleway",Font.BOLD,15));
        occupationComboBox.setBackground(Color.WHITE);
        occupationComboBox.setBounds(300,380,400,30);
        add(occupationComboBox);
        
        pan = new JLabel("PAN Number: ");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,430,200,30);
        add(pan);
        
        panNoTextField = new JTextField();
        panNoTextField.setFont(new Font("Raleway",Font.BOLD,15));
        panNoTextField.setBackground(Color.WHITE);
        panNoTextField.setBounds(300,430,400,30);
        add(panNoTextField);
        
        
        aadhar = new JLabel("Aadhar Number: ");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,480,200,30);
        add(aadhar);
        
        aadharNoTextField = new JTextField();
        aadharNoTextField.setFont(new Font("Raleway",Font.BOLD,15));
        aadharNoTextField.setBackground(Color.WHITE);
        aadharNoTextField.setBounds(300,480,400,30);
        add(aadharNoTextField);
        
        
        seniorCitizen = new JLabel("Senior Citizen: : ");
        seniorCitizen.setFont(new Font("Raleway",Font.BOLD,20));
        seniorCitizen.setBounds(100,530,200,30);
        add(seniorCitizen);
        
        
        sYesRadioButton = new JRadioButton("Yes");
        sYesRadioButton.setFont(new Font("Raleway",Font.BOLD,15));
        sYesRadioButton.setBackground(Color.WHITE);
        sYesRadioButton.setBounds(300,530,100,30);
        add(sYesRadioButton);
        
        sNoRadioButton = new JRadioButton("No");
        sNoRadioButton.setFont(new Font("Raleway",Font.BOLD,15));
        sNoRadioButton.setBackground(Color.WHITE);
        sNoRadioButton.setBounds(450,530,100,30);
        add(sNoRadioButton);
        
        ButtonGroup seniorCitizenGroupButton = new ButtonGroup();
        seniorCitizenGroupButton.add(sYesRadioButton);
        seniorCitizenGroupButton.add(sNoRadioButton);
        
        
        existingAccount = new JLabel("Existing Account: ");
        existingAccount.setFont(new Font("Raleway",Font.BOLD,20));
        existingAccount.setBounds(100,580,200,30);
        add(existingAccount);
        
        eYesRadioButton = new JRadioButton("Yes");
        eYesRadioButton.setFont(new Font("Raleway",Font.BOLD,15));
        eYesRadioButton.setBackground(Color.WHITE);
        eYesRadioButton.setBounds(300,580,100,30);
        add(eYesRadioButton);
        
        eNoRadioButton = new JRadioButton("No");
        eNoRadioButton.setFont(new Font("Raleway",Font.BOLD,15));
        eNoRadioButton.setBackground(Color.WHITE);
        eNoRadioButton.setBounds(450,580,100,30);
        add(eNoRadioButton);
        
        ButtonGroup existingAccountGroupButton = new ButtonGroup();
        existingAccountGroupButton.add(eYesRadioButton);
        existingAccountGroupButton.add(eNoRadioButton);
        
        
        
        nextButton = new JButton("NEXT...");
        nextButton.setFont(new Font("Raleway",Font.BOLD,15));
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);
        nextButton.setBounds(350,700,100,30);
        nextButton.addActionListener(this);
        add(nextButton);
        
        
        // setting up background color for our window
        
        getContentPane().setBackground(Color.WHITE);
        
//        setting the size for our frame

        setSize(850,800);
        setLocation(350,30);
        setVisible(true); 
    }
 
    
    public void actionPerformed(ActionEvent ae){
        String religion = (String)religionComboBox.getSelectedItem();
        String category = (String)categoryComboBox.getSelectedItem();
        String income = (String)incomeComboBox.getSelectedItem();
        String education = (String)educationComboBox.getSelectedItem();
        String occupation = (String)occupationComboBox.getSelectedItem();
        String panNo = panNoTextField.getText();
        String aadharNo = aadharNoTextField.getText();
        
        String seniorCitizen = null;
        if(sYesRadioButton.isSelected()){
            seniorCitizen = "Yes";
        } else if(sNoRadioButton.isSelected()){
            seniorCitizen = "No";
        }
        
        String existingAccount = null;
        if(eYesRadioButton.isSelected()){
            existingAccount = "Yes";
        } else if(eNoRadioButton.isSelected()){
            existingAccount = "No";
        }
        
        
        try {
            if(religion.equals("")){
                JOptionPane.showMessageDialog(null, "Religion is Required");
            } else if(category.equals("")){
                JOptionPane.showMessageDialog(null, "Category is Required");
            }  else if(income.equals("")){
                JOptionPane.showMessageDialog(null, "Income is Required");
            }  else if(education.equals("")){
                JOptionPane.showMessageDialog(null, "Education Qualification is Required");
            }  else if(occupation.equals("")){
                JOptionPane.showMessageDialog(null, "Occupation is Required");
            }  else if(panNo.equals("")){
                JOptionPane.showMessageDialog(null, "Pan No is Required");
            } else if(aadharNo.equals("")){
                JOptionPane.showMessageDialog(null, "Aadhar No is Required");
            }  else if(seniorCitizen.equals("")){
                JOptionPane.showMessageDialog(null, "Senior Citizen Yes/No is Required");
            }  else if(existingAccount.equals("")){
                JOptionPane.showMessageDialog(null, "Existing Account Yes/No is Required");
            } else {
                Conn c = new Conn();
                String query = "insert into signupTwo values('"+formno+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+panNo+"', '"+aadharNo+"', '"+seniorCitizen+"', '"+existingAccount+"')"; 
                c.s.executeUpdate(query); 
                
                setVisible(false);
                new signupThree(formno).setVisible(true);
                
            }
        } catch (Exception e) {
                System.out.println(e);
                }
            }
   
}
        
