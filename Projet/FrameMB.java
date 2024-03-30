/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projet;
import java.awt.*;

import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;


/**
 *
 * @author dongm
 */
public class FrameMB extends JFrame{
    public FrameMB(String name_lib){
        this.setVisible(true);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Projet/design/logo1.png"));
        this.setIconImage(icon); 
        this.setTitle("L I B R A R Y");
        this.setSize(1200,630);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        JPanelBook b=new JPanelBook(this,name_lib);
        b.setBounds(0,0,1200,630);
        this.add(b);
        
    
    }
    
   
    public JLabel createicon(String img){
        JLabel label=new JLabel("");
        label.setIcon(new ImageIcon(img));
        label.setForeground(Color.gray);
        label.setSize(600, 50);
        return label;
    }
    public JLabel createJLabel(String img,String text){
        JLabel label=new JLabel(text);
        label.setIcon(new ImageIcon(img));
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        return label;
    }
    public JTextField createJTextField(String text){
        JTextField jtf = new JTextField("write ID");        
        jtf.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        jtf.setSize(300, 50);
        return jtf;
    }
    public JLabel createJLabel1(String text){
        JLabel label=new JLabel();
        label.setText(text);
        label.setHorizontalAlignment(CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setForeground(Color.red);
       
        return label;
    }
    public  JPanel createField(String labelText, String iconPath, String defaultValue) {
        JPanel field1=new JPanel();
        field1.setLayout(new BorderLayout(10,5));
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JLabel label = createJLabel1(labelText);
        JLabel icon = createicon(iconPath);
        JTextField textField = createJTextField(defaultValue);
        p1.add(label,BorderLayout.PAGE_START);
        p2.add(icon,BorderLayout.LINE_START);
        p3.add(textField,BorderLayout.CENTER);
        field1.add(p1);
        field1.add(p3);
        field1.add(p2);
        //field1.setSize(400, 200);
        field1.setBackground(new Color(250,240,240));
        return field1;
    }
    
}
