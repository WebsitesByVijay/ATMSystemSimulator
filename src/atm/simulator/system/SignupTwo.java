
package atm.simulator.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField panTextField, aadharTextField;
    JRadioButton eyes,syes,eno,sno;
    JButton next;
    JComboBox religion,education,income,occupation,category;
    String formno;
    
    
    SignupTwo(String formno){
        
        this.formno = formno;
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
         
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setBounds(180, 20 ,600, 45);
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 38));
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setBounds(100, 140, 100, 30 );
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        add(name);
        
        String valReligion[] = { "Hindu", "Muslim", "Christian" ,"Sikh","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);      
        
        JLabel fname = new JLabel("Category:");
        fname.setBounds(100, 190, 200, 30 );
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        add(fname);
        
        String valcategory[] = {"General","OBC", "SC/ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        JLabel dob = new JLabel("Income:");
        dob.setBounds(100, 240, 200, 30 );
        dob.setFont(new Font("Arial" , Font.BOLD, 20));
        add(dob);
   
        String incomecategory[] = {"NULL","< 1,50,000", " < 2,50,000","< 5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        JLabel gender = new JLabel("Educational");
        gender.setBounds(100, 290, 200, 30 );
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        add(gender);

        JLabel email = new JLabel("Qualification:");
        email.setBounds(100, 315, 200, 30 );
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        add(email);
        
        String educationValues[] = {"Non-Graduate","Graduate", " Post Graduate","Doctarte","Other"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315,400,30);
        education.setBackground(Color.WHITE);
        add(education);        

        JLabel marital = new JLabel("Occupation:");
        marital.setBounds(100, 390, 200, 30 );
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        add(marital);
    
        String occupationValues[] = {"Salaried","Self-Employed", "Bussiness","Student","Retired","Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);        

        
        JLabel address = new JLabel("PAN Number:");
        address.setBounds(100, 440, 200, 30 );
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        add(address);
    
        panTextField = new JTextField();
        panTextField.setFont(new Font("Arial" , Font.BOLD, 20));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        JLabel city = new JLabel("Aadhar Number:");
        city.setBounds(100, 490, 200, 30 );
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        add(city);      
        
       aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Arial" , Font.BOLD, 20));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);
        
        JLabel state = new JLabel("Senior Citizen:");
        state.setBounds(100, 540, 200, 30 );
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        add(state); 
       
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30 );
        syes.setBackground(Color.WHITE);
        add(syes);
        
       sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30 );
        sno.setBackground(Color.WHITE);
        add(sno);
 
        ButtonGroup sRadioButton = new ButtonGroup();
        sRadioButton.add(syes);
        sRadioButton.add(sno);
        
        JLabel pincode = new JLabel("Existing Account:");
        pincode.setBounds(100, 590, 200, 30 );
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        add(pincode); 
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30 );
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
       eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30 );
        eno.setBackground(Color.WHITE);
        add(eno);
 
        ButtonGroup eRadioButton = new ButtonGroup();
        eRadioButton.add(eyes);
        eRadioButton.add(eno);
        
        
        next = new JButton("NEXT");
        next.setBackground(Color.ORANGE);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,640,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        setTitle("Continue to Sign-up!");
        setSize(850,820);
        setLocation(350, 10);
        setVisible(true);   
    }
    
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String) religion.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        
        String PAN = panTextField.getText();
        String Aadhar = aadharTextField.getText();
        
        String sCitizen = null;
        if (syes.isSelected()){
            sCitizen = "Yes";
        } else if( sno.isSelected()){
            sCitizen = "No";
        }
        String eAccount = null;
        if(eyes.isSelected()){
            eAccount = "Yes";
        } else if (eno.isSelected()){
            eAccount = "No";
        } 
        
 
        try{            
           Conn c = new Conn();
           String query = "insert into signuptwo values ('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+PAN+"','"+Aadhar+"','"+sCitizen+"','"+eAccount+"')"; 
           c.s.executeUpdate(query);
           
           setVisible(false);
           new SignupThree(formno).setVisible(true);
        } catch (Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]){
        new SignupTwo("");
    }
    
}
