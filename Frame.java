import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComponent;
import javax.swing.JButton;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.KeyStroke;


public class Frame extends JFrame{
    protected double num1;
    protected double num2;
    protected double num3;
    protected double num4; 

    public Frame(){
        JPanel p = new JPanel();
        p.setLayout(null);
        setContentPane(p);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Expenses");
        setSize(550,550); 

        // TEXT FIELDS
        JTextField jt = new JTextField("",10);
        JTextField jt2 = new JTextField();
        JTextField jt3 = new JTextField("",10);
        JTextField jt4 = new JTextField();
        JTextField jt5 = new JTextField("",10);
        JTextField jt6 = new JTextField();
        JTextField jt7 = new JTextField("",10);
        JTextField jt8 = new JTextField();
        JTextField total = new JTextField("Total",10);
        JTextField result = new JTextField();               

        jt.setToolTipText("Enter text here");
        jt3.setToolTipText("Enter text here");
        jt5.setToolTipText("Enter text here");
        jt7.setToolTipText("Enter text here");
        jt2.setToolTipText("Enter a number value");
        jt4.setToolTipText("Enter a number value");
        jt6.setToolTipText("Enter a number value");
        jt8.setToolTipText("Enter a number value");
        result.setToolTipText("This is your total");
        total.setEditable(false);
        // JTF - Positioning
        jt.setBounds(100,150,100,20);
        jt2.setBounds(200,150,150,20); 
        jt3.setBounds(100,170,100,20);
        jt4.setBounds(200,170,150,20);
        jt5.setBounds(100,190,100,20);
        jt6.setBounds(200,190,150,20); 
        jt7.setBounds(100,210,100,20);
        jt8.setBounds(200,210,150,20);
        total.setBounds(100,270,100,20);
        result.setBounds(200,270,150,20);

        // JTF - Text Positioning
        jt2.setHorizontalAlignment(JTextField.CENTER);
        jt4.setHorizontalAlignment(JTextField.CENTER);
        jt6.setHorizontalAlignment(JTextField.CENTER);
        jt8.setHorizontalAlignment(JTextField.CENTER);
        jt.setHorizontalAlignment(JTextField.CENTER);
        jt3.setHorizontalAlignment(JTextField.CENTER);
        jt5.setHorizontalAlignment(JTextField.CENTER);
        jt7.setHorizontalAlignment(JTextField.CENTER);
        total.setHorizontalAlignment(JTextField.CENTER);

               
        // BUTTON
        Font font = new Font("Comic Sans MS", Font.BOLD, 15);
        
        JButton calculate = new JButton("Calculate");
        calculate.setToolTipText("What are you waiting for, click me!");
        calculate.setBounds(150,300,140,50);
        calculate.setBackground(Color.WHITE);
        calculate.setFont(font);
        calculate.addActionListener(new ActionListener(){        
            @Override
            public void actionPerformed(ActionEvent e) { 
                num1 =0;     
                num2 =0;       
                num3 =0;       
                num4 =0; 
                result.setText("");                
                try{
                    num1 = Double.parseDouble(jt2.getText());
                    num2 = Double.parseDouble(jt4.getText());
                    num3 = Double.parseDouble(jt6.getText());
                    num4 = Double.parseDouble(jt8.getText());
                    double x = num1+num2+num3+num4;
                    result.setText(String.valueOf(x));
                    jt2.setBackground(Color.white);
                    jt4.setBackground(Color.white);
                    jt6.setBackground(Color.white);
                    jt8.setBackground(Color.white);
                    result.setBackground(Color.white);
                }                
                catch(NumberFormatException ex){                    
                    System.out.println(ex.getMessage());                      
                    if(num1 == 0.0){
                        jt2.setBackground(Color.white);
                        jt4.setBackground(Color.white);
                        jt6.setBackground(Color.white);
                        jt8.setBackground(Color.white);
                        jt2.setBackground(Color.red);
                        result.setBackground(Color.black);                        
                     }
                     else if(num2 == 0.0){
                        jt2.setBackground(Color.white);
                        jt4.setBackground(Color.white);
                        jt6.setBackground(Color.white);
                        jt8.setBackground(Color.white);
                        jt4.setBackground(Color.red);
                        result.setBackground(Color.black);                        
                     }  
                     else if(num3 == 0.0){
                        jt2.setBackground(Color.white);
                        jt4.setBackground(Color.white);
                        jt6.setBackground(Color.white);
                        jt8.setBackground(Color.white);
                        jt6.setBackground(Color.red);
                        result.setBackground(Color.black);                        
                     }  
                     else if(num4 == 0.0){
                        jt2.setBackground(Color.white);
                        jt4.setBackground(Color.white);
                        jt6.setBackground(Color.white);
                        jt8.setBackground(Color.white);
                        jt8.setBackground(Color.red);
                        result.setBackground(Color.black);                        
                     }                   
                }                
            }
        });        
        
        // DISPLAY OUTPUT
        p.add(jt);
        p.add(jt2);
        p.add(jt3);
        p.add(jt4);
        p.add(jt6);
        p.add(jt7);
        p.add(jt8);
        p.add(jt5);
        p.add(total);
        p.add(result);
        p.add(calculate);
    }
    
}
